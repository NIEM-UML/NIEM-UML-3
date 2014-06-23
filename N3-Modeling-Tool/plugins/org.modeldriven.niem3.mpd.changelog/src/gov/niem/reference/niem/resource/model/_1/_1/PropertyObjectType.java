/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyQualifiedName <em>Property Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyNamespace <em>Property Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDefinitionText <em>Property Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyElementIndicator <em>Property Element Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAbstractIndicator <em>Property Abstract Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyInlineIndicator <em>Property Inline Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType()
 * @model extendedMetaData="name='PropertyObjectType' kind='elementOnly'"
 * @generated
 */
public interface PropertyObjectType extends ComplexObjectType {
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyQualifiedName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getPropertyQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyQualifiedName <em>Property Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Qualified Name</em>' containment reference.
	 * @see #getPropertyQualifiedName()
	 * @generated
	 */
	void setPropertyQualifiedName(QName value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference.
	 * @see #setPropertyName(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getPropertyName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyName <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' containment reference.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Property Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Namespace</em>' containment reference.
	 * @see #setPropertyNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyNamespace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getPropertyNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyNamespace <em>Property Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Namespace</em>' containment reference.
	 * @see #getPropertyNamespace()
	 * @generated
	 */
	void setPropertyNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>Property Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Definition Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definition Text</em>' containment reference.
	 * @see #setPropertyDefinitionText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyDefinitionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyDefinitionText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getPropertyDefinitionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDefinitionText <em>Property Definition Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Definition Text</em>' containment reference.
	 * @see #getPropertyDefinitionText()
	 * @generated
	 */
	void setPropertyDefinitionText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Property Data Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Data Type Qualified Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Data Type Qualified Name</em>' containment reference.
	 * @see #isSetPropertyDataTypeQualifiedName()
	 * @see #unsetPropertyDataTypeQualifiedName()
	 * @see #setPropertyDataTypeQualifiedName(QName)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyDataTypeQualifiedName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PropertyDataTypeQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getPropertyDataTypeQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Data Type Qualified Name</em>' containment reference.
	 * @see #isSetPropertyDataTypeQualifiedName()
	 * @see #unsetPropertyDataTypeQualifiedName()
	 * @see #getPropertyDataTypeQualifiedName()
	 * @generated
	 */
	void setPropertyDataTypeQualifiedName(QName value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyDataTypeQualifiedName()
	 * @see #getPropertyDataTypeQualifiedName()
	 * @see #setPropertyDataTypeQualifiedName(QName)
	 * @generated
	 */
	void unsetPropertyDataTypeQualifiedName();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Data Type Qualified Name</em>' containment reference is set.
	 * @see #unsetPropertyDataTypeQualifiedName()
	 * @see #getPropertyDataTypeQualifiedName()
	 * @see #setPropertyDataTypeQualifiedName(QName)
	 * @generated
	 */
	boolean isSetPropertyDataTypeQualifiedName();

	/**
	 * Returns the value of the '<em><b>Property Substitution Group Head Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Substitution Group Head Qualified Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Substitution Group Head Qualified Name</em>' containment reference.
	 * @see #isSetPropertySubstitutionGroupHeadQualifiedName()
	 * @see #unsetPropertySubstitutionGroupHeadQualifiedName()
	 * @see #setPropertySubstitutionGroupHeadQualifiedName(QName)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertySubstitutionGroupHeadQualifiedName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PropertySubstitutionGroupHeadQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getPropertySubstitutionGroupHeadQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Substitution Group Head Qualified Name</em>' containment reference.
	 * @see #isSetPropertySubstitutionGroupHeadQualifiedName()
	 * @see #unsetPropertySubstitutionGroupHeadQualifiedName()
	 * @see #getPropertySubstitutionGroupHeadQualifiedName()
	 * @generated
	 */
	void setPropertySubstitutionGroupHeadQualifiedName(QName value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertySubstitutionGroupHeadQualifiedName()
	 * @see #getPropertySubstitutionGroupHeadQualifiedName()
	 * @see #setPropertySubstitutionGroupHeadQualifiedName(QName)
	 * @generated
	 */
	void unsetPropertySubstitutionGroupHeadQualifiedName();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Substitution Group Head Qualified Name</em>' containment reference is set.
	 * @see #unsetPropertySubstitutionGroupHeadQualifiedName()
	 * @see #getPropertySubstitutionGroupHeadQualifiedName()
	 * @see #setPropertySubstitutionGroupHeadQualifiedName(QName)
	 * @generated
	 */
	boolean isSetPropertySubstitutionGroupHeadQualifiedName();

	/**
	 * Returns the value of the '<em><b>Property Element Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Element Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Element Indicator</em>' containment reference.
	 * @see #setPropertyElementIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyElementIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyElementIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getPropertyElementIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyElementIndicator <em>Property Element Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Element Indicator</em>' containment reference.
	 * @see #getPropertyElementIndicator()
	 * @generated
	 */
	void setPropertyElementIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

	/**
	 * Returns the value of the '<em><b>Property Abstract Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Abstract Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Abstract Indicator</em>' containment reference.
	 * @see #setPropertyAbstractIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyAbstractIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyAbstractIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getPropertyAbstractIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAbstractIndicator <em>Property Abstract Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Abstract Indicator</em>' containment reference.
	 * @see #getPropertyAbstractIndicator()
	 * @generated
	 */
	void setPropertyAbstractIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyInlineIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyInlineIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getPropertyInlineIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyInlineIndicator <em>Property Inline Indicator</em>}' containment reference.
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyReferenceIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyReferenceIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getPropertyReferenceIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Reference Indicator</em>' containment reference.
	 * @see #getPropertyReferenceIndicator()
	 * @generated
	 */
	void setPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

	/**
	 * Returns the value of the '<em><b>Property Augmentation Of Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Augmentation Of Type Qualified Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Augmentation Of Type Qualified Name</em>' containment reference.
	 * @see #isSetPropertyAugmentationOfTypeQualifiedName()
	 * @see #unsetPropertyAugmentationOfTypeQualifiedName()
	 * @see #setPropertyAugmentationOfTypeQualifiedName(QName)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getPropertyObjectType_PropertyAugmentationOfTypeQualifiedName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PropertyAugmentationOfTypeQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getPropertyAugmentationOfTypeQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Augmentation Of Type Qualified Name</em>' containment reference.
	 * @see #isSetPropertyAugmentationOfTypeQualifiedName()
	 * @see #unsetPropertyAugmentationOfTypeQualifiedName()
	 * @see #getPropertyAugmentationOfTypeQualifiedName()
	 * @generated
	 */
	void setPropertyAugmentationOfTypeQualifiedName(QName value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyAugmentationOfTypeQualifiedName()
	 * @see #getPropertyAugmentationOfTypeQualifiedName()
	 * @see #setPropertyAugmentationOfTypeQualifiedName(QName)
	 * @generated
	 */
	void unsetPropertyAugmentationOfTypeQualifiedName();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Augmentation Of Type Qualified Name</em>' containment reference is set.
	 * @see #unsetPropertyAugmentationOfTypeQualifiedName()
	 * @see #getPropertyAugmentationOfTypeQualifiedName()
	 * @see #setPropertyAugmentationOfTypeQualifiedName(QName)
	 * @generated
	 */
	boolean isSetPropertyAugmentationOfTypeQualifiedName();

} // PropertyObjectType

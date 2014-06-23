/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeNamespace <em>Type Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeDefinitionText <em>Type Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeContentStyleCode <em>Type Content Style Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeSimpleStyleCode <em>Type Simple Style Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAssociationIndicator <em>Type Association Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAugmentationIndicator <em>Type Augmentation Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAdapterIndicator <em>Type Adapter Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeMetadataIndicator <em>Type Metadata Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType()
 * @model extendedMetaData="name='TypeObjectType' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectType extends ComplexObjectType {
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeQualifiedName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeQualifiedName <em>Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Qualified Name</em>' containment reference.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(QName value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getTypeName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Type Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Namespace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Namespace</em>' containment reference.
	 * @see #setTypeNamespace(NamespaceType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeNamespace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceType getTypeNamespace();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeNamespace <em>Type Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Namespace</em>' containment reference.
	 * @see #getTypeNamespace()
	 * @generated
	 */
	void setTypeNamespace(NamespaceType value);

	/**
	 * Returns the value of the '<em><b>Type Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition Text</em>' containment reference.
	 * @see #setTypeDefinitionText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeDefinitionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeDefinitionText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getTypeDefinitionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeDefinitionText <em>Type Definition Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Text</em>' containment reference.
	 * @see #getTypeDefinitionText()
	 * @generated
	 */
	void setTypeDefinitionText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Type Base Type Qualified Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Base Type Qualified Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Base Type Qualified Name</em>' containment reference.
	 * @see #isSetTypeBaseTypeQualifiedName()
	 * @see #unsetTypeBaseTypeQualifiedName()
	 * @see #setTypeBaseTypeQualifiedName(QName)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeBaseTypeQualifiedName()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeBaseTypeQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getTypeBaseTypeQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Base Type Qualified Name</em>' containment reference.
	 * @see #isSetTypeBaseTypeQualifiedName()
	 * @see #unsetTypeBaseTypeQualifiedName()
	 * @see #getTypeBaseTypeQualifiedName()
	 * @generated
	 */
	void setTypeBaseTypeQualifiedName(QName value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeBaseTypeQualifiedName()
	 * @see #getTypeBaseTypeQualifiedName()
	 * @see #setTypeBaseTypeQualifiedName(QName)
	 * @generated
	 */
	void unsetTypeBaseTypeQualifiedName();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Base Type Qualified Name</em>' containment reference is set.
	 * @see #unsetTypeBaseTypeQualifiedName()
	 * @see #getTypeBaseTypeQualifiedName()
	 * @see #setTypeBaseTypeQualifiedName(QName)
	 * @generated
	 */
	boolean isSetTypeBaseTypeQualifiedName();

	/**
	 * Returns the value of the '<em><b>Type Content Style Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Content Style Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Content Style Code</em>' containment reference.
	 * @see #setTypeContentStyleCode(TypeContentStyleCodeType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeContentStyleCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeContentStyleCode' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeContentStyleCodeType getTypeContentStyleCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeContentStyleCode <em>Type Content Style Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Content Style Code</em>' containment reference.
	 * @see #getTypeContentStyleCode()
	 * @generated
	 */
	void setTypeContentStyleCode(TypeContentStyleCodeType value);

	/**
	 * Returns the value of the '<em><b>Type Simple Style Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Simple Style Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Simple Style Code</em>' containment reference.
	 * @see #setTypeSimpleStyleCode(TypeSimpleStyleCodeType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeSimpleStyleCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeSimpleStyleCode' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSimpleStyleCodeType getTypeSimpleStyleCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeSimpleStyleCode <em>Type Simple Style Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Simple Style Code</em>' containment reference.
	 * @see #getTypeSimpleStyleCode()
	 * @generated
	 */
	void setTypeSimpleStyleCode(TypeSimpleStyleCodeType value);

	/**
	 * Returns the value of the '<em><b>Type Association Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Association Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Association Indicator</em>' containment reference.
	 * @see #setTypeAssociationIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeAssociationIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeAssociationIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getTypeAssociationIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAssociationIndicator <em>Type Association Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Association Indicator</em>' containment reference.
	 * @see #getTypeAssociationIndicator()
	 * @generated
	 */
	void setTypeAssociationIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type Augmentation Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Augmentation Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Augmentation Indicator</em>' containment reference.
	 * @see #setTypeAugmentationIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeAugmentationIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeAugmentationIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getTypeAugmentationIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAugmentationIndicator <em>Type Augmentation Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Augmentation Indicator</em>' containment reference.
	 * @see #getTypeAugmentationIndicator()
	 * @generated
	 */
	void setTypeAugmentationIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type Adapter Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Adapter Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Adapter Indicator</em>' containment reference.
	 * @see #setTypeAdapterIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeAdapterIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeAdapterIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getTypeAdapterIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeAdapterIndicator <em>Type Adapter Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Adapter Indicator</em>' containment reference.
	 * @see #getTypeAdapterIndicator()
	 * @generated
	 */
	void setTypeAdapterIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type Metadata Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Metadata Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Metadata Indicator</em>' containment reference.
	 * @see #setTypeMetadataIndicator(gov.niem.niem.proxy.xsd._2.Boolean)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeObjectType_TypeMetadataIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeMetadataIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.Boolean getTypeMetadataIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType#getTypeMetadataIndicator <em>Type Metadata Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Metadata Indicator</em>' containment reference.
	 * @see #getTypeMetadataIndicator()
	 * @generated
	 */
	void setTypeMetadataIndicator(gov.niem.niem.proxy.xsd._2.Boolean value);

} // TypeObjectType

/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetCategoryCode <em>Facet Category Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetText <em>Facet Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetDefinitionText <em>Facet Definition Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getFacetType()
 * @model extendedMetaData="name='FacetType' kind='elementOnly'"
 * @generated
 */
public interface FacetType extends ComplexObjectType {
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getFacetType_TypeQualifiedName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeQualifiedName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getTypeQualifiedName();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getTypeQualifiedName <em>Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Qualified Name</em>' containment reference.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(QName value);

	/**
	 * Returns the value of the '<em><b>Facet Category Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Category Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Category Code</em>' containment reference.
	 * @see #setFacetCategoryCode(FacetCategoryCodeType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getFacetType_FacetCategoryCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FacetCategoryCode' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetCategoryCodeType getFacetCategoryCode();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetCategoryCode <em>Facet Category Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet Category Code</em>' containment reference.
	 * @see #getFacetCategoryCode()
	 * @generated
	 */
	void setFacetCategoryCode(FacetCategoryCodeType value);

	/**
	 * Returns the value of the '<em><b>Facet Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Text</em>' containment reference.
	 * @see #setFacetText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getFacetType_FacetText()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FacetText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getFacetText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetText <em>Facet Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet Text</em>' containment reference.
	 * @see #getFacetText()
	 * @generated
	 */
	void setFacetText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Facet Definition Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Definition Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Definition Text</em>' containment reference.
	 * @see #setFacetDefinitionText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getFacetType_FacetDefinitionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FacetDefinitionText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getFacetDefinitionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.FacetType#getFacetDefinitionText <em>Facet Definition Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet Definition Text</em>' containment reference.
	 * @see #getFacetDefinitionText()
	 * @generated
	 */
	void setFacetDefinitionText(gov.niem.niem.proxy.xsd._2.String value);

} // FacetType

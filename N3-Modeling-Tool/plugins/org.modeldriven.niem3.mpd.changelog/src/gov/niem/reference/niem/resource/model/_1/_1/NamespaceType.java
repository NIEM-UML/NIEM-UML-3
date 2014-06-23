/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespacePrefixText <em>Namespace Prefix Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceVersionText <em>Namespace Version Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getNamespaceType()
 * @model extendedMetaData="name='NamespaceType' kind='elementOnly'"
 * @generated
 */
public interface NamespaceType extends ComplexObjectType {
	/**
	 * Returns the value of the '<em><b>Namespace URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace URI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace URI</em>' containment reference.
	 * @see #setNamespaceURI(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getNamespaceType_NamespaceURI()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NamespaceURI' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getNamespaceURI();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceURI <em>Namespace URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace URI</em>' containment reference.
	 * @see #getNamespaceURI()
	 * @generated
	 */
	void setNamespaceURI(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Namespace Prefix Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Prefix Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Prefix Text</em>' containment reference.
	 * @see #setNamespacePrefixText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getNamespaceType_NamespacePrefixText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamespacePrefixText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getNamespacePrefixText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespacePrefixText <em>Namespace Prefix Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix Text</em>' containment reference.
	 * @see #getNamespacePrefixText()
	 * @generated
	 */
	void setNamespacePrefixText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Namespace Version Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Version Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Version Text</em>' containment reference.
	 * @see #setNamespaceVersionText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getNamespaceType_NamespaceVersionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamespaceVersionText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getNamespaceVersionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType#getNamespaceVersionText <em>Namespace Version Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Version Text</em>' containment reference.
	 * @see #getNamespaceVersionText()
	 * @generated
	 */
	void setNamespaceVersionText(gov.niem.niem.proxy.xsd._2.String value);

} // NamespaceType

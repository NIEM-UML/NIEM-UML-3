/**
 */
package gov.niem.niem.proxy.xsd._2;

import java.lang.String;

import java.math.BigDecimal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for arbitrary precision decimal numbers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.Decimal#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.Decimal#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.Decimal#getLinkMetadata <em>Link Metadata</em>}</li>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.Decimal#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.proxy.xsd._2._2Package#getDecimal()
 * @model extendedMetaData="name='decimal' kind='simple'"
 * @generated
 */
public interface Decimal extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see gov.niem.niem.proxy.xsd._2._2Package#getDecimal_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link gov.niem.niem.proxy.xsd._2.Decimal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

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
	 * @see gov.niem.niem.proxy.xsd._2._2Package#getDecimal_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.niem.proxy.xsd._2.Decimal#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Metadata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Metadata</em>' attribute.
	 * @see #setLinkMetadata(List)
	 * @see gov.niem.niem.proxy.xsd._2._2Package#getDecimal_LinkMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='linkMetadata' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	List<String> getLinkMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.niem.proxy.xsd._2.Decimal#getLinkMetadata <em>Link Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Metadata</em>' attribute.
	 * @see #getLinkMetadata()
	 * @generated
	 */
	void setLinkMetadata(List<String> value);

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
	 * @see gov.niem.niem.proxy.xsd._2._2Package#getDecimal_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.niem.proxy.xsd._2.Decimal#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(List<String> value);

} // Decimal
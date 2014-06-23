/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

import java.util.List;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Names Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a set of qualified names.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getQualifiedNameList <em>Qualified Name List</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getQualifiedNamesType()
 * @model extendedMetaData="name='QualifiedNamesType' kind='elementOnly'"
 * @generated
 */
public interface QualifiedNamesType extends ObjectType {
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getQualifiedNamesType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getDescriptionText <em>Description Text</em>}' containment reference.
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
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getDescriptionText <em>Description Text</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Qualified Name List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of qualified names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name List</em>' attribute.
	 * @see #setQualifiedNameList(List)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getQualifiedNamesType_QualifiedNameList()
	 * @model dataType="gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNameListSimpleType" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='qualifiedNameList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<QName> getQualifiedNameList();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType#getQualifiedNameList <em>Qualified Name List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name List</em>' attribute.
	 * @see #getQualifiedNameList()
	 * @generated
	 */
	void setQualifiedNameList(List<QName> value);

} // QualifiedNamesType

/**
 */
package gov.niem.release.niem.niem.core._3._0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a name of a computer application used to process data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SoftwareNameType#getSoftwareVersionText <em>Software Version Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSoftwareNameType()
 * @model extendedMetaData="name='SoftwareNameType' kind='simple'"
 * @generated
 */
public interface SoftwareNameType extends TextType {
	/**
	 * Returns the value of the '<em><b>Software Version Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A version of a computer application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Version Text</em>' attribute.
	 * @see #setSoftwareVersionText(String)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSoftwareNameType_SoftwareVersionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='softwareVersionText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSoftwareVersionText();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.SoftwareNameType#getSoftwareVersionText <em>Software Version Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Version Text</em>' attribute.
	 * @see #getSoftwareVersionText()
	 * @generated
	 */
	void setSoftwareVersionText(String value);

} // SoftwareNameType

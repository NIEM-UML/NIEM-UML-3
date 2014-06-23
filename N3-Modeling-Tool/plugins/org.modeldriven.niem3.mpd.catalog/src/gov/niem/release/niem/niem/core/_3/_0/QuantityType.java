/**
 */
package gov.niem.release.niem.niem.core._3._0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a count or tally.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.QuantityType#getQuantityUnitText <em>Quantity Unit Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getQuantityType()
 * @model extendedMetaData="name='QuantityType' kind='simple'"
 * @generated
 */
public interface QuantityType extends NumericType {
	/**
	 * Returns the value of the '<em><b>Quantity Unit Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit of counting or tallying for a quantity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Unit Text</em>' attribute.
	 * @see #setQuantityUnitText(String)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getQuantityType_QuantityUnitText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='quantityUnitText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuantityUnitText();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.QuantityType#getQuantityUnitText <em>Quantity Unit Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Unit Text</em>' attribute.
	 * @see #getQuantityUnitText()
	 * @generated
	 */
	void setQuantityUnitText(String value);

} // QuantityType

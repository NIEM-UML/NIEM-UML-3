/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.Decimal;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a number value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NumericType#getConfidenceNumeric <em>Confidence Numeric</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NumericType#getToleranceNumeric <em>Tolerance Numeric</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNumericType()
 * @model extendedMetaData="name='NumericType' kind='simple'"
 * @generated
 */
public interface NumericType extends Decimal {
	/**
	 * Returns the value of the '<em><b>Confidence Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A decimal value that indicates belief in the accuracy of the tolerance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence Numeric</em>' attribute.
	 * @see #setConfidenceNumeric(BigDecimal)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNumericType_ConfidenceNumeric()
	 * @model dataType="gov.niem.release.niem.niem.core._3._0.PercentSimpleType"
	 *        extendedMetaData="kind='attribute' name='confidenceNumeric' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getConfidenceNumeric();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.NumericType#getConfidenceNumeric <em>Confidence Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Numeric</em>' attribute.
	 * @see #getConfidenceNumeric()
	 * @generated
	 */
	void setConfidenceNumeric(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tolerance Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An allowable range for error on a point estimate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tolerance Numeric</em>' attribute.
	 * @see #setToleranceNumeric(BigDecimal)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNumericType_ToleranceNumeric()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='toleranceNumeric' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getToleranceNumeric();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.NumericType#getToleranceNumeric <em>Tolerance Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance Numeric</em>' attribute.
	 * @see #getToleranceNumeric()
	 * @generated
	 */
	void setToleranceNumeric(BigDecimal value);

} // NumericType

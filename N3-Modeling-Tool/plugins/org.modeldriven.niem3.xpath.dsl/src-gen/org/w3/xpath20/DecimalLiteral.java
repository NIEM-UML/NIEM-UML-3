/**
 */
package org.w3.xpath20;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.DecimalLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getDecimalLiteral()
 * @model
 * @generated
 */
public interface DecimalLiteral extends NumericLiteral
{
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
   * @see org.w3.xpath20.Xpath20Package#getDecimalLiteral_Value()
   * @model
   * @generated
   */
  BigDecimal getValue();

  /**
   * Sets the value of the '{@link org.w3.xpath20.DecimalLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigDecimal value);

} // DecimalLiteral

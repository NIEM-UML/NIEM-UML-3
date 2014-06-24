/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reverse Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ReverseAxis#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getReverseAxis()
 * @model
 * @generated
 */
public interface ReverseAxis extends EObject
{
  /**
   * Returns the value of the '<em><b>Axis</b></em>' attribute.
   * The literals are from the enumeration {@link org.w3.xpath20.ReverseAxisEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' attribute.
   * @see org.w3.xpath20.ReverseAxisEnum
   * @see #setAxis(ReverseAxisEnum)
   * @see org.w3.xpath20.Xpath20Package#getReverseAxis_Axis()
   * @model
   * @generated
   */
  ReverseAxisEnum getAxis();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ReverseAxis#getAxis <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' attribute.
   * @see org.w3.xpath20.ReverseAxisEnum
   * @see #getAxis()
   * @generated
   */
  void setAxis(ReverseAxisEnum value);

} // ReverseAxis

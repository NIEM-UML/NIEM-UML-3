/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ForwardAxis#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getForwardAxis()
 * @model
 * @generated
 */
public interface ForwardAxis extends EObject
{
  /**
   * Returns the value of the '<em><b>Axis</b></em>' attribute.
   * The literals are from the enumeration {@link org.w3.xpath20.ForwardAxisEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' attribute.
   * @see org.w3.xpath20.ForwardAxisEnum
   * @see #setAxis(ForwardAxisEnum)
   * @see org.w3.xpath20.Xpath20Package#getForwardAxis_Axis()
   * @model
   * @generated
   */
  ForwardAxisEnum getAxis();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ForwardAxis#getAxis <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' attribute.
   * @see org.w3.xpath20.ForwardAxisEnum
   * @see #getAxis()
   * @generated
   */
  void setAxis(ForwardAxisEnum value);

} // ForwardAxis

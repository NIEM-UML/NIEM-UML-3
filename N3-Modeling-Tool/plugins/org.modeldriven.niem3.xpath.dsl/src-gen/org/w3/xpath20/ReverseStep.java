/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reverse Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ReverseStep#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3.xpath20.ReverseStep#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3.xpath20.ReverseStep#getAbbrev <em>Abbrev</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getReverseStep()
 * @model
 * @generated
 */
public interface ReverseStep extends EObject
{
  /**
   * Returns the value of the '<em><b>Axis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' containment reference.
   * @see #setAxis(ReverseAxis)
   * @see org.w3.xpath20.Xpath20Package#getReverseStep_Axis()
   * @model containment="true"
   * @generated
   */
  ReverseAxis getAxis();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ReverseStep#getAxis <em>Axis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' containment reference.
   * @see #getAxis()
   * @generated
   */
  void setAxis(ReverseAxis value);

  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(NodeTest)
   * @see org.w3.xpath20.Xpath20Package#getReverseStep_Test()
   * @model containment="true"
   * @generated
   */
  NodeTest getTest();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ReverseStep#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(NodeTest value);

  /**
   * Returns the value of the '<em><b>Abbrev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbrev</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbrev</em>' attribute.
   * @see #setAbbrev(String)
   * @see org.w3.xpath20.Xpath20Package#getReverseStep_Abbrev()
   * @model
   * @generated
   */
  String getAbbrev();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ReverseStep#getAbbrev <em>Abbrev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abbrev</em>' attribute.
   * @see #getAbbrev()
   * @generated
   */
  void setAbbrev(String value);

} // ReverseStep

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ForwardStep#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3.xpath20.ForwardStep#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3.xpath20.ForwardStep#getAbbrev <em>Abbrev</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getForwardStep()
 * @model
 * @generated
 */
public interface ForwardStep extends EObject
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
   * @see #setAxis(ForwardAxis)
   * @see org.w3.xpath20.Xpath20Package#getForwardStep_Axis()
   * @model containment="true"
   * @generated
   */
  ForwardAxis getAxis();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ForwardStep#getAxis <em>Axis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' containment reference.
   * @see #getAxis()
   * @generated
   */
  void setAxis(ForwardAxis value);

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
   * @see org.w3.xpath20.Xpath20Package#getForwardStep_Test()
   * @model containment="true"
   * @generated
   */
  NodeTest getTest();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ForwardStep#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(NodeTest value);

  /**
   * Returns the value of the '<em><b>Abbrev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbrev</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbrev</em>' containment reference.
   * @see #setAbbrev(AbbrevForwardStep)
   * @see org.w3.xpath20.Xpath20Package#getForwardStep_Abbrev()
   * @model containment="true"
   * @generated
   */
  AbbrevForwardStep getAbbrev();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ForwardStep#getAbbrev <em>Abbrev</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abbrev</em>' containment reference.
   * @see #getAbbrev()
   * @generated
   */
  void setAbbrev(AbbrevForwardStep value);

} // ForwardStep

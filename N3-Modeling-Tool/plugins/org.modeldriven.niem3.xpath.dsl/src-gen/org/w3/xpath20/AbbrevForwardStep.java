/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbrev Forward Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.AbbrevForwardStep#isAt <em>At</em>}</li>
 *   <li>{@link org.w3.xpath20.AbbrevForwardStep#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getAbbrevForwardStep()
 * @model
 * @generated
 */
public interface AbbrevForwardStep extends EObject
{
  /**
   * Returns the value of the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' attribute.
   * @see #setAt(boolean)
   * @see org.w3.xpath20.Xpath20Package#getAbbrevForwardStep_At()
   * @model
   * @generated
   */
  boolean isAt();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AbbrevForwardStep#isAt <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At</em>' attribute.
   * @see #isAt()
   * @generated
   */
  void setAt(boolean value);

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
   * @see org.w3.xpath20.Xpath20Package#getAbbrevForwardStep_Test()
   * @model containment="true"
   * @generated
   */
  NodeTest getTest();

  /**
   * Sets the value of the '{@link org.w3.xpath20.AbbrevForwardStep#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(NodeTest value);

} // AbbrevForwardStep

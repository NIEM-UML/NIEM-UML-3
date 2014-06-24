/**
 */
package org.w3.xpath20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.RelativePathExpr#getStep <em>Step</em>}</li>
 *   <li>{@link org.w3.xpath20.RelativePathExpr#getSeparator <em>Separator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getRelativePathExpr()
 * @model
 * @generated
 */
public interface RelativePathExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference list.
   * The list contents are of type {@link org.w3.xpath20.StepExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference list.
   * @see org.w3.xpath20.Xpath20Package#getRelativePathExpr_Step()
   * @model containment="true"
   * @generated
   */
  EList<StepExpr> getStep();

  /**
   * Returns the value of the '<em><b>Separator</b></em>' attribute list.
   * The list contents are of type {@link org.w3.xpath20.Separator}.
   * The literals are from the enumeration {@link org.w3.xpath20.Separator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separator</em>' attribute list.
   * @see org.w3.xpath20.Separator
   * @see org.w3.xpath20.Xpath20Package#getRelativePathExpr_Separator()
   * @model unique="false"
   * @generated
   */
  EList<Separator> getSeparator();

} // RelativePathExpr

/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.ValueExpr#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getValueExpr()
 * @model
 * @generated
 */
public interface ValueExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(PathExpr)
   * @see org.w3.xpath20.Xpath20Package#getValueExpr_Path()
   * @model containment="true"
   * @generated
   */
  PathExpr getPath();

  /**
   * Sets the value of the '{@link org.w3.xpath20.ValueExpr#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(PathExpr value);

} // ValueExpr

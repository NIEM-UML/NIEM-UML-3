/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.xpath20.PathExpr#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3.xpath20.PathExpr#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.xpath20.Xpath20Package#getPathExpr()
 * @model
 * @generated
 */
public interface PathExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separator</em>' attribute.
   * @see #setSeparator(String)
   * @see org.w3.xpath20.Xpath20Package#getPathExpr_Separator()
   * @model
   * @generated
   */
  String getSeparator();

  /**
   * Sets the value of the '{@link org.w3.xpath20.PathExpr#getSeparator <em>Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Separator</em>' attribute.
   * @see #getSeparator()
   * @generated
   */
  void setSeparator(String value);

  /**
   * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relative Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relative Path</em>' containment reference.
   * @see #setRelativePath(RelativePathExpr)
   * @see org.w3.xpath20.Xpath20Package#getPathExpr_RelativePath()
   * @model containment="true"
   * @generated
   */
  RelativePathExpr getRelativePath();

  /**
   * Sets the value of the '{@link org.w3.xpath20.PathExpr#getRelativePath <em>Relative Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relative Path</em>' containment reference.
   * @see #getRelativePath()
   * @generated
   */
  void setRelativePath(RelativePathExpr value);

} // PathExpr

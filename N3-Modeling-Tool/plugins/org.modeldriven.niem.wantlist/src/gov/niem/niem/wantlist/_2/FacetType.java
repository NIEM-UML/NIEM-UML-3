/**
 */
package gov.niem.niem.wantlist._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.FacetType#getFacet <em>Facet</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.FacetType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.wantlist._2.wantlistPackage#getFacetType()
 * @model extendedMetaData="name='FacetType' kind='empty'"
 * @generated
 */
public interface FacetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Facet</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.niem.niem.wantlist._2.FacetFacetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet</em>' attribute.
	 * @see gov.niem.niem.wantlist._2.FacetFacetType
	 * @see #isSetFacet()
	 * @see #unsetFacet()
	 * @see #setFacet(FacetFacetType)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getFacetType_Facet()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='facet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetFacetType getFacet();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.FacetType#getFacet <em>Facet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet</em>' attribute.
	 * @see gov.niem.niem.wantlist._2.FacetFacetType
	 * @see #isSetFacet()
	 * @see #unsetFacet()
	 * @see #getFacet()
	 * @generated
	 */
	void setFacet(FacetFacetType value);

	/**
	 * Unsets the value of the '{@link gov.niem.niem.wantlist._2.FacetType#getFacet <em>Facet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFacet()
	 * @see #getFacet()
	 * @see #setFacet(FacetFacetType)
	 * @generated
	 */
	void unsetFacet();

	/**
	 * Returns whether the value of the '{@link gov.niem.niem.wantlist._2.FacetType#getFacet <em>Facet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Facet</em>' attribute is set.
	 * @see #unsetFacet()
	 * @see #getFacet()
	 * @see #setFacet(FacetFacetType)
	 * @generated
	 */
	boolean isSetFacet();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getFacetType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.FacetType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // FacetType

/**
 */
package gov.niem.niem.wantlist._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Want List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.WantListType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.WantListType#getElement <em>Element</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.WantListType#getType <em>Type</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.WantListType#isNillableDefault <em>Nillable Default</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.WantListType#getProduct <em>Product</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.WantListType#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType()
 * @model extendedMetaData="name='WantListType' kind='elementOnly'"
 * @generated
 */
public interface WantListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeType> getAttribute();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementType> getElement();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TypeType> getType();

	/**
	 * Returns the value of the '<em><b>Nillable Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nillable Default</em>' attribute.
	 * @see #isSetNillableDefault()
	 * @see #unsetNillableDefault()
	 * @see #setNillableDefault(boolean)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType_NillableDefault()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='nillableDefault' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNillableDefault();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.WantListType#isNillableDefault <em>Nillable Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable Default</em>' attribute.
	 * @see #isSetNillableDefault()
	 * @see #unsetNillableDefault()
	 * @see #isNillableDefault()
	 * @generated
	 */
	void setNillableDefault(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.niem.wantlist._2.WantListType#isNillableDefault <em>Nillable Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNillableDefault()
	 * @see #isNillableDefault()
	 * @see #setNillableDefault(boolean)
	 * @generated
	 */
	void unsetNillableDefault();

	/**
	 * Returns whether the value of the '{@link gov.niem.niem.wantlist._2.WantListType#isNillableDefault <em>Nillable Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nillable Default</em>' attribute is set.
	 * @see #unsetNillableDefault()
	 * @see #isNillableDefault()
	 * @see #setNillableDefault(boolean)
	 * @generated
	 */
	boolean isSetNillableDefault();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' attribute.
	 * @see #setProduct(String)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType_Product()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProduct();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.WantListType#getProduct <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' attribute.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(String value);

	/**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #setRelease(String)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getWantListType_Release()
	 * @model dataType="gov.niem.niem.wantlist._2.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='release' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRelease();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.WantListType#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(String value);

} // WantListType

/**
 */
package gov.niem.niem.wantlist._2;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.TypeType#getAttributeInType <em>Attribute In Type</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.TypeType#getElementInType <em>Element In Type</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.TypeType#getFacet <em>Facet</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.TypeType#getUnionMember <em>Union Member</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.TypeType#isIsRequested <em>Is Requested</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.TypeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType()
 * @model extendedMetaData="name='TypeType' kind='elementOnly'"
 * @generated
 */
public interface TypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute In Type</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.AttributeInTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute In Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute In Type</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType_AttributeInType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeInType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeInTypeType> getAttributeInType();

	/**
	 * Returns the value of the '<em><b>Element In Type</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.ElementInTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element In Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element In Type</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType_ElementInType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ElementInType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementInTypeType> getElementInType();

	/**
	 * Returns the value of the '<em><b>Facet</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.FacetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType_Facet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacetType> getFacet();

	/**
	 * Returns the value of the '<em><b>Union Member</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.wantlist._2.UnionMemberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Member</em>' containment reference list.
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType_UnionMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnionMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnionMemberType> getUnionMember();

	/**
	 * Returns the value of the '<em><b>Is Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Requested</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Requested</em>' attribute.
	 * @see #isSetIsRequested()
	 * @see #unsetIsRequested()
	 * @see #setIsRequested(boolean)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType_IsRequested()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isRequested' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsRequested();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.TypeType#isIsRequested <em>Is Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Requested</em>' attribute.
	 * @see #isSetIsRequested()
	 * @see #unsetIsRequested()
	 * @see #isIsRequested()
	 * @generated
	 */
	void setIsRequested(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.niem.wantlist._2.TypeType#isIsRequested <em>Is Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRequested()
	 * @see #isIsRequested()
	 * @see #setIsRequested(boolean)
	 * @generated
	 */
	void unsetIsRequested();

	/**
	 * Returns whether the value of the '{@link gov.niem.niem.wantlist._2.TypeType#isIsRequested <em>Is Requested</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Requested</em>' attribute is set.
	 * @see #unsetIsRequested()
	 * @see #isIsRequested()
	 * @see #setIsRequested(boolean)
	 * @generated
	 */
	boolean isSetIsRequested();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(QName)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.TypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

} // TypeType

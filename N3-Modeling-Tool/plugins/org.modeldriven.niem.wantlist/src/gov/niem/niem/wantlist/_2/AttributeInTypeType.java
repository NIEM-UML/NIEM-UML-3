/**
 */
package gov.niem.niem.wantlist._2;

import java.math.BigInteger;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute In Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getName <em>Name</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.wantlist._2.wantlistPackage#getAttributeInTypeType()
 * @model extendedMetaData="name='AttributeInTypeType' kind='empty'"
 * @generated
 */
public interface AttributeInTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(BigInteger)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getAttributeInTypeType_MaxOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='maxOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxOccurs();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #setMinOccurs(BigInteger)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getAttributeInTypeType_MinOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinOccurs();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(BigInteger value);

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
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getAttributeInTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getAttributeInTypeType_Qualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.AttributeInTypeType#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

} // AttributeInTypeType

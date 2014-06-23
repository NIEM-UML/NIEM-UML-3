/**
 */
package gov.niem.niem.wantlist._2;

import java.math.BigInteger;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element In Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementInTypeType#getChoice <em>Choice</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementInTypeType#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementInTypeType#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementInTypeType#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementInTypeType#getName <em>Name</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementInTypeType#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType()
 * @model extendedMetaData="name='ElementInTypeType' kind='empty'"
 * @generated
 */
public interface ElementInTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' attribute.
	 * @see #setChoice(List)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType_Choice()
	 * @model dataType="gov.niem.niem.wantlist._2.PositiveIntegerListType" many="false"
	 *        extendedMetaData="kind='attribute' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getChoice();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getChoice <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' attribute.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference</em>' attribute.
	 * @see #isSetIsReference()
	 * @see #unsetIsReference()
	 * @see #setIsReference(boolean)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType_IsReference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isReference' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsReference();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#isIsReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference</em>' attribute.
	 * @see #isSetIsReference()
	 * @see #unsetIsReference()
	 * @see #isIsReference()
	 * @generated
	 */
	void setIsReference(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#isIsReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReference()
	 * @see #isIsReference()
	 * @see #setIsReference(boolean)
	 * @generated
	 */
	void unsetIsReference();

	/**
	 * Returns whether the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#isIsReference <em>Is Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Reference</em>' attribute is set.
	 * @see #unsetIsReference()
	 * @see #isIsReference()
	 * @see #setIsReference(boolean)
	 * @generated
	 */
	boolean isSetIsReference();

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(Object)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType_MaxOccurs()
	 * @model dataType="gov.niem.niem.wantlist._2.AllNNI"
	 *        extendedMetaData="kind='attribute' name='maxOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMaxOccurs();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(Object value);

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
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType_MinOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinOccurs();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getMinOccurs <em>Min Occurs</em>}' attribute.
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
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getName <em>Name</em>}' attribute.
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
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementInTypeType_Qualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementInTypeType#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

} // ElementInTypeType

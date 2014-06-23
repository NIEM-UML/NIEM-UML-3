/**
 */
package gov.niem.niem.wantlist._2;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementType#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementType#getName <em>Name</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementType#isNillable <em>Nillable</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.ElementType#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementType()
 * @model extendedMetaData="name='ElementType' kind='empty'"
 * @generated
 */
public interface ElementType extends EObject {
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
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementType_IsReference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isReference' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsReference();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementType#isIsReference <em>Is Reference</em>}' attribute.
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
	 * Unsets the value of the '{@link gov.niem.niem.wantlist._2.ElementType#isIsReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReference()
	 * @see #isIsReference()
	 * @see #setIsReference(boolean)
	 * @generated
	 */
	void unsetIsReference();

	/**
	 * Returns whether the value of the '{@link gov.niem.niem.wantlist._2.ElementType#isIsReference <em>Is Reference</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(QName)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #isSetNillable()
	 * @see #unsetNillable()
	 * @see #setNillable(boolean)
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementType_Nillable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='nillable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementType#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isSetNillable()
	 * @see #unsetNillable()
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.niem.wantlist._2.ElementType#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNillable()
	 * @see #isNillable()
	 * @see #setNillable(boolean)
	 * @generated
	 */
	void unsetNillable();

	/**
	 * Returns whether the value of the '{@link gov.niem.niem.wantlist._2.ElementType#isNillable <em>Nillable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nillable</em>' attribute is set.
	 * @see #unsetNillable()
	 * @see #isNillable()
	 * @see #setNillable(boolean)
	 * @generated
	 */
	boolean isSetNillable();

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
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#getElementType_Qualifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link gov.niem.niem.wantlist._2.ElementType#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

} // ElementType

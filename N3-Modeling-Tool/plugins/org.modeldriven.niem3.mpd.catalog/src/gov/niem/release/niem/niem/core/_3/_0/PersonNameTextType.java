/**
 */
package gov.niem.release.niem.niem.core._3._0;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Name Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a name by which a person is known, referred, or addressed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType#isPersonNameInitialIndicator <em>Person Name Initial Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType#getSequenceID <em>Sequence ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameTextType()
 * @model extendedMetaData="name='PersonNameTextType' kind='simple'"
 * @generated
 */
public interface PersonNameTextType extends ProperNameTextType {
	/**
	 * Returns the value of the '<em><b>Person Name Initial Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if value represents the first letter or initials of a persons name; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Initial Indicator</em>' attribute.
	 * @see #isSetPersonNameInitialIndicator()
	 * @see #unsetPersonNameInitialIndicator()
	 * @see #setPersonNameInitialIndicator(boolean)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameTextType_PersonNameInitialIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='personNameInitialIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPersonNameInitialIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType#isPersonNameInitialIndicator <em>Person Name Initial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name Initial Indicator</em>' attribute.
	 * @see #isSetPersonNameInitialIndicator()
	 * @see #unsetPersonNameInitialIndicator()
	 * @see #isPersonNameInitialIndicator()
	 * @generated
	 */
	void setPersonNameInitialIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType#isPersonNameInitialIndicator <em>Person Name Initial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersonNameInitialIndicator()
	 * @see #isPersonNameInitialIndicator()
	 * @see #setPersonNameInitialIndicator(boolean)
	 * @generated
	 */
	void unsetPersonNameInitialIndicator();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType#isPersonNameInitialIndicator <em>Person Name Initial Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Person Name Initial Indicator</em>' attribute is set.
	 * @see #unsetPersonNameInitialIndicator()
	 * @see #isPersonNameInitialIndicator()
	 * @see #setPersonNameInitialIndicator(boolean)
	 * @generated
	 */
	boolean isSetPersonNameInitialIndicator();

	/**
	 * Returns the value of the '<em><b>Sequence ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric identifier that explicitly sequences or orders elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence ID</em>' attribute.
	 * @see #setSequenceID(BigInteger)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameTextType_SequenceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='sequenceID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSequenceID();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType#getSequenceID <em>Sequence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence ID</em>' attribute.
	 * @see #getSequenceID()
	 * @generated
	 */
	void setSequenceID(BigInteger value);

} // PersonNameTextType

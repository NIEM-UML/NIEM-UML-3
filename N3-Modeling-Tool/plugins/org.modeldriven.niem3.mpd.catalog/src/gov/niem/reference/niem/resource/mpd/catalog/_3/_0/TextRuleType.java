/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for a rule drafted in a human language.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getRuleText <em>Rule Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getTextRuleType()
 * @model extendedMetaData="name='TextRuleType' kind='elementOnly'"
 * @generated
 */
public interface TextRuleType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getTextRuleType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @generated
	 */
	void setDescriptionText(TextType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getDescriptionText <em>Description Text</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description Text</em>' containment reference is set.
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	boolean isSetDescriptionText();

	/**
	 * Returns the value of the '<em><b>Rule Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rule written in a human language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Text</em>' containment reference.
	 * @see #setRuleText(TextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getTextRuleType_RuleText()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RuleText' namespace='##targetNamespace'"
	 * @generated
	 */
	TextType getRuleText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType#getRuleText <em>Rule Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Text</em>' containment reference.
	 * @see #getRuleText()
	 * @generated
	 */
	void setRuleText(TextType value);

} // TextRuleType

/**
 */
package gov.niem.release.niem.niem.core._3._0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a character string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TextType#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TextType#isPartialIndicator <em>Partial Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TextType#isTruncationIndicator <em>Truncation Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTextType()
 * @model extendedMetaData="name='TextType' kind='simple'"
 * @generated
 */
public interface TextType extends gov.niem.release.niem.proxy.xsd._3._0.String {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      
	 *       <h3>lang (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *      
	 *     </div>
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      <h4>Notes</h4>
	 *      <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *      <p>
	 *       See BCP 47 at <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *       and the IANA language subtag registry at
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *       for further information.
	 *      </p>
	 *      <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *     </div>
	 *    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTextType_Lang()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Partial Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if only partial information was available to the information source at the time when the data was captured in the system; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partial Indicator</em>' attribute.
	 * @see #isSetPartialIndicator()
	 * @see #unsetPartialIndicator()
	 * @see #setPartialIndicator(boolean)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTextType_PartialIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='partialIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPartialIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#isPartialIndicator <em>Partial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Indicator</em>' attribute.
	 * @see #isSetPartialIndicator()
	 * @see #unsetPartialIndicator()
	 * @see #isPartialIndicator()
	 * @generated
	 */
	void setPartialIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#isPartialIndicator <em>Partial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartialIndicator()
	 * @see #isPartialIndicator()
	 * @see #setPartialIndicator(boolean)
	 * @generated
	 */
	void unsetPartialIndicator();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#isPartialIndicator <em>Partial Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Partial Indicator</em>' attribute is set.
	 * @see #unsetPartialIndicator()
	 * @see #isPartialIndicator()
	 * @see #setPartialIndicator(boolean)
	 * @generated
	 */
	boolean isSetPartialIndicator();

	/**
	 * Returns the value of the '<em><b>Truncation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the length of a string is greater than the length of the field within which the string was stored in the exporting system; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Truncation Indicator</em>' attribute.
	 * @see #isSetTruncationIndicator()
	 * @see #unsetTruncationIndicator()
	 * @see #setTruncationIndicator(boolean)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTextType_TruncationIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='truncationIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTruncationIndicator();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#isTruncationIndicator <em>Truncation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncation Indicator</em>' attribute.
	 * @see #isSetTruncationIndicator()
	 * @see #unsetTruncationIndicator()
	 * @see #isTruncationIndicator()
	 * @generated
	 */
	void setTruncationIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#isTruncationIndicator <em>Truncation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTruncationIndicator()
	 * @see #isTruncationIndicator()
	 * @see #setTruncationIndicator(boolean)
	 * @generated
	 */
	void unsetTruncationIndicator();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.TextType#isTruncationIndicator <em>Truncation Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Truncation Indicator</em>' attribute is set.
	 * @see #unsetTruncationIndicator()
	 * @see #isTruncationIndicator()
	 * @see #setTruncationIndicator(boolean)
	 * @generated
	 */
	boolean isSetTruncationIndicator();

} // TextType

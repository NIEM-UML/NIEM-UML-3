/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeSummaryText <em>Change Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeReasonText <em>Change Reason Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeFullDescriptionText <em>Change Full Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeCode <em>Change Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeInformationType()
 * @model extendedMetaData="name='ChangeInformationType' kind='elementOnly'"
 * @generated
 */
public interface ChangeInformationType extends ComplexObjectType {
	/**
	 * Returns the value of the '<em><b>Change Summary Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Summary Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Summary Text</em>' containment reference.
	 * @see #setChangeSummaryText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeInformationType_ChangeSummaryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeSummaryText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeSummaryText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeSummaryText <em>Change Summary Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Summary Text</em>' containment reference.
	 * @see #getChangeSummaryText()
	 * @generated
	 */
	void setChangeSummaryText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Reason Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Reason Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Reason Text</em>' containment reference.
	 * @see #setChangeReasonText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeInformationType_ChangeReasonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeReasonText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeReasonText <em>Change Reason Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Reason Text</em>' containment reference.
	 * @see #getChangeReasonText()
	 * @generated
	 */
	void setChangeReasonText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change Full Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Full Description Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Full Description Text</em>' containment reference.
	 * @see #setChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeInformationType_ChangeFullDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeFullDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.niem.proxy.xsd._2.String getChangeFullDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType#getChangeFullDescriptionText <em>Change Full Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Full Description Text</em>' containment reference.
	 * @see #getChangeFullDescriptionText()
	 * @generated
	 */
	void setChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String value);

	/**
	 * Returns the value of the '<em><b>Change NCCT Issue Number</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.niem.proxy.xsd._2.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change NCCT Issue Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change NCCT Issue Number</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeInformationType_ChangeNCCTIssueNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeNCCTIssueNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.niem.proxy.xsd._2.Integer> getChangeNCCTIssueNumber();

	/**
	 * Returns the value of the '<em><b>Change Code</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Code</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeInformationType_ChangeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangeCodeType> getChangeCode();

} // ChangeInformationType

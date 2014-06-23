/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an MPD catalog.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType#getMPD <em>MPD</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getCatalogType()
 * @model extendedMetaData="name='CatalogType' kind='elementOnly'"
 * @generated
 */
public interface CatalogType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>MPD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Model Package Description (MPD).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MPD</em>' containment reference.
	 * @see #setMPD(MPDType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getCatalogType_MPD()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MPD' namespace='##targetNamespace'"
	 * @generated
	 */
	MPDType getMPD();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType#getMPD <em>MPD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPD</em>' containment reference.
	 * @see #getMPD()
	 * @generated
	 */
	void setMPD(MPDType value);

} // CatalogType

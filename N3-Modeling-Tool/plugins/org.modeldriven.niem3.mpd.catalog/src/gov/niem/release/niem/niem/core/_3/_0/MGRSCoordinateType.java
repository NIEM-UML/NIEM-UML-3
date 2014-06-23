/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGRS Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a coordinate from the Military Grid Reference System (MGRS) which represents a location using the Universal Transverse Mercator (UTM) and the UPS grid systems and a unique military grid labeling convention.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSCoordinateID <em>MGRS Coordinate ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSEastingValue <em>MGRS Easting Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSNorthingValue <em>MGRS Northing Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getGeographicDatumGroup <em>Geographic Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getGeographicDatum <em>Geographic Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSGridZoneID <em>MGRS Grid Zone ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSGridZoneSquareID <em>MGRS Grid Zone Square ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSCoordinateAugmentationPointGroup <em>MGRS Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSCoordinateAugmentationPoint <em>MGRS Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType()
 * @model extendedMetaData="name='MGRSCoordinateType' kind='elementOnly'"
 * @generated
 */
public interface MGRSCoordinateType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>MGRS Coordinate ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a Military Grid Reference System (MGRS) coordinate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Coordinate ID</em>' containment reference.
	 * @see #isSetMGRSCoordinateID()
	 * @see #unsetMGRSCoordinateID()
	 * @see #setMGRSCoordinateID(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSCoordinateID()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MGRSCoordinateID' namespace='##targetNamespace'"
	 * @generated
	 */
	gov.niem.release.niem.proxy.xsd._3._0.String getMGRSCoordinateID();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSCoordinateID <em>MGRS Coordinate ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MGRS Coordinate ID</em>' containment reference.
	 * @see #isSetMGRSCoordinateID()
	 * @see #unsetMGRSCoordinateID()
	 * @see #getMGRSCoordinateID()
	 * @generated
	 */
	void setMGRSCoordinateID(gov.niem.release.niem.proxy.xsd._3._0.String value);

	/**
	 * Unsets the value of the '{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSCoordinateID <em>MGRS Coordinate ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMGRSCoordinateID()
	 * @see #getMGRSCoordinateID()
	 * @see #setMGRSCoordinateID(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @generated
	 */
	void unsetMGRSCoordinateID();

	/**
	 * Returns whether the value of the '{@link gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType#getMGRSCoordinateID <em>MGRS Coordinate ID</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MGRS Coordinate ID</em>' containment reference is set.
	 * @see #unsetMGRSCoordinateID()
	 * @see #getMGRSCoordinateID()
	 * @see #setMGRSCoordinateID(gov.niem.release.niem.proxy.xsd._3._0.String)
	 * @generated
	 */
	boolean isSetMGRSCoordinateID();

	/**
	 * Returns the value of the '<em><b>MGRS Easting Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distance east within a MGRS zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Easting Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSEastingValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MGRSEastingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getMGRSEastingValue();

	/**
	 * Returns the value of the '<em><b>MGRS Northing Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distance north within a MGRS zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Northing Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSNorthingValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MGRSNorthingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getMGRSNorthingValue();

	/**
	 * Returns the value of the '<em><b>Geographic Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a spatial reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Datum Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_GeographicDatumGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GeographicDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGeographicDatumGroup();

	/**
	 * Returns the value of the '<em><b>Geographic Datum</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a spatial reference system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographic Datum</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_GeographicDatum()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeographicDatum' namespace='##targetNamespace' group='GeographicDatum:group'"
	 * @generated
	 */
	EList<EObject> getGeographicDatum();

	/**
	 * Returns the value of the '<em><b>MGRS Grid Zone ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a MGRS grid zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Grid Zone ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSGridZoneID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MGRSGridZoneID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMGRSGridZoneID();

	/**
	 * Returns the value of the '<em><b>MGRS Grid Zone Square ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a specific 100,000 meter squared region within a MGRS grid zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Grid Zone Square ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSGridZoneSquareID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MGRSGridZoneSquareID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMGRSGridZoneSquareID();

	/**
	 * Returns the value of the '<em><b>MGRS Coordinate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MGRSCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Coordinate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSCoordinateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MGRSCoordinateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMGRSCoordinateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>MGRS Coordinate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MGRSCoordinateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MGRS Coordinate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMGRSCoordinateType_MGRSCoordinateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MGRSCoordinateAugmentationPoint' namespace='##targetNamespace' group='MGRSCoordinateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getMGRSCoordinateAugmentationPoint();

} // MGRSCoordinateType

/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.niem.structures._2.ComplexObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Log Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType#getChangeInformationAbstractGroup <em>Change Information Abstract Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType#getChangeInformationAbstract <em>Change Information Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogEntryType()
 * @model extendedMetaData="name='ChangeLogEntryType' kind='elementOnly'"
 * @generated
 */
public interface ChangeLogEntryType extends ComplexObjectType {
	/**
	 * Returns the value of the '<em><b>Change Information Abstract Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Information Abstract Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Information Abstract Group</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogEntryType_ChangeInformationAbstractGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ChangeInformationAbstract:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getChangeInformationAbstractGroup();

	/**
	 * Returns the value of the '<em><b>Change Information Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Information Abstract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Information Abstract</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getChangeLogEntryType_ChangeInformationAbstract()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChangeInformationAbstract' namespace='##targetNamespace' group='ChangeInformationAbstract:group'"
	 * @generated
	 */
	EList<EObject> getChangeInformationAbstract();

} // ChangeLogEntryType

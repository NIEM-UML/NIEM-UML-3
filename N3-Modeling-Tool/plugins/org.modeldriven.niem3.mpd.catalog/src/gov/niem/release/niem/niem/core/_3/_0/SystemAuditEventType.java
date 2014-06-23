/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Audit Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a system event for audit reporting purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType#getSystemOperatingModeGroup <em>System Operating Mode Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType#getSystemOperatingMode <em>System Operating Mode</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType#getSystemUserNameGroup <em>System User Name Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType#getSystemUserName <em>System User Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType#getSystemAuditEventAugmentationPointGroup <em>System Audit Event Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemAuditEventType#getSystemAuditEventAugmentationPoint <em>System Audit Event Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType()
 * @model extendedMetaData="name='SystemAuditEventType' kind='elementOnly'"
 * @generated
 */
public interface SystemAuditEventType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>System Operating Mode Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for the operating mode of a system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Operating Mode Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType_SystemOperatingModeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SystemOperatingMode:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSystemOperatingModeGroup();

	/**
	 * Returns the value of the '<em><b>System Operating Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for the operating mode of a system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Operating Mode</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType_SystemOperatingMode()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemOperatingMode' namespace='##targetNamespace' group='SystemOperatingMode:group'"
	 * @generated
	 */
	EList<EObject> getSystemOperatingMode();

	/**
	 * Returns the value of the '<em><b>System User Name Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a user name associated with a system audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System User Name Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType_SystemUserNameGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SystemUserName:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSystemUserNameGroup();

	/**
	 * Returns the value of the '<em><b>System User Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a user name associated with a system audit event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System User Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType_SystemUserName()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemUserName' namespace='##targetNamespace' group='SystemUserName:group'"
	 * @generated
	 */
	EList<EObject> getSystemUserName();

	/**
	 * Returns the value of the '<em><b>System Audit Event Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SystemAuditEventType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Audit Event Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType_SystemAuditEventAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SystemAuditEventAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSystemAuditEventAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>System Audit Event Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SystemAuditEventType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Audit Event Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemAuditEventType_SystemAuditEventAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemAuditEventAugmentationPoint' namespace='##targetNamespace' group='SystemAuditEventAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getSystemAuditEventAugmentationPoint();

} // SystemAuditEventType

/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Log Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getChangeLogSummaryText <em>Change Log Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getChangeInformation <em>Change Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getNewPropertyEntry <em>New Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getNewTypeEntry <em>New Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getNewFacetEntry <em>New Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getNewNamespaceEntry <em>New Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getModifiedPropertyEntry <em>Modified Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getModifiedTypeEntry <em>Modified Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getModifiedFacetEntry <em>Modified Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getRemovedPropertyEntry <em>Removed Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getRemovedTypeEntry <em>Removed Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getRemovedFacetEntry <em>Removed Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeLogTypeImpl#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeLogTypeImpl extends ComplexObjectTypeImpl implements ChangeLogType {
	/**
	 * The cached value of the '{@link #getChangeLogSummaryText() <em>Change Log Summary Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeLogSummaryText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String changeLogSummaryText;

	/**
	 * The cached value of the '{@link #getChangeLogSubmitterName() <em>Change Log Submitter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeLogSubmitterName()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String changeLogSubmitterName;

	/**
	 * The cached value of the '{@link #getChangeLogApplicationInstructionsText() <em>Change Log Application Instructions Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeLogApplicationInstructionsText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String changeLogApplicationInstructionsText;

	/**
	 * The cached value of the '{@link #getChangeInformation() <em>Change Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeInformationType> changeInformation;

	/**
	 * The cached value of the '{@link #getNewPropertyEntry() <em>New Property Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewPropertyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<NewPropertyEntryType> newPropertyEntry;

	/**
	 * The cached value of the '{@link #getNewTypeEntry() <em>New Type Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTypeEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<NewTypeEntryType> newTypeEntry;

	/**
	 * The cached value of the '{@link #getNewTypeContainsPropertyEntry() <em>New Type Contains Property Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTypeContainsPropertyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<NewTypeContainsPropertyEntryType> newTypeContainsPropertyEntry;

	/**
	 * The cached value of the '{@link #getNewFacetEntry() <em>New Facet Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewFacetEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<NewFacetEntryType> newFacetEntry;

	/**
	 * The cached value of the '{@link #getNewNamespaceEntry() <em>New Namespace Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewNamespaceEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<NewNamespaceEntryType> newNamespaceEntry;

	/**
	 * The cached value of the '{@link #getModifiedPropertyEntry() <em>Modified Property Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedPropertyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifiedPropertyEntryType> modifiedPropertyEntry;

	/**
	 * The cached value of the '{@link #getModifiedTypeEntry() <em>Modified Type Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedTypeEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifiedTypeEntryType> modifiedTypeEntry;

	/**
	 * The cached value of the '{@link #getModifiedTypeContainsPropertyEntry() <em>Modified Type Contains Property Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedTypeContainsPropertyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifiedTypeContainsPropertyEntryType> modifiedTypeContainsPropertyEntry;

	/**
	 * The cached value of the '{@link #getModifiedFacetEntry() <em>Modified Facet Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedFacetEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifiedFacetEntryType> modifiedFacetEntry;

	/**
	 * The cached value of the '{@link #getModifiedNamespaceEntry() <em>Modified Namespace Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedNamespaceEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifiedNamespaceEntryType> modifiedNamespaceEntry;

	/**
	 * The cached value of the '{@link #getRemovedPropertyEntry() <em>Removed Property Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedPropertyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<RemovedPropertyEntryType> removedPropertyEntry;

	/**
	 * The cached value of the '{@link #getRemovedTypeEntry() <em>Removed Type Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedTypeEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<RemovedTypeEntryType> removedTypeEntry;

	/**
	 * The cached value of the '{@link #getRemovedTypeContainsPropertyEntry() <em>Removed Type Contains Property Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedTypeContainsPropertyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<RemovedTypeContainsPropertyEntryType> removedTypeContainsPropertyEntry;

	/**
	 * The cached value of the '{@link #getRemovedFacetEntry() <em>Removed Facet Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedFacetEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<RemovedFacetEntryType> removedFacetEntry;

	/**
	 * The cached value of the '{@link #getRemovedNamespaceEntry() <em>Removed Namespace Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedNamespaceEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<RemovedNamespaceEntryType> removedNamespaceEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeLogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.CHANGE_LOG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeLogSummaryText() {
		return changeLogSummaryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeLogSummaryText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldChangeLogSummaryText = changeLogSummaryText;
		changeLogSummaryText = newChangeLogSummaryText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT, oldChangeLogSummaryText, newChangeLogSummaryText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeLogSummaryText) {
		if (newChangeLogSummaryText != changeLogSummaryText) {
			NotificationChain msgs = null;
			if (changeLogSummaryText != null)
				msgs = ((InternalEObject)changeLogSummaryText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT, null, msgs);
			if (newChangeLogSummaryText != null)
				msgs = ((InternalEObject)newChangeLogSummaryText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT, null, msgs);
			msgs = basicSetChangeLogSummaryText(newChangeLogSummaryText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT, newChangeLogSummaryText, newChangeLogSummaryText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeLogSubmitterName() {
		return changeLogSubmitterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String newChangeLogSubmitterName, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldChangeLogSubmitterName = changeLogSubmitterName;
		changeLogSubmitterName = newChangeLogSubmitterName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME, oldChangeLogSubmitterName, newChangeLogSubmitterName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String newChangeLogSubmitterName) {
		if (newChangeLogSubmitterName != changeLogSubmitterName) {
			NotificationChain msgs = null;
			if (changeLogSubmitterName != null)
				msgs = ((InternalEObject)changeLogSubmitterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME, null, msgs);
			if (newChangeLogSubmitterName != null)
				msgs = ((InternalEObject)newChangeLogSubmitterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME, null, msgs);
			msgs = basicSetChangeLogSubmitterName(newChangeLogSubmitterName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME, newChangeLogSubmitterName, newChangeLogSubmitterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeLogApplicationInstructionsText() {
		return changeLogApplicationInstructionsText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String newChangeLogApplicationInstructionsText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldChangeLogApplicationInstructionsText = changeLogApplicationInstructionsText;
		changeLogApplicationInstructionsText = newChangeLogApplicationInstructionsText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, oldChangeLogApplicationInstructionsText, newChangeLogApplicationInstructionsText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String newChangeLogApplicationInstructionsText) {
		if (newChangeLogApplicationInstructionsText != changeLogApplicationInstructionsText) {
			NotificationChain msgs = null;
			if (changeLogApplicationInstructionsText != null)
				msgs = ((InternalEObject)changeLogApplicationInstructionsText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, null, msgs);
			if (newChangeLogApplicationInstructionsText != null)
				msgs = ((InternalEObject)newChangeLogApplicationInstructionsText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, null, msgs);
			msgs = basicSetChangeLogApplicationInstructionsText(newChangeLogApplicationInstructionsText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, newChangeLogApplicationInstructionsText, newChangeLogApplicationInstructionsText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeInformationType> getChangeInformation() {
		if (changeInformation == null) {
			changeInformation = new EObjectContainmentEList<ChangeInformationType>(ChangeInformationType.class, this, _1Package.CHANGE_LOG_TYPE__CHANGE_INFORMATION);
		}
		return changeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NewPropertyEntryType> getNewPropertyEntry() {
		if (newPropertyEntry == null) {
			newPropertyEntry = new EObjectContainmentEList<NewPropertyEntryType>(NewPropertyEntryType.class, this, _1Package.CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY);
		}
		return newPropertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NewTypeEntryType> getNewTypeEntry() {
		if (newTypeEntry == null) {
			newTypeEntry = new EObjectContainmentEList<NewTypeEntryType>(NewTypeEntryType.class, this, _1Package.CHANGE_LOG_TYPE__NEW_TYPE_ENTRY);
		}
		return newTypeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NewTypeContainsPropertyEntryType> getNewTypeContainsPropertyEntry() {
		if (newTypeContainsPropertyEntry == null) {
			newTypeContainsPropertyEntry = new EObjectContainmentEList<NewTypeContainsPropertyEntryType>(NewTypeContainsPropertyEntryType.class, this, _1Package.CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY);
		}
		return newTypeContainsPropertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NewFacetEntryType> getNewFacetEntry() {
		if (newFacetEntry == null) {
			newFacetEntry = new EObjectContainmentEList<NewFacetEntryType>(NewFacetEntryType.class, this, _1Package.CHANGE_LOG_TYPE__NEW_FACET_ENTRY);
		}
		return newFacetEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NewNamespaceEntryType> getNewNamespaceEntry() {
		if (newNamespaceEntry == null) {
			newNamespaceEntry = new EObjectContainmentEList<NewNamespaceEntryType>(NewNamespaceEntryType.class, this, _1Package.CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY);
		}
		return newNamespaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifiedPropertyEntryType> getModifiedPropertyEntry() {
		if (modifiedPropertyEntry == null) {
			modifiedPropertyEntry = new EObjectContainmentEList<ModifiedPropertyEntryType>(ModifiedPropertyEntryType.class, this, _1Package.CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY);
		}
		return modifiedPropertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifiedTypeEntryType> getModifiedTypeEntry() {
		if (modifiedTypeEntry == null) {
			modifiedTypeEntry = new EObjectContainmentEList<ModifiedTypeEntryType>(ModifiedTypeEntryType.class, this, _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY);
		}
		return modifiedTypeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifiedTypeContainsPropertyEntryType> getModifiedTypeContainsPropertyEntry() {
		if (modifiedTypeContainsPropertyEntry == null) {
			modifiedTypeContainsPropertyEntry = new EObjectContainmentEList<ModifiedTypeContainsPropertyEntryType>(ModifiedTypeContainsPropertyEntryType.class, this, _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY);
		}
		return modifiedTypeContainsPropertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifiedFacetEntryType> getModifiedFacetEntry() {
		if (modifiedFacetEntry == null) {
			modifiedFacetEntry = new EObjectContainmentEList<ModifiedFacetEntryType>(ModifiedFacetEntryType.class, this, _1Package.CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY);
		}
		return modifiedFacetEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifiedNamespaceEntryType> getModifiedNamespaceEntry() {
		if (modifiedNamespaceEntry == null) {
			modifiedNamespaceEntry = new EObjectContainmentEList<ModifiedNamespaceEntryType>(ModifiedNamespaceEntryType.class, this, _1Package.CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY);
		}
		return modifiedNamespaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovedPropertyEntryType> getRemovedPropertyEntry() {
		if (removedPropertyEntry == null) {
			removedPropertyEntry = new EObjectContainmentEList<RemovedPropertyEntryType>(RemovedPropertyEntryType.class, this, _1Package.CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY);
		}
		return removedPropertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovedTypeEntryType> getRemovedTypeEntry() {
		if (removedTypeEntry == null) {
			removedTypeEntry = new EObjectContainmentEList<RemovedTypeEntryType>(RemovedTypeEntryType.class, this, _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY);
		}
		return removedTypeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovedTypeContainsPropertyEntryType> getRemovedTypeContainsPropertyEntry() {
		if (removedTypeContainsPropertyEntry == null) {
			removedTypeContainsPropertyEntry = new EObjectContainmentEList<RemovedTypeContainsPropertyEntryType>(RemovedTypeContainsPropertyEntryType.class, this, _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY);
		}
		return removedTypeContainsPropertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovedFacetEntryType> getRemovedFacetEntry() {
		if (removedFacetEntry == null) {
			removedFacetEntry = new EObjectContainmentEList<RemovedFacetEntryType>(RemovedFacetEntryType.class, this, _1Package.CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY);
		}
		return removedFacetEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemovedNamespaceEntryType> getRemovedNamespaceEntry() {
		if (removedNamespaceEntry == null) {
			removedNamespaceEntry = new EObjectContainmentEList<RemovedNamespaceEntryType>(RemovedNamespaceEntryType.class, this, _1Package.CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY);
		}
		return removedNamespaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT:
				return basicSetChangeLogSummaryText(null, msgs);
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME:
				return basicSetChangeLogSubmitterName(null, msgs);
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				return basicSetChangeLogApplicationInstructionsText(null, msgs);
			case _1Package.CHANGE_LOG_TYPE__CHANGE_INFORMATION:
				return ((InternalEList<?>)getChangeInformation()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY:
				return ((InternalEList<?>)getNewPropertyEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_ENTRY:
				return ((InternalEList<?>)getNewTypeEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				return ((InternalEList<?>)getNewTypeContainsPropertyEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__NEW_FACET_ENTRY:
				return ((InternalEList<?>)getNewFacetEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY:
				return ((InternalEList<?>)getNewNamespaceEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY:
				return ((InternalEList<?>)getModifiedPropertyEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY:
				return ((InternalEList<?>)getModifiedTypeEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return ((InternalEList<?>)getModifiedTypeContainsPropertyEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY:
				return ((InternalEList<?>)getModifiedFacetEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY:
				return ((InternalEList<?>)getModifiedNamespaceEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY:
				return ((InternalEList<?>)getRemovedPropertyEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY:
				return ((InternalEList<?>)getRemovedTypeEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return ((InternalEList<?>)getRemovedTypeContainsPropertyEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY:
				return ((InternalEList<?>)getRemovedFacetEntry()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY:
				return ((InternalEList<?>)getRemovedNamespaceEntry()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT:
				return getChangeLogSummaryText();
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME:
				return getChangeLogSubmitterName();
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				return getChangeLogApplicationInstructionsText();
			case _1Package.CHANGE_LOG_TYPE__CHANGE_INFORMATION:
				return getChangeInformation();
			case _1Package.CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY:
				return getNewPropertyEntry();
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_ENTRY:
				return getNewTypeEntry();
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getNewTypeContainsPropertyEntry();
			case _1Package.CHANGE_LOG_TYPE__NEW_FACET_ENTRY:
				return getNewFacetEntry();
			case _1Package.CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY:
				return getNewNamespaceEntry();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY:
				return getModifiedPropertyEntry();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY:
				return getModifiedTypeEntry();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getModifiedTypeContainsPropertyEntry();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY:
				return getModifiedFacetEntry();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY:
				return getModifiedNamespaceEntry();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY:
				return getRemovedPropertyEntry();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY:
				return getRemovedTypeEntry();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getRemovedTypeContainsPropertyEntry();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY:
				return getRemovedFacetEntry();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY:
				return getRemovedNamespaceEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT:
				setChangeLogSummaryText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME:
				setChangeLogSubmitterName((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				setChangeLogApplicationInstructionsText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_INFORMATION:
				getChangeInformation().clear();
				getChangeInformation().addAll((Collection<? extends ChangeInformationType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY:
				getNewPropertyEntry().clear();
				getNewPropertyEntry().addAll((Collection<? extends NewPropertyEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_ENTRY:
				getNewTypeEntry().clear();
				getNewTypeEntry().addAll((Collection<? extends NewTypeEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				getNewTypeContainsPropertyEntry().clear();
				getNewTypeContainsPropertyEntry().addAll((Collection<? extends NewTypeContainsPropertyEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_FACET_ENTRY:
				getNewFacetEntry().clear();
				getNewFacetEntry().addAll((Collection<? extends NewFacetEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY:
				getNewNamespaceEntry().clear();
				getNewNamespaceEntry().addAll((Collection<? extends NewNamespaceEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY:
				getModifiedPropertyEntry().clear();
				getModifiedPropertyEntry().addAll((Collection<? extends ModifiedPropertyEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY:
				getModifiedTypeEntry().clear();
				getModifiedTypeEntry().addAll((Collection<? extends ModifiedTypeEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				getModifiedTypeContainsPropertyEntry().clear();
				getModifiedTypeContainsPropertyEntry().addAll((Collection<? extends ModifiedTypeContainsPropertyEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY:
				getModifiedFacetEntry().clear();
				getModifiedFacetEntry().addAll((Collection<? extends ModifiedFacetEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY:
				getModifiedNamespaceEntry().clear();
				getModifiedNamespaceEntry().addAll((Collection<? extends ModifiedNamespaceEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY:
				getRemovedPropertyEntry().clear();
				getRemovedPropertyEntry().addAll((Collection<? extends RemovedPropertyEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY:
				getRemovedTypeEntry().clear();
				getRemovedTypeEntry().addAll((Collection<? extends RemovedTypeEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				getRemovedTypeContainsPropertyEntry().clear();
				getRemovedTypeContainsPropertyEntry().addAll((Collection<? extends RemovedTypeContainsPropertyEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY:
				getRemovedFacetEntry().clear();
				getRemovedFacetEntry().addAll((Collection<? extends RemovedFacetEntryType>)newValue);
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY:
				getRemovedNamespaceEntry().clear();
				getRemovedNamespaceEntry().addAll((Collection<? extends RemovedNamespaceEntryType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT:
				setChangeLogSummaryText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME:
				setChangeLogSubmitterName((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				setChangeLogApplicationInstructionsText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_INFORMATION:
				getChangeInformation().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY:
				getNewPropertyEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_ENTRY:
				getNewTypeEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				getNewTypeContainsPropertyEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_FACET_ENTRY:
				getNewFacetEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY:
				getNewNamespaceEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY:
				getModifiedPropertyEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY:
				getModifiedTypeEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				getModifiedTypeContainsPropertyEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY:
				getModifiedFacetEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY:
				getModifiedNamespaceEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY:
				getRemovedPropertyEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY:
				getRemovedTypeEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				getRemovedTypeContainsPropertyEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY:
				getRemovedFacetEntry().clear();
				return;
			case _1Package.CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY:
				getRemovedNamespaceEntry().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT:
				return changeLogSummaryText != null;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME:
				return changeLogSubmitterName != null;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				return changeLogApplicationInstructionsText != null;
			case _1Package.CHANGE_LOG_TYPE__CHANGE_INFORMATION:
				return changeInformation != null && !changeInformation.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY:
				return newPropertyEntry != null && !newPropertyEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_ENTRY:
				return newTypeEntry != null && !newTypeEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				return newTypeContainsPropertyEntry != null && !newTypeContainsPropertyEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__NEW_FACET_ENTRY:
				return newFacetEntry != null && !newFacetEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY:
				return newNamespaceEntry != null && !newNamespaceEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY:
				return modifiedPropertyEntry != null && !modifiedPropertyEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY:
				return modifiedTypeEntry != null && !modifiedTypeEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return modifiedTypeContainsPropertyEntry != null && !modifiedTypeContainsPropertyEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY:
				return modifiedFacetEntry != null && !modifiedFacetEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY:
				return modifiedNamespaceEntry != null && !modifiedNamespaceEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY:
				return removedPropertyEntry != null && !removedPropertyEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY:
				return removedTypeEntry != null && !removedTypeEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return removedTypeContainsPropertyEntry != null && !removedTypeContainsPropertyEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY:
				return removedFacetEntry != null && !removedFacetEntry.isEmpty();
			case _1Package.CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY:
				return removedNamespaceEntry != null && !removedNamespaceEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeLogTypeImpl

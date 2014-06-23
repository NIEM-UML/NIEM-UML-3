/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.niem.structures._2.ReferenceType;

import gov.niem.reference.niem.resource.model._1._1.FacetType;
import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;
import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;
import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot;
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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeCode <em>Change Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeFullDescriptionText <em>Change Full Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeInformation <em>Change Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeInformationAbstract <em>Change Information Abstract</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeInformationReference <em>Change Information Reference</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeLog <em>Change Log</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeLogApplicationInstructionsText <em>Change Log Application Instructions Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeLogSubmitterName <em>Change Log Submitter Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeLogSummaryText <em>Change Log Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeReasonText <em>Change Reason Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getChangeSummaryText <em>Change Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getModifiedFacetEntry <em>Modified Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getModifiedNamespaceEntry <em>Modified Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getModifiedPropertyEntry <em>Modified Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getModifiedTypeContainsPropertyEntry <em>Modified Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getModifiedTypeEntry <em>Modified Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewFacet <em>New Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewFacetEntry <em>New Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewNamespace <em>New Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewNamespaceEntry <em>New Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewProperty <em>New Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewPropertyEntry <em>New Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewType <em>New Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewTypeContainsProperty <em>New Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewTypeContainsPropertyEntry <em>New Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getNewTypeEntry <em>New Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getOriginalFacet <em>Original Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getOriginalNamespace <em>Original Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getOriginalProperty <em>Original Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedFacet <em>Removed Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedFacetEntry <em>Removed Facet Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedNamespace <em>Removed Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedNamespaceEntry <em>Removed Namespace Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedProperty <em>Removed Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedPropertyEntry <em>Removed Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedType <em>Removed Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedTypeContainsPropertyEntry <em>Removed Type Contains Property Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getRemovedTypeEntry <em>Removed Type Entry</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getUpdatedFacet <em>Updated Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getUpdatedNamespace <em>Updated Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getUpdatedProperty <em>Updated Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getUpdatedType <em>Updated Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.DocumentRootImpl#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _1Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCodeType getChangeCode() {
		return (ChangeCodeType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeCode(ChangeCodeType newChangeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_CODE, newChangeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeCode(ChangeCodeType newChangeCode) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_CODE, newChangeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeFullDescriptionText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String newChangeFullDescriptionText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT, newChangeFullDescriptionText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String newChangeFullDescriptionText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT, newChangeFullDescriptionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInformationType getChangeInformation() {
		return (ChangeInformationType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInformation(ChangeInformationType newChangeInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION, newChangeInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInformation(ChangeInformationType newChangeInformation) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION, newChangeInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getChangeInformationAbstract() {
		return (EObject)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInformationAbstract(EObject newChangeInformationAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT, newChangeInformationAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getChangeInformationReference() {
		return (ReferenceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInformationReference(ReferenceType newChangeInformationReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE, newChangeInformationReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInformationReference(ReferenceType newChangeInformationReference) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE, newChangeInformationReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLogType getChangeLog() {
		return (ChangeLogType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLog(ChangeLogType newChangeLog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG, newChangeLog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLog(ChangeLogType newChangeLog) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG, newChangeLog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeLogApplicationInstructionsText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String newChangeLogApplicationInstructionsText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, newChangeLogApplicationInstructionsText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogApplicationInstructionsText(gov.niem.niem.proxy.xsd._2.String newChangeLogApplicationInstructionsText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT, newChangeLogApplicationInstructionsText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeLogSubmitterName() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String newChangeLogSubmitterName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME, newChangeLogSubmitterName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogSubmitterName(gov.niem.niem.proxy.xsd._2.String newChangeLogSubmitterName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME, newChangeLogSubmitterName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeLogSummaryText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeLogSummaryText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT, newChangeLogSummaryText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeLogSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeLogSummaryText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT, newChangeLogSummaryText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Integer getChangeNCCTIssueNumber() {
		return (gov.niem.niem.proxy.xsd._2.Integer)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeNCCTIssueNumber(gov.niem.niem.proxy.xsd._2.Integer newChangeNCCTIssueNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER, newChangeNCCTIssueNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeNCCTIssueNumber(gov.niem.niem.proxy.xsd._2.Integer newChangeNCCTIssueNumber) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER, newChangeNCCTIssueNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeReasonText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_REASON_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeReasonText(gov.niem.niem.proxy.xsd._2.String newChangeReasonText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_REASON_TEXT, newChangeReasonText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeReasonText(gov.niem.niem.proxy.xsd._2.String newChangeReasonText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_REASON_TEXT, newChangeReasonText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeSummaryText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeSummaryText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT, newChangeSummaryText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeSummaryText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT, newChangeSummaryText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedFacetEntryType getModifiedFacetEntry() {
		return (ModifiedFacetEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifiedFacetEntry(ModifiedFacetEntryType newModifiedFacetEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY, newModifiedFacetEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedFacetEntry(ModifiedFacetEntryType newModifiedFacetEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY, newModifiedFacetEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedNamespaceEntryType getModifiedNamespaceEntry() {
		return (ModifiedNamespaceEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifiedNamespaceEntry(ModifiedNamespaceEntryType newModifiedNamespaceEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY, newModifiedNamespaceEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedNamespaceEntry(ModifiedNamespaceEntryType newModifiedNamespaceEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY, newModifiedNamespaceEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedPropertyEntryType getModifiedPropertyEntry() {
		return (ModifiedPropertyEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifiedPropertyEntry(ModifiedPropertyEntryType newModifiedPropertyEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY, newModifiedPropertyEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedPropertyEntry(ModifiedPropertyEntryType newModifiedPropertyEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY, newModifiedPropertyEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedTypeContainsPropertyEntryType getModifiedTypeContainsPropertyEntry() {
		return (ModifiedTypeContainsPropertyEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifiedTypeContainsPropertyEntry(ModifiedTypeContainsPropertyEntryType newModifiedTypeContainsPropertyEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY, newModifiedTypeContainsPropertyEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedTypeContainsPropertyEntry(ModifiedTypeContainsPropertyEntryType newModifiedTypeContainsPropertyEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY, newModifiedTypeContainsPropertyEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedTypeEntryType getModifiedTypeEntry() {
		return (ModifiedTypeEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifiedTypeEntry(ModifiedTypeEntryType newModifiedTypeEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY, newModifiedTypeEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedTypeEntry(ModifiedTypeEntryType newModifiedTypeEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY, newModifiedTypeEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getNewFacet() {
		return (FacetType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_FACET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewFacet(FacetType newNewFacet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_FACET, newNewFacet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewFacet(FacetType newNewFacet) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_FACET, newNewFacet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFacetEntryType getNewFacetEntry() {
		return (NewFacetEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_FACET_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewFacetEntry(NewFacetEntryType newNewFacetEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_FACET_ENTRY, newNewFacetEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewFacetEntry(NewFacetEntryType newNewFacetEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_FACET_ENTRY, newNewFacetEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getNewNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewNamespace(NamespaceType newNewNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_NAMESPACE, newNewNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewNamespace(NamespaceType newNewNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_NAMESPACE, newNewNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewNamespaceEntryType getNewNamespaceEntry() {
		return (NewNamespaceEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewNamespaceEntry(NewNamespaceEntryType newNewNamespaceEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY, newNewNamespaceEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewNamespaceEntry(NewNamespaceEntryType newNewNamespaceEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY, newNewNamespaceEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getNewProperty() {
		return (PropertyObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewProperty(PropertyObjectType newNewProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_PROPERTY, newNewProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewProperty(PropertyObjectType newNewProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_PROPERTY, newNewProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPropertyEntryType getNewPropertyEntry() {
		return (NewPropertyEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewPropertyEntry(NewPropertyEntryType newNewPropertyEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY, newNewPropertyEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewPropertyEntry(NewPropertyEntryType newNewPropertyEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY, newNewPropertyEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getNewType() {
		return (TypeObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewType(TypeObjectType newNewType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE, newNewType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewType(TypeObjectType newNewType) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE, newNewType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getNewTypeContainsProperty() {
		return (TypeContainsPropertyType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewTypeContainsProperty(TypeContainsPropertyType newNewTypeContainsProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY, newNewTypeContainsProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTypeContainsProperty(TypeContainsPropertyType newNewTypeContainsProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY, newNewTypeContainsProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTypeContainsPropertyEntryType getNewTypeContainsPropertyEntry() {
		return (NewTypeContainsPropertyEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewTypeContainsPropertyEntry(NewTypeContainsPropertyEntryType newNewTypeContainsPropertyEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY, newNewTypeContainsPropertyEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTypeContainsPropertyEntry(NewTypeContainsPropertyEntryType newNewTypeContainsPropertyEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY, newNewTypeContainsPropertyEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTypeEntryType getNewTypeEntry() {
		return (NewTypeEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewTypeEntry(NewTypeEntryType newNewTypeEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_ENTRY, newNewTypeEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTypeEntry(NewTypeEntryType newNewTypeEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NEW_TYPE_ENTRY, newNewTypeEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getOriginalFacet() {
		return (FacetType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_FACET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalFacet(FacetType newOriginalFacet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_FACET, newOriginalFacet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFacet(FacetType newOriginalFacet) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_FACET, newOriginalFacet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getOriginalNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalNamespace(NamespaceType newOriginalNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_NAMESPACE, newOriginalNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalNamespace(NamespaceType newOriginalNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_NAMESPACE, newOriginalNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getOriginalProperty() {
		return (PropertyObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalProperty(PropertyObjectType newOriginalProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_PROPERTY, newOriginalProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalProperty(PropertyObjectType newOriginalProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_PROPERTY, newOriginalProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getOriginalType() {
		return (TypeObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalType(TypeObjectType newOriginalType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_TYPE, newOriginalType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalType(TypeObjectType newOriginalType) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_TYPE, newOriginalType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getOriginalTypeContainsProperty() {
		return (TypeContainsPropertyType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalTypeContainsProperty(TypeContainsPropertyType newOriginalTypeContainsProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY, newOriginalTypeContainsProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalTypeContainsProperty(TypeContainsPropertyType newOriginalTypeContainsProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY, newOriginalTypeContainsProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getRemovedFacet() {
		return (FacetType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_FACET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedFacet(FacetType newRemovedFacet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_FACET, newRemovedFacet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedFacet(FacetType newRemovedFacet) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_FACET, newRemovedFacet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedFacetEntryType getRemovedFacetEntry() {
		return (RemovedFacetEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_FACET_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedFacetEntry(RemovedFacetEntryType newRemovedFacetEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_FACET_ENTRY, newRemovedFacetEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedFacetEntry(RemovedFacetEntryType newRemovedFacetEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_FACET_ENTRY, newRemovedFacetEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getRemovedNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedNamespace(NamespaceType newRemovedNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_NAMESPACE, newRemovedNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedNamespace(NamespaceType newRemovedNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_NAMESPACE, newRemovedNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedNamespaceEntryType getRemovedNamespaceEntry() {
		return (RemovedNamespaceEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedNamespaceEntry(RemovedNamespaceEntryType newRemovedNamespaceEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY, newRemovedNamespaceEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedNamespaceEntry(RemovedNamespaceEntryType newRemovedNamespaceEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY, newRemovedNamespaceEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getRemovedProperty() {
		return (PropertyObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedProperty(PropertyObjectType newRemovedProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_PROPERTY, newRemovedProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedProperty(PropertyObjectType newRemovedProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_PROPERTY, newRemovedProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedPropertyEntryType getRemovedPropertyEntry() {
		return (RemovedPropertyEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedPropertyEntry(RemovedPropertyEntryType newRemovedPropertyEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY, newRemovedPropertyEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedPropertyEntry(RemovedPropertyEntryType newRemovedPropertyEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY, newRemovedPropertyEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getRemovedType() {
		return (TypeObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedType(TypeObjectType newRemovedType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE, newRemovedType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedType(TypeObjectType newRemovedType) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE, newRemovedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getRemovedTypeContainsProperty() {
		return (TypeContainsPropertyType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedTypeContainsProperty(TypeContainsPropertyType newRemovedTypeContainsProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY, newRemovedTypeContainsProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedTypeContainsProperty(TypeContainsPropertyType newRemovedTypeContainsProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY, newRemovedTypeContainsProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedTypeContainsPropertyEntryType getRemovedTypeContainsPropertyEntry() {
		return (RemovedTypeContainsPropertyEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedTypeContainsPropertyEntry(RemovedTypeContainsPropertyEntryType newRemovedTypeContainsPropertyEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY, newRemovedTypeContainsPropertyEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedTypeContainsPropertyEntry(RemovedTypeContainsPropertyEntryType newRemovedTypeContainsPropertyEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY, newRemovedTypeContainsPropertyEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedTypeEntryType getRemovedTypeEntry() {
		return (RemovedTypeEntryType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedTypeEntry(RemovedTypeEntryType newRemovedTypeEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY, newRemovedTypeEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedTypeEntry(RemovedTypeEntryType newRemovedTypeEntry) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY, newRemovedTypeEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getUpdatedFacet() {
		return (FacetType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__UPDATED_FACET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedFacet(FacetType newUpdatedFacet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__UPDATED_FACET, newUpdatedFacet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedFacet(FacetType newUpdatedFacet) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__UPDATED_FACET, newUpdatedFacet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getUpdatedNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__UPDATED_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedNamespace(NamespaceType newUpdatedNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__UPDATED_NAMESPACE, newUpdatedNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedNamespace(NamespaceType newUpdatedNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__UPDATED_NAMESPACE, newUpdatedNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getUpdatedProperty() {
		return (PropertyObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__UPDATED_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedProperty(PropertyObjectType newUpdatedProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__UPDATED_PROPERTY, newUpdatedProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedProperty(PropertyObjectType newUpdatedProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__UPDATED_PROPERTY, newUpdatedProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getUpdatedType() {
		return (TypeObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__UPDATED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedType(TypeObjectType newUpdatedType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__UPDATED_TYPE, newUpdatedType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedType(TypeObjectType newUpdatedType) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__UPDATED_TYPE, newUpdatedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getUpdatedTypeContainsProperty() {
		return (TypeContainsPropertyType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedTypeContainsProperty(TypeContainsPropertyType newUpdatedTypeContainsProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY, newUpdatedTypeContainsProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedTypeContainsProperty(TypeContainsPropertyType newUpdatedTypeContainsProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY, newUpdatedTypeContainsProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_CODE:
				return basicSetChangeCode(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT:
				return basicSetChangeFullDescriptionText(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION:
				return basicSetChangeInformation(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT:
				return basicSetChangeInformationAbstract(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE:
				return basicSetChangeInformationReference(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG:
				return basicSetChangeLog(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				return basicSetChangeLogApplicationInstructionsText(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME:
				return basicSetChangeLogSubmitterName(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT:
				return basicSetChangeLogSummaryText(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER:
				return basicSetChangeNCCTIssueNumber(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_REASON_TEXT:
				return basicSetChangeReasonText(null, msgs);
			case _1Package.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT:
				return basicSetChangeSummaryText(null, msgs);
			case _1Package.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY:
				return basicSetModifiedFacetEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY:
				return basicSetModifiedNamespaceEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY:
				return basicSetModifiedPropertyEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return basicSetModifiedTypeContainsPropertyEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY:
				return basicSetModifiedTypeEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_FACET:
				return basicSetNewFacet(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_FACET_ENTRY:
				return basicSetNewFacetEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE:
				return basicSetNewNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY:
				return basicSetNewNamespaceEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY:
				return basicSetNewProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY:
				return basicSetNewPropertyEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_TYPE:
				return basicSetNewType(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY:
				return basicSetNewTypeContainsProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				return basicSetNewTypeContainsPropertyEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_ENTRY:
				return basicSetNewTypeEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__ORIGINAL_FACET:
				return basicSetOriginalFacet(null, msgs);
			case _1Package.DOCUMENT_ROOT__ORIGINAL_NAMESPACE:
				return basicSetOriginalNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__ORIGINAL_PROPERTY:
				return basicSetOriginalProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE:
				return basicSetOriginalType(null, msgs);
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				return basicSetOriginalTypeContainsProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET:
				return basicSetRemovedFacet(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET_ENTRY:
				return basicSetRemovedFacetEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE:
				return basicSetRemovedNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY:
				return basicSetRemovedNamespaceEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY:
				return basicSetRemovedProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY:
				return basicSetRemovedPropertyEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE:
				return basicSetRemovedType(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY:
				return basicSetRemovedTypeContainsProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return basicSetRemovedTypeContainsPropertyEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY:
				return basicSetRemovedTypeEntry(null, msgs);
			case _1Package.DOCUMENT_ROOT__UPDATED_FACET:
				return basicSetUpdatedFacet(null, msgs);
			case _1Package.DOCUMENT_ROOT__UPDATED_NAMESPACE:
				return basicSetUpdatedNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__UPDATED_PROPERTY:
				return basicSetUpdatedProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE:
				return basicSetUpdatedType(null, msgs);
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY:
				return basicSetUpdatedTypeContainsProperty(null, msgs);
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
			case _1Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _1Package.DOCUMENT_ROOT__CHANGE_CODE:
				return getChangeCode();
			case _1Package.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT:
				return getChangeFullDescriptionText();
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION:
				return getChangeInformation();
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT:
				return getChangeInformationAbstract();
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE:
				return getChangeInformationReference();
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG:
				return getChangeLog();
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				return getChangeLogApplicationInstructionsText();
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME:
				return getChangeLogSubmitterName();
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT:
				return getChangeLogSummaryText();
			case _1Package.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER:
				return getChangeNCCTIssueNumber();
			case _1Package.DOCUMENT_ROOT__CHANGE_REASON_TEXT:
				return getChangeReasonText();
			case _1Package.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT:
				return getChangeSummaryText();
			case _1Package.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY:
				return getModifiedFacetEntry();
			case _1Package.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY:
				return getModifiedNamespaceEntry();
			case _1Package.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY:
				return getModifiedPropertyEntry();
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getModifiedTypeContainsPropertyEntry();
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY:
				return getModifiedTypeEntry();
			case _1Package.DOCUMENT_ROOT__NEW_FACET:
				return getNewFacet();
			case _1Package.DOCUMENT_ROOT__NEW_FACET_ENTRY:
				return getNewFacetEntry();
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE:
				return getNewNamespace();
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY:
				return getNewNamespaceEntry();
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY:
				return getNewProperty();
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY:
				return getNewPropertyEntry();
			case _1Package.DOCUMENT_ROOT__NEW_TYPE:
				return getNewType();
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY:
				return getNewTypeContainsProperty();
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getNewTypeContainsPropertyEntry();
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_ENTRY:
				return getNewTypeEntry();
			case _1Package.DOCUMENT_ROOT__ORIGINAL_FACET:
				return getOriginalFacet();
			case _1Package.DOCUMENT_ROOT__ORIGINAL_NAMESPACE:
				return getOriginalNamespace();
			case _1Package.DOCUMENT_ROOT__ORIGINAL_PROPERTY:
				return getOriginalProperty();
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE:
				return getOriginalType();
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				return getOriginalTypeContainsProperty();
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET:
				return getRemovedFacet();
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET_ENTRY:
				return getRemovedFacetEntry();
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE:
				return getRemovedNamespace();
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY:
				return getRemovedNamespaceEntry();
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY:
				return getRemovedProperty();
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY:
				return getRemovedPropertyEntry();
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE:
				return getRemovedType();
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY:
				return getRemovedTypeContainsProperty();
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getRemovedTypeContainsPropertyEntry();
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY:
				return getRemovedTypeEntry();
			case _1Package.DOCUMENT_ROOT__UPDATED_FACET:
				return getUpdatedFacet();
			case _1Package.DOCUMENT_ROOT__UPDATED_NAMESPACE:
				return getUpdatedNamespace();
			case _1Package.DOCUMENT_ROOT__UPDATED_PROPERTY:
				return getUpdatedProperty();
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE:
				return getUpdatedType();
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY:
				return getUpdatedTypeContainsProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_CODE:
				setChangeCode((ChangeCodeType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT:
				setChangeFullDescriptionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION:
				setChangeInformation((ChangeInformationType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE:
				setChangeInformationReference((ReferenceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG:
				setChangeLog((ChangeLogType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				setChangeLogApplicationInstructionsText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME:
				setChangeLogSubmitterName((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT:
				setChangeLogSummaryText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER:
				setChangeNCCTIssueNumber((gov.niem.niem.proxy.xsd._2.Integer)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_REASON_TEXT:
				setChangeReasonText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT:
				setChangeSummaryText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY:
				setModifiedFacetEntry((ModifiedFacetEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY:
				setModifiedNamespaceEntry((ModifiedNamespaceEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY:
				setModifiedPropertyEntry((ModifiedPropertyEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				setModifiedTypeContainsPropertyEntry((ModifiedTypeContainsPropertyEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY:
				setModifiedTypeEntry((ModifiedTypeEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_FACET:
				setNewFacet((FacetType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_FACET_ENTRY:
				setNewFacetEntry((NewFacetEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE:
				setNewNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY:
				setNewNamespaceEntry((NewNamespaceEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY:
				setNewProperty((PropertyObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY:
				setNewPropertyEntry((NewPropertyEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE:
				setNewType((TypeObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY:
				setNewTypeContainsProperty((TypeContainsPropertyType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				setNewTypeContainsPropertyEntry((NewTypeContainsPropertyEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_ENTRY:
				setNewTypeEntry((NewTypeEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_FACET:
				setOriginalFacet((FacetType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_NAMESPACE:
				setOriginalNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_PROPERTY:
				setOriginalProperty((PropertyObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE:
				setOriginalType((TypeObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				setOriginalTypeContainsProperty((TypeContainsPropertyType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET:
				setRemovedFacet((FacetType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET_ENTRY:
				setRemovedFacetEntry((RemovedFacetEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE:
				setRemovedNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY:
				setRemovedNamespaceEntry((RemovedNamespaceEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY:
				setRemovedProperty((PropertyObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY:
				setRemovedPropertyEntry((RemovedPropertyEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE:
				setRemovedType((TypeObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY:
				setRemovedTypeContainsProperty((TypeContainsPropertyType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				setRemovedTypeContainsPropertyEntry((RemovedTypeContainsPropertyEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY:
				setRemovedTypeEntry((RemovedTypeEntryType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_FACET:
				setUpdatedFacet((FacetType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_NAMESPACE:
				setUpdatedNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_PROPERTY:
				setUpdatedProperty((PropertyObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE:
				setUpdatedType((TypeObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY:
				setUpdatedTypeContainsProperty((TypeContainsPropertyType)newValue);
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
			case _1Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_CODE:
				setChangeCode((ChangeCodeType)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT:
				setChangeFullDescriptionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION:
				setChangeInformation((ChangeInformationType)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE:
				setChangeInformationReference((ReferenceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG:
				setChangeLog((ChangeLogType)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				setChangeLogApplicationInstructionsText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME:
				setChangeLogSubmitterName((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT:
				setChangeLogSummaryText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER:
				setChangeNCCTIssueNumber((gov.niem.niem.proxy.xsd._2.Integer)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_REASON_TEXT:
				setChangeReasonText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT:
				setChangeSummaryText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY:
				setModifiedFacetEntry((ModifiedFacetEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY:
				setModifiedNamespaceEntry((ModifiedNamespaceEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY:
				setModifiedPropertyEntry((ModifiedPropertyEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				setModifiedTypeContainsPropertyEntry((ModifiedTypeContainsPropertyEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY:
				setModifiedTypeEntry((ModifiedTypeEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_FACET:
				setNewFacet((FacetType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_FACET_ENTRY:
				setNewFacetEntry((NewFacetEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE:
				setNewNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY:
				setNewNamespaceEntry((NewNamespaceEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY:
				setNewProperty((PropertyObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY:
				setNewPropertyEntry((NewPropertyEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE:
				setNewType((TypeObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY:
				setNewTypeContainsProperty((TypeContainsPropertyType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				setNewTypeContainsPropertyEntry((NewTypeContainsPropertyEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_ENTRY:
				setNewTypeEntry((NewTypeEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_FACET:
				setOriginalFacet((FacetType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_NAMESPACE:
				setOriginalNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_PROPERTY:
				setOriginalProperty((PropertyObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE:
				setOriginalType((TypeObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				setOriginalTypeContainsProperty((TypeContainsPropertyType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET:
				setRemovedFacet((FacetType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET_ENTRY:
				setRemovedFacetEntry((RemovedFacetEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE:
				setRemovedNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY:
				setRemovedNamespaceEntry((RemovedNamespaceEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY:
				setRemovedProperty((PropertyObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY:
				setRemovedPropertyEntry((RemovedPropertyEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE:
				setRemovedType((TypeObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY:
				setRemovedTypeContainsProperty((TypeContainsPropertyType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				setRemovedTypeContainsPropertyEntry((RemovedTypeContainsPropertyEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY:
				setRemovedTypeEntry((RemovedTypeEntryType)null);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_FACET:
				setUpdatedFacet((FacetType)null);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_NAMESPACE:
				setUpdatedNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_PROPERTY:
				setUpdatedProperty((PropertyObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE:
				setUpdatedType((TypeObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY:
				setUpdatedTypeContainsProperty((TypeContainsPropertyType)null);
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
			case _1Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _1Package.DOCUMENT_ROOT__CHANGE_CODE:
				return getChangeCode() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT:
				return getChangeFullDescriptionText() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION:
				return getChangeInformation() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT:
				return getChangeInformationAbstract() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE:
				return getChangeInformationReference() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG:
				return getChangeLog() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT:
				return getChangeLogApplicationInstructionsText() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME:
				return getChangeLogSubmitterName() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT:
				return getChangeLogSummaryText() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER:
				return getChangeNCCTIssueNumber() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_REASON_TEXT:
				return getChangeReasonText() != null;
			case _1Package.DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT:
				return getChangeSummaryText() != null;
			case _1Package.DOCUMENT_ROOT__MODIFIED_FACET_ENTRY:
				return getModifiedFacetEntry() != null;
			case _1Package.DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY:
				return getModifiedNamespaceEntry() != null;
			case _1Package.DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY:
				return getModifiedPropertyEntry() != null;
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getModifiedTypeContainsPropertyEntry() != null;
			case _1Package.DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY:
				return getModifiedTypeEntry() != null;
			case _1Package.DOCUMENT_ROOT__NEW_FACET:
				return getNewFacet() != null;
			case _1Package.DOCUMENT_ROOT__NEW_FACET_ENTRY:
				return getNewFacetEntry() != null;
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE:
				return getNewNamespace() != null;
			case _1Package.DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY:
				return getNewNamespaceEntry() != null;
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY:
				return getNewProperty() != null;
			case _1Package.DOCUMENT_ROOT__NEW_PROPERTY_ENTRY:
				return getNewPropertyEntry() != null;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE:
				return getNewType() != null;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY:
				return getNewTypeContainsProperty() != null;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getNewTypeContainsPropertyEntry() != null;
			case _1Package.DOCUMENT_ROOT__NEW_TYPE_ENTRY:
				return getNewTypeEntry() != null;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_FACET:
				return getOriginalFacet() != null;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_NAMESPACE:
				return getOriginalNamespace() != null;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_PROPERTY:
				return getOriginalProperty() != null;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE:
				return getOriginalType() != null;
			case _1Package.DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				return getOriginalTypeContainsProperty() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET:
				return getRemovedFacet() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_FACET_ENTRY:
				return getRemovedFacetEntry() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE:
				return getRemovedNamespace() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY:
				return getRemovedNamespaceEntry() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY:
				return getRemovedProperty() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY:
				return getRemovedPropertyEntry() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE:
				return getRemovedType() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY:
				return getRemovedTypeContainsProperty() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY:
				return getRemovedTypeContainsPropertyEntry() != null;
			case _1Package.DOCUMENT_ROOT__REMOVED_TYPE_ENTRY:
				return getRemovedTypeEntry() != null;
			case _1Package.DOCUMENT_ROOT__UPDATED_FACET:
				return getUpdatedFacet() != null;
			case _1Package.DOCUMENT_ROOT__UPDATED_NAMESPACE:
				return getUpdatedNamespace() != null;
			case _1Package.DOCUMENT_ROOT__UPDATED_PROPERTY:
				return getUpdatedProperty() != null;
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE:
				return getUpdatedType() != null;
			case _1Package.DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY:
				return getUpdatedTypeContainsProperty() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

/**
 */
package gov.niem.niem.structures._2.impl;

import gov.niem.niem.structures._2.AugmentationType;
import gov.niem.niem.structures._2.DocumentRoot;
import gov.niem.niem.structures._2.MetadataType;
import gov.niem.niem.structures._2._2Package;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getAugmentation <em>Augmentation</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getLinkMetadata <em>Link Metadata</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.niem.niem.structures._2.impl.DocumentRootImpl#getSequenceID <em>Sequence ID</em>}</li>
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkMetadata() <em>Link Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> LINK_METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkMetadata() <em>Link Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMetadata()
	 * @generated
	 * @ordered
	 */
	protected List<String> linkMetadata = LINK_METADATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadata1() <em>Metadata1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> METADATA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadata1() <em>Metadata1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata1()
	 * @generated
	 * @ordered
	 */
	protected List<String> metadata1 = METADATA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceID() <em>Sequence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SEQUENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceID() <em>Sequence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sequenceID = SEQUENCE_ID_EDEFAULT;

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
		return _2Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _2Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AugmentationType getAugmentation() {
		return (AugmentationType)getMixed().get(_2Package.Literals.DOCUMENT_ROOT__AUGMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAugmentation(AugmentationType newAugmentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2Package.Literals.DOCUMENT_ROOT__AUGMENTATION, newAugmentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType getMetadata() {
		return (MetadataType)getMixed().get(_2Package.Literals.DOCUMENT_ROOT__METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2Package.Literals.DOCUMENT_ROOT__METADATA, newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getLinkMetadata() {
		return linkMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkMetadata(List<String> newLinkMetadata) {
		List<String> oldLinkMetadata = linkMetadata;
		linkMetadata = newLinkMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.DOCUMENT_ROOT__LINK_METADATA, oldLinkMetadata, linkMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getMetadata1() {
		return metadata1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata1(List<String> newMetadata1) {
		List<String> oldMetadata1 = metadata1;
		metadata1 = newMetadata1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.DOCUMENT_ROOT__METADATA1, oldMetadata1, metadata1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.DOCUMENT_ROOT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSequenceID() {
		return sequenceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceID(BigInteger newSequenceID) {
		BigInteger oldSequenceID = sequenceID;
		sequenceID = newSequenceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.DOCUMENT_ROOT__SEQUENCE_ID, oldSequenceID, sequenceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _2Package.DOCUMENT_ROOT__AUGMENTATION:
				return basicSetAugmentation(null, msgs);
			case _2Package.DOCUMENT_ROOT__METADATA:
				return basicSetMetadata(null, msgs);
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
			case _2Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _2Package.DOCUMENT_ROOT__AUGMENTATION:
				return getAugmentation();
			case _2Package.DOCUMENT_ROOT__METADATA:
				return getMetadata();
			case _2Package.DOCUMENT_ROOT__ID:
				return getId();
			case _2Package.DOCUMENT_ROOT__LINK_METADATA:
				return getLinkMetadata();
			case _2Package.DOCUMENT_ROOT__METADATA1:
				return getMetadata1();
			case _2Package.DOCUMENT_ROOT__REF:
				return getRef();
			case _2Package.DOCUMENT_ROOT__SEQUENCE_ID:
				return getSequenceID();
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
			case _2Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _2Package.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case _2Package.DOCUMENT_ROOT__LINK_METADATA:
				setLinkMetadata((List<String>)newValue);
				return;
			case _2Package.DOCUMENT_ROOT__METADATA1:
				setMetadata1((List<String>)newValue);
				return;
			case _2Package.DOCUMENT_ROOT__REF:
				setRef((String)newValue);
				return;
			case _2Package.DOCUMENT_ROOT__SEQUENCE_ID:
				setSequenceID((BigInteger)newValue);
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
			case _2Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _2Package.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case _2Package.DOCUMENT_ROOT__LINK_METADATA:
				setLinkMetadata(LINK_METADATA_EDEFAULT);
				return;
			case _2Package.DOCUMENT_ROOT__METADATA1:
				setMetadata1(METADATA1_EDEFAULT);
				return;
			case _2Package.DOCUMENT_ROOT__REF:
				setRef(REF_EDEFAULT);
				return;
			case _2Package.DOCUMENT_ROOT__SEQUENCE_ID:
				setSequenceID(SEQUENCE_ID_EDEFAULT);
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
			case _2Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _2Package.DOCUMENT_ROOT__AUGMENTATION:
				return getAugmentation() != null;
			case _2Package.DOCUMENT_ROOT__METADATA:
				return getMetadata() != null;
			case _2Package.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _2Package.DOCUMENT_ROOT__LINK_METADATA:
				return LINK_METADATA_EDEFAULT == null ? linkMetadata != null : !LINK_METADATA_EDEFAULT.equals(linkMetadata);
			case _2Package.DOCUMENT_ROOT__METADATA1:
				return METADATA1_EDEFAULT == null ? metadata1 != null : !METADATA1_EDEFAULT.equals(metadata1);
			case _2Package.DOCUMENT_ROOT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case _2Package.DOCUMENT_ROOT__SEQUENCE_ID:
				return SEQUENCE_ID_EDEFAULT == null ? sequenceID != null : !SEQUENCE_ID_EDEFAULT.equals(sequenceID);
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
		result.append(", id: ");
		result.append(id);
		result.append(", linkMetadata: ");
		result.append(linkMetadata);
		result.append(", metadata1: ");
		result.append(metadata1);
		result.append(", ref: ");
		result.append(ref);
		result.append(", sequenceID: ");
		result.append(sequenceID);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

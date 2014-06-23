/**
 */
package gov.niem.release.niem.codes.censusCommodity._3._0.impl;

import gov.niem.release.niem.codes.censusCommodity._3._0.MachineryCategoryCodeSimpleType;
import gov.niem.release.niem.codes.censusCommodity._3._0.MachineryCategoryCodeType;
import gov.niem.release.niem.codes.censusCommodity._3._0._0Package;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machinery Category Code Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.impl.MachineryCategoryCodeTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.impl.MachineryCategoryCodeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.impl.MachineryCategoryCodeTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.impl.MachineryCategoryCodeTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.impl.MachineryCategoryCodeTypeImpl#getRelationshipMetadata <em>Relationship Metadata</em>}</li>
 *   <li>{@link gov.niem.release.niem.codes.censusCommodity._3._0.impl.MachineryCategoryCodeTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineryCategoryCodeTypeImpl extends MinimalEObjectImpl.Container implements MachineryCategoryCodeType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final MachineryCategoryCodeSimpleType VALUE_EDEFAULT = MachineryCategoryCodeSimpleType._34000;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected MachineryCategoryCodeSimpleType value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

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
	 * The default value of the '{@link #getMetadata() <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected List<String> metadata = METADATA_EDEFAULT;

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
	 * The default value of the '{@link #getRelationshipMetadata() <em>Relationship Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> RELATIONSHIP_METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipMetadata() <em>Relationship Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipMetadata()
	 * @generated
	 * @ordered
	 */
	protected List<String> relationshipMetadata = RELATIONSHIP_METADATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineryCategoryCodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.MACHINERY_CATEGORY_CODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineryCategoryCodeSimpleType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(MachineryCategoryCodeSimpleType newValue) {
		MachineryCategoryCodeSimpleType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MACHINERY_CATEGORY_CODE_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		MachineryCategoryCodeSimpleType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.MACHINERY_CATEGORY_CODE_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MACHINERY_CATEGORY_CODE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(List<String> newMetadata) {
		List<String> oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MACHINERY_CATEGORY_CODE_TYPE__METADATA, oldMetadata, metadata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MACHINERY_CATEGORY_CODE_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getRelationshipMetadata() {
		return relationshipMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipMetadata(List<String> newRelationshipMetadata) {
		List<String> oldRelationshipMetadata = relationshipMetadata;
		relationshipMetadata = newRelationshipMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MACHINERY_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA, oldRelationshipMetadata, relationshipMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__VALUE:
				return getValue();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ID:
				return getId();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__METADATA:
				return getMetadata();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__REF:
				return getRef();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA:
				return getRelationshipMetadata();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__VALUE:
				setValue((MachineryCategoryCodeSimpleType)newValue);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ID:
				setId((String)newValue);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__METADATA:
				setMetadata((List<String>)newValue);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__REF:
				setRef((String)newValue);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA:
				setRelationshipMetadata((List<String>)newValue);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__VALUE:
				unsetValue();
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__METADATA:
				setMetadata(METADATA_EDEFAULT);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__REF:
				setRef(REF_EDEFAULT);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA:
				setRelationshipMetadata(RELATIONSHIP_METADATA_EDEFAULT);
				return;
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__VALUE:
				return isSetValue();
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__METADATA:
				return METADATA_EDEFAULT == null ? metadata != null : !METADATA_EDEFAULT.equals(metadata);
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA:
				return RELATIONSHIP_METADATA_EDEFAULT == null ? relationshipMetadata != null : !RELATIONSHIP_METADATA_EDEFAULT.equals(relationshipMetadata);
			case _0Package.MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(", ref: ");
		result.append(ref);
		result.append(", relationshipMetadata: ");
		result.append(relationshipMetadata);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //MachineryCategoryCodeTypeImpl

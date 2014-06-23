/**
 */
package gov.niem.niem.proxy.xsd._2.impl;

import gov.niem.niem.proxy.xsd._2.GMonth;
import gov.niem.niem.proxy.xsd._2._2Package;

import java.lang.String;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GMonth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.impl.GMonthImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.impl.GMonthImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.impl.GMonthImpl#getLinkMetadata <em>Link Metadata</em>}</li>
 *   <li>{@link gov.niem.niem.proxy.xsd._2.impl.GMonthImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GMonthImpl extends MinimalEObjectImpl.Container implements GMonth {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar value = VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMonthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2Package.Literals.GMONTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(XMLGregorianCalendar newValue) {
		XMLGregorianCalendar oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.GMONTH__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.GMONTH__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.GMONTH__LINK_METADATA, oldLinkMetadata, linkMetadata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2Package.GMONTH__METADATA, oldMetadata, metadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2Package.GMONTH__VALUE:
				return getValue();
			case _2Package.GMONTH__ID:
				return getId();
			case _2Package.GMONTH__LINK_METADATA:
				return getLinkMetadata();
			case _2Package.GMONTH__METADATA:
				return getMetadata();
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
			case _2Package.GMONTH__VALUE:
				setValue((XMLGregorianCalendar)newValue);
				return;
			case _2Package.GMONTH__ID:
				setId((String)newValue);
				return;
			case _2Package.GMONTH__LINK_METADATA:
				setLinkMetadata((List<String>)newValue);
				return;
			case _2Package.GMONTH__METADATA:
				setMetadata((List<String>)newValue);
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
			case _2Package.GMONTH__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _2Package.GMONTH__ID:
				setId(ID_EDEFAULT);
				return;
			case _2Package.GMONTH__LINK_METADATA:
				setLinkMetadata(LINK_METADATA_EDEFAULT);
				return;
			case _2Package.GMONTH__METADATA:
				setMetadata(METADATA_EDEFAULT);
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
			case _2Package.GMONTH__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _2Package.GMONTH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _2Package.GMONTH__LINK_METADATA:
				return LINK_METADATA_EDEFAULT == null ? linkMetadata != null : !LINK_METADATA_EDEFAULT.equals(linkMetadata);
			case _2Package.GMONTH__METADATA:
				return METADATA_EDEFAULT == null ? metadata != null : !METADATA_EDEFAULT.equals(metadata);
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
		result.append(value);
		result.append(", id: ");
		result.append(id);
		result.append(", linkMetadata: ");
		result.append(linkMetadata);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(')');
		return result.toString();
	}

} //GMonthImpl

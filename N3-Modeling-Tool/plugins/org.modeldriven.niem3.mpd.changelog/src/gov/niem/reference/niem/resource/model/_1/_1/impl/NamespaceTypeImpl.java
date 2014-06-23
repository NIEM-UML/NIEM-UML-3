/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl#getNamespacePrefixText <em>Namespace Prefix Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.NamespaceTypeImpl#getNamespaceVersionText <em>Namespace Version Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceTypeImpl extends ComplexObjectTypeImpl implements NamespaceType {
	/**
	 * The cached value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceURI()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String namespaceURI;

	/**
	 * The cached value of the '{@link #getNamespacePrefixText() <em>Namespace Prefix Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefixText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String namespacePrefixText;

	/**
	 * The cached value of the '{@link #getNamespaceVersionText() <em>Namespace Version Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceVersionText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String namespaceVersionText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NAMESPACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getNamespaceURI() {
		return namespaceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaceURI(gov.niem.niem.proxy.xsd._2.String newNamespaceURI, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldNamespaceURI = namespaceURI;
		namespaceURI = newNamespaceURI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NAMESPACE_TYPE__NAMESPACE_URI, oldNamespaceURI, newNamespaceURI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceURI(gov.niem.niem.proxy.xsd._2.String newNamespaceURI) {
		if (newNamespaceURI != namespaceURI) {
			NotificationChain msgs = null;
			if (namespaceURI != null)
				msgs = ((InternalEObject)namespaceURI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NAMESPACE_TYPE__NAMESPACE_URI, null, msgs);
			if (newNamespaceURI != null)
				msgs = ((InternalEObject)newNamespaceURI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NAMESPACE_TYPE__NAMESPACE_URI, null, msgs);
			msgs = basicSetNamespaceURI(newNamespaceURI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NAMESPACE_TYPE__NAMESPACE_URI, newNamespaceURI, newNamespaceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getNamespacePrefixText() {
		return namespacePrefixText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespacePrefixText(gov.niem.niem.proxy.xsd._2.String newNamespacePrefixText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldNamespacePrefixText = namespacePrefixText;
		namespacePrefixText = newNamespacePrefixText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT, oldNamespacePrefixText, newNamespacePrefixText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespacePrefixText(gov.niem.niem.proxy.xsd._2.String newNamespacePrefixText) {
		if (newNamespacePrefixText != namespacePrefixText) {
			NotificationChain msgs = null;
			if (namespacePrefixText != null)
				msgs = ((InternalEObject)namespacePrefixText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT, null, msgs);
			if (newNamespacePrefixText != null)
				msgs = ((InternalEObject)newNamespacePrefixText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT, null, msgs);
			msgs = basicSetNamespacePrefixText(newNamespacePrefixText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT, newNamespacePrefixText, newNamespacePrefixText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getNamespaceVersionText() {
		return namespaceVersionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaceVersionText(gov.niem.niem.proxy.xsd._2.String newNamespaceVersionText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldNamespaceVersionText = namespaceVersionText;
		namespaceVersionText = newNamespaceVersionText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT, oldNamespaceVersionText, newNamespaceVersionText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceVersionText(gov.niem.niem.proxy.xsd._2.String newNamespaceVersionText) {
		if (newNamespaceVersionText != namespaceVersionText) {
			NotificationChain msgs = null;
			if (namespaceVersionText != null)
				msgs = ((InternalEObject)namespaceVersionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT, null, msgs);
			if (newNamespaceVersionText != null)
				msgs = ((InternalEObject)newNamespaceVersionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT, null, msgs);
			msgs = basicSetNamespaceVersionText(newNamespaceVersionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT, newNamespaceVersionText, newNamespaceVersionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NAMESPACE_TYPE__NAMESPACE_URI:
				return basicSetNamespaceURI(null, msgs);
			case _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT:
				return basicSetNamespacePrefixText(null, msgs);
			case _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT:
				return basicSetNamespaceVersionText(null, msgs);
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
			case _1Package.NAMESPACE_TYPE__NAMESPACE_URI:
				return getNamespaceURI();
			case _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT:
				return getNamespacePrefixText();
			case _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT:
				return getNamespaceVersionText();
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
			case _1Package.NAMESPACE_TYPE__NAMESPACE_URI:
				setNamespaceURI((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT:
				setNamespacePrefixText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT:
				setNamespaceVersionText((gov.niem.niem.proxy.xsd._2.String)newValue);
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
			case _1Package.NAMESPACE_TYPE__NAMESPACE_URI:
				setNamespaceURI((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT:
				setNamespacePrefixText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT:
				setNamespaceVersionText((gov.niem.niem.proxy.xsd._2.String)null);
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
			case _1Package.NAMESPACE_TYPE__NAMESPACE_URI:
				return namespaceURI != null;
			case _1Package.NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT:
				return namespacePrefixText != null;
			case _1Package.NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT:
				return namespaceVersionText != null;
		}
		return super.eIsSet(featureID);
	}

} //NamespaceTypeImpl

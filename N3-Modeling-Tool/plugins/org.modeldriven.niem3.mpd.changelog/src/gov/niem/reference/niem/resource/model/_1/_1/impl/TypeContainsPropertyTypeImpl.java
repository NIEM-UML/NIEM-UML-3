/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.model._1._1.QName;
import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Contains Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl#getPropertyQualifiedName <em>Property Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl#getPropertyMinOccursText <em>Property Min Occurs Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl#getPropertyMaxOccursText <em>Property Max Occurs Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl#getPropertyInlineIndicator <em>Property Inline Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeContainsPropertyTypeImpl#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeContainsPropertyTypeImpl extends ComplexObjectTypeImpl implements TypeContainsPropertyType {
	/**
	 * The cached value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected QName typeQualifiedName;

	/**
	 * The cached value of the '{@link #getPropertyQualifiedName() <em>Property Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected QName propertyQualifiedName;

	/**
	 * The cached value of the '{@link #getPropertyMinOccursText() <em>Property Min Occurs Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyMinOccursText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String propertyMinOccursText;

	/**
	 * The cached value of the '{@link #getPropertyMaxOccursText() <em>Property Max Occurs Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyMaxOccursText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String propertyMaxOccursText;

	/**
	 * The cached value of the '{@link #getPropertyInlineIndicator() <em>Property Inline Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyInlineIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean propertyInlineIndicator;

	/**
	 * The cached value of the '{@link #getPropertyReferenceIndicator() <em>Property Reference Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyReferenceIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean propertyReferenceIndicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeContainsPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.TYPE_CONTAINS_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeQualifiedName() {
		return typeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeQualifiedName(QName newTypeQualifiedName, NotificationChain msgs) {
		QName oldTypeQualifiedName = typeQualifiedName;
		typeQualifiedName = newTypeQualifiedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, newTypeQualifiedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeQualifiedName(QName newTypeQualifiedName) {
		if (newTypeQualifiedName != typeQualifiedName) {
			NotificationChain msgs = null;
			if (typeQualifiedName != null)
				msgs = ((InternalEObject)typeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME, null, msgs);
			if (newTypeQualifiedName != null)
				msgs = ((InternalEObject)newTypeQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicSetTypeQualifiedName(newTypeQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME, newTypeQualifiedName, newTypeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertyQualifiedName() {
		return propertyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyQualifiedName(QName newPropertyQualifiedName, NotificationChain msgs) {
		QName oldPropertyQualifiedName = propertyQualifiedName;
		propertyQualifiedName = newPropertyQualifiedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME, oldPropertyQualifiedName, newPropertyQualifiedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyQualifiedName(QName newPropertyQualifiedName) {
		if (newPropertyQualifiedName != propertyQualifiedName) {
			NotificationChain msgs = null;
			if (propertyQualifiedName != null)
				msgs = ((InternalEObject)propertyQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME, null, msgs);
			if (newPropertyQualifiedName != null)
				msgs = ((InternalEObject)newPropertyQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME, null, msgs);
			msgs = basicSetPropertyQualifiedName(newPropertyQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME, newPropertyQualifiedName, newPropertyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyMinOccursText() {
		return propertyMinOccursText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyMinOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMinOccursText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldPropertyMinOccursText = propertyMinOccursText;
		propertyMinOccursText = newPropertyMinOccursText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT, oldPropertyMinOccursText, newPropertyMinOccursText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyMinOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMinOccursText) {
		if (newPropertyMinOccursText != propertyMinOccursText) {
			NotificationChain msgs = null;
			if (propertyMinOccursText != null)
				msgs = ((InternalEObject)propertyMinOccursText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT, null, msgs);
			if (newPropertyMinOccursText != null)
				msgs = ((InternalEObject)newPropertyMinOccursText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT, null, msgs);
			msgs = basicSetPropertyMinOccursText(newPropertyMinOccursText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT, newPropertyMinOccursText, newPropertyMinOccursText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyMaxOccursText() {
		return propertyMaxOccursText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyMaxOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMaxOccursText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldPropertyMaxOccursText = propertyMaxOccursText;
		propertyMaxOccursText = newPropertyMaxOccursText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT, oldPropertyMaxOccursText, newPropertyMaxOccursText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyMaxOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMaxOccursText) {
		if (newPropertyMaxOccursText != propertyMaxOccursText) {
			NotificationChain msgs = null;
			if (propertyMaxOccursText != null)
				msgs = ((InternalEObject)propertyMaxOccursText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT, null, msgs);
			if (newPropertyMaxOccursText != null)
				msgs = ((InternalEObject)newPropertyMaxOccursText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT, null, msgs);
			msgs = basicSetPropertyMaxOccursText(newPropertyMaxOccursText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT, newPropertyMaxOccursText, newPropertyMaxOccursText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyInlineIndicator() {
		return propertyInlineIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyInlineIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyInlineIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldPropertyInlineIndicator = propertyInlineIndicator;
		propertyInlineIndicator = newPropertyInlineIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR, oldPropertyInlineIndicator, newPropertyInlineIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyInlineIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyInlineIndicator) {
		if (newPropertyInlineIndicator != propertyInlineIndicator) {
			NotificationChain msgs = null;
			if (propertyInlineIndicator != null)
				msgs = ((InternalEObject)propertyInlineIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR, null, msgs);
			if (newPropertyInlineIndicator != null)
				msgs = ((InternalEObject)newPropertyInlineIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR, null, msgs);
			msgs = basicSetPropertyInlineIndicator(newPropertyInlineIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR, newPropertyInlineIndicator, newPropertyInlineIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyReferenceIndicator() {
		return propertyReferenceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyReferenceIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldPropertyReferenceIndicator = propertyReferenceIndicator;
		propertyReferenceIndicator = newPropertyReferenceIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR, oldPropertyReferenceIndicator, newPropertyReferenceIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyReferenceIndicator) {
		if (newPropertyReferenceIndicator != propertyReferenceIndicator) {
			NotificationChain msgs = null;
			if (propertyReferenceIndicator != null)
				msgs = ((InternalEObject)propertyReferenceIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR, null, msgs);
			if (newPropertyReferenceIndicator != null)
				msgs = ((InternalEObject)newPropertyReferenceIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR, null, msgs);
			msgs = basicSetPropertyReferenceIndicator(newPropertyReferenceIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR, newPropertyReferenceIndicator, newPropertyReferenceIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME:
				return basicSetTypeQualifiedName(null, msgs);
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME:
				return basicSetPropertyQualifiedName(null, msgs);
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT:
				return basicSetPropertyMinOccursText(null, msgs);
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT:
				return basicSetPropertyMaxOccursText(null, msgs);
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR:
				return basicSetPropertyInlineIndicator(null, msgs);
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR:
				return basicSetPropertyReferenceIndicator(null, msgs);
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
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME:
				return getPropertyQualifiedName();
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT:
				return getPropertyMinOccursText();
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT:
				return getPropertyMaxOccursText();
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR:
				return getPropertyInlineIndicator();
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR:
				return getPropertyReferenceIndicator();
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
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)newValue);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME:
				setPropertyQualifiedName((QName)newValue);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT:
				setPropertyMinOccursText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT:
				setPropertyMaxOccursText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR:
				setPropertyInlineIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR:
				setPropertyReferenceIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
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
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)null);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME:
				setPropertyQualifiedName((QName)null);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT:
				setPropertyMinOccursText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT:
				setPropertyMaxOccursText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR:
				setPropertyInlineIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR:
				setPropertyReferenceIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
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
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME:
				return typeQualifiedName != null;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME:
				return propertyQualifiedName != null;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT:
				return propertyMinOccursText != null;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT:
				return propertyMaxOccursText != null;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR:
				return propertyInlineIndicator != null;
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR:
				return propertyReferenceIndicator != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeContainsPropertyTypeImpl

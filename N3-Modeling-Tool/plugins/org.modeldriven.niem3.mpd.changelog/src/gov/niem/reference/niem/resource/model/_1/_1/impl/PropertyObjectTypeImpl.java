/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;
import gov.niem.reference.niem.resource.model._1._1.QName;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyQualifiedName <em>Property Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyNamespace <em>Property Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyDefinitionText <em>Property Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyElementIndicator <em>Property Element Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyAbstractIndicator <em>Property Abstract Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyInlineIndicator <em>Property Inline Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.PropertyObjectTypeImpl#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyObjectTypeImpl extends ComplexObjectTypeImpl implements PropertyObjectType {
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
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String propertyName;

	/**
	 * The cached value of the '{@link #getPropertyNamespace() <em>Property Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyNamespace()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType propertyNamespace;

	/**
	 * The cached value of the '{@link #getPropertyDefinitionText() <em>Property Definition Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDefinitionText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String propertyDefinitionText;

	/**
	 * The cached value of the '{@link #getPropertyDataTypeQualifiedName() <em>Property Data Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDataTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected QName propertyDataTypeQualifiedName;

	/**
	 * This is true if the Property Data Type Qualified Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyDataTypeQualifiedNameESet;

	/**
	 * The cached value of the '{@link #getPropertySubstitutionGroupHeadQualifiedName() <em>Property Substitution Group Head Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySubstitutionGroupHeadQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected QName propertySubstitutionGroupHeadQualifiedName;

	/**
	 * This is true if the Property Substitution Group Head Qualified Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertySubstitutionGroupHeadQualifiedNameESet;

	/**
	 * The cached value of the '{@link #getPropertyElementIndicator() <em>Property Element Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyElementIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean propertyElementIndicator;

	/**
	 * The cached value of the '{@link #getPropertyAbstractIndicator() <em>Property Abstract Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAbstractIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean propertyAbstractIndicator;

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
	 * The cached value of the '{@link #getPropertyAugmentationOfTypeQualifiedName() <em>Property Augmentation Of Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAugmentationOfTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected QName propertyAugmentationOfTypeQualifiedName;

	/**
	 * This is true if the Property Augmentation Of Type Qualified Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyAugmentationOfTypeQualifiedNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.PROPERTY_OBJECT_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME, oldPropertyQualifiedName, newPropertyQualifiedName);
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
				msgs = ((InternalEObject)propertyQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME, null, msgs);
			if (newPropertyQualifiedName != null)
				msgs = ((InternalEObject)newPropertyQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME, null, msgs);
			msgs = basicSetPropertyQualifiedName(newPropertyQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME, newPropertyQualifiedName, newPropertyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName(gov.niem.niem.proxy.xsd._2.String newPropertyName, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME, oldPropertyName, newPropertyName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(gov.niem.niem.proxy.xsd._2.String newPropertyName) {
		if (newPropertyName != propertyName) {
			NotificationChain msgs = null;
			if (propertyName != null)
				msgs = ((InternalEObject)propertyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME, null, msgs);
			if (newPropertyName != null)
				msgs = ((InternalEObject)newPropertyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME, null, msgs);
			msgs = basicSetPropertyName(newPropertyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME, newPropertyName, newPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getPropertyNamespace() {
		return propertyNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyNamespace(NamespaceType newPropertyNamespace, NotificationChain msgs) {
		NamespaceType oldPropertyNamespace = propertyNamespace;
		propertyNamespace = newPropertyNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE, oldPropertyNamespace, newPropertyNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyNamespace(NamespaceType newPropertyNamespace) {
		if (newPropertyNamespace != propertyNamespace) {
			NotificationChain msgs = null;
			if (propertyNamespace != null)
				msgs = ((InternalEObject)propertyNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE, null, msgs);
			if (newPropertyNamespace != null)
				msgs = ((InternalEObject)newPropertyNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE, null, msgs);
			msgs = basicSetPropertyNamespace(newPropertyNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE, newPropertyNamespace, newPropertyNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyDefinitionText() {
		return propertyDefinitionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyDefinitionText(gov.niem.niem.proxy.xsd._2.String newPropertyDefinitionText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldPropertyDefinitionText = propertyDefinitionText;
		propertyDefinitionText = newPropertyDefinitionText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT, oldPropertyDefinitionText, newPropertyDefinitionText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyDefinitionText(gov.niem.niem.proxy.xsd._2.String newPropertyDefinitionText) {
		if (newPropertyDefinitionText != propertyDefinitionText) {
			NotificationChain msgs = null;
			if (propertyDefinitionText != null)
				msgs = ((InternalEObject)propertyDefinitionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT, null, msgs);
			if (newPropertyDefinitionText != null)
				msgs = ((InternalEObject)newPropertyDefinitionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT, null, msgs);
			msgs = basicSetPropertyDefinitionText(newPropertyDefinitionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT, newPropertyDefinitionText, newPropertyDefinitionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertyDataTypeQualifiedName() {
		return propertyDataTypeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyDataTypeQualifiedName(QName newPropertyDataTypeQualifiedName, NotificationChain msgs) {
		QName oldPropertyDataTypeQualifiedName = propertyDataTypeQualifiedName;
		propertyDataTypeQualifiedName = newPropertyDataTypeQualifiedName;
		boolean oldPropertyDataTypeQualifiedNameESet = propertyDataTypeQualifiedNameESet;
		propertyDataTypeQualifiedNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, oldPropertyDataTypeQualifiedName, newPropertyDataTypeQualifiedName, !oldPropertyDataTypeQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyDataTypeQualifiedName(QName newPropertyDataTypeQualifiedName) {
		if (newPropertyDataTypeQualifiedName != propertyDataTypeQualifiedName) {
			NotificationChain msgs = null;
			if (propertyDataTypeQualifiedName != null)
				msgs = ((InternalEObject)propertyDataTypeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, null, msgs);
			if (newPropertyDataTypeQualifiedName != null)
				msgs = ((InternalEObject)newPropertyDataTypeQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicSetPropertyDataTypeQualifiedName(newPropertyDataTypeQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertyDataTypeQualifiedNameESet = propertyDataTypeQualifiedNameESet;
			propertyDataTypeQualifiedNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, newPropertyDataTypeQualifiedName, newPropertyDataTypeQualifiedName, !oldPropertyDataTypeQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPropertyDataTypeQualifiedName(NotificationChain msgs) {
		QName oldPropertyDataTypeQualifiedName = propertyDataTypeQualifiedName;
		propertyDataTypeQualifiedName = null;
		boolean oldPropertyDataTypeQualifiedNameESet = propertyDataTypeQualifiedNameESet;
		propertyDataTypeQualifiedNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, oldPropertyDataTypeQualifiedName, null, oldPropertyDataTypeQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyDataTypeQualifiedName() {
		if (propertyDataTypeQualifiedName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)propertyDataTypeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicUnsetPropertyDataTypeQualifiedName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertyDataTypeQualifiedNameESet = propertyDataTypeQualifiedNameESet;
			propertyDataTypeQualifiedNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME, null, null, oldPropertyDataTypeQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyDataTypeQualifiedName() {
		return propertyDataTypeQualifiedNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertySubstitutionGroupHeadQualifiedName() {
		return propertySubstitutionGroupHeadQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertySubstitutionGroupHeadQualifiedName(QName newPropertySubstitutionGroupHeadQualifiedName, NotificationChain msgs) {
		QName oldPropertySubstitutionGroupHeadQualifiedName = propertySubstitutionGroupHeadQualifiedName;
		propertySubstitutionGroupHeadQualifiedName = newPropertySubstitutionGroupHeadQualifiedName;
		boolean oldPropertySubstitutionGroupHeadQualifiedNameESet = propertySubstitutionGroupHeadQualifiedNameESet;
		propertySubstitutionGroupHeadQualifiedNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, oldPropertySubstitutionGroupHeadQualifiedName, newPropertySubstitutionGroupHeadQualifiedName, !oldPropertySubstitutionGroupHeadQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySubstitutionGroupHeadQualifiedName(QName newPropertySubstitutionGroupHeadQualifiedName) {
		if (newPropertySubstitutionGroupHeadQualifiedName != propertySubstitutionGroupHeadQualifiedName) {
			NotificationChain msgs = null;
			if (propertySubstitutionGroupHeadQualifiedName != null)
				msgs = ((InternalEObject)propertySubstitutionGroupHeadQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, null, msgs);
			if (newPropertySubstitutionGroupHeadQualifiedName != null)
				msgs = ((InternalEObject)newPropertySubstitutionGroupHeadQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, null, msgs);
			msgs = basicSetPropertySubstitutionGroupHeadQualifiedName(newPropertySubstitutionGroupHeadQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertySubstitutionGroupHeadQualifiedNameESet = propertySubstitutionGroupHeadQualifiedNameESet;
			propertySubstitutionGroupHeadQualifiedNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, newPropertySubstitutionGroupHeadQualifiedName, newPropertySubstitutionGroupHeadQualifiedName, !oldPropertySubstitutionGroupHeadQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPropertySubstitutionGroupHeadQualifiedName(NotificationChain msgs) {
		QName oldPropertySubstitutionGroupHeadQualifiedName = propertySubstitutionGroupHeadQualifiedName;
		propertySubstitutionGroupHeadQualifiedName = null;
		boolean oldPropertySubstitutionGroupHeadQualifiedNameESet = propertySubstitutionGroupHeadQualifiedNameESet;
		propertySubstitutionGroupHeadQualifiedNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, oldPropertySubstitutionGroupHeadQualifiedName, null, oldPropertySubstitutionGroupHeadQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertySubstitutionGroupHeadQualifiedName() {
		if (propertySubstitutionGroupHeadQualifiedName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)propertySubstitutionGroupHeadQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, null, msgs);
			msgs = basicUnsetPropertySubstitutionGroupHeadQualifiedName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertySubstitutionGroupHeadQualifiedNameESet = propertySubstitutionGroupHeadQualifiedNameESet;
			propertySubstitutionGroupHeadQualifiedNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, null, null, oldPropertySubstitutionGroupHeadQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertySubstitutionGroupHeadQualifiedName() {
		return propertySubstitutionGroupHeadQualifiedNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyElementIndicator() {
		return propertyElementIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyElementIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyElementIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldPropertyElementIndicator = propertyElementIndicator;
		propertyElementIndicator = newPropertyElementIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR, oldPropertyElementIndicator, newPropertyElementIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyElementIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyElementIndicator) {
		if (newPropertyElementIndicator != propertyElementIndicator) {
			NotificationChain msgs = null;
			if (propertyElementIndicator != null)
				msgs = ((InternalEObject)propertyElementIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR, null, msgs);
			if (newPropertyElementIndicator != null)
				msgs = ((InternalEObject)newPropertyElementIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR, null, msgs);
			msgs = basicSetPropertyElementIndicator(newPropertyElementIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR, newPropertyElementIndicator, newPropertyElementIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyAbstractIndicator() {
		return propertyAbstractIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyAbstractIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyAbstractIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldPropertyAbstractIndicator = propertyAbstractIndicator;
		propertyAbstractIndicator = newPropertyAbstractIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR, oldPropertyAbstractIndicator, newPropertyAbstractIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAbstractIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyAbstractIndicator) {
		if (newPropertyAbstractIndicator != propertyAbstractIndicator) {
			NotificationChain msgs = null;
			if (propertyAbstractIndicator != null)
				msgs = ((InternalEObject)propertyAbstractIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR, null, msgs);
			if (newPropertyAbstractIndicator != null)
				msgs = ((InternalEObject)newPropertyAbstractIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR, null, msgs);
			msgs = basicSetPropertyAbstractIndicator(newPropertyAbstractIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR, newPropertyAbstractIndicator, newPropertyAbstractIndicator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR, oldPropertyInlineIndicator, newPropertyInlineIndicator);
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
				msgs = ((InternalEObject)propertyInlineIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR, null, msgs);
			if (newPropertyInlineIndicator != null)
				msgs = ((InternalEObject)newPropertyInlineIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR, null, msgs);
			msgs = basicSetPropertyInlineIndicator(newPropertyInlineIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR, newPropertyInlineIndicator, newPropertyInlineIndicator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR, oldPropertyReferenceIndicator, newPropertyReferenceIndicator);
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
				msgs = ((InternalEObject)propertyReferenceIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR, null, msgs);
			if (newPropertyReferenceIndicator != null)
				msgs = ((InternalEObject)newPropertyReferenceIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR, null, msgs);
			msgs = basicSetPropertyReferenceIndicator(newPropertyReferenceIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR, newPropertyReferenceIndicator, newPropertyReferenceIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertyAugmentationOfTypeQualifiedName() {
		return propertyAugmentationOfTypeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyAugmentationOfTypeQualifiedName(QName newPropertyAugmentationOfTypeQualifiedName, NotificationChain msgs) {
		QName oldPropertyAugmentationOfTypeQualifiedName = propertyAugmentationOfTypeQualifiedName;
		propertyAugmentationOfTypeQualifiedName = newPropertyAugmentationOfTypeQualifiedName;
		boolean oldPropertyAugmentationOfTypeQualifiedNameESet = propertyAugmentationOfTypeQualifiedNameESet;
		propertyAugmentationOfTypeQualifiedNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, oldPropertyAugmentationOfTypeQualifiedName, newPropertyAugmentationOfTypeQualifiedName, !oldPropertyAugmentationOfTypeQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAugmentationOfTypeQualifiedName(QName newPropertyAugmentationOfTypeQualifiedName) {
		if (newPropertyAugmentationOfTypeQualifiedName != propertyAugmentationOfTypeQualifiedName) {
			NotificationChain msgs = null;
			if (propertyAugmentationOfTypeQualifiedName != null)
				msgs = ((InternalEObject)propertyAugmentationOfTypeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, null, msgs);
			if (newPropertyAugmentationOfTypeQualifiedName != null)
				msgs = ((InternalEObject)newPropertyAugmentationOfTypeQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicSetPropertyAugmentationOfTypeQualifiedName(newPropertyAugmentationOfTypeQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertyAugmentationOfTypeQualifiedNameESet = propertyAugmentationOfTypeQualifiedNameESet;
			propertyAugmentationOfTypeQualifiedNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, newPropertyAugmentationOfTypeQualifiedName, newPropertyAugmentationOfTypeQualifiedName, !oldPropertyAugmentationOfTypeQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPropertyAugmentationOfTypeQualifiedName(NotificationChain msgs) {
		QName oldPropertyAugmentationOfTypeQualifiedName = propertyAugmentationOfTypeQualifiedName;
		propertyAugmentationOfTypeQualifiedName = null;
		boolean oldPropertyAugmentationOfTypeQualifiedNameESet = propertyAugmentationOfTypeQualifiedNameESet;
		propertyAugmentationOfTypeQualifiedNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, oldPropertyAugmentationOfTypeQualifiedName, null, oldPropertyAugmentationOfTypeQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyAugmentationOfTypeQualifiedName() {
		if (propertyAugmentationOfTypeQualifiedName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)propertyAugmentationOfTypeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicUnsetPropertyAugmentationOfTypeQualifiedName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPropertyAugmentationOfTypeQualifiedNameESet = propertyAugmentationOfTypeQualifiedNameESet;
			propertyAugmentationOfTypeQualifiedNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, null, null, oldPropertyAugmentationOfTypeQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyAugmentationOfTypeQualifiedName() {
		return propertyAugmentationOfTypeQualifiedNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME:
				return basicSetPropertyQualifiedName(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE:
				return basicSetPropertyNamespace(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT:
				return basicSetPropertyDefinitionText(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				return basicUnsetPropertyDataTypeQualifiedName(msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				return basicUnsetPropertySubstitutionGroupHeadQualifiedName(msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR:
				return basicSetPropertyElementIndicator(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR:
				return basicSetPropertyAbstractIndicator(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR:
				return basicSetPropertyInlineIndicator(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR:
				return basicSetPropertyReferenceIndicator(null, msgs);
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				return basicUnsetPropertyAugmentationOfTypeQualifiedName(msgs);
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
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME:
				return getPropertyQualifiedName();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE:
				return getPropertyNamespace();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT:
				return getPropertyDefinitionText();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				return getPropertyDataTypeQualifiedName();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				return getPropertySubstitutionGroupHeadQualifiedName();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR:
				return getPropertyElementIndicator();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR:
				return getPropertyAbstractIndicator();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR:
				return getPropertyInlineIndicator();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR:
				return getPropertyReferenceIndicator();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				return getPropertyAugmentationOfTypeQualifiedName();
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
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME:
				setPropertyQualifiedName((QName)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME:
				setPropertyName((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE:
				setPropertyNamespace((NamespaceType)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT:
				setPropertyDefinitionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				setPropertyDataTypeQualifiedName((QName)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				setPropertySubstitutionGroupHeadQualifiedName((QName)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR:
				setPropertyElementIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR:
				setPropertyAbstractIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR:
				setPropertyInlineIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR:
				setPropertyReferenceIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				setPropertyAugmentationOfTypeQualifiedName((QName)newValue);
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
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME:
				setPropertyQualifiedName((QName)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME:
				setPropertyName((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE:
				setPropertyNamespace((NamespaceType)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT:
				setPropertyDefinitionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				unsetPropertyDataTypeQualifiedName();
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				unsetPropertySubstitutionGroupHeadQualifiedName();
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR:
				setPropertyElementIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR:
				setPropertyAbstractIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR:
				setPropertyInlineIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR:
				setPropertyReferenceIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				unsetPropertyAugmentationOfTypeQualifiedName();
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
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME:
				return propertyQualifiedName != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAME:
				return propertyName != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE:
				return propertyNamespace != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT:
				return propertyDefinitionText != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				return isSetPropertyDataTypeQualifiedName();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				return isSetPropertySubstitutionGroupHeadQualifiedName();
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR:
				return propertyElementIndicator != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR:
				return propertyAbstractIndicator != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR:
				return propertyInlineIndicator != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR:
				return propertyReferenceIndicator != null;
			case _1Package.PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				return isSetPropertyAugmentationOfTypeQualifiedName();
		}
		return super.eIsSet(featureID);
	}

} //PropertyObjectTypeImpl

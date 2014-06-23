/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1.QName;
import gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType;
import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;
import gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeNamespace <em>Type Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeDefinitionText <em>Type Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeContentStyleCode <em>Type Content Style Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeSimpleStyleCode <em>Type Simple Style Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeAssociationIndicator <em>Type Association Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeAugmentationIndicator <em>Type Augmentation Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeAdapterIndicator <em>Type Adapter Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.TypeObjectTypeImpl#getTypeMetadataIndicator <em>Type Metadata Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectTypeImpl extends ComplexObjectTypeImpl implements TypeObjectType {
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
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String typeName;

	/**
	 * The cached value of the '{@link #getTypeNamespace() <em>Type Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNamespace()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType typeNamespace;

	/**
	 * The cached value of the '{@link #getTypeDefinitionText() <em>Type Definition Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String typeDefinitionText;

	/**
	 * The cached value of the '{@link #getTypeBaseTypeQualifiedName() <em>Type Base Type Qualified Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBaseTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected QName typeBaseTypeQualifiedName;

	/**
	 * This is true if the Type Base Type Qualified Name containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeBaseTypeQualifiedNameESet;

	/**
	 * The cached value of the '{@link #getTypeContentStyleCode() <em>Type Content Style Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeContentStyleCode()
	 * @generated
	 * @ordered
	 */
	protected TypeContentStyleCodeType typeContentStyleCode;

	/**
	 * The cached value of the '{@link #getTypeSimpleStyleCode() <em>Type Simple Style Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSimpleStyleCode()
	 * @generated
	 * @ordered
	 */
	protected TypeSimpleStyleCodeType typeSimpleStyleCode;

	/**
	 * The cached value of the '{@link #getTypeAssociationIndicator() <em>Type Association Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssociationIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean typeAssociationIndicator;

	/**
	 * The cached value of the '{@link #getTypeAugmentationIndicator() <em>Type Augmentation Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAugmentationIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean typeAugmentationIndicator;

	/**
	 * The cached value of the '{@link #getTypeAdapterIndicator() <em>Type Adapter Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAdapterIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean typeAdapterIndicator;

	/**
	 * The cached value of the '{@link #getTypeMetadataIndicator() <em>Type Metadata Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMetadataIndicator()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.Boolean typeMetadataIndicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.TYPE_OBJECT_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, newTypeQualifiedName);
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
				msgs = ((InternalEObject)typeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME, null, msgs);
			if (newTypeQualifiedName != null)
				msgs = ((InternalEObject)newTypeQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicSetTypeQualifiedName(newTypeQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME, newTypeQualifiedName, newTypeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeName(gov.niem.niem.proxy.xsd._2.String newTypeName, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_NAME, oldTypeName, newTypeName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(gov.niem.niem.proxy.xsd._2.String newTypeName) {
		if (newTypeName != typeName) {
			NotificationChain msgs = null;
			if (typeName != null)
				msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_NAME, null, msgs);
			if (newTypeName != null)
				msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_NAME, null, msgs);
			msgs = basicSetTypeName(newTypeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_NAME, newTypeName, newTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getTypeNamespace() {
		return typeNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeNamespace(NamespaceType newTypeNamespace, NotificationChain msgs) {
		NamespaceType oldTypeNamespace = typeNamespace;
		typeNamespace = newTypeNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE, oldTypeNamespace, newTypeNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNamespace(NamespaceType newTypeNamespace) {
		if (newTypeNamespace != typeNamespace) {
			NotificationChain msgs = null;
			if (typeNamespace != null)
				msgs = ((InternalEObject)typeNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE, null, msgs);
			if (newTypeNamespace != null)
				msgs = ((InternalEObject)newTypeNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE, null, msgs);
			msgs = basicSetTypeNamespace(newTypeNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE, newTypeNamespace, newTypeNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getTypeDefinitionText() {
		return typeDefinitionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinitionText(gov.niem.niem.proxy.xsd._2.String newTypeDefinitionText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldTypeDefinitionText = typeDefinitionText;
		typeDefinitionText = newTypeDefinitionText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT, oldTypeDefinitionText, newTypeDefinitionText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinitionText(gov.niem.niem.proxy.xsd._2.String newTypeDefinitionText) {
		if (newTypeDefinitionText != typeDefinitionText) {
			NotificationChain msgs = null;
			if (typeDefinitionText != null)
				msgs = ((InternalEObject)typeDefinitionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT, null, msgs);
			if (newTypeDefinitionText != null)
				msgs = ((InternalEObject)newTypeDefinitionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT, null, msgs);
			msgs = basicSetTypeDefinitionText(newTypeDefinitionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT, newTypeDefinitionText, newTypeDefinitionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeBaseTypeQualifiedName() {
		return typeBaseTypeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeBaseTypeQualifiedName(QName newTypeBaseTypeQualifiedName, NotificationChain msgs) {
		QName oldTypeBaseTypeQualifiedName = typeBaseTypeQualifiedName;
		typeBaseTypeQualifiedName = newTypeBaseTypeQualifiedName;
		boolean oldTypeBaseTypeQualifiedNameESet = typeBaseTypeQualifiedNameESet;
		typeBaseTypeQualifiedNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, oldTypeBaseTypeQualifiedName, newTypeBaseTypeQualifiedName, !oldTypeBaseTypeQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeBaseTypeQualifiedName(QName newTypeBaseTypeQualifiedName) {
		if (newTypeBaseTypeQualifiedName != typeBaseTypeQualifiedName) {
			NotificationChain msgs = null;
			if (typeBaseTypeQualifiedName != null)
				msgs = ((InternalEObject)typeBaseTypeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, null, msgs);
			if (newTypeBaseTypeQualifiedName != null)
				msgs = ((InternalEObject)newTypeBaseTypeQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicSetTypeBaseTypeQualifiedName(newTypeBaseTypeQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeBaseTypeQualifiedNameESet = typeBaseTypeQualifiedNameESet;
			typeBaseTypeQualifiedNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, newTypeBaseTypeQualifiedName, newTypeBaseTypeQualifiedName, !oldTypeBaseTypeQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTypeBaseTypeQualifiedName(NotificationChain msgs) {
		QName oldTypeBaseTypeQualifiedName = typeBaseTypeQualifiedName;
		typeBaseTypeQualifiedName = null;
		boolean oldTypeBaseTypeQualifiedNameESet = typeBaseTypeQualifiedNameESet;
		typeBaseTypeQualifiedNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, oldTypeBaseTypeQualifiedName, null, oldTypeBaseTypeQualifiedNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeBaseTypeQualifiedName() {
		if (typeBaseTypeQualifiedName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)typeBaseTypeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicUnsetTypeBaseTypeQualifiedName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTypeBaseTypeQualifiedNameESet = typeBaseTypeQualifiedNameESet;
			typeBaseTypeQualifiedNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME, null, null, oldTypeBaseTypeQualifiedNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeBaseTypeQualifiedName() {
		return typeBaseTypeQualifiedNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContentStyleCodeType getTypeContentStyleCode() {
		return typeContentStyleCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeContentStyleCode(TypeContentStyleCodeType newTypeContentStyleCode, NotificationChain msgs) {
		TypeContentStyleCodeType oldTypeContentStyleCode = typeContentStyleCode;
		typeContentStyleCode = newTypeContentStyleCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE, oldTypeContentStyleCode, newTypeContentStyleCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContentStyleCode(TypeContentStyleCodeType newTypeContentStyleCode) {
		if (newTypeContentStyleCode != typeContentStyleCode) {
			NotificationChain msgs = null;
			if (typeContentStyleCode != null)
				msgs = ((InternalEObject)typeContentStyleCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE, null, msgs);
			if (newTypeContentStyleCode != null)
				msgs = ((InternalEObject)newTypeContentStyleCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE, null, msgs);
			msgs = basicSetTypeContentStyleCode(newTypeContentStyleCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE, newTypeContentStyleCode, newTypeContentStyleCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleStyleCodeType getTypeSimpleStyleCode() {
		return typeSimpleStyleCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeSimpleStyleCode(TypeSimpleStyleCodeType newTypeSimpleStyleCode, NotificationChain msgs) {
		TypeSimpleStyleCodeType oldTypeSimpleStyleCode = typeSimpleStyleCode;
		typeSimpleStyleCode = newTypeSimpleStyleCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE, oldTypeSimpleStyleCode, newTypeSimpleStyleCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSimpleStyleCode(TypeSimpleStyleCodeType newTypeSimpleStyleCode) {
		if (newTypeSimpleStyleCode != typeSimpleStyleCode) {
			NotificationChain msgs = null;
			if (typeSimpleStyleCode != null)
				msgs = ((InternalEObject)typeSimpleStyleCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE, null, msgs);
			if (newTypeSimpleStyleCode != null)
				msgs = ((InternalEObject)newTypeSimpleStyleCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE, null, msgs);
			msgs = basicSetTypeSimpleStyleCode(newTypeSimpleStyleCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE, newTypeSimpleStyleCode, newTypeSimpleStyleCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeAssociationIndicator() {
		return typeAssociationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAssociationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAssociationIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldTypeAssociationIndicator = typeAssociationIndicator;
		typeAssociationIndicator = newTypeAssociationIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR, oldTypeAssociationIndicator, newTypeAssociationIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAssociationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAssociationIndicator) {
		if (newTypeAssociationIndicator != typeAssociationIndicator) {
			NotificationChain msgs = null;
			if (typeAssociationIndicator != null)
				msgs = ((InternalEObject)typeAssociationIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR, null, msgs);
			if (newTypeAssociationIndicator != null)
				msgs = ((InternalEObject)newTypeAssociationIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR, null, msgs);
			msgs = basicSetTypeAssociationIndicator(newTypeAssociationIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR, newTypeAssociationIndicator, newTypeAssociationIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeAugmentationIndicator() {
		return typeAugmentationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAugmentationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAugmentationIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldTypeAugmentationIndicator = typeAugmentationIndicator;
		typeAugmentationIndicator = newTypeAugmentationIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR, oldTypeAugmentationIndicator, newTypeAugmentationIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAugmentationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAugmentationIndicator) {
		if (newTypeAugmentationIndicator != typeAugmentationIndicator) {
			NotificationChain msgs = null;
			if (typeAugmentationIndicator != null)
				msgs = ((InternalEObject)typeAugmentationIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR, null, msgs);
			if (newTypeAugmentationIndicator != null)
				msgs = ((InternalEObject)newTypeAugmentationIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR, null, msgs);
			msgs = basicSetTypeAugmentationIndicator(newTypeAugmentationIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR, newTypeAugmentationIndicator, newTypeAugmentationIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeAdapterIndicator() {
		return typeAdapterIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAdapterIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAdapterIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldTypeAdapterIndicator = typeAdapterIndicator;
		typeAdapterIndicator = newTypeAdapterIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR, oldTypeAdapterIndicator, newTypeAdapterIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAdapterIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAdapterIndicator) {
		if (newTypeAdapterIndicator != typeAdapterIndicator) {
			NotificationChain msgs = null;
			if (typeAdapterIndicator != null)
				msgs = ((InternalEObject)typeAdapterIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR, null, msgs);
			if (newTypeAdapterIndicator != null)
				msgs = ((InternalEObject)newTypeAdapterIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR, null, msgs);
			msgs = basicSetTypeAdapterIndicator(newTypeAdapterIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR, newTypeAdapterIndicator, newTypeAdapterIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeMetadataIndicator() {
		return typeMetadataIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMetadataIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeMetadataIndicator, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.Boolean oldTypeMetadataIndicator = typeMetadataIndicator;
		typeMetadataIndicator = newTypeMetadataIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR, oldTypeMetadataIndicator, newTypeMetadataIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMetadataIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeMetadataIndicator) {
		if (newTypeMetadataIndicator != typeMetadataIndicator) {
			NotificationChain msgs = null;
			if (typeMetadataIndicator != null)
				msgs = ((InternalEObject)typeMetadataIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR, null, msgs);
			if (newTypeMetadataIndicator != null)
				msgs = ((InternalEObject)newTypeMetadataIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR, null, msgs);
			msgs = basicSetTypeMetadataIndicator(newTypeMetadataIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR, newTypeMetadataIndicator, newTypeMetadataIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME:
				return basicSetTypeQualifiedName(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAME:
				return basicSetTypeName(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE:
				return basicSetTypeNamespace(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT:
				return basicSetTypeDefinitionText(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME:
				return basicUnsetTypeBaseTypeQualifiedName(msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE:
				return basicSetTypeContentStyleCode(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE:
				return basicSetTypeSimpleStyleCode(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR:
				return basicSetTypeAssociationIndicator(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR:
				return basicSetTypeAugmentationIndicator(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR:
				return basicSetTypeAdapterIndicator(null, msgs);
			case _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR:
				return basicSetTypeMetadataIndicator(null, msgs);
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
			case _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAME:
				return getTypeName();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE:
				return getTypeNamespace();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT:
				return getTypeDefinitionText();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME:
				return getTypeBaseTypeQualifiedName();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE:
				return getTypeContentStyleCode();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE:
				return getTypeSimpleStyleCode();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR:
				return getTypeAssociationIndicator();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR:
				return getTypeAugmentationIndicator();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR:
				return getTypeAdapterIndicator();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR:
				return getTypeMetadataIndicator();
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
			case _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAME:
				setTypeName((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE:
				setTypeNamespace((NamespaceType)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT:
				setTypeDefinitionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME:
				setTypeBaseTypeQualifiedName((QName)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE:
				setTypeContentStyleCode((TypeContentStyleCodeType)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE:
				setTypeSimpleStyleCode((TypeSimpleStyleCodeType)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR:
				setTypeAssociationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR:
				setTypeAugmentationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR:
				setTypeAdapterIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR:
				setTypeMetadataIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
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
			case _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAME:
				setTypeName((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE:
				setTypeNamespace((NamespaceType)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT:
				setTypeDefinitionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME:
				unsetTypeBaseTypeQualifiedName();
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE:
				setTypeContentStyleCode((TypeContentStyleCodeType)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE:
				setTypeSimpleStyleCode((TypeSimpleStyleCodeType)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR:
				setTypeAssociationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR:
				setTypeAugmentationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR:
				setTypeAdapterIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR:
				setTypeMetadataIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
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
			case _1Package.TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME:
				return typeQualifiedName != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAME:
				return typeName != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_NAMESPACE:
				return typeNamespace != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT:
				return typeDefinitionText != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME:
				return isSetTypeBaseTypeQualifiedName();
			case _1Package.TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE:
				return typeContentStyleCode != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE:
				return typeSimpleStyleCode != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR:
				return typeAssociationIndicator != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR:
				return typeAugmentationIndicator != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR:
				return typeAdapterIndicator != null;
			case _1Package.TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR:
				return typeMetadataIndicator != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeObjectTypeImpl

/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType;
import gov.niem.reference.niem.resource.model._1._1.FacetType;
import gov.niem.reference.niem.resource.model._1._1.QName;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl#getFacetCategoryCode <em>Facet Category Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl#getFacetText <em>Facet Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.FacetTypeImpl#getFacetDefinitionText <em>Facet Definition Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetTypeImpl extends ComplexObjectTypeImpl implements FacetType {
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
	 * The cached value of the '{@link #getFacetCategoryCode() <em>Facet Category Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetCategoryCode()
	 * @generated
	 * @ordered
	 */
	protected FacetCategoryCodeType facetCategoryCode;

	/**
	 * The cached value of the '{@link #getFacetText() <em>Facet Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String facetText;

	/**
	 * The cached value of the '{@link #getFacetDefinitionText() <em>Facet Definition Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetDefinitionText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String facetDefinitionText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.FACET_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, newTypeQualifiedName);
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
				msgs = ((InternalEObject)typeQualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME, null, msgs);
			if (newTypeQualifiedName != null)
				msgs = ((InternalEObject)newTypeQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME, null, msgs);
			msgs = basicSetTypeQualifiedName(newTypeQualifiedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME, newTypeQualifiedName, newTypeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetCategoryCodeType getFacetCategoryCode() {
		return facetCategoryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacetCategoryCode(FacetCategoryCodeType newFacetCategoryCode, NotificationChain msgs) {
		FacetCategoryCodeType oldFacetCategoryCode = facetCategoryCode;
		facetCategoryCode = newFacetCategoryCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__FACET_CATEGORY_CODE, oldFacetCategoryCode, newFacetCategoryCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetCategoryCode(FacetCategoryCodeType newFacetCategoryCode) {
		if (newFacetCategoryCode != facetCategoryCode) {
			NotificationChain msgs = null;
			if (facetCategoryCode != null)
				msgs = ((InternalEObject)facetCategoryCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__FACET_CATEGORY_CODE, null, msgs);
			if (newFacetCategoryCode != null)
				msgs = ((InternalEObject)newFacetCategoryCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__FACET_CATEGORY_CODE, null, msgs);
			msgs = basicSetFacetCategoryCode(newFacetCategoryCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__FACET_CATEGORY_CODE, newFacetCategoryCode, newFacetCategoryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getFacetText() {
		return facetText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacetText(gov.niem.niem.proxy.xsd._2.String newFacetText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldFacetText = facetText;
		facetText = newFacetText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__FACET_TEXT, oldFacetText, newFacetText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetText(gov.niem.niem.proxy.xsd._2.String newFacetText) {
		if (newFacetText != facetText) {
			NotificationChain msgs = null;
			if (facetText != null)
				msgs = ((InternalEObject)facetText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__FACET_TEXT, null, msgs);
			if (newFacetText != null)
				msgs = ((InternalEObject)newFacetText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__FACET_TEXT, null, msgs);
			msgs = basicSetFacetText(newFacetText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__FACET_TEXT, newFacetText, newFacetText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getFacetDefinitionText() {
		return facetDefinitionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacetDefinitionText(gov.niem.niem.proxy.xsd._2.String newFacetDefinitionText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldFacetDefinitionText = facetDefinitionText;
		facetDefinitionText = newFacetDefinitionText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__FACET_DEFINITION_TEXT, oldFacetDefinitionText, newFacetDefinitionText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetDefinitionText(gov.niem.niem.proxy.xsd._2.String newFacetDefinitionText) {
		if (newFacetDefinitionText != facetDefinitionText) {
			NotificationChain msgs = null;
			if (facetDefinitionText != null)
				msgs = ((InternalEObject)facetDefinitionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__FACET_DEFINITION_TEXT, null, msgs);
			if (newFacetDefinitionText != null)
				msgs = ((InternalEObject)newFacetDefinitionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.FACET_TYPE__FACET_DEFINITION_TEXT, null, msgs);
			msgs = basicSetFacetDefinitionText(newFacetDefinitionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FACET_TYPE__FACET_DEFINITION_TEXT, newFacetDefinitionText, newFacetDefinitionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME:
				return basicSetTypeQualifiedName(null, msgs);
			case _1Package.FACET_TYPE__FACET_CATEGORY_CODE:
				return basicSetFacetCategoryCode(null, msgs);
			case _1Package.FACET_TYPE__FACET_TEXT:
				return basicSetFacetText(null, msgs);
			case _1Package.FACET_TYPE__FACET_DEFINITION_TEXT:
				return basicSetFacetDefinitionText(null, msgs);
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
			case _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case _1Package.FACET_TYPE__FACET_CATEGORY_CODE:
				return getFacetCategoryCode();
			case _1Package.FACET_TYPE__FACET_TEXT:
				return getFacetText();
			case _1Package.FACET_TYPE__FACET_DEFINITION_TEXT:
				return getFacetDefinitionText();
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
			case _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)newValue);
				return;
			case _1Package.FACET_TYPE__FACET_CATEGORY_CODE:
				setFacetCategoryCode((FacetCategoryCodeType)newValue);
				return;
			case _1Package.FACET_TYPE__FACET_TEXT:
				setFacetText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.FACET_TYPE__FACET_DEFINITION_TEXT:
				setFacetDefinitionText((gov.niem.niem.proxy.xsd._2.String)newValue);
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
			case _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)null);
				return;
			case _1Package.FACET_TYPE__FACET_CATEGORY_CODE:
				setFacetCategoryCode((FacetCategoryCodeType)null);
				return;
			case _1Package.FACET_TYPE__FACET_TEXT:
				setFacetText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.FACET_TYPE__FACET_DEFINITION_TEXT:
				setFacetDefinitionText((gov.niem.niem.proxy.xsd._2.String)null);
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
			case _1Package.FACET_TYPE__TYPE_QUALIFIED_NAME:
				return typeQualifiedName != null;
			case _1Package.FACET_TYPE__FACET_CATEGORY_CODE:
				return facetCategoryCode != null;
			case _1Package.FACET_TYPE__FACET_TEXT:
				return facetText != null;
			case _1Package.FACET_TYPE__FACET_DEFINITION_TEXT:
				return facetDefinitionText != null;
		}
		return super.eIsSet(featureID);
	}

} //FacetTypeImpl

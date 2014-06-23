/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validity Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl#getValidityConstraintGroup <em>Validity Constraint Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl#getValidityConstraint <em>Validity Constraint</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ValidityContextTypeImpl#getXPathText <em>XPath Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidityContextTypeImpl extends ObjectTypeImpl implements ValidityContextType {
	/**
	 * The cached value of the '{@link #getDescriptionText() <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected TextType descriptionText;

	/**
	 * This is true if the Description Text containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionTextESet;

	/**
	 * The cached value of the '{@link #getValidityConstraintGroup() <em>Validity Constraint Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityConstraintGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap validityConstraintGroup;

	/**
	 * The default value of the '{@link #getXPathText() <em>XPath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPathText()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPathText() <em>XPath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPathText()
	 * @generated
	 * @ordered
	 */
	protected String xPathText = XPATH_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidityContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.VALIDITY_CONTEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType getDescriptionText() {
		return descriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionText(TextType newDescriptionText, NotificationChain msgs) {
		TextType oldDescriptionText = descriptionText;
		descriptionText = newDescriptionText;
		boolean oldDescriptionTextESet = descriptionTextESet;
		descriptionTextESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionText(TextType newDescriptionText) {
		if (newDescriptionText != descriptionText) {
			NotificationChain msgs = null;
			if (descriptionText != null)
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDescriptionText(NotificationChain msgs) {
		TextType oldDescriptionText = descriptionText;
		descriptionText = null;
		boolean oldDescriptionTextESet = descriptionTextESet;
		descriptionTextESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescriptionText() {
		if (descriptionText != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescriptionText() {
		return descriptionTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getValidityConstraintGroup() {
		if (validityConstraintGroup == null) {
			validityConstraintGroup = new BasicFeatureMap(this, _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP);
		}
		return validityConstraintGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getValidityConstraint() {
		return getValidityConstraintGroup().list(_0Package.Literals.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPathText() {
		return xPathText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPathText(String newXPathText) {
		String oldXPathText = xPathText;
		xPathText = newXPathText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.VALIDITY_CONTEXT_TYPE__XPATH_TEXT, oldXPathText, xPathText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP:
				return ((InternalEList<?>)getValidityConstraintGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT:
				return ((InternalEList<?>)getValidityConstraint()).basicRemove(otherEnd, msgs);
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
			case _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP:
				if (coreType) return getValidityConstraintGroup();
				return ((FeatureMap.Internal)getValidityConstraintGroup()).getWrapper();
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT:
				return getValidityConstraint();
			case _0Package.VALIDITY_CONTEXT_TYPE__XPATH_TEXT:
				return getXPathText();
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
			case _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP:
				((FeatureMap.Internal)getValidityConstraintGroup()).set(newValue);
				return;
			case _0Package.VALIDITY_CONTEXT_TYPE__XPATH_TEXT:
				setXPathText((String)newValue);
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
			case _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP:
				getValidityConstraintGroup().clear();
				return;
			case _0Package.VALIDITY_CONTEXT_TYPE__XPATH_TEXT:
				setXPathText(XPATH_TEXT_EDEFAULT);
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
			case _0Package.VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP:
				return validityConstraintGroup != null && !validityConstraintGroup.isEmpty();
			case _0Package.VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT:
				return !getValidityConstraint().isEmpty();
			case _0Package.VALIDITY_CONTEXT_TYPE__XPATH_TEXT:
				return XPATH_TEXT_EDEFAULT == null ? xPathText != null : !XPATH_TEXT_EDEFAULT.equals(xPathText);
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
		result.append(" (validityConstraintGroup: ");
		result.append(validityConstraintGroup);
		result.append(", xPathText: ");
		result.append(xPathText);
		result.append(')');
		return result.toString();
	}

} //ValidityContextTypeImpl

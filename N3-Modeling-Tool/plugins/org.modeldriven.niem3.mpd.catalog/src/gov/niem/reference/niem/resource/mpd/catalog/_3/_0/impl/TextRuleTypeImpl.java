/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.TextRuleTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.TextRuleTypeImpl#getRuleText <em>Rule Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextRuleTypeImpl extends ObjectTypeImpl implements TextRuleType {
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
	 * The cached value of the '{@link #getRuleText() <em>Rule Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleText()
	 * @generated
	 * @ordered
	 */
	protected TextType ruleText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.TEXT_RULE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
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
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
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
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
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
	public TextType getRuleText() {
		return ruleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleText(TextType newRuleText, NotificationChain msgs) {
		TextType oldRuleText = ruleText;
		ruleText = newRuleText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.TEXT_RULE_TYPE__RULE_TEXT, oldRuleText, newRuleText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleText(TextType newRuleText) {
		if (newRuleText != ruleText) {
			NotificationChain msgs = null;
			if (ruleText != null)
				msgs = ((InternalEObject)ruleText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.TEXT_RULE_TYPE__RULE_TEXT, null, msgs);
			if (newRuleText != null)
				msgs = ((InternalEObject)newRuleText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.TEXT_RULE_TYPE__RULE_TEXT, null, msgs);
			msgs = basicSetRuleText(newRuleText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.TEXT_RULE_TYPE__RULE_TEXT, newRuleText, newRuleText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
			case _0Package.TEXT_RULE_TYPE__RULE_TEXT:
				return basicSetRuleText(null, msgs);
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
			case _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.TEXT_RULE_TYPE__RULE_TEXT:
				return getRuleText();
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
			case _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.TEXT_RULE_TYPE__RULE_TEXT:
				setRuleText((TextType)newValue);
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
			case _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.TEXT_RULE_TYPE__RULE_TEXT:
				setRuleText((TextType)null);
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
			case _0Package.TEXT_RULE_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.TEXT_RULE_TYPE__RULE_TEXT:
				return ruleText != null;
		}
		return super.eIsSet(featureID);
	}

} //TextRuleTypeImpl

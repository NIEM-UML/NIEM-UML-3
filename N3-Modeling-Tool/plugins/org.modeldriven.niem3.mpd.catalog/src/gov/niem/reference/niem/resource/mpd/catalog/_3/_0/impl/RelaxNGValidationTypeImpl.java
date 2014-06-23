/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType;
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
 * An implementation of the model object '<em><b>Relax NG Validation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelaxNGValidationTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.RelaxNGValidationTypeImpl#getRelaxNGSchema <em>Relax NG Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelaxNGValidationTypeImpl extends ObjectTypeImpl implements RelaxNGValidationType {
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
	 * The cached value of the '{@link #getRelaxNGSchema() <em>Relax NG Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxNGSchema()
	 * @generated
	 * @ordered
	 */
	protected FileType relaxNGSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelaxNGValidationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.RELAX_NG_VALIDATION_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
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
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
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
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
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
	public FileType getRelaxNGSchema() {
		return relaxNGSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelaxNGSchema(FileType newRelaxNGSchema, NotificationChain msgs) {
		FileType oldRelaxNGSchema = relaxNGSchema;
		relaxNGSchema = newRelaxNGSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA, oldRelaxNGSchema, newRelaxNGSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxNGSchema(FileType newRelaxNGSchema) {
		if (newRelaxNGSchema != relaxNGSchema) {
			NotificationChain msgs = null;
			if (relaxNGSchema != null)
				msgs = ((InternalEObject)relaxNGSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA, null, msgs);
			if (newRelaxNGSchema != null)
				msgs = ((InternalEObject)newRelaxNGSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA, null, msgs);
			msgs = basicSetRelaxNGSchema(newRelaxNGSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA, newRelaxNGSchema, newRelaxNGSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
			case _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA:
				return basicSetRelaxNGSchema(null, msgs);
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
			case _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA:
				return getRelaxNGSchema();
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
			case _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA:
				setRelaxNGSchema((FileType)newValue);
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
			case _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA:
				setRelaxNGSchema((FileType)null);
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
			case _0Package.RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA:
				return relaxNGSchema != null;
		}
		return super.eIsSet(featureID);
	}

} //RelaxNGValidationTypeImpl

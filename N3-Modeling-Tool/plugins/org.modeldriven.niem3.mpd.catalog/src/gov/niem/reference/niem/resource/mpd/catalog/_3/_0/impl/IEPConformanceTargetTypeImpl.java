/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType;
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
 * An implementation of the model object '<em><b>IEP Conformance Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl#getValidityConstraintWithContextGroup <em>Validity Constraint With Context Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl#getValidityConstraintWithContext <em>Validity Constraint With Context</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.IEPConformanceTargetTypeImpl#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IEPConformanceTargetTypeImpl extends ObjectTypeImpl implements IEPConformanceTargetType {
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
	 * The cached value of the '{@link #getValidityConstraintWithContextGroup() <em>Validity Constraint With Context Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityConstraintWithContextGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap validityConstraintWithContextGroup;

	/**
	 * The cached value of the '{@link #getArtifactOrArtifactSetGroup() <em>Artifact Or Artifact Set Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactOrArtifactSetGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap artifactOrArtifactSetGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEPConformanceTargetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.IEP_CONFORMANCE_TARGET_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
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
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
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
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
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
	public FeatureMap getValidityConstraintWithContextGroup() {
		if (validityConstraintWithContextGroup == null) {
			validityConstraintWithContextGroup = new BasicFeatureMap(this, _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP);
		}
		return validityConstraintWithContextGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getValidityConstraintWithContext() {
		return getValidityConstraintWithContextGroup().list(_0Package.Literals.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getArtifactOrArtifactSetGroup() {
		if (artifactOrArtifactSetGroup == null) {
			artifactOrArtifactSetGroup = new BasicFeatureMap(this, _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP);
		}
		return artifactOrArtifactSetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getArtifactOrArtifactSet() {
		return getArtifactOrArtifactSetGroup().list(_0Package.Literals.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP:
				return ((InternalEList<?>)getValidityConstraintWithContextGroup()).basicRemove(otherEnd, msgs);
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT:
				return ((InternalEList<?>)getValidityConstraintWithContext()).basicRemove(otherEnd, msgs);
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				return ((InternalEList<?>)getArtifactOrArtifactSetGroup()).basicRemove(otherEnd, msgs);
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET:
				return ((InternalEList<?>)getArtifactOrArtifactSet()).basicRemove(otherEnd, msgs);
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
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP:
				if (coreType) return getValidityConstraintWithContextGroup();
				return ((FeatureMap.Internal)getValidityConstraintWithContextGroup()).getWrapper();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT:
				return getValidityConstraintWithContext();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				if (coreType) return getArtifactOrArtifactSetGroup();
				return ((FeatureMap.Internal)getArtifactOrArtifactSetGroup()).getWrapper();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET:
				return getArtifactOrArtifactSet();
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
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP:
				((FeatureMap.Internal)getValidityConstraintWithContextGroup()).set(newValue);
				return;
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				((FeatureMap.Internal)getArtifactOrArtifactSetGroup()).set(newValue);
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
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP:
				getValidityConstraintWithContextGroup().clear();
				return;
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				getArtifactOrArtifactSetGroup().clear();
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
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP:
				return validityConstraintWithContextGroup != null && !validityConstraintWithContextGroup.isEmpty();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT:
				return !getValidityConstraintWithContext().isEmpty();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				return artifactOrArtifactSetGroup != null && !artifactOrArtifactSetGroup.isEmpty();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET:
				return !getArtifactOrArtifactSet().isEmpty();
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
		result.append(" (validityConstraintWithContextGroup: ");
		result.append(validityConstraintWithContextGroup);
		result.append(", artifactOrArtifactSetGroup: ");
		result.append(artifactOrArtifactSetGroup);
		result.append(')');
		return result.toString();
	}

} //IEPConformanceTargetTypeImpl

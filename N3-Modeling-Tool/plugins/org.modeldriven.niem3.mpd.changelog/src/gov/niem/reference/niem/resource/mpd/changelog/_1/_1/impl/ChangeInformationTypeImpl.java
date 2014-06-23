/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.niem.structures._2.impl.ComplexObjectTypeImpl;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl#getChangeSummaryText <em>Change Summary Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl#getChangeReasonText <em>Change Reason Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl#getChangeFullDescriptionText <em>Change Full Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl#getChangeNCCTIssueNumber <em>Change NCCT Issue Number</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ChangeInformationTypeImpl#getChangeCode <em>Change Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeInformationTypeImpl extends ComplexObjectTypeImpl implements ChangeInformationType {
	/**
	 * The cached value of the '{@link #getChangeSummaryText() <em>Change Summary Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSummaryText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String changeSummaryText;

	/**
	 * The cached value of the '{@link #getChangeReasonText() <em>Change Reason Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeReasonText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String changeReasonText;

	/**
	 * The cached value of the '{@link #getChangeFullDescriptionText() <em>Change Full Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeFullDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.niem.proxy.xsd._2.String changeFullDescriptionText;

	/**
	 * The cached value of the '{@link #getChangeNCCTIssueNumber() <em>Change NCCT Issue Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeNCCTIssueNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.niem.proxy.xsd._2.Integer> changeNCCTIssueNumber;

	/**
	 * The cached value of the '{@link #getChangeCode() <em>Change Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeCode()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeCodeType> changeCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.CHANGE_INFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeSummaryText() {
		return changeSummaryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeSummaryText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldChangeSummaryText = changeSummaryText;
		changeSummaryText = newChangeSummaryText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT, oldChangeSummaryText, newChangeSummaryText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSummaryText(gov.niem.niem.proxy.xsd._2.String newChangeSummaryText) {
		if (newChangeSummaryText != changeSummaryText) {
			NotificationChain msgs = null;
			if (changeSummaryText != null)
				msgs = ((InternalEObject)changeSummaryText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT, null, msgs);
			if (newChangeSummaryText != null)
				msgs = ((InternalEObject)newChangeSummaryText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT, null, msgs);
			msgs = basicSetChangeSummaryText(newChangeSummaryText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT, newChangeSummaryText, newChangeSummaryText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeReasonText() {
		return changeReasonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeReasonText(gov.niem.niem.proxy.xsd._2.String newChangeReasonText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldChangeReasonText = changeReasonText;
		changeReasonText = newChangeReasonText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT, oldChangeReasonText, newChangeReasonText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeReasonText(gov.niem.niem.proxy.xsd._2.String newChangeReasonText) {
		if (newChangeReasonText != changeReasonText) {
			NotificationChain msgs = null;
			if (changeReasonText != null)
				msgs = ((InternalEObject)changeReasonText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT, null, msgs);
			if (newChangeReasonText != null)
				msgs = ((InternalEObject)newChangeReasonText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT, null, msgs);
			msgs = basicSetChangeReasonText(newChangeReasonText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT, newChangeReasonText, newChangeReasonText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getChangeFullDescriptionText() {
		return changeFullDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String newChangeFullDescriptionText, NotificationChain msgs) {
		gov.niem.niem.proxy.xsd._2.String oldChangeFullDescriptionText = changeFullDescriptionText;
		changeFullDescriptionText = newChangeFullDescriptionText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT, oldChangeFullDescriptionText, newChangeFullDescriptionText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeFullDescriptionText(gov.niem.niem.proxy.xsd._2.String newChangeFullDescriptionText) {
		if (newChangeFullDescriptionText != changeFullDescriptionText) {
			NotificationChain msgs = null;
			if (changeFullDescriptionText != null)
				msgs = ((InternalEObject)changeFullDescriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT, null, msgs);
			if (newChangeFullDescriptionText != null)
				msgs = ((InternalEObject)newChangeFullDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetChangeFullDescriptionText(newChangeFullDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT, newChangeFullDescriptionText, newChangeFullDescriptionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.niem.proxy.xsd._2.Integer> getChangeNCCTIssueNumber() {
		if (changeNCCTIssueNumber == null) {
			changeNCCTIssueNumber = new EObjectContainmentEList<gov.niem.niem.proxy.xsd._2.Integer>(gov.niem.niem.proxy.xsd._2.Integer.class, this, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER);
		}
		return changeNCCTIssueNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeCodeType> getChangeCode() {
		if (changeCode == null) {
			changeCode = new EObjectContainmentEList<ChangeCodeType>(ChangeCodeType.class, this, _1Package.CHANGE_INFORMATION_TYPE__CHANGE_CODE);
		}
		return changeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT:
				return basicSetChangeSummaryText(null, msgs);
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT:
				return basicSetChangeReasonText(null, msgs);
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT:
				return basicSetChangeFullDescriptionText(null, msgs);
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER:
				return ((InternalEList<?>)getChangeNCCTIssueNumber()).basicRemove(otherEnd, msgs);
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_CODE:
				return ((InternalEList<?>)getChangeCode()).basicRemove(otherEnd, msgs);
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
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT:
				return getChangeSummaryText();
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT:
				return getChangeReasonText();
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT:
				return getChangeFullDescriptionText();
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER:
				return getChangeNCCTIssueNumber();
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_CODE:
				return getChangeCode();
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
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT:
				setChangeSummaryText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT:
				setChangeReasonText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT:
				setChangeFullDescriptionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER:
				getChangeNCCTIssueNumber().clear();
				getChangeNCCTIssueNumber().addAll((Collection<? extends gov.niem.niem.proxy.xsd._2.Integer>)newValue);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_CODE:
				getChangeCode().clear();
				getChangeCode().addAll((Collection<? extends ChangeCodeType>)newValue);
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
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT:
				setChangeSummaryText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT:
				setChangeReasonText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT:
				setChangeFullDescriptionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER:
				getChangeNCCTIssueNumber().clear();
				return;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_CODE:
				getChangeCode().clear();
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
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT:
				return changeSummaryText != null;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT:
				return changeReasonText != null;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT:
				return changeFullDescriptionText != null;
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER:
				return changeNCCTIssueNumber != null && !changeNCCTIssueNumber.isEmpty();
			case _1Package.CHANGE_INFORMATION_TYPE__CHANGE_CODE:
				return changeCode != null && !changeCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeInformationTypeImpl

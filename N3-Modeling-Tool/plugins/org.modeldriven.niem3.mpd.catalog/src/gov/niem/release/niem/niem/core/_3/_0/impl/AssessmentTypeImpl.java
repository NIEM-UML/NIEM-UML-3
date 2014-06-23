/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AssessmentType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ObligationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ProgramType;
import gov.niem.release.niem.niem.core._3._0.ReferralType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentAssessor <em>Assessment Assessor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentScoreText <em>Assessment Score Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentFee <em>Assessment Fee</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentProgram <em>Assessment Program</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentReferral <em>Assessment Referral</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentPerson <em>Assessment Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentAugmentationPointGroup <em>Assessment Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AssessmentTypeImpl#getAssessmentAugmentationPoint <em>Assessment Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentTypeImpl extends ActivityTypeImpl implements AssessmentType {
	/**
	 * The cached value of the '{@link #getAssessmentAssessor() <em>Assessment Assessor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAssessor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> assessmentAssessor;

	/**
	 * The cached value of the '{@link #getAssessmentScoreText() <em>Assessment Score Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScoreText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> assessmentScoreText;

	/**
	 * The cached value of the '{@link #getAssessmentFee() <em>Assessment Fee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentFee()
	 * @generated
	 * @ordered
	 */
	protected EList<ObligationType> assessmentFee;

	/**
	 * The cached value of the '{@link #getAssessmentProgram() <em>Assessment Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramType> assessmentProgram;

	/**
	 * The cached value of the '{@link #getAssessmentReferral() <em>Assessment Referral</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentReferral()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferralType> assessmentReferral;

	/**
	 * The cached value of the '{@link #getAssessmentPerson() <em>Assessment Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> assessmentPerson;

	/**
	 * The cached value of the '{@link #getAssessmentAugmentationPointGroup() <em>Assessment Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap assessmentAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAssessmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getAssessmentAssessor() {
		if (assessmentAssessor == null) {
			assessmentAssessor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_ASSESSOR);
		}
		return assessmentAssessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAssessmentScoreText() {
		if (assessmentScoreText == null) {
			assessmentScoreText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_SCORE_TEXT);
		}
		return assessmentScoreText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObligationType> getAssessmentFee() {
		if (assessmentFee == null) {
			assessmentFee = new EObjectContainmentEList<ObligationType>(ObligationType.class, this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_FEE);
		}
		return assessmentFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramType> getAssessmentProgram() {
		if (assessmentProgram == null) {
			assessmentProgram = new EObjectContainmentEList<ProgramType>(ProgramType.class, this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_PROGRAM);
		}
		return assessmentProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferralType> getAssessmentReferral() {
		if (assessmentReferral == null) {
			assessmentReferral = new EObjectContainmentEList<ReferralType>(ReferralType.class, this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_REFERRAL);
		}
		return assessmentReferral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getAssessmentPerson() {
		if (assessmentPerson == null) {
			assessmentPerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_PERSON);
		}
		return assessmentPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAssessmentAugmentationPointGroup() {
		if (assessmentAugmentationPointGroup == null) {
			assessmentAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT_GROUP);
		}
		return assessmentAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAssessmentAugmentationPoint() {
		return getAssessmentAugmentationPointGroup().list(_0Package.eINSTANCE.getAssessmentType_AssessmentAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_ASSESSOR:
				return ((InternalEList<?>)getAssessmentAssessor()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_SCORE_TEXT:
				return ((InternalEList<?>)getAssessmentScoreText()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_FEE:
				return ((InternalEList<?>)getAssessmentFee()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PROGRAM:
				return ((InternalEList<?>)getAssessmentProgram()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_REFERRAL:
				return ((InternalEList<?>)getAssessmentReferral()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PERSON:
				return ((InternalEList<?>)getAssessmentPerson()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAssessmentAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAssessmentAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_ASSESSOR:
				return getAssessmentAssessor();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_SCORE_TEXT:
				return getAssessmentScoreText();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_FEE:
				return getAssessmentFee();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PROGRAM:
				return getAssessmentProgram();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_REFERRAL:
				return getAssessmentReferral();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PERSON:
				return getAssessmentPerson();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAssessmentAugmentationPointGroup();
				return ((FeatureMap.Internal)getAssessmentAugmentationPointGroup()).getWrapper();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT:
				return getAssessmentAugmentationPoint();
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
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_ASSESSOR:
				getAssessmentAssessor().clear();
				getAssessmentAssessor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_SCORE_TEXT:
				getAssessmentScoreText().clear();
				getAssessmentScoreText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_FEE:
				getAssessmentFee().clear();
				getAssessmentFee().addAll((Collection<? extends ObligationType>)newValue);
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PROGRAM:
				getAssessmentProgram().clear();
				getAssessmentProgram().addAll((Collection<? extends ProgramType>)newValue);
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_REFERRAL:
				getAssessmentReferral().clear();
				getAssessmentReferral().addAll((Collection<? extends ReferralType>)newValue);
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PERSON:
				getAssessmentPerson().clear();
				getAssessmentPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAssessmentAugmentationPointGroup()).set(newValue);
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
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_ASSESSOR:
				getAssessmentAssessor().clear();
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_SCORE_TEXT:
				getAssessmentScoreText().clear();
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_FEE:
				getAssessmentFee().clear();
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PROGRAM:
				getAssessmentProgram().clear();
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_REFERRAL:
				getAssessmentReferral().clear();
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PERSON:
				getAssessmentPerson().clear();
				return;
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT_GROUP:
				getAssessmentAugmentationPointGroup().clear();
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
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_ASSESSOR:
				return assessmentAssessor != null && !assessmentAssessor.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_SCORE_TEXT:
				return assessmentScoreText != null && !assessmentScoreText.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_FEE:
				return assessmentFee != null && !assessmentFee.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PROGRAM:
				return assessmentProgram != null && !assessmentProgram.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_REFERRAL:
				return assessmentReferral != null && !assessmentReferral.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_PERSON:
				return assessmentPerson != null && !assessmentPerson.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT_GROUP:
				return assessmentAugmentationPointGroup != null && !assessmentAugmentationPointGroup.isEmpty();
			case _0Package.ASSESSMENT_TYPE__ASSESSMENT_AUGMENTATION_POINT:
				return !getAssessmentAugmentationPoint().isEmpty();
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
		result.append(" (assessmentAugmentationPointGroup: ");
		result.append(assessmentAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AssessmentTypeImpl

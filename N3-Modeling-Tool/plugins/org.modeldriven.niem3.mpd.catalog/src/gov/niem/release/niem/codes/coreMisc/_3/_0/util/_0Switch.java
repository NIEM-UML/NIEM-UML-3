/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0.util;

import gov.niem.release.niem.codes.coreMisc._3._0.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package
 * @generated
 */
public class _0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE: {
				ContactInformationAvailabilityCodeType contactInformationAvailabilityCodeType = (ContactInformationAvailabilityCodeType)theEObject;
				T result = caseContactInformationAvailabilityCodeType(contactInformationAvailabilityCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DAY_OF_WEEK_CODE_TYPE: {
				DayOfWeekCodeType dayOfWeekCodeType = (DayOfWeekCodeType)theEObject;
				T result = caseDayOfWeekCodeType(dayOfWeekCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.IMAGE_POSE_CODE_TYPE: {
				ImagePoseCodeType imagePoseCodeType = (ImagePoseCodeType)theEObject;
				T result = caseImagePoseCodeType(imagePoseCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MILITARY_DISCHARGE_CATEGORY_CODE_TYPE: {
				MilitaryDischargeCategoryCodeType militaryDischargeCategoryCodeType = (MilitaryDischargeCategoryCodeType)theEObject;
				T result = caseMilitaryDischargeCategoryCodeType(militaryDischargeCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.OFFENSE_LEVEL_CODE_TYPE: {
				OffenseLevelCodeType offenseLevelCodeType = (OffenseLevelCodeType)theEObject;
				T result = caseOffenseLevelCodeType(offenseLevelCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_NAME_CATEGORY_CODE_TYPE: {
				PersonNameCategoryCodeType personNameCategoryCodeType = (PersonNameCategoryCodeType)theEObject;
				T result = casePersonNameCategoryCodeType(personNameCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PLEA_CATEGORY_CODE_TYPE: {
				PleaCategoryCodeType pleaCategoryCodeType = (PleaCategoryCodeType)theEObject;
				T result = casePleaCategoryCodeType(pleaCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.STATUTE_CATEGORY_CODE_TYPE: {
				StatuteCategoryCodeType statuteCategoryCodeType = (StatuteCategoryCodeType)theEObject;
				T result = caseStatuteCategoryCodeType(statuteCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUPERVISION_LEVEL_CODE_TYPE: {
				SupervisionLevelCodeType supervisionLevelCodeType = (SupervisionLevelCodeType)theEObject;
				T result = caseSupervisionLevelCodeType(supervisionLevelCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUPERVISION_RESTRICTION_CODE_TYPE: {
				SupervisionRestrictionCodeType supervisionRestrictionCodeType = (SupervisionRestrictionCodeType)theEObject;
				T result = caseSupervisionRestrictionCodeType(supervisionRestrictionCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.UTM_HEMISPHERE_CODE_TYPE: {
				UTMHemisphereCodeType utmHemisphereCodeType = (UTMHemisphereCodeType)theEObject;
				T result = caseUTMHemisphereCodeType(utmHemisphereCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Information Availability Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Information Availability Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactInformationAvailabilityCodeType(ContactInformationAvailabilityCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Of Week Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Of Week Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayOfWeekCodeType(DayOfWeekCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Pose Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Pose Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagePoseCodeType(ImagePoseCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Military Discharge Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Military Discharge Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMilitaryDischargeCategoryCodeType(MilitaryDischargeCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offense Level Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offense Level Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffenseLevelCodeType(OffenseLevelCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Name Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Name Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonNameCategoryCodeType(PersonNameCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plea Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plea Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePleaCategoryCodeType(PleaCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statute Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statute Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatuteCategoryCodeType(StatuteCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supervision Level Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervision Level Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervisionLevelCodeType(SupervisionLevelCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supervision Restriction Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervision Restriction Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervisionRestrictionCodeType(SupervisionRestrictionCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UTM Hemisphere Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UTM Hemisphere Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUTMHemisphereCodeType(UTMHemisphereCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch

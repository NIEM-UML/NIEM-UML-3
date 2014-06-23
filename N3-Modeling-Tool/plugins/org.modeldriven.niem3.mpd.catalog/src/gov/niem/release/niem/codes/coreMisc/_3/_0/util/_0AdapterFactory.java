/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0.util;

import gov.niem.release.niem.codes.coreMisc._3._0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseContactInformationAvailabilityCodeType(ContactInformationAvailabilityCodeType object) {
				return createContactInformationAvailabilityCodeTypeAdapter();
			}
			@Override
			public Adapter caseDayOfWeekCodeType(DayOfWeekCodeType object) {
				return createDayOfWeekCodeTypeAdapter();
			}
			@Override
			public Adapter caseImagePoseCodeType(ImagePoseCodeType object) {
				return createImagePoseCodeTypeAdapter();
			}
			@Override
			public Adapter caseMilitaryDischargeCategoryCodeType(MilitaryDischargeCategoryCodeType object) {
				return createMilitaryDischargeCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter caseOffenseLevelCodeType(OffenseLevelCodeType object) {
				return createOffenseLevelCodeTypeAdapter();
			}
			@Override
			public Adapter casePersonNameCategoryCodeType(PersonNameCategoryCodeType object) {
				return createPersonNameCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter casePleaCategoryCodeType(PleaCategoryCodeType object) {
				return createPleaCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter caseStatuteCategoryCodeType(StatuteCategoryCodeType object) {
				return createStatuteCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter caseSupervisionLevelCodeType(SupervisionLevelCodeType object) {
				return createSupervisionLevelCodeTypeAdapter();
			}
			@Override
			public Adapter caseSupervisionRestrictionCodeType(SupervisionRestrictionCodeType object) {
				return createSupervisionRestrictionCodeTypeAdapter();
			}
			@Override
			public Adapter caseUTMHemisphereCodeType(UTMHemisphereCodeType object) {
				return createUTMHemisphereCodeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.ContactInformationAvailabilityCodeType <em>Contact Information Availability Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.ContactInformationAvailabilityCodeType
	 * @generated
	 */
	public Adapter createContactInformationAvailabilityCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.DayOfWeekCodeType <em>Day Of Week Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.DayOfWeekCodeType
	 * @generated
	 */
	public Adapter createDayOfWeekCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.ImagePoseCodeType <em>Image Pose Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.ImagePoseCodeType
	 * @generated
	 */
	public Adapter createImagePoseCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.MilitaryDischargeCategoryCodeType <em>Military Discharge Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.MilitaryDischargeCategoryCodeType
	 * @generated
	 */
	public Adapter createMilitaryDischargeCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.OffenseLevelCodeType <em>Offense Level Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.OffenseLevelCodeType
	 * @generated
	 */
	public Adapter createOffenseLevelCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.PersonNameCategoryCodeType <em>Person Name Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.PersonNameCategoryCodeType
	 * @generated
	 */
	public Adapter createPersonNameCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.PleaCategoryCodeType <em>Plea Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.PleaCategoryCodeType
	 * @generated
	 */
	public Adapter createPleaCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.StatuteCategoryCodeType <em>Statute Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.StatuteCategoryCodeType
	 * @generated
	 */
	public Adapter createStatuteCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.SupervisionLevelCodeType <em>Supervision Level Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.SupervisionLevelCodeType
	 * @generated
	 */
	public Adapter createSupervisionLevelCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.SupervisionRestrictionCodeType <em>Supervision Restriction Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.SupervisionRestrictionCodeType
	 * @generated
	 */
	public Adapter createSupervisionRestrictionCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.codes.coreMisc._3._0.UTMHemisphereCodeType <em>UTM Hemisphere Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.codes.coreMisc._3._0.UTMHemisphereCodeType
	 * @generated
	 */
	public Adapter createUTMHemisphereCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_0AdapterFactory

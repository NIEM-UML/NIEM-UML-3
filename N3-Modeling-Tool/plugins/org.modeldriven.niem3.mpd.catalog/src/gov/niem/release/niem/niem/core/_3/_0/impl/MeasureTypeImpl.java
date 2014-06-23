/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.MeasureType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

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
 * An implementation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureValueGroup <em>Measure Value Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureValue <em>Measure Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureCommentText <em>Measure Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureDate <em>Measure Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureErrorGroup <em>Measure Error Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureError <em>Measure Error</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureUnitGroup <em>Measure Unit Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureUnit <em>Measure Unit</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasurer <em>Measurer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureMethodText <em>Measure Method Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureEstimatedIndicator <em>Measure Estimated Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureAugmentationPointGroup <em>Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MeasureTypeImpl#getMeasureAugmentationPoint <em>Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureTypeImpl extends ObjectTypeImpl implements MeasureType {
	/**
	 * The cached value of the '{@link #getMeasureValueGroup() <em>Measure Value Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureValueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap measureValueGroup;

	/**
	 * The cached value of the '{@link #getMeasureCommentText() <em>Measure Comment Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureCommentText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> measureCommentText;

	/**
	 * The cached value of the '{@link #getMeasureDate() <em>Measure Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> measureDate;

	/**
	 * The cached value of the '{@link #getMeasureErrorGroup() <em>Measure Error Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureErrorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap measureErrorGroup;

	/**
	 * The cached value of the '{@link #getMeasureUnitGroup() <em>Measure Unit Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureUnitGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap measureUnitGroup;

	/**
	 * The cached value of the '{@link #getMeasurer() <em>Measurer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> measurer;

	/**
	 * The cached value of the '{@link #getMeasureMethodText() <em>Measure Method Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureMethodText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> measureMethodText;

	/**
	 * The cached value of the '{@link #getMeasureEstimatedIndicator() <em>Measure Estimated Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureEstimatedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> measureEstimatedIndicator;

	/**
	 * The cached value of the '{@link #getMeasureAugmentationPointGroup() <em>Measure Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap measureAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMeasureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMeasureValueGroup() {
		if (measureValueGroup == null) {
			measureValueGroup = new BasicFeatureMap(this, _0Package.MEASURE_TYPE__MEASURE_VALUE_GROUP);
		}
		return measureValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMeasureValue() {
		return getMeasureValueGroup().list(_0Package.eINSTANCE.getMeasureType_MeasureValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMeasureCommentText() {
		if (measureCommentText == null) {
			measureCommentText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MEASURE_TYPE__MEASURE_COMMENT_TEXT);
		}
		return measureCommentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getMeasureDate() {
		if (measureDate == null) {
			measureDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MEASURE_TYPE__MEASURE_DATE);
		}
		return measureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMeasureErrorGroup() {
		if (measureErrorGroup == null) {
			measureErrorGroup = new BasicFeatureMap(this, _0Package.MEASURE_TYPE__MEASURE_ERROR_GROUP);
		}
		return measureErrorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMeasureError() {
		return getMeasureErrorGroup().list(_0Package.eINSTANCE.getMeasureType_MeasureError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMeasureUnitGroup() {
		if (measureUnitGroup == null) {
			measureUnitGroup = new BasicFeatureMap(this, _0Package.MEASURE_TYPE__MEASURE_UNIT_GROUP);
		}
		return measureUnitGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMeasureUnit() {
		return getMeasureUnitGroup().list(_0Package.eINSTANCE.getMeasureType_MeasureUnit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getMeasurer() {
		if (measurer == null) {
			measurer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.MEASURE_TYPE__MEASURER);
		}
		return measurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMeasureMethodText() {
		if (measureMethodText == null) {
			measureMethodText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MEASURE_TYPE__MEASURE_METHOD_TEXT);
		}
		return measureMethodText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMeasureEstimatedIndicator() {
		if (measureEstimatedIndicator == null) {
			measureEstimatedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.MEASURE_TYPE__MEASURE_ESTIMATED_INDICATOR);
		}
		return measureEstimatedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMeasureAugmentationPointGroup() {
		if (measureAugmentationPointGroup == null) {
			measureAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT_GROUP);
		}
		return measureAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMeasureAugmentationPoint() {
		return getMeasureAugmentationPointGroup().list(_0Package.eINSTANCE.getMeasureType_MeasureAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MEASURE_TYPE__MEASURE_VALUE_GROUP:
				return ((InternalEList<?>)getMeasureValueGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_VALUE:
				return ((InternalEList<?>)getMeasureValue()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_COMMENT_TEXT:
				return ((InternalEList<?>)getMeasureCommentText()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_DATE:
				return ((InternalEList<?>)getMeasureDate()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_ERROR_GROUP:
				return ((InternalEList<?>)getMeasureErrorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_ERROR:
				return ((InternalEList<?>)getMeasureError()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_UNIT_GROUP:
				return ((InternalEList<?>)getMeasureUnitGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_UNIT:
				return ((InternalEList<?>)getMeasureUnit()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURER:
				return ((InternalEList<?>)getMeasurer()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_METHOD_TEXT:
				return ((InternalEList<?>)getMeasureMethodText()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_ESTIMATED_INDICATOR:
				return ((InternalEList<?>)getMeasureEstimatedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getMeasureAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getMeasureAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.MEASURE_TYPE__MEASURE_VALUE_GROUP:
				if (coreType) return getMeasureValueGroup();
				return ((FeatureMap.Internal)getMeasureValueGroup()).getWrapper();
			case _0Package.MEASURE_TYPE__MEASURE_VALUE:
				return getMeasureValue();
			case _0Package.MEASURE_TYPE__MEASURE_COMMENT_TEXT:
				return getMeasureCommentText();
			case _0Package.MEASURE_TYPE__MEASURE_DATE:
				return getMeasureDate();
			case _0Package.MEASURE_TYPE__MEASURE_ERROR_GROUP:
				if (coreType) return getMeasureErrorGroup();
				return ((FeatureMap.Internal)getMeasureErrorGroup()).getWrapper();
			case _0Package.MEASURE_TYPE__MEASURE_ERROR:
				return getMeasureError();
			case _0Package.MEASURE_TYPE__MEASURE_UNIT_GROUP:
				if (coreType) return getMeasureUnitGroup();
				return ((FeatureMap.Internal)getMeasureUnitGroup()).getWrapper();
			case _0Package.MEASURE_TYPE__MEASURE_UNIT:
				return getMeasureUnit();
			case _0Package.MEASURE_TYPE__MEASURER:
				return getMeasurer();
			case _0Package.MEASURE_TYPE__MEASURE_METHOD_TEXT:
				return getMeasureMethodText();
			case _0Package.MEASURE_TYPE__MEASURE_ESTIMATED_INDICATOR:
				return getMeasureEstimatedIndicator();
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getMeasureAugmentationPointGroup();
				return ((FeatureMap.Internal)getMeasureAugmentationPointGroup()).getWrapper();
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT:
				return getMeasureAugmentationPoint();
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
			case _0Package.MEASURE_TYPE__MEASURE_VALUE_GROUP:
				((FeatureMap.Internal)getMeasureValueGroup()).set(newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_COMMENT_TEXT:
				getMeasureCommentText().clear();
				getMeasureCommentText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_DATE:
				getMeasureDate().clear();
				getMeasureDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_ERROR_GROUP:
				((FeatureMap.Internal)getMeasureErrorGroup()).set(newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_UNIT_GROUP:
				((FeatureMap.Internal)getMeasureUnitGroup()).set(newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURER:
				getMeasurer().clear();
				getMeasurer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_METHOD_TEXT:
				getMeasureMethodText().clear();
				getMeasureMethodText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_ESTIMATED_INDICATOR:
				getMeasureEstimatedIndicator().clear();
				getMeasureEstimatedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getMeasureAugmentationPointGroup()).set(newValue);
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
			case _0Package.MEASURE_TYPE__MEASURE_VALUE_GROUP:
				getMeasureValueGroup().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_COMMENT_TEXT:
				getMeasureCommentText().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_DATE:
				getMeasureDate().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_ERROR_GROUP:
				getMeasureErrorGroup().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_UNIT_GROUP:
				getMeasureUnitGroup().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURER:
				getMeasurer().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_METHOD_TEXT:
				getMeasureMethodText().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_ESTIMATED_INDICATOR:
				getMeasureEstimatedIndicator().clear();
				return;
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT_GROUP:
				getMeasureAugmentationPointGroup().clear();
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
			case _0Package.MEASURE_TYPE__MEASURE_VALUE_GROUP:
				return measureValueGroup != null && !measureValueGroup.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_VALUE:
				return !getMeasureValue().isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_COMMENT_TEXT:
				return measureCommentText != null && !measureCommentText.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_DATE:
				return measureDate != null && !measureDate.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_ERROR_GROUP:
				return measureErrorGroup != null && !measureErrorGroup.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_ERROR:
				return !getMeasureError().isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_UNIT_GROUP:
				return measureUnitGroup != null && !measureUnitGroup.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_UNIT:
				return !getMeasureUnit().isEmpty();
			case _0Package.MEASURE_TYPE__MEASURER:
				return measurer != null && !measurer.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_METHOD_TEXT:
				return measureMethodText != null && !measureMethodText.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_ESTIMATED_INDICATOR:
				return measureEstimatedIndicator != null && !measureEstimatedIndicator.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT_GROUP:
				return measureAugmentationPointGroup != null && !measureAugmentationPointGroup.isEmpty();
			case _0Package.MEASURE_TYPE__MEASURE_AUGMENTATION_POINT:
				return !getMeasureAugmentationPoint().isEmpty();
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
		result.append(" (measureValueGroup: ");
		result.append(measureValueGroup);
		result.append(", measureErrorGroup: ");
		result.append(measureErrorGroup);
		result.append(", measureUnitGroup: ");
		result.append(measureUnitGroup);
		result.append(", measureAugmentationPointGroup: ");
		result.append(measureAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //MeasureTypeImpl

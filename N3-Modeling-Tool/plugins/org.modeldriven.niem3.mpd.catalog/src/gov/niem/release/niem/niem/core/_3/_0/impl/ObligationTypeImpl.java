/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ObligationExemptionType;
import gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType;
import gov.niem.release.niem.niem.core._3._0.ObligationType;
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
 * An implementation of the model object '<em><b>Obligation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationTotalGroup <em>Obligation Total Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationTotal <em>Obligation Total</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationDueGroup <em>Obligation Due Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationDue <em>Obligation Due</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationPaidGroup <em>Obligation Paid Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationPaid <em>Obligation Paid</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationCompleteIndicator <em>Obligation Complete Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationComplianceIndicator <em>Obligation Compliance Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationDueDate <em>Obligation Due Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationExemption <em>Obligation Exemption</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationExemptionIndicator <em>Obligation Exemption Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationPaidDate <em>Obligation Paid Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationProgressDescriptionText <em>Obligation Progress Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationRequirementDescriptionText <em>Obligation Requirement Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationCategoryText <em>Obligation Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationEntity <em>Obligation Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationRecipient <em>Obligation Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationRecurrence <em>Obligation Recurrence</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationAugmentationPointGroup <em>Obligation Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ObligationTypeImpl#getObligationAugmentationPoint <em>Obligation Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObligationTypeImpl extends ObjectTypeImpl implements ObligationType {
	/**
	 * The cached value of the '{@link #getObligationTotalGroup() <em>Obligation Total Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationTotalGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap obligationTotalGroup;

	/**
	 * The cached value of the '{@link #getObligationDueGroup() <em>Obligation Due Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationDueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap obligationDueGroup;

	/**
	 * The cached value of the '{@link #getObligationPaidGroup() <em>Obligation Paid Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationPaidGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap obligationPaidGroup;

	/**
	 * The cached value of the '{@link #getObligationCompleteIndicator() <em>Obligation Complete Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationCompleteIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> obligationCompleteIndicator;

	/**
	 * The cached value of the '{@link #getObligationComplianceIndicator() <em>Obligation Compliance Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationComplianceIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> obligationComplianceIndicator;

	/**
	 * The cached value of the '{@link #getObligationDueDate() <em>Obligation Due Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationDueDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> obligationDueDate;

	/**
	 * The cached value of the '{@link #getObligationExemption() <em>Obligation Exemption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationExemption()
	 * @generated
	 * @ordered
	 */
	protected EList<ObligationExemptionType> obligationExemption;

	/**
	 * The cached value of the '{@link #getObligationExemptionIndicator() <em>Obligation Exemption Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationExemptionIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> obligationExemptionIndicator;

	/**
	 * The cached value of the '{@link #getObligationPaidDate() <em>Obligation Paid Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationPaidDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> obligationPaidDate;

	/**
	 * The cached value of the '{@link #getObligationProgressDescriptionText() <em>Obligation Progress Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationProgressDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> obligationProgressDescriptionText;

	/**
	 * The cached value of the '{@link #getObligationRequirementDescriptionText() <em>Obligation Requirement Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationRequirementDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> obligationRequirementDescriptionText;

	/**
	 * The cached value of the '{@link #getObligationCategoryText() <em>Obligation Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> obligationCategoryText;

	/**
	 * The cached value of the '{@link #getObligationEntity() <em>Obligation Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> obligationEntity;

	/**
	 * The cached value of the '{@link #getObligationRecipient() <em>Obligation Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> obligationRecipient;

	/**
	 * The cached value of the '{@link #getObligationRecurrence() <em>Obligation Recurrence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationRecurrence()
	 * @generated
	 * @ordered
	 */
	protected EList<ObligationRecurrenceType> obligationRecurrence;

	/**
	 * The cached value of the '{@link #getObligationAugmentationPointGroup() <em>Obligation Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap obligationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getObligationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObligationTotalGroup() {
		if (obligationTotalGroup == null) {
			obligationTotalGroup = new BasicFeatureMap(this, _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL_GROUP);
		}
		return obligationTotalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObligationTotal() {
		return getObligationTotalGroup().list(_0Package.eINSTANCE.getObligationType_ObligationTotal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObligationDueGroup() {
		if (obligationDueGroup == null) {
			obligationDueGroup = new BasicFeatureMap(this, _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_GROUP);
		}
		return obligationDueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObligationDue() {
		return getObligationDueGroup().list(_0Package.eINSTANCE.getObligationType_ObligationDue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObligationPaidGroup() {
		if (obligationPaidGroup == null) {
			obligationPaidGroup = new BasicFeatureMap(this, _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_GROUP);
		}
		return obligationPaidGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObligationPaid() {
		return getObligationPaidGroup().list(_0Package.eINSTANCE.getObligationType_ObligationPaid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getObligationCompleteIndicator() {
		if (obligationCompleteIndicator == null) {
			obligationCompleteIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLETE_INDICATOR);
		}
		return obligationCompleteIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getObligationComplianceIndicator() {
		if (obligationComplianceIndicator == null) {
			obligationComplianceIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLIANCE_INDICATOR);
		}
		return obligationComplianceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getObligationDueDate() {
		if (obligationDueDate == null) {
			obligationDueDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_DATE);
		}
		return obligationDueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObligationExemptionType> getObligationExemption() {
		if (obligationExemption == null) {
			obligationExemption = new EObjectContainmentEList<ObligationExemptionType>(ObligationExemptionType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION);
		}
		return obligationExemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getObligationExemptionIndicator() {
		if (obligationExemptionIndicator == null) {
			obligationExemptionIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION_INDICATOR);
		}
		return obligationExemptionIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getObligationPaidDate() {
		if (obligationPaidDate == null) {
			obligationPaidDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_DATE);
		}
		return obligationPaidDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getObligationProgressDescriptionText() {
		if (obligationProgressDescriptionText == null) {
			obligationProgressDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_PROGRESS_DESCRIPTION_TEXT);
		}
		return obligationProgressDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getObligationRequirementDescriptionText() {
		if (obligationRequirementDescriptionText == null) {
			obligationRequirementDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_REQUIREMENT_DESCRIPTION_TEXT);
		}
		return obligationRequirementDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getObligationCategoryText() {
		if (obligationCategoryText == null) {
			obligationCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_CATEGORY_TEXT);
		}
		return obligationCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getObligationEntity() {
		if (obligationEntity == null) {
			obligationEntity = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_ENTITY);
		}
		return obligationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getObligationRecipient() {
		if (obligationRecipient == null) {
			obligationRecipient = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_RECIPIENT);
		}
		return obligationRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObligationRecurrenceType> getObligationRecurrence() {
		if (obligationRecurrence == null) {
			obligationRecurrence = new EObjectContainmentEList<ObligationRecurrenceType>(ObligationRecurrenceType.class, this, _0Package.OBLIGATION_TYPE__OBLIGATION_RECURRENCE);
		}
		return obligationRecurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObligationAugmentationPointGroup() {
		if (obligationAugmentationPointGroup == null) {
			obligationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT_GROUP);
		}
		return obligationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObligationAugmentationPoint() {
		return getObligationAugmentationPointGroup().list(_0Package.eINSTANCE.getObligationType_ObligationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL_GROUP:
				return ((InternalEList<?>)getObligationTotalGroup()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL:
				return ((InternalEList<?>)getObligationTotal()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_GROUP:
				return ((InternalEList<?>)getObligationDueGroup()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE:
				return ((InternalEList<?>)getObligationDue()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_GROUP:
				return ((InternalEList<?>)getObligationPaidGroup()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID:
				return ((InternalEList<?>)getObligationPaid()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLETE_INDICATOR:
				return ((InternalEList<?>)getObligationCompleteIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLIANCE_INDICATOR:
				return ((InternalEList<?>)getObligationComplianceIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_DATE:
				return ((InternalEList<?>)getObligationDueDate()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION:
				return ((InternalEList<?>)getObligationExemption()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION_INDICATOR:
				return ((InternalEList<?>)getObligationExemptionIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_DATE:
				return ((InternalEList<?>)getObligationPaidDate()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PROGRESS_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getObligationProgressDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_REQUIREMENT_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getObligationRequirementDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_CATEGORY_TEXT:
				return ((InternalEList<?>)getObligationCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_ENTITY:
				return ((InternalEList<?>)getObligationEntity()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECIPIENT:
				return ((InternalEList<?>)getObligationRecipient()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECURRENCE:
				return ((InternalEList<?>)getObligationRecurrence()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getObligationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getObligationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL_GROUP:
				if (coreType) return getObligationTotalGroup();
				return ((FeatureMap.Internal)getObligationTotalGroup()).getWrapper();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL:
				return getObligationTotal();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_GROUP:
				if (coreType) return getObligationDueGroup();
				return ((FeatureMap.Internal)getObligationDueGroup()).getWrapper();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE:
				return getObligationDue();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_GROUP:
				if (coreType) return getObligationPaidGroup();
				return ((FeatureMap.Internal)getObligationPaidGroup()).getWrapper();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID:
				return getObligationPaid();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLETE_INDICATOR:
				return getObligationCompleteIndicator();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLIANCE_INDICATOR:
				return getObligationComplianceIndicator();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_DATE:
				return getObligationDueDate();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION:
				return getObligationExemption();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION_INDICATOR:
				return getObligationExemptionIndicator();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_DATE:
				return getObligationPaidDate();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PROGRESS_DESCRIPTION_TEXT:
				return getObligationProgressDescriptionText();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_REQUIREMENT_DESCRIPTION_TEXT:
				return getObligationRequirementDescriptionText();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_CATEGORY_TEXT:
				return getObligationCategoryText();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_ENTITY:
				return getObligationEntity();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECIPIENT:
				return getObligationRecipient();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECURRENCE:
				return getObligationRecurrence();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getObligationAugmentationPointGroup();
				return ((FeatureMap.Internal)getObligationAugmentationPointGroup()).getWrapper();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT:
				return getObligationAugmentationPoint();
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
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL_GROUP:
				((FeatureMap.Internal)getObligationTotalGroup()).set(newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_GROUP:
				((FeatureMap.Internal)getObligationDueGroup()).set(newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_GROUP:
				((FeatureMap.Internal)getObligationPaidGroup()).set(newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLETE_INDICATOR:
				getObligationCompleteIndicator().clear();
				getObligationCompleteIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLIANCE_INDICATOR:
				getObligationComplianceIndicator().clear();
				getObligationComplianceIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_DATE:
				getObligationDueDate().clear();
				getObligationDueDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION:
				getObligationExemption().clear();
				getObligationExemption().addAll((Collection<? extends ObligationExemptionType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION_INDICATOR:
				getObligationExemptionIndicator().clear();
				getObligationExemptionIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_DATE:
				getObligationPaidDate().clear();
				getObligationPaidDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PROGRESS_DESCRIPTION_TEXT:
				getObligationProgressDescriptionText().clear();
				getObligationProgressDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_REQUIREMENT_DESCRIPTION_TEXT:
				getObligationRequirementDescriptionText().clear();
				getObligationRequirementDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_CATEGORY_TEXT:
				getObligationCategoryText().clear();
				getObligationCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_ENTITY:
				getObligationEntity().clear();
				getObligationEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECIPIENT:
				getObligationRecipient().clear();
				getObligationRecipient().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECURRENCE:
				getObligationRecurrence().clear();
				getObligationRecurrence().addAll((Collection<? extends ObligationRecurrenceType>)newValue);
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getObligationAugmentationPointGroup()).set(newValue);
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
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL_GROUP:
				getObligationTotalGroup().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_GROUP:
				getObligationDueGroup().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_GROUP:
				getObligationPaidGroup().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLETE_INDICATOR:
				getObligationCompleteIndicator().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLIANCE_INDICATOR:
				getObligationComplianceIndicator().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_DATE:
				getObligationDueDate().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION:
				getObligationExemption().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION_INDICATOR:
				getObligationExemptionIndicator().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_DATE:
				getObligationPaidDate().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PROGRESS_DESCRIPTION_TEXT:
				getObligationProgressDescriptionText().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_REQUIREMENT_DESCRIPTION_TEXT:
				getObligationRequirementDescriptionText().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_CATEGORY_TEXT:
				getObligationCategoryText().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_ENTITY:
				getObligationEntity().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECIPIENT:
				getObligationRecipient().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECURRENCE:
				getObligationRecurrence().clear();
				return;
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT_GROUP:
				getObligationAugmentationPointGroup().clear();
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
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL_GROUP:
				return obligationTotalGroup != null && !obligationTotalGroup.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_TOTAL:
				return !getObligationTotal().isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_GROUP:
				return obligationDueGroup != null && !obligationDueGroup.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE:
				return !getObligationDue().isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_GROUP:
				return obligationPaidGroup != null && !obligationPaidGroup.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID:
				return !getObligationPaid().isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLETE_INDICATOR:
				return obligationCompleteIndicator != null && !obligationCompleteIndicator.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_COMPLIANCE_INDICATOR:
				return obligationComplianceIndicator != null && !obligationComplianceIndicator.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_DUE_DATE:
				return obligationDueDate != null && !obligationDueDate.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION:
				return obligationExemption != null && !obligationExemption.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_EXEMPTION_INDICATOR:
				return obligationExemptionIndicator != null && !obligationExemptionIndicator.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PAID_DATE:
				return obligationPaidDate != null && !obligationPaidDate.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_PROGRESS_DESCRIPTION_TEXT:
				return obligationProgressDescriptionText != null && !obligationProgressDescriptionText.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_REQUIREMENT_DESCRIPTION_TEXT:
				return obligationRequirementDescriptionText != null && !obligationRequirementDescriptionText.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_CATEGORY_TEXT:
				return obligationCategoryText != null && !obligationCategoryText.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_ENTITY:
				return obligationEntity != null && !obligationEntity.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECIPIENT:
				return obligationRecipient != null && !obligationRecipient.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_RECURRENCE:
				return obligationRecurrence != null && !obligationRecurrence.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT_GROUP:
				return obligationAugmentationPointGroup != null && !obligationAugmentationPointGroup.isEmpty();
			case _0Package.OBLIGATION_TYPE__OBLIGATION_AUGMENTATION_POINT:
				return !getObligationAugmentationPoint().isEmpty();
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
		result.append(" (obligationTotalGroup: ");
		result.append(obligationTotalGroup);
		result.append(", obligationDueGroup: ");
		result.append(obligationDueGroup);
		result.append(", obligationPaidGroup: ");
		result.append(obligationPaidGroup);
		result.append(", obligationAugmentationPointGroup: ");
		result.append(obligationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ObligationTypeImpl

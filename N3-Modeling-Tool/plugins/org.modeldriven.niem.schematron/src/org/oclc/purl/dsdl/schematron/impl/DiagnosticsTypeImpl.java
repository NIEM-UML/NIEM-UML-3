/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.oclc.purl.dsdl.schematron.DiagnosticType;
import org.oclc.purl.dsdl.schematron.DiagnosticsType;
import org.oclc.purl.dsdl.schematron.IncludeType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl#getDiagnostic <em>Diagnostic</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticsTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticsTypeImpl extends EObjectImpl implements DiagnosticsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.DIAGNOSTICS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SchematronPackage.DIAGNOSTICS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.DIAGNOSTICS_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.DIAGNOSTICS_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		return getGroup().list(SchematronPackage.Literals.DIAGNOSTICS_TYPE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticType> getDiagnostic() {
		return getGroup().list(SchematronPackage.Literals.DIAGNOSTICS_TYPE__DIAGNOSTIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.DIAGNOSTICS_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchematronPackage.DIAGNOSTICS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTICS_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTICS_TYPE__DIAGNOSTIC:
				return ((InternalEList<?>)getDiagnostic()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case SchematronPackage.DIAGNOSTICS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.DIAGNOSTICS_TYPE__INCLUDE:
				return getInclude();
			case SchematronPackage.DIAGNOSTICS_TYPE__DIAGNOSTIC:
				return getDiagnostic();
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case SchematronPackage.DIAGNOSTICS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__DIAGNOSTIC:
				getDiagnostic().clear();
				getDiagnostic().addAll((Collection<? extends DiagnosticType>)newValue);
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case SchematronPackage.DIAGNOSTICS_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__DIAGNOSTIC:
				getDiagnostic().clear();
				return;
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case SchematronPackage.DIAGNOSTICS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.DIAGNOSTICS_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case SchematronPackage.DIAGNOSTICS_TYPE__DIAGNOSTIC:
				return !getDiagnostic().isEmpty();
			case SchematronPackage.DIAGNOSTICS_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DiagnosticsTypeImpl

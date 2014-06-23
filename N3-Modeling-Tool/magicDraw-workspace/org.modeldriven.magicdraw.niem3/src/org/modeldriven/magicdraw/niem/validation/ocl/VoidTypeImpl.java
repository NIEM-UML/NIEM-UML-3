/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 * 
 * </copyright>
 *
 * $Id: VoidTypeImpl.java,v 1.10 2010/04/23 05:52:14 ewillink Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.impl.ClassImpl;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.impl.ClassifierImpl;
//import org.eclipse.ocl.uml.UMLPackage;
//import org.eclipse.ocl.uml.VoidType;
//import org.eclipse.ocl.uml.internal.OCLStandardLibraryImpl;
//import org.eclipse.uml2.common.util.CacheAdapter;
//import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
//
//import org.eclipse.uml2.uml.internal.impl.ClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Void Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.uml.impl.VoidTypeImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.ocl.uml.impl.VoidTypeImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class VoidTypeImpl
//		extends ClassifierImpl
		extends ClassImpl
		implements VoidType {

//	private EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
//	protected EList<Operation> ownedOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VOID_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentEList<Operation>(
				Operation.class, this, UMLPackage.VOID_TYPE__OWNED_OPERATION);
		}
		return ownedOperations;
	}
*/
	public List<Operation> getOwnedOperations() {
		return super.getOwnedOperation();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		return getOwnedOperation(name, ownedParameterNames,
			ownedParameterTypes, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase) {
		ownedOperationLoop : for (Operation ownedOperation : getOwnedOperations()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedOperation.getName())
				: name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			List<Parameter> ownedParameterList = ownedOperation
				.getOwnedParameter();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null
				&& ownedParameterNames.size() != ownedParameterListSize
				|| (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedOperationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null
					&& !(ignoreCase
						? (ownedParameterNames.get(j))
							.equalsIgnoreCase(ownedParameter.getName())
						: ownedParameterNames.get(j).equals(
							ownedParameter.getName())))
					continue ownedOperationLoop;
				if (ownedParameterTypes != null
					&& !ownedParameterTypes.get(j).equals(
						ownedParameter.getType()))
					continue ownedOperationLoop;
			}
			return ownedOperation;
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	public EList<Operation> oclOperations() {
		List<Operation> operations=null;
		if (operations == null) {
			VoidType prototype = (VoidType) OCLStandardLibraryImpl.INSTANCE
				.getOclVoid();

			if (prototype == this) {
				// I *am* the standard library type!
				operations = getOwnedOperations();
			} else {
				// the prototype defines my operations for me
				operations = prototype.oclOperations();
			}
		}
//		return operations;
		return new BasicEList(operations);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getName() {
		String name=super.getName();
		if (name == null) {
			name = SINGLETON_NAME;
			super.setName(name);
		}

		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
//	@Override
	public EList<Feature> getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Feature> features = (EList<Feature>) cache.get(eResource,
				this,
				org.eclipse.uml2.uml.UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache
					.put(
						eResource,
						this,
						org.eclipse.uml2.uml.UMLPackage.Literals.CLASSIFIER__FEATURE,
						features = new DerivedUnionEObjectEList<Feature>(
							Feature.class, this, UMLPackage.VOID_TYPE__FEATURE,
							FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList<Feature>(Feature.class, this,
			UMLPackage.VOID_TYPE__FEATURE, FEATURE_ESUBSETS);
	}
*/
	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	/*
	protected static final int[] FEATURE_ESUBSETS = new int[]{
		UMLPackage.VOID_TYPE__ATTRIBUTE, UMLPackage.VOID_TYPE__OWNED_OPERATION};
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.VOID_TYPE__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.VOID_TYPE__OWNED_OPERATION :
				return getOwnedOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.VOID_TYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll(
					(Collection<? extends Operation>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.VOID_TYPE__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
		}
		super.eUnset(featureID);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.VOID_TYPE__OWNED_OPERATION :
//				return ownedOperations != null && !ownedOperations.isEmpty();
				return !getOwnedOperations().isEmpty();
		}
		return super.eIsSet(featureID);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
/*
//	@Override
	public boolean isSetFeatures() {
//		return super.isSetFeatures()
		return super.hasFeature()
			|| eIsSet(UMLPackage.VOID_TYPE__OWNED_OPERATION);
	}
*/
} //VoidTypeImpl

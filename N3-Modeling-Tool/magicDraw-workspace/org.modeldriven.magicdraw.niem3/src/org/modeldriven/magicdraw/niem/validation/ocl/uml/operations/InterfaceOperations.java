/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InterfaceOperations.java,v 1.11 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
/*
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interface</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Interface#validateVisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interface#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of all features owned by an interface must be public.
	 * self.feature->forAll(f | f.visibility = #public)
	 * @param interface_ The receiving '<em><b>Interface</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibility(Interface interface_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		for (Feature feature : interface_.getFeature()) {

			if (feature.getVisibility() != VisibilityKindEnum.PUBLIC) {

				if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.INTERFACE__VISIBILITY, NIEMResourceLoader.INSTANCE
							.getString("_UI_Interface_Visibility_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, interface_)),
						new Object[]{interface_}));
				}

				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this interface.
	 * @param interface_ The receiving '<em><b>Interface</b></em>' model object.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(Interface interface_,
			String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType) {
		return TypeOperations.createOwnedOperation(interface_, name,
			parameterNames, parameterTypes, returnType);
	}
	static public Operation createOwnedOperation(Interface interface_,String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		Operation newOwnedOperation = (Operation) create(UMLPackage.Literals.OPERATION);
		interface_.getOwnedOperation().add(newOwnedOperation);
		if (name != null)
			newOwnedOperation.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null
			? 0
			: ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null
			? 0
			: ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
//			newOwnedOperation.createOwnedParameter(i < ownedParameterNamesSize
			OperationOperations.createOwnedParameter(newOwnedOperation,i < ownedParameterNamesSize
				? (String) ownedParameterNames.get(i)
				: null, i < ownedParameterTypesSize
				? (Type) ownedParameterTypes.get(i)
				: null);
		}
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this interface.
	 * @param interface_ The receiving '<em><b>Interface</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(Interface interface_,
			String name, Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(interface_, name, type,
			lower, upper);
	}
	static public Property createOwnedAttribute(Interface interface_,String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) create(eClass);
		interface_.getOwnedAttribute().add(newOwnedAttribute);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		return newOwnedAttribute;
	}
	static public Property createOwnedAttribute(Interface interface_,String name, Type type) {
		return createOwnedAttribute(interface_,name, type, UMLPackage.Literals.PROPERTY);
	}

} // InterfaceOperations
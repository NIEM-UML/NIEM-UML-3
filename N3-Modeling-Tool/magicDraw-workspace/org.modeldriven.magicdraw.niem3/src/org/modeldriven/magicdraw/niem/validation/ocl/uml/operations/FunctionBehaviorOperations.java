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
 * $Id: FunctionBehaviorOperations.java,v 1.7 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.FunctionBehavior;
/*
import org.eclipse.uml2.uml.FunctionBehavior;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Function Behavior</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Output Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Types Of Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionBehaviorOperations
		extends BehaviorOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBehaviorOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function behavior has at least one output parameter.
	 * self.ownedParameters->
	 *   select(p | p.direction=#out or p.direction=#inout or p.direction=#return)->size() >= 1
	 * @param functionBehavior The receiving '<em><b>Function Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneOutputParameter(
			FunctionBehavior functionBehavior, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.FUNCTION_BEHAVIOR__ONE_OUTPUT_PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneOutputParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(functionBehavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{functionBehavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of parameters are all data types, which may not nest anything but other datatypes.
	 * def: hasAllDataTypeAttributes(d : DataType) : Boolean =
	 *   d.ownedAttribute->forAll(a |
	 *     a.type.oclIsTypeOf(DataType) and
	 *       hasAllDataTypeAttributes(a.type))
	 * self.ownedParameters->forAll(p | p.type.notEmpty() and
	 *   p.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p))
	 * @param functionBehavior The receiving '<em><b>Function Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypesOfParameters(
			FunctionBehavior functionBehavior, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.FUNCTION_BEHAVIOR__TYPES_OF_PARAMETERS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypesOfParameters", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(functionBehavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{functionBehavior}));
			}
			return false;
		}
		return true;
	}

} // FunctionBehaviorOperations
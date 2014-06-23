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
 * $Id: InteractionConstraintOperations.java,v 1.7 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.InteractionConstraint;
/*
import org.eclipse.uml2.uml.InteractionConstraint;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interaction Constraint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateDynamicVariables(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dynamic Variables</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateGlobalData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Global Data</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMinintMaxint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint Maxint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMinintNonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Minint Non Negative</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMaxintPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maxint Positive</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.InteractionConstraint#validateMaxintGreaterEqualMinint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maxint Greater Equal Minint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionConstraintOperations
		extends ConstraintOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionConstraintOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dynamic variables that take part in the constraint must be owned by the ConnectableElement corresponding to the covered Lifeline.
	 * true
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDynamicVariables(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__DYNAMIC_VARIABLES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDynamicVariables", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint may contain references to global data or write-once data.
	 * true
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGlobalData(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__GLOBAL_DATA,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGlobalData", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minint/maxint can only be present if the InteractionConstraint is associated with the operand of a loop CombinedFragment.
	 * true
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinintMaxint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MININT_MAXINT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMinintMaxint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If minint is specified, then the expression must evaluate to a non-negative integer.
	 * true
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMinintNonNegative(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MININT_NON_NEGATIVE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMinintNonNegative", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If maxint is specified, then the expression must evaluate to a positive integer.
	 * true
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaxintPositive(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MAXINT_POSITIVE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMaxintPositive", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If maxint is specified, then minint must be specified and the evaluation of maxint must be >= the evaluation of minint
	 * true
	 * @param interactionConstraint The receiving '<em><b>Interaction Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMaxintGreaterEqualMinint(
			InteractionConstraint interactionConstraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						UMLValidator.INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMaxintGreaterEqualMinint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(interactionConstraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{interactionConstraint}));
			}
			return false;
		}
		return true;
	}

} // InteractionConstraintOperations
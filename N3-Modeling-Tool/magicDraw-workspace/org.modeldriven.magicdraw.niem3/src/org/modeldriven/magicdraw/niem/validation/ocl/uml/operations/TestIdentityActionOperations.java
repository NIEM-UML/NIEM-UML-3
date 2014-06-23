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
 * $Id: TestIdentityActionOperations.java,v 1.6 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.TestIdentityAction;
/*
import org.eclipse.uml2.uml.TestIdentityAction;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Test Identity Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#validateNoType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TestIdentityAction#validateResultIsBoolean(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Is Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIdentityActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIdentityActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pins have no type.
	 * self.first.type->size() = 0
	 * and self.second.type->size() = 0
	 * 
	 * @param testIdentityAction The receiving '<em><b>Test Identity Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoType(TestIdentityAction testIdentityAction,
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
						UMLValidator.TEST_IDENTITY_ACTION__NO_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(testIdentityAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{testIdentityAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the input pins is 1..1.
	 * self.first.multiplicity.is(1,1)
	 * and self.second.multiplicity.is(1,1)
	 * 
	 * @param testIdentityAction The receiving '<em><b>Test Identity Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(
			TestIdentityAction testIdentityAction, DiagnosticChain diagnostics,
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
						UMLValidator.TEST_IDENTITY_ACTION__MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(testIdentityAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{testIdentityAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result is Boolean.
	 * self.result.type.oclIsTypeOf(Boolean)
	 * @param testIdentityAction The receiving '<em><b>Test Identity Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResultIsBoolean(
			TestIdentityAction testIdentityAction, DiagnosticChain diagnostics,
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
						UMLValidator.TEST_IDENTITY_ACTION__RESULT_IS_BOOLEAN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateResultIsBoolean", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(testIdentityAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{testIdentityAction}));
			}
			return false;
		}
		return true;
	}

} // TestIdentityActionOperations
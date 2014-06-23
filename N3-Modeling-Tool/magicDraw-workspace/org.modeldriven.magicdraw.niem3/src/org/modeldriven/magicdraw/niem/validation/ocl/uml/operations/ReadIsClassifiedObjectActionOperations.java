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
 * $Id: ReadIsClassifiedObjectActionOperations.java,v 1.6 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReadIsClassifiedObjectAction;
/*
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Is Classified Object Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateMultiplicityOfInput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateNoType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateMultiplicityOfOutput(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadIsClassifiedObjectAction#validateBooleanResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boolean Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadIsClassifiedObjectActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadIsClassifiedObjectActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the input pin is 1..1.
	 * self.object.multiplicity.is(1,1)
	 * @param readIsClassifiedObjectAction The receiving '<em><b>Read Is Classified Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfInput(
			ReadIsClassifiedObjectAction readIsClassifiedObjectAction,
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
						UMLValidator.READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_INPUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfInput", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readIsClassifiedObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readIsClassifiedObjectAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pin has no type.
	 * self.object.type->isEmpty()
	 * @param readIsClassifiedObjectAction The receiving '<em><b>Read Is Classified Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoType(
			ReadIsClassifiedObjectAction readIsClassifiedObjectAction,
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
						UMLValidator.READ_IS_CLASSIFIED_OBJECT_ACTION__NO_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readIsClassifiedObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readIsClassifiedObjectAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the output pin is 1..1.
	 * self.result.multiplicity.is(1,1)
	 * @param readIsClassifiedObjectAction The receiving '<em><b>Read Is Classified Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfOutput(
			ReadIsClassifiedObjectAction readIsClassifiedObjectAction,
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
						UMLValidator.READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_OUTPUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfOutput", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readIsClassifiedObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readIsClassifiedObjectAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the output pin is Boolean
	 * self.result.type = Boolean
	 * @param readIsClassifiedObjectAction The receiving '<em><b>Read Is Classified Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBooleanResult(
			ReadIsClassifiedObjectAction readIsClassifiedObjectAction,
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
						UMLValidator.READ_IS_CLASSIFIED_OBJECT_ACTION__BOOLEAN_RESULT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBooleanResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readIsClassifiedObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readIsClassifiedObjectAction}));
			}
			return false;
		}
		return true;
	}

} // ReadIsClassifiedObjectActionOperations
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
 * $Id: ReadSelfActionOperations.java,v 1.6 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ReadSelfAction;
/*
import org.eclipse.uml2.uml.ReadSelfAction;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Self Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadSelfAction#validateContained(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Contained</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadSelfAction#validateNotStatic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Static</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadSelfAction#validateType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadSelfAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadSelfActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadSelfActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action must be contained in an behavior that has a host classifier.
	 * self.context->size() = 1
	 * @param readSelfAction The receiving '<em><b>Read Self Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateContained(ReadSelfAction readSelfAction,
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
						UMLValidator.READ_SELF_ACTION__CONTAINED,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateContained", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readSelfAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readSelfAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the action is contained in an behavior that is acting as the body of a method, then the operation of the method must not be static.
	 * true
	 * @param readSelfAction The receiving '<em><b>Read Self Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotStatic(ReadSelfAction readSelfAction,
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
						UMLValidator.READ_SELF_ACTION__NOT_STATIC,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotStatic", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readSelfAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readSelfAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result output pin is the host classifier.
	 * self.result.type = self.context
	 * @param readSelfAction The receiving '<em><b>Read Self Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateType(ReadSelfAction readSelfAction,
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
						UMLValidator.READ_SELF_ACTION__TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readSelfAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readSelfAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the result output pin is 1..1.
	 * self.result.multiplicity.is(1,1)
	 * @param readSelfAction The receiving '<em><b>Read Self Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(ReadSelfAction readSelfAction,
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
						UMLValidator.READ_SELF_ACTION__MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readSelfAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readSelfAction}));
			}
			return false;
		}
		return true;
	}

} // ReadSelfActionOperations
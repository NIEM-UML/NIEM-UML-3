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
 * $Id: ProtocolTransitionOperations.java,v 1.6 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.statemachines.mdprotocolstatemachines.ProtocolTransition;
/*
import org.eclipse.uml2.uml.ProtocolTransition;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Transition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateBelongsToPsm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Belongs To Psm</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateAssociatedActions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associated Actions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProtocolTransition#validateRefersToOperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refers To Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionOperations
		extends TransitionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol transition always belongs to a protocol state machine.
	 * container.belongsToPSM()
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBelongsToPsm(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
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
						UMLValidator.PROTOCOL_TRANSITION__BELONGS_TO_PSM,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBelongsToPsm", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolTransition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol transition never has associated actions.
	 * effect->isEmpty()
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssociatedActions(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
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
						UMLValidator.PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAssociatedActions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolTransition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a protocol transition refers to an operation (i. e. has a call trigger corresponding to an operation), then that operation should apply to the context classifier of the state machine of the protocol transition.
	 * true
	 * @param protocolTransition The receiving '<em><b>Protocol Transition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRefersToOperation(
			ProtocolTransition protocolTransition, DiagnosticChain diagnostics,
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
						UMLValidator.PROTOCOL_TRANSITION__REFERS_TO_OPERATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateRefersToOperation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(protocolTransition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{protocolTransition}));
			}
			return false;
		}
		return true;
	}

} // ProtocolTransitionOperations
/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: OutputPinOperations.java,v 1.3 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.OutputPin;
/*
import org.eclipse.uml2.uml.OutputPin;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Output Pin</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.OutputPin#validateIncomingEdgesStructuredOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incoming Edges Structured Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPinOperations
		extends PinOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output pins may have incoming edges only when they are on actions that are structured nodes, and these edges may not target a node contained by the structured node.
	 * true
	 * @param outputPin The receiving '<em><b>Output Pin</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIncomingEdgesStructuredOnly(
			OutputPin outputPin, DiagnosticChain diagnostics,
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
						UMLValidator.OUTPUT_PIN__INCOMING_EDGES_STRUCTURED_ONLY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIncomingEdgesStructuredOnly", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(outputPin, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{outputPin}));
			}
			return false;
		}
		return true;
	}

} // OutputPinOperations
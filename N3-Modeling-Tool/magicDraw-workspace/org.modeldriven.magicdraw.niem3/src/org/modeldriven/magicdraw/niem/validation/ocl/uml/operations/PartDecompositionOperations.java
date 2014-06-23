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
 * $Id: PartDecompositionOperations.java,v 1.7 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.PartDecomposition;
/*
import org.eclipse.uml2.uml.PartDecomposition;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Part Decomposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.PartDecomposition#validatePartsOfInternalStructures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parts Of Internal Structures</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PartDecomposition#validateAssume(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assume</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PartDecomposition#validateCommutativityOfDecomposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Commutativity Of Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartDecompositionOperations
		extends InteractionUseOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartDecompositionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PartDecompositions apply only to Parts that are Parts of Internal Structures not to Parts of Collaborations.
	 * true
	 * @param partDecomposition The receiving '<em><b>Part Decomposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePartsOfInternalStructures(
			PartDecomposition partDecomposition, DiagnosticChain diagnostics,
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
						UMLValidator.PART_DECOMPOSITION__PARTS_OF_INTERNAL_STRUCTURES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validatePartsOfInternalStructures", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(partDecomposition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{partDecomposition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Within X there is a sequence of constructs along L (such constructs are CombinedFragments, InteractionUse and (plain) OccurrenceSpecifications). Then a corresponding sequence of constructs must appear within D, matched one-to-one in the same order.
	 * 
	 * i) CombinedFragment covering L are matched with an extra-global CombinedFragment in D
	 * ii) An InteractionUse covering L are matched with a global (i.e. covering all Lifelines) InteractionUse in D.
	 * iii) A plain OccurrenceSpecification on L is considered an actualGate that must be matched by a formalGate of D
	 * 
	 * true
	 * @param partDecomposition The receiving '<em><b>Part Decomposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssume(PartDecomposition partDecomposition,
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
						UMLValidator.PART_DECOMPOSITION__ASSUME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAssume", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(partDecomposition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{partDecomposition}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Assume also that there is within X an
	 * InteractionUse (say) U that covers L. According to the constraint above U will have a counterpart CU within D. Within the Interaction referenced by U, L should also be decomposed, and the decomposition should reference CU. (This rule is called commutativity of decomposition)
	 * 
	 * true
	 * @param partDecomposition The receiving '<em><b>Part Decomposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCommutativityOfDecomposition(
			PartDecomposition partDecomposition, DiagnosticChain diagnostics,
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
						UMLValidator.PART_DECOMPOSITION__COMMUTATIVITY_OF_DECOMPOSITION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCommutativityOfDecomposition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(partDecomposition, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{partDecomposition}));
			}
			return false;
		}
		return true;
	}

} // PartDecompositionOperations
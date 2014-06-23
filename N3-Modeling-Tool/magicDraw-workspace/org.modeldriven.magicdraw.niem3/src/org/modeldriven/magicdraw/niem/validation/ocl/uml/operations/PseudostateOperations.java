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
 * $Id: PseudostateOperations.java,v 1.7 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Pseudostate;
/*
import org.eclipse.uml2.uml.Pseudostate;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pseudostate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateInitialVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Initial Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateHistoryVertices(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Vertices</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateJoinVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Join Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsIncoming(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Incoming</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateForkVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fork Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateTransitionsOutgoing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transitions Outgoing</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateJunctionVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Junction Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateChoiceVertex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Choice Vertex</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Pseudostate#validateOutgoingFromInitial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outgoing From Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PseudostateOperations
		extends VertexOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudostateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initial vertex can have at most one outgoing transition.
	 * (self.kind = #initial) implies (self.outgoing->size <= 1)
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInitialVertex(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__INITIAL_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInitialVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * History vertices can have at most one outgoing transition.
	 * ((self.kind = #deepHistory) or (self.kind = #shallowHistory)) implies
	 * (self.outgoing->size <= 1)
	 * 
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryVertices(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__HISTORY_VERTICES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHistoryVertices", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete statemachine, a join vertex must have at least two incoming transitions and exactly one outgoing transition.
	 * (self.kind = #join) implies
	 * ((self.outgoing->size = 1) and (self.incoming->size >= 2))
	 * 
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateJoinVertex(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__JOIN_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateJoinVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions incoming a join vertex must originate in different regions of an orthogonal state.
	 * (self.kind = #join) implies
	 *   self.incoming->forAll (t1, t2 | t1<>t2 implies
	 *     (self.stateMachine.LCA(t1.source, t2.source).container.isOrthogonal))
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTransitionsIncoming(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__TRANSITIONS_INCOMING,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTransitionsIncoming", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete statemachine, a fork vertex must have at least two outgoing transitions and exactly one incoming transition.
	 * (self.kind = #fork) implies
	 * ((self.incoming->size = 1) and (self.outgoing->size >= 2))
	 * 
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateForkVertex(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__FORK_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateForkVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions outgoing a fork vertex must target states in different regions of an orthogonal state.
	 * (self.kind = #fork) implies
	 *   self.outgoing->forAll (t1, t2 | t1<>t2 implies
	 *     (self.stateMachine.LCA(t1.target, t2.target).container.isOrthogonal))
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTransitionsOutgoing(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__TRANSITIONS_OUTGOING,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTransitionsOutgoing", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete statemachine, a junction vertex must have at least one incoming and one outgoing transition.
	 * (self.kind = #junction) implies
	 * ((self.incoming->size >= 1) and (self.outgoing->size >= 1))
	 * 
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateJunctionVertex(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__JUNCTION_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateJunctionVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a complete statemachine, a choice vertex must have at least one incoming and one outgoing transition.
	 * (self.kind = #choice) implies
	 * ((self.incoming->size >= 1) and (self.outgoing->size >= 1))
	 * 
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateChoiceVertex(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__CHOICE_VERTEX,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateChoiceVertex", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing transition from and initial vertex may have a behavior, but not a trigger or a guard.
	 * (self.kind = #initial) implies (self.outgoing.guard->isEmpty()
	 *   and self.outgoing.trigger->isEmpty())
	 * @param pseudostate The receiving '<em><b>Pseudostate</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOutgoingFromInitial(Pseudostate pseudostate,
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
						UMLValidator.PSEUDOSTATE__OUTGOING_FROM_INITIAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOutgoingFromInitial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pseudostate, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{pseudostate}));
			}
			return false;
		}
		return true;
	}

} // PseudostateOperations
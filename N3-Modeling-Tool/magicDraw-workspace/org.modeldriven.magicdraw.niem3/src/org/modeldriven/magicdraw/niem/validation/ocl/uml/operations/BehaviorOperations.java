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
 * $Id: BehaviorOperations.java,v 1.13 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.BehavioralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.Behavior;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.BehavioredClassifier;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.metadata.MdbasicbehaviorsPackage;
/*
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Behavior</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateParametersMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameters Match</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateFeatureOfContextClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Feature Of Context Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateMustRealize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Realize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#validateMostOneBehaviour(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most One Behaviour</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Behavior#getContext() <em>Get Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters of the behavior must match the parameters of the implemented behavioral feature.
	 * true
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateParametersMatch(Behavior behavior,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		BehavioralFeature specification = behavior.getSpecification();

		if (specification != null) {
			List<Parameter> behaviorOwnedParameters = behavior
				.getOwnedParameter();
			List<Parameter> specificationOwnedParameters = specification
				.getOwnedParameter();

			if (behaviorOwnedParameters.size() != specificationOwnedParameters
				.size()) {

				result = false;
			} else {
				Iterator<Parameter> bop = behaviorOwnedParameters.iterator();
				Iterator<Parameter> sop = specificationOwnedParameters
					.iterator();

				while (bop.hasNext() && sop.hasNext()) {

					if (!ParameterOperations.matches(bop.next(), sop.next())) {
						result = false;
						break;
					}
				}
			}

			if (!result && diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.BEHAVIOR__PARAMETERS_MATCH, NIEMResourceLoader.INSTANCE
						.getString("_UI_Behavior_ParametersMatch_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, behavior)),
					new Object[]{behavior}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The implemented behavioral feature must be a feature (possibly inherited) of the context classifier of the behavior.
	 * true
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateFeatureOfContextClassifier(Behavior behavior,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		BehavioralFeature specification = behavior.getSpecification();

		if (specification != null) {
			Classifier contextClassifier = behavior.getContext();

			if (contextClassifier == null
				|| !ClassifierOperations.allFeatures(contextClassifier).contains(specification)) {

				if (diagnostics != null) {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER,
							NIEMResourceLoader.INSTANCE
								.getString(
									"_UI_Behavior_FeatureOfContextClassifier_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context, behavior)),
							new Object[]{behavior}));
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
	 * If the implemented behavioral feature has been redefined in the ancestors of the owner of the behavior, then the behavior must realize the latest redefining behavioral feature.
	 * true
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMustRealize(Behavior behavior,
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
						UMLValidator.BEHAVIOR__MUST_REALIZE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMustRealize", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There may be at most one behavior for a given pairing of classifier (as owner of the behavior) and behavioral feature (as specification of the behavior).
	 * true
	 * @param behavior The receiving '<em><b>Behavior</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMostOneBehaviour(Behavior behavior,
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
						UMLValidator.BEHAVIOR__MOST_ONE_BEHAVIOUR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMostOneBehaviour", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(behavior, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{behavior}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static BehavioredClassifier getContext(Behavior behavior) {
		return (BehavioredClassifier) getOwningElement(behavior,
				UMLPackage.Literals.BEHAVIORED_CLASSIFIER, false);
	}

} // BehaviorOperations
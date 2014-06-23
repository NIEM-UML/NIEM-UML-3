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
 * $Id: DeploymentSpecificationOperations.java,v 1.7 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.deployments.mdcomponentdeployments.DeploymentSpecification;
/*
import org.eclipse.uml2.uml.DeploymentSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Deployment Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#validateDeployedElements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deployed Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentSpecification#validateDeploymentTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deployment Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationOperations
		extends ArtifactOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployedElements of a DeploymentTarget that are involved in a Deployment that has an associated Deployment-Specification is a kind of Component (i.e. the configured components).
	 * self.deployment->forAll (d | d.location.deployedElements->forAll (de |
	 *   de.oclIsKindOf(Component)))
	 * @param deploymentSpecification The receiving '<em><b>Deployment Specification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeployedElements(
			DeploymentSpecification deploymentSpecification,
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
						UMLValidator.DEPLOYMENT_SPECIFICATION__DEPLOYED_ELEMENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDeployedElements", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deploymentSpecification, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{deploymentSpecification}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeploymentTarget of a DeploymentSpecification is a kind of ExecutionEnvironment.
	 * result = self.deployment->forAll (d | d.location..oclIsKindOf(ExecutionEnvironment))
	 * @param deploymentSpecification The receiving '<em><b>Deployment Specification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeploymentTarget(
			DeploymentSpecification deploymentSpecification,
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
						UMLValidator.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_TARGET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateDeploymentTarget", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deploymentSpecification, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{deploymentSpecification}));
			}
			return false;
		}
		return true;
	}

} // DeploymentSpecificationOperations
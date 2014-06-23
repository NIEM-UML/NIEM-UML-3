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
 * $Id: CreateObjectActionOperations.java,v 1.6 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.CreateObjectAction;
/*
import org.eclipse.uml2.uml.CreateObjectAction;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Create Object Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.CreateObjectAction#validateClassifierNotAbstract(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Not Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CreateObjectAction#validateClassifierNotAssociationClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Classifier Not Association Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CreateObjectAction#validateSameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.CreateObjectAction#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateObjectActionOperations
		extends ActivityNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateObjectActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier cannot be abstract.
	 * not (self.classifier.isAbstract = #true)
	 * @param createObjectAction The receiving '<em><b>Create Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassifierNotAbstract(
			CreateObjectAction createObjectAction, DiagnosticChain diagnostics,
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
						UMLValidator.CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClassifierNotAbstract", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(createObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{createObjectAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier cannot be an association class
	 * not self.classifier.oclIsKindOf(AssociationClass)
	 * @param createObjectAction The receiving '<em><b>Create Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassifierNotAssociationClass(
			CreateObjectAction createObjectAction, DiagnosticChain diagnostics,
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
						UMLValidator.CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ASSOCIATION_CLASS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateClassifierNotAssociationClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(createObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{createObjectAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result pin must be the same as the classifier of the action.
	 * self.result.type = self.classifier
	 * @param createObjectAction The receiving '<em><b>Create Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameType(
			CreateObjectAction createObjectAction, DiagnosticChain diagnostics,
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
						UMLValidator.CREATE_OBJECT_ACTION__SAME_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(createObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{createObjectAction}));
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
	 * @param createObjectAction The receiving '<em><b>Create Object Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(
			CreateObjectAction createObjectAction, DiagnosticChain diagnostics,
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
						UMLValidator.CREATE_OBJECT_ACTION__MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(createObjectAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{createObjectAction}));
			}
			return false;
		}
		return true;
	}

} // CreateObjectActionOperations
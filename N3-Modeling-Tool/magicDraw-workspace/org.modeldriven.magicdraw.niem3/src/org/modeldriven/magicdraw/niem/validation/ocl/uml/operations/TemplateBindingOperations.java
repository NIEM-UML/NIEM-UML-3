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
 * $Id: TemplateBindingOperations.java,v 1.7 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateBinding;
/*
import org.eclipse.uml2.uml.TemplateBinding;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Template Binding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#validateParameterSubstitutionFormal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameter Substitution Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateBinding#validateOneParameterSubstitution(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each parameter substitution must refer to a formal template parameter of the target template signature.
	 * parameterSubstitution->forAll(b | template.parameter->includes(b.formal))
	 * @param templateBinding The receiving '<em><b>Template Binding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParameterSubstitutionFormal(
			TemplateBinding templateBinding, DiagnosticChain diagnostics,
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
						UMLValidator.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION_FORMAL,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateParameterSubstitutionFormal", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(templateBinding, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{templateBinding}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding contains at most one parameter substitution for each formal template parameter of the target template signature.
	 * template.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)
	 * @param templateBinding The receiving '<em><b>Template Binding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOneParameterSubstitution(
			TemplateBinding templateBinding, DiagnosticChain diagnostics,
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
						UMLValidator.TEMPLATE_BINDING__ONE_PARAMETER_SUBSTITUTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOneParameterSubstitution", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(templateBinding, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{templateBinding}));
			}
			return false;
		}
		return true;
	}

} // TemplateBindingOperations
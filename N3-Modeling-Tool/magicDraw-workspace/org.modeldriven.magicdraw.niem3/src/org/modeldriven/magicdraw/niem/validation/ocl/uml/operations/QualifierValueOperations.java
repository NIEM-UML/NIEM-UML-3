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
 * $Id: QualifierValueOperations.java,v 1.4 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.QualifierValue;
/*
import org.eclipse.uml2.uml.QualifierValue;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Qualifier Value</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.QualifierValue#validateQualifierAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualifier Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.QualifierValue#validateTypeOfQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Of Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.QualifierValue#validateMultiplicityOfQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifierValueOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierValueOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier attribute must be a qualifier of the association end of the link-end data.
	 * self.LinkEndData.end->collect(qualifier)->includes(self.qualifier)
	 * @param qualifierValue The receiving '<em><b>Qualifier Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateQualifierAttribute(
			QualifierValue qualifierValue, DiagnosticChain diagnostics,
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
						UMLValidator.QUALIFIER_VALUE__QUALIFIER_ATTRIBUTE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateQualifierAttribute", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(qualifierValue, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{qualifierValue}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the qualifier value input pin is the same as the type of the qualifier attribute.
	 * self.value.type = self.qualifier.type
	 * @param qualifierValue The receiving '<em><b>Qualifier Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeOfQualifier(
			QualifierValue qualifierValue, DiagnosticChain diagnostics,
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
						UMLValidator.QUALIFIER_VALUE__TYPE_OF_QUALIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeOfQualifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(qualifierValue, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{qualifierValue}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the qualifier value input pin is "1..1".
	 * self.value.multiplicity.is(1,1)
	 * @param qualifierValue The receiving '<em><b>Qualifier Value</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfQualifier(
			QualifierValue qualifierValue, DiagnosticChain diagnostics,
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
						UMLValidator.QUALIFIER_VALUE__MULTIPLICITY_OF_QUALIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfQualifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(qualifierValue, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{qualifierValue}));
			}
			return false;
		}
		return true;
	}

} // QualifierValueOperations
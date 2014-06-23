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
 * $Id: ExtensionEndOperations.java,v 1.14 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ExtensionEnd;
/*
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extension End</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#validateMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#validateAggregation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionEnd#lowerBound() <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionEndOperations
		extends PropertyOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionEndOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of ExtensionEnd is 0..1 or 1.
	 * (self->lowerBound() = 0 or self->lowerBound() = 1) and self->upperBound() = 1
	 * @param extensionEnd The receiving '<em><b>Extension End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicity(ExtensionEnd extensionEnd,
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
						UMLValidator.EXTENSION_END__MULTIPLICITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extensionEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extensionEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation of an ExtensionEnd is composite.
	 * self.aggregation = #composite
	 * @param extensionEnd The receiving '<em><b>Extension End</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAggregation(ExtensionEnd extensionEnd,
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
						UMLValidator.EXTENSION_END__AGGREGATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateAggregation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extensionEnd, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extensionEnd}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an Integer. This is a redefinition of the default
	 * lower bound, which normally, for MultiplicityElements, evaluates to 1 if empty.
	 * result = lowerBound = if lowerValue->isEmpty() then 0 else lowerValue->IntegerValue() endif
	 * @param extensionEnd The receiving '<em><b>Extension End</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(ExtensionEnd extensionEnd) {
		ValueSpecification lowerValue = extensionEnd.getLowerValue();

		if (lowerValue != null) {

			try {
//				return lowerValue.integerValue();
				return ValueSpecificationOperations.integerValue(lowerValue);
			} catch (UnsupportedOperationException uoe) {
				// do nothing
			}
		}

		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static int getLower(ExtensionEnd extensionEnd) {
//		return extensionEnd.lowerBound();
		return lowerBound(extensionEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(ExtensionEnd extensionEnd, int newLower) {
		MultiplicityElementOperations.setLower(extensionEnd, newLower);
	}

} // ExtensionEndOperations
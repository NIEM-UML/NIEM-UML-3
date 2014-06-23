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
 * $Id: ParameterOperations.java,v 1.20 2007/05/04 20:35:34 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralNull;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
/*
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Parameter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateConnectorEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Connector End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateStreamAndException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stream And Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateNotException(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateReentrantBehaviors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reentrant Behaviors</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#validateInAndOut(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In And Out</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#getDefault() <em>Get Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#isSetDefault() <em>Is Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setDefault(java.lang.String) <em>Set Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#unsetDefault() <em>Unset Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setBooleanDefaultValue(boolean) <em>Set Boolean Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setIntegerDefaultValue(int) <em>Set Integer Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setStringDefaultValue(java.lang.String) <em>Set String Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setUnlimitedNaturalDefaultValue(int) <em>Set Unlimited Natural Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Parameter#setNullDefaultValue() <em>Set Null Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterOperations
		extends ConnectableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter may only be associated with a connector end within the context of a collaboration.
	 * self.end.notEmpty() implies self.collaboration.notEmpty()
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConnectorEnd(Parameter parameter,
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
						UMLValidator.PARAMETER__CONNECTOR_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateConnectorEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter cannot be a stream and exception at the same time.
	 * true
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStreamAndException(Parameter parameter,
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
						UMLValidator.PARAMETER__STREAM_AND_EXCEPTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateStreamAndException", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input parameter cannot be an exception.
	 * true
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotException(Parameter parameter,
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
						UMLValidator.PARAMETER__NOT_EXCEPTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotException", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reentrant behaviors cannot have stream parameters.
	 * true
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReentrantBehaviors(Parameter parameter,
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
						UMLValidator.PARAMETER__REENTRANT_BEHAVIORS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateReentrantBehaviors", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only in and inout parameters may have a delete effect. Only out, inout, and return parameters may have a create effect.
	 * true
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInAndOut(Parameter parameter,
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
						UMLValidator.PARAMETER__IN_AND_OUT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateInAndOut", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(parameter, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{parameter}));
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
	public static String getDefault(Parameter parameter) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		return defaultValue == null
			? null
			: ValueSpecificationOperations.stringValue(defaultValue);
//		: defaultValue.stringValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setDefault(Parameter parameter, String newDefault) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		if (defaultValue != null) {
			ValueSpecificationOperations.setValue(defaultValue, newDefault);
		} else {
			ParameterOperations.setStringDefaultValue(parameter,newDefault);
//			parameter.setStringDefaultValue(newDefault);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isSetDefault(Parameter parameter) {
		return parameter.getDefault() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void unsetDefault(Parameter parameter) {

		if (isSetDefault(parameter)) {
//		if (parameter.isSetDefault()) {
			parameter.eUnset(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified Boolean value.
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setBooleanDefaultValue(Parameter parameter, boolean value) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralBoolean) (defaultValue instanceof LiteralBoolean
			? defaultValue
//					: parameter.createDefaultValue(null, null,
			: createDefaultValue(parameter,null, null,
					UMLPackage.Literals.LITERAL_BOOLEAN))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified integer value.
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setIntegerDefaultValue(Parameter parameter, int value) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralInteger) (defaultValue instanceof LiteralInteger
			? defaultValue
//					: parameter.createDefaultValue(null, null,
			: createDefaultValue(parameter,null, null,
					UMLPackage.Literals.LITERAL_INTEGER))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified string value.
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setStringDefaultValue(Parameter parameter, String value) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralString) (defaultValue instanceof LiteralString
			? defaultValue
//					: parameter.createDefaultValue(null, null,
			: createDefaultValue(parameter,null, null,
					UMLPackage.Literals.LITERAL_STRING))).setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the specified unlimited natural value.
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setUnlimitedNaturalDefaultValue(Parameter parameter,
			int value) {
		ValueSpecification defaultValue = parameter.getDefaultValue();

		((LiteralUnlimitedNatural) (defaultValue instanceof LiteralUnlimitedNatural
			? defaultValue
//					: parameter.createDefaultValue(null, null,
			: createDefaultValue(parameter,null, null,
					UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL)))
			.setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this parameter to the null value.
	 * @param parameter The receiving '<em><b>Parameter</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void setNullDefaultValue(Parameter parameter) {

		if (!(parameter.getDefaultValue() instanceof LiteralNull)) {
//			parameter.createDefaultValue(null, null,
			createDefaultValue(parameter,null, null,
					UMLPackage.Literals.LITERAL_NULL);
		}
	}

	protected static boolean matches(Parameter parameter,
			Parameter otherParameter) {
		Type type = parameter.getType();
		Type otherType = otherParameter.getType();

		return (type == null
			? otherType == null
			: TypeOperations.conformsTo(type,otherType))
			/*
			&& parameter.lowerBound() == otherParameter.lowerBound()
			&& parameter.upperBound() == otherParameter.upperBound()
			*/
			&& parameter.getLower() == otherParameter.getLower()
			&& parameter.getUpper() == otherParameter.getUpper()
			&& parameter.isOrdered() == otherParameter.isOrdered();
	}
	static public ValueSpecification createDefaultValue(Parameter parameter,String name, Type type,
			EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) create(eClass);
		parameter.setDefaultValue(newDefaultValue);
		if (name != null)
			newDefaultValue.setName(name);
		if (type != null)
			newDefaultValue.setType(type);
		return newDefaultValue;
	}

} // ParameterOperations
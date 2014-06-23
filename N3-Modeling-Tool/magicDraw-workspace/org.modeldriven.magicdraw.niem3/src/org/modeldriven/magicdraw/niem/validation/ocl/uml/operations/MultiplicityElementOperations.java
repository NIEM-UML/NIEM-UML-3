/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: MultiplicityElementOperations.java,v 1.19 2008/10/02 20:56:22 jbruck Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
/*
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Multiplicity Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#setUpper(int) <em>Set Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesCardinality(int) <em>Includes Cardinality</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement) <em>Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#is(int, int) <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityElementOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound must be a non-negative integer literal.
	 * lowerBound()->notEmpty() implies lowerBound() >= 0
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateLowerGe0(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		int lowerBound = multiplicityElement.getLower();

		if (lowerBound < 0) {
			result = false;

			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__LOWER_GE0,
						NIEMResourceLoader.INSTANCE.getString(
							"_UI_MultiplicityElement_LowerGE0_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context,
								multiplicityElement)), new Object[]{
							multiplicityElement, new Integer(lowerBound)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound must be greater than or equal to the lower bound.
	 * (upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateUpperGeLower(
			MultiplicityElement multiplicityElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		int upperBound = multiplicityElement.getUpper();

		if (upperBound != LiteralUnlimitedNaturalOperations.UNLIMITED
			&& upperBound < multiplicityElement.getLower()) {

			result = false;

			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(Diagnostic.WARNING,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
						NIEMResourceLoader.INSTANCE.getString(
							"_UI_MultiplicityElement_UpperGELower_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context,
								multiplicityElement)), new Object[]{
							multiplicityElement, new Integer(upperBound)}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating that specification must not have side effects.
	 * true
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationNoSideEffects(
			MultiplicityElement multiplicityElement,
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
						UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateValueSpecificationNoSideEffects", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then that specification must be a constant expression.
	 * true
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationConstant(
			MultiplicityElement multiplicityElement,
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
						UMLValidator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateValueSpecificationConstant", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(multiplicityElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{multiplicityElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived lower attribute must equal the lowerBound.
	 * result = lowerBound()
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int getLower(MultiplicityElement multiplicityElement) {
		return multiplicityElement.getLower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived upper attribute must equal the upperBound.
	 * result = upperBound()
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int getUpper(MultiplicityElement multiplicityElement) {
		return multiplicityElement.getUpper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.
	 * upperBound()->notEmpty()
	 * result = upperBound() > 1
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isMultivalued(MultiplicityElement multiplicityElement) {
		int upperBound = multiplicityElement.getUpper();
		return upperBound == LiteralUnlimitedNaturalOperations.UNLIMITED
			|| upperBound > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesCardinality() checks whether the specified cardinality is valid for this multiplicity.
	 * upperBound()->notEmpty() and lowerBound()->notEmpty()
	 * result = (lowerBound() <= C) and (upperBound() >= C)
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean includesCardinality(
			MultiplicityElement multiplicityElement, int C) {

		if (C == LiteralUnlimitedNaturalOperations.UNLIMITED) {
			return multiplicityElement.getUpper() == LiteralUnlimitedNaturalOperations.UNLIMITED;
		} else {

			if (multiplicityElement.getLower() <= C) {
				int upperBound = multiplicityElement.getUpper();
				return upperBound == LiteralUnlimitedNaturalOperations.UNLIMITED
					? true
					: upperBound >= C;
			} else {
				return false;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.
	 * self.upperBound()->notEmpty() and self.lowerBound()->notEmpty() and M.upperBound()->notEmpty() and M.lowerBound()->notEmpty()
	 * result = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean includesMultiplicity(
			MultiplicityElement multiplicityElement, MultiplicityElement M) {

		if (multiplicityElement.getLower() <= M.getLower()) {
			int upperBound = multiplicityElement.getUpper();

			if (upperBound == LiteralUnlimitedNaturalOperations.UNLIMITED) {
				return true;
			} else {
				int mUpperBound = M.getUpper();
				return mUpperBound == LiteralUnlimitedNaturalOperations.UNLIMITED
					? false
					: upperBound >= mUpperBound;
			}
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer.
	 * result = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int lowerBound(MultiplicityElement multiplicityElement) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();

		if (lowerValue != null) {

			try {
//				return lowerValue.integerValue();
				return ValueSpecificationOperations.integerValue(lowerValue);
			} catch (UnsupportedOperationException uoe) {
				// do nothing
			}
		}

		return 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural.
	 * result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static int upperBound(MultiplicityElement multiplicityElement) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		if (upperValue != null) {

			try {
//				return upperValue.unlimitedValue();
				return ValueSpecificationOperations.unlimitedValue(upperValue);
			} catch (UnsupportedOperationException uoe) {
				// do nothing
			}
		}

		return 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation compatibleWith takes another multiplicity as input. It checks if one multiplicity is compatible with another.
	 * result = Integer.allInstances()->forAll(i : Integer | self.includesCardinality(i) implies other.includesCardinality(i))
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean compatibleWith(
			MultiplicityElement multiplicityElement, MultiplicityElement other) {
//		return other != null && other.includesMultiplicity(multiplicityElement);
		return other != null && MultiplicityElementOperations.includesMultiplicity(other,multiplicityElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation is determines if the upper and lower bound of the ranges are the ones given.
	 * result = (lowerbound = self.lowerbound and upperbound = self.upperbound)
	 * @param multiplicityElement The receiving '<em><b>Multiplicity Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean is(MultiplicityElement multiplicityElement,
			int lowerbound, int upperbound) {
		return multiplicityElement.getLower() == lowerbound
			&& multiplicityElement.getUpper() == upperbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setLower(MultiplicityElement multiplicityElement,
			int newLower) {
		ValueSpecification lowerValue = multiplicityElement.getLowerValue();

		((LiteralInteger) (lowerValue instanceof LiteralInteger
			? lowerValue
//					: multiplicityElement.createLowerValue(null, null,
			: MultiplicityElementOperations.createLowerValue(multiplicityElement,null, null,
					UMLPackage.Literals.LITERAL_INTEGER))).setValue(newLower);
	}
	static public ValueSpecification createLowerValue(MultiplicityElement multiplicityElement,String name, Type type,
			EClass eClass) {
		
		ValueSpecification newLowerValue = (ValueSpecification) create(eClass);
		multiplicityElement.setLowerValue(newLowerValue);
		if (name != null)
			newLowerValue.setName(name);
		if (type != null)
			newLowerValue.setType(type);
		return newLowerValue;
	}
	static public ValueSpecification createUpperValue(MultiplicityElement multiplicityElement,String name, Type type,
			EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) create(eClass);
		multiplicityElement.setUpperValue(newUpperValue);
		if (name != null)
			newUpperValue.setName(name);
		if (type != null)
			newUpperValue.setType(type);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static void setUpper(MultiplicityElement multiplicityElement,
			int newUpper) {
		ValueSpecification upperValue = multiplicityElement.getUpperValue();

		((LiteralUnlimitedNatural) (upperValue instanceof LiteralUnlimitedNatural
			? upperValue
//					: multiplicityElement.createUpperValue(null, null,
			: MultiplicityElementOperations.createUpperValue(multiplicityElement,null, null,
					UMLPackage.Literals.LITERAL_UNLIMITED_NATURAL)))
			.setValue(newUpper);
	}

} // MultiplicityElementOperations
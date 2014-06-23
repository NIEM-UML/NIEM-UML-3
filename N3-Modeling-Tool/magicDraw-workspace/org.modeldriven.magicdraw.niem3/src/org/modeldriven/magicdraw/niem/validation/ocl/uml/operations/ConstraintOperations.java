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
 * $Id: ConstraintOperations.java,v 1.7 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.expressions.OCLExpression;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
/*
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Constraint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateNotApplyToSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Apply To Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateValueSpecificationBoolean(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Boolean</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateBooleanValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Constraint#validateNotAppliedToSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Applied To Self</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint cannot be applied to itself.
	 * not constrainedElement->includes(self)
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNotApplyToSelf(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (constraint.getConstrainedElement().contains(constraint)) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CONSTRAINT__NOT_APPLY_TO_SELF,
					NIEMResourceLoader.INSTANCE.getString(
						"_UI_Constraint_NotApplyToSelf_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, constraint)),
					new Object[]{constraint}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value specification for a constraint must evaluate to a Boolean value.
	 * self.specification().booleanValue().isOclKindOf(Boolean)
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateValueSpecificationBoolean(
			Constraint constraint, DiagnosticChain diagnostics,
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
						UMLValidator.CONSTRAINT__VALUE_SPECIFICATION_BOOLEAN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateValueSpecificationBoolean", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value specification for a constraint must evaluate to a Boolean value.
	 * true
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBooleanValue(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (true) {
			// we want to see that it compiles and that type of result is boolean
			String constraintName=constraint.getName();
			ValueSpecification vs = constraint.getSpecification();
			if (!OpaqueExpression.class.isInstance(vs)) return true;
				OpaqueExpression oe = (OpaqueExpression) vs;
				Vector<String> languages=new Vector<String>(oe.getLanguage());
				Vector<String> bodies=new Vector<String>(oe.getBody());
				for(int i=0;i<languages.size();i++){
					String language=languages.get(i);
					if (!language.startsWith("OCL")||i>=bodies.size()) continue;
						String body=bodies.get(i);
						for(Element element:constraint.getConstrainedElement()){
							if(Classifier.class.isInstance(element)){
								if((element instanceof Class)&&StereotypesHelper.isMetaClass((Class)element)){
									// constrained element could also be a metaclass; TODO handle elsewhere
									System.out.println("UNHANDLED constrained metaclass "+((Class)element).getQualifiedName());
									continue;
								}
								try{
									NIEMValidator niemValidator=NIEMValidator.INSTANCE;
								org.eclipse.ocl.Query<Classifier, Class, EObject> eval=niemValidator.
									getClassQuery(body,(Classifier)element);
								//System.out.println("Constraint "+constraint.getQualifiedName()+", "+eval);
								if(eval!=null){
									OCLExpression expression=eval.getExpression();
									if(expression!=null){
										Object typeTest=expression.getType();
										System.out.println("Constraint validate "+constraint.getQualifiedName()+", "+typeTest);
									}
								}else{
									//log("FAILED to evaluate expression "+body);// message should be already logged
									Diagnostic problems=niemValidator.getProblems();
									if(problems!=null)diagnostics.add(problems);
								}
								}catch(ParserException e){
									diagnostics.add(e.getDiagnostic());
								}
							}else{
								log("UNHANDLED constrained element "+element.eClass().getName());
							}
						}
						
					
					
				}
			/*
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CONSTRAINT__BOOLEAN_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateBooleanValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
			*/
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluating the value specification for a constraint must not have side effects.
	 * true
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoSideEffects(Constraint constraint,
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
						UMLValidator.CONSTRAINT__NO_SIDE_EFFECTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoSideEffects", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint cannot be applied to itself.
	 * not constrainedElement->includes(self)
	 * @param constraint The receiving '<em><b>Constraint</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotAppliedToSelf(Constraint constraint,
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
						UMLValidator.CONSTRAINT__NOT_APPLIED_TO_SELF,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotAppliedToSelf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(constraint, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{constraint}));
			}
			return false;
		}
		return true;
	}

} // ConstraintOperations
/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologie) - 247980
 *
 * $Id: ElementOperations.java,v 1.53 2009/03/13 20:34:37 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;
import org.modeldriven.magicdraw.niem.validation.ocl.UML2Util;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLUtil;

import com.nomagic.magicdraw.foundation.MDExtension;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
//import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.metadata.MdmodelsPackage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
//import com.nomagic.uml2.ext.magicdraw.extensions.MDExtension;
//import com.nomagic.uml2.ext.magicdraw.extensions.impl.MDExtensionImpl;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
/*
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRelationships() <em>Get Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRelationships(org.eclipse.emf.ecore.EClass) <em>Get Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships() <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships() <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class ElementOperations
		extends UMLUtil {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element may not directly or indirectly own itself.
	 * not self.allOwnedElements()->includes(self)
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNotOwnSelf(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		if (EcoreUtil.isAncestor(element, element.getOwner())) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ELEMENT__NOT_OWN_SELF, NIEMResourceLoader.INSTANCE
						.getString("_UI_Element_NotOwnSelf_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, element)),
					new Object[]{element}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements that must be owned must have an owner.
	 * self.mustBeOwned() implies owner->notEmpty()
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateHasOwner(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

//		if (element.mustBeOwned() && element.getOwner() == null) {
		if (mustBeOwned(element) && element.getOwner() == null) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ELEMENT__HAS_OWNER, NIEMResourceLoader.INSTANCE
						.getString("_UI_Element_HasOwner_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, element)),
					new Object[]{element}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype applications for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EList<EObject> getStereotypeApplications(Element element) {
		EList<EObject> stereotypeApplications = new UniqueEList.FastCompare<EObject>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {

			if (setting.getEStructuralFeature().getName().startsWith(
				ExtensionOperations.METACLASS_ROLE_PREFIX)) {

				EObject eObject = setting.getEObject();

				if (getStereotype(eObject) != null) {
					stereotypeApplications.add(eObject);
				}
			}
		}

		return ECollections.unmodifiableEList(stereotypeApplications);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified stereotype for this element, or null if no such stereotype application exists.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to retrieve an application.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */

	public static EObject getStereotypeApplication(Element element,
			Stereotype stereotype) {
		return element.getAppliedStereotypeInstance();
		/*
//		for (EObject stereotypeApplication : element.getStereotypeApplications()) {
		for (EObject stereotypeApplication : getStereotypeApplications(element)) {

			if (getStereotype(stereotypeApplication) == stereotype) {
				return stereotypeApplication;
			}
		}

		return null;
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotypes that are required for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EList<Stereotype> getRequiredStereotypes(Element element) {
		Package package_ = ElementOperations.getNearestPackage(element);

		if (package_ != null) {
			EList<Stereotype> requiredStereotypes = new UniqueEList.FastCompare<Stereotype>();

//			for (ProfileApplication profileApplication : package_.getAllProfileApplications()) {
			for (ProfileApplication profileApplication : PackageOperations.getAllProfileApplications(package_)) {

				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {

					for (Stereotype stereotype : appliedProfile
						.getOwnedStereotype()) {

//						ENamedElement appliedDefinition = profileApplication.getAppliedDefinition(stereotype);
						ENamedElement appliedDefinition = ProfileApplicationOperations.getAppliedDefinition(profileApplication,stereotype);

						if (appliedDefinition instanceof EClass
							&& !((EClass) appliedDefinition).isAbstract()) {

							Extension extension = getExtension(element,
								stereotype);

							if (extension != null && extension.isRequired()) {
								requiredStereotypes.add(stereotype);
							}
						}
					}
				}
			}

			return ECollections.unmodifiableEList(requiredStereotypes);
		}

		return ECollections.emptyEList();
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype with the specified qualified name that is required for this element, or null if no such stereotype is required.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param qualifiedName The qualified name of the required stereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static Stereotype getRequiredStereotype(Element element,
			String qualifiedName) {

//		for (Stereotype requiredStereotype : element.getRequiredStereotypes()) {
		for (Stereotype requiredStereotype : getRequiredStereotypes(element)) {

			if (safeEquals(requiredStereotype.getQualifiedName(), qualifiedName)) {
				return requiredStereotype;
			}
		}

		return null;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotypes that are applied to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */

	public static EList<Stereotype> getAppliedStereotypes(Element element) {
		/*
		EList<Stereotype> appliedStereotypes = new UniqueEList.FastCompare<Stereotype>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {

			if (setting.getEStructuralFeature().getName().startsWith(
				ExtensionOperations.METACLASS_ROLE_PREFIX)) {

				Stereotype stereotype = getStereotype(setting.getEObject());

				if (stereotype != null) {
					appliedStereotypes.add(stereotype);
				}
			}
		}

		return ECollections.unmodifiableEList(appliedStereotypes);
		*/
		return new BasicEList(StereotypesHelper.getStereotypes( element)) ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype with the specified qualified name that is applied to this element, or null if no such stereotype is  applied.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied stereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */

	public static Stereotype getAppliedStereotype(Element element,
			String qualifiedName) {
		return StereotypesHelper.getAppliedStereotypeByString( element,qualifiedName) ;
		/*
		for (Stereotype appliedStereotype : ElementOperations.getAppliedStereotypes(element)) {

			if (safeEquals(appliedStereotype.getQualifiedName(), qualifiedName)) {
				return appliedStereotype;
			}
		}

		return null;
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the substereotypes of the specified stereotype that are applied to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The superstereotype of the applied substereotypes to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EList<Stereotype> getAppliedSubstereotypes(Element element,
			Stereotype stereotype) {
		EList<Stereotype> appliedSubstereotypes = new UniqueEList.FastCompare<Stereotype>();

		for (Stereotype appliedStereotype : ElementOperations.getAppliedStereotypes(element)) {

			if (ClassifierOperations.allParents(appliedStereotype).contains(stereotype)) {
				appliedSubstereotypes.add(appliedStereotype);
			}
		}

		return ECollections.unmodifiableEList(appliedSubstereotypes);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the substereotype of the specified stereotype with the specified qualified name that is applied to this element, or null if no such stereotype is applied.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The superstereotype of the applied substereotype to retrieve.
	 * @param qualifiedName The qualified name of the applied substereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static Stereotype getAppliedSubstereotype(Element element,
			Stereotype stereotype, String qualifiedName) {

//		for (Stereotype appliedSubstereotype : element.getAppliedSubstereotypes(stereotype)) {
		for (Stereotype appliedSubstereotype : getAppliedSubstereotypes(element,stereotype)) {

			if (safeEquals(appliedSubstereotype.getQualifiedName(),
				qualifiedName)) {

				return appliedSubstereotype;
			}
		}

		return null;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this element has a (non-default) value for the property with the specified name in the specified stereotype.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to test the property.
	 * @param propertyName The name of the property in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static boolean hasValue(Element element, Stereotype stereotype,
			String propertyName) {
		EObject eObject = ElementOperations.getStereotypeApplication(element,stereotype);

		if (eObject != null && !isEmpty(propertyName)) {
			EClass eClass = eObject.eClass();
			String[] segments = propertyName.split(NamedElementOperations.SEPARATOR);

			for (int i = 0, length = segments.length; i < length; i++) {
				String segment = segments[i];
				EStructuralFeature eStructuralFeature = null;
				int index = -1;

				if (segment.indexOf('[') == -1) {
					eStructuralFeature = eClass
						.getEStructuralFeature(getValidJavaIdentifier(segment));
				} else {
					eStructuralFeature = eClass
						.getEStructuralFeature(getValidJavaIdentifier(segment
							.substring(0, segment.indexOf('['))));

					try {
						index = Integer.parseInt(segment.substring(segment
							.indexOf('[') + 1, segment.indexOf(']')));
					} catch (Exception e) {
						return false;
					}
				}

				if (eStructuralFeature != null) {

					if (length > i + 1) {

						if (eObject != null) {
							EClassifier eType = eStructuralFeature.getEType();

							if (eType instanceof EClass) {
								eClass = (EClass) eType;

								if (eStructuralFeature.isMany()) {
									@SuppressWarnings("unchecked")
									List<EObject> list = (List<EObject>) eObject
										.eGet(eStructuralFeature);
									eObject = list.get(index);
								} else {
									eObject = (EObject) eObject
										.eGet(eStructuralFeature);
								}
							}
						} else {
							return false;
						}
					} else {

						if (eStructuralFeature.isMany()) {
							@SuppressWarnings("unchecked")
							List<Object> list = eObject == null
								? Collections.emptyList()
								: (List<Object>) eObject
									.eGet(eStructuralFeature);

							return index == -1
								? !list.isEmpty()
								: !safeEquals(eStructuralFeature
									.getDefaultValue(), list.get(index));
						} else {
							return eObject == null
								? false
								: !safeEquals(eStructuralFeature
									.getDefaultValue(), eObject
									.eGet(eStructuralFeature));
						}
					}
				}
			}
		}

		return false;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the value of the property with the specified name in the specified stereotype for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to retrieve the value.
	 * @param propertyName The name of the property whose value to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */

	public static Object getValue(Element element, Stereotype stereotype,
			String propertyName) {
		Property property=StereotypesHelper.getDefinedPropertyByName( stereotype,propertyName,true);
		List values= StereotypesHelper.getStereotypePropertyValue(element, stereotype, property);
		if(property.getUpper()==1){
			if(values.size()==0)return null;
			return values.get(0);
		}
		return values;
		/*
		if (stereotype == null || !ElementOperations.isStereotypeApplied(element,stereotype)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (isEmpty(propertyName)) {
			throw new IllegalArgumentException(String.valueOf(propertyName));
		}

		EObject eObject = ElementOperations.getStereotypeApplication(element,stereotype);

		if (eObject == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EClass eClass = eObject.eClass();
		String[] segments = propertyName.split(NamedElementOperations.SEPARATOR);

		for (int i = 0, length = segments.length; i < length; i++) {
			String segment = segments[i];
			EStructuralFeature eStructuralFeature = null;
			int index = -1;

			if (segment.indexOf('[') == -1) {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(segment));
			} else {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(segment
						.substring(0, segment.indexOf('['))));

				try {
					index = Integer.parseInt(segment.substring(segment
						.indexOf('[') + 1, segment.indexOf(']')));
				} catch (Exception e) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}
			}

			if (eStructuralFeature == null) {
				throw new IllegalArgumentException(String.valueOf(propertyName));
			}

			EClassifier eType = eStructuralFeature.getEType();

			if (i + 1 < length) {

				if (eObject == null || !(eType instanceof EClass)) {

					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eType;

				if (eStructuralFeature.isMany()) {
					@SuppressWarnings("unchecked")
					List<EObject> list = (List<EObject>) eObject
						.eGet(eStructuralFeature);
					eObject = list.get(index);
				} else {
					eObject = (EObject) eObject.eGet(eStructuralFeature);
				}
			} else {
				Object value = null;

				if (eStructuralFeature.isMany()) {
					@SuppressWarnings("unchecked")
					List<Object> list = eObject == null
						? Collections.emptyList()
						: (List<Object>) eObject.eGet(eStructuralFeature);

					value = index == -1
						? list
						: list.get(index);
				} else {
					value = eObject == null
						? eStructuralFeature.getDefaultValue()
						: eObject.eGet(eStructuralFeature);
				}

				if (eType instanceof EEnum && value instanceof EEnumLiteral) {
					EAnnotation eAnnotation = eType
						.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

					if (eAnnotation != null) {
						EList<EObject> references = eAnnotation.getReferences();

						if (references.size() > 0) {
							Object reference = references.get(0);

							if (reference instanceof Enumeration) {
								value = EnumerationOperations.getOwnedLiteral(((Enumeration) reference),((EEnumLiteral) value)
										.getName());
							}
						}
					}
				}

				return value;
			}
		}

		return null;
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the value of the property with the specified name in the specified stereotype for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to set the value.
	 * @param propertyName The name of the property whose value to set.
	 * @param newValue The new value for the property.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static void setValue(Element element, Stereotype stereotype,
			String propertyName, Object newValue) {

		if (stereotype == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		if (isEmpty(propertyName)) {
			throw new IllegalArgumentException(String.valueOf(propertyName));
		}

		EObject eObject = ElementOperations.getStereotypeApplication(element,stereotype);

		if (eObject == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EClass eClass = eObject.eClass();
		String[] segments = propertyName.split(NamedElementOperations.SEPARATOR);

		for (int i = 0, length = segments.length; i < length; i++) {
			String segment = segments[i];
			EStructuralFeature eStructuralFeature = null;
			int index = -1;

			if (segment.indexOf('[') == -1) {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(segment));
			} else {
				eStructuralFeature = eClass
					.getEStructuralFeature(getValidJavaIdentifier(segment
						.substring(0, segment.indexOf('['))));

				try {
					index = Integer.parseInt(segment.substring(segment
						.indexOf('[') + 1, segment.indexOf(']')));
				} catch (Exception e) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}
			}

			if (eStructuralFeature == null) {
				throw new IllegalArgumentException(String.valueOf(propertyName));
			}

			EClassifier eType = eStructuralFeature.getEType();

			if (i + 1 < length) {

				if (!(eType instanceof EClass)) {
					throw new IllegalArgumentException(String
						.valueOf(propertyName));
				}

				eClass = (EClass) eType;

				if (eStructuralFeature.isMany()) {
					@SuppressWarnings("unchecked")
					List<Object> list = (List<Object>) eObject
						.eGet(eStructuralFeature);
					int size = list.size();

					if (size <= index) {

						if (!((EReference) eStructuralFeature).isContainment()) {
							throw new IllegalArgumentException(String
								.valueOf(propertyName));
						}

						for (int j = size; j <= index; j++) {
							list.add(j, EcoreUtil.create(eClass));
						}
					}

					eObject = (EObject) list.get(index);
				} else {
					Object value = eObject.eGet(eStructuralFeature);

					if (value == null) {

						if (!((EReference) eStructuralFeature).isContainment()) {
							throw new IllegalArgumentException(String
								.valueOf(propertyName));
						}

						eObject.eSet(eStructuralFeature, value = EcoreUtil
							.create(eClass));
					}

					eObject = (EObject) value;
				}
			} else {

				if (newValue != null) {

					if (eType instanceof EClass) {
						EClass eClassType = (EClass) eType;

						if (newValue instanceof List<?>) {
							@SuppressWarnings("unchecked")
							Iterator<Object> j = ((List<Object>) newValue)
								.iterator();

							while (j.hasNext()) {

								if (!eClassType.isInstance(j.next())) {
									throw new IllegalArgumentException(String
										.valueOf(newValue));
								}
							}
						} else if (!eClassType.isInstance(newValue)) {
							throw new IllegalArgumentException(String
								.valueOf(newValue));
						}
					} else if (eType instanceof EDataType) {
						EDataType eDataType = (EDataType) eType;
						EFactory eFactoryInstance = eDataType.getEPackage()
							.getEFactoryInstance();

						if (newValue instanceof List<?>) {
							@SuppressWarnings("unchecked")
							List<Object> newList = new ArrayList<Object>(
								(List<Object>) newValue);

							if (eDataType instanceof EEnum) {
								EEnum eEnum = (EEnum) eDataType;

								for (ListIterator<Object> li = newList
									.listIterator(); li.hasNext();) {

									Object item = li.next();

									if (item instanceof EnumerationLiteral) {
										li.set(eEnum.getEEnumLiteral(
											((EnumerationLiteral) item)
												.getName()).getInstance());
									}
								}
							}

							for (ListIterator<Object> li = newList
								.listIterator(); li.hasNext();) {

								Object item = li.next();

								if (item instanceof String) {

									try {
										li.set(eFactoryInstance
											.createFromString(eDataType,
												(String) item));
									} catch (Exception e) {
										// ignore
									}
								}
							}

							newValue = newList;
						} else {

							if (eDataType instanceof EEnum) {
								EEnum eEnum = (EEnum) eDataType;

								if (newValue instanceof EnumerationLiteral) {
									newValue = eEnum.getEEnumLiteral(
										((EnumerationLiteral) newValue)
											.getName()).getInstance();
								}
							}

							if (newValue instanceof String) {

								try {
									newValue = eFactoryInstance
										.createFromString(eDataType,
											(String) newValue);
								} catch (Exception e) {
									// ignore
								}
							}
						}
					}
				}

				if (newValue == null) {
					newValue = eStructuralFeature.getDefaultValue();
				}

				if (eStructuralFeature.isMany()) {

					if (index == -1) {

						if (newValue instanceof List<?>) {
							eObject.eSet(eStructuralFeature, newValue);
						} else {
							throw new IllegalArgumentException(String
								.valueOf(newValue));
						}
					} else {
						@SuppressWarnings("unchecked")
						List<Object> list = (List<Object>) eObject
							.eGet(eStructuralFeature);

						for (int j = list.size(); j < index; j++) {
							list.add(j, eStructuralFeature.getDefaultValue());
						}

						if (index == list.size()) {
							list.add(index, newValue);
						} else {
							list.set(index, newValue);
						}
					}

				} else {
					eObject.eSet(eStructuralFeature, newValue);
				}
			}
		}
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an annotation with the specified source and this element as its model element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param source The source for the new annotation.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static MDExtension createEAnnotation(Element element, String source) {
		return UML2Util.createEAnnotation( element, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the relationships in which this element is involved.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Relationship> getRelationships(Element element) {
		return getRelationships(element, UMLPackage.Literals.RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the relationships of the specified type in which this element is involved.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param eClass The (meta)type of the relationships to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Relationship> getRelationships(Element element,
			EClass eClass) {
		EList<Relationship> relationships = new UniqueEList.FastCompare<Relationship>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {

			EObject eObject = setting.getEObject();

			if (eClass.isInstance(eObject)) {
				relationships.add((Relationship) eObject);
			} else if (eObject instanceof Property) {
				Association association = ((Property) eObject).getAssociation();

				if (eClass.isInstance(association)) {
					relationships.add(association);
				}
			}
		}

		for (EReference eReference : element.eClass().getEAllReferences()) {

			if (!eReference.isDerived() && element.eIsSet(eReference)) {
				EClass eReferenceType = eReference.getEReferenceType();

				if (eClass.isSuperTypeOf(eReferenceType)) {

					if (eReference.isMany()) {
						@SuppressWarnings("unchecked")
						List<Relationship> values = (List<Relationship>) element
							.eGet(eReference);
						relationships.addAll(values);
					} else {
						relationships.add((Relationship) element
							.eGet(eReference));
					}
				} else if (eReferenceType.isSuperTypeOf(eClass)) {
					Object value = element.eGet(eReference);

					if (eReference.isMany()) {
						@SuppressWarnings("unchecked")
						Iterator<Object> i = ((List<Object>) value).iterator();

						while (i.hasNext()) {
							value = i.next();

							if (eClass.isInstance(value)) {
								relationships.add((Relationship) value);
							}
						}
					} else if (eClass.isInstance(value)) {
						relationships.add((Relationship) value);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(relationships);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships for which this element is a source.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<DirectedRelationship> getSourceDirectedRelationships(
			Element element) {
		return getSourceDirectedRelationships(element,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships of the specified type for which this element is a source.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param eClass The (meta)type of the directed relationships to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<DirectedRelationship> getSourceDirectedRelationships(
			Element element, EClass eClass) {
		return new BasicEList<DirectedRelationship>(element.get_directedRelationshipOfSource());
		/*
		EList<DirectedRelationship> sourceDirectedRelationships = new UniqueEList.FastCompare<DirectedRelationship>();

		for (Iterator<Relationship> directedRelationships = getRelationships(
			element, eClass).iterator(); directedRelationships.hasNext();) {

			DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationships
				.next();

			if (directedRelationship.getSource().contains(element)) {
				sourceDirectedRelationships.add(directedRelationship);
			}
		}

		return ECollections.unmodifiableEList(sourceDirectedRelationships);
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships for which this element is a target.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<DirectedRelationship> getTargetDirectedRelationships(
			Element element) {
		return getTargetDirectedRelationships(element,
				UMLPackage.Literals.DIRECTED_RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships of the specified type for which this element is a target.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param eClass The (meta)type of the directed relationships to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<DirectedRelationship> getTargetDirectedRelationships(
			Element element, EClass eClass) {
		EList<DirectedRelationship> targetDirectedRelationships = new UniqueEList.FastCompare<DirectedRelationship>();

		for (Iterator<Relationship> directedRelationships = getRelationships(
			element, eClass).iterator(); directedRelationships.hasNext();) {

			DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationships
				.next();

			if (directedRelationship.getTarget().contains(element)) {
				targetDirectedRelationships.add(directedRelationship);
			}
		}

		return ECollections.unmodifiableEList(targetDirectedRelationships);
	}
	public static MDExtension getMDExtension(Element element,String source){
		MDExtension eAnnotation=null;
		for(MDExtension eAnnotationTest:element.getMdExtensions()){
			if(source.equals(getSource(eAnnotationTest))){
				eAnnotation=eAnnotationTest;
				break;
			}
		}
		return eAnnotation;
	}
	public static String getSource(MDExtension extension){
		String result=extension.getSource();
		if(result!=null){
			int index=result.indexOf(";");
			if(index>=0)result=result.substring(0, index);
		}
		return result;
	}
	public static Map<String,String> getDetails(MDExtension extension){
		Map<String,String> result=new HashMap<String,String>();
		String source=extension.getSource();
		if(source!=null){
			for(String keyword:source.split(";")){
				result.put(keyword, "");
			}
		}
		return result;
	}
	public static void removeDetailKey(MDExtension extension,String key){
		String source=extension.getSource();
		source=source.replace(key,"").replace(";;",";");
		extension.setSource(source);
	}
	public static void addDetailKey(MDExtension extension,String key){
		removeDetailKey(extension,key);
		String source=extension.getSource();
		source=(source+";"+key).replace(";;",";");
		extension.setSource(source);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the keywords for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
//	public static EList<String> getKeywords(Element element) {
	public static List<String> getKeywords(Element element) {
//		EAnnotation eAnnotation = element.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);
//		MDExtension eAnnotation = element.getMDExtension(UML2_UML_PACKAGE_2_0_NS_URI);
		MDExtension eAnnotation = getMDExtension(element,UML2_UML_PACKAGE_2_0_NS_URI);

		if (eAnnotation != null) {
//			Map<String, String> details = eAnnotation.getDetails();
			Map<String, String> details = getDetails(eAnnotation);
			return new Vector<String>(details.keySet());

			/*
			if (!details.isEmpty()) {
				EList<String> keywords = new UniqueEList<String>();
				for (Iterator<Map.Entry<String, String>> d = details.iterator(); d
					.hasNext();) {

					keywords.add(d.next().getKey());
				}
				return ECollections.unmodifiableEList(keywords);
			}
*/
		}

		return ECollections.emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the specified keyword to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param keyword The keyword to add.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean addKeyword(Element element, String keyword) {
//		EMap<String, String> details = getEAnnotation(element,UML2_UML_PACKAGE_2_0_NS_URI, true).getDetails();
		MDExtension extension=getEAnnotation(element,UML2_UML_PACKAGE_2_0_NS_URI, true);
		if(extension==null){
			extension=createEAnnotation( element,UML2_UML_PACKAGE_2_0_NS_URI);
		}
		try{
			Map<String, String> details = getDetails(extension);
//			Map<String, String> details = extension.getDetails();
//			EMap<String, String> details = (EMap<String, String>)extension.getDetails();
	
			if (!details.containsKey(keyword)) {
				//details.put(keyword, null);
				addDetailKey(extension,keyword);
				return true;
			}
		}catch(Throwable t){
			log("ElementOperations.addKeyword failed "+keyword+" , "+element+" : "+t);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes the specified keyword from this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param keyword The keyword to remove.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean removeKeyword(Element element, String keyword) {
//		MDExtension eAnnotation = element.getMDExtension(UML2_UML_PACKAGE_2_0_NS_URI);
		MDExtension eAnnotation = getMDExtension(element,UML2_UML_PACKAGE_2_0_NS_URI);

		if (eAnnotation != null) {
//			Map<String, String> details = eAnnotation.getDetails();
			Map<String, String> details = getDetails(eAnnotation);

			if (details.containsKey(keyword)) {
//				details.remove(keyword);
				removeDetailKey(eAnnotation,keyword);
				return true;
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the nearest package that owns (either directly or indirectly) this element, or the element itself (if it is a package).
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Package getNearestPackage(Element element) {
		return (Package) (element instanceof Package
			? element
			: getOwningElement(element, UMLPackage.Literals.PACKAGE, true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the model that owns (either directly or indirectly) this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Model getModel(Element element) {
		return (Model) (element instanceof Model
			? element
			: getOwningElement(element, UMLPackage.Literals.MODEL, true));
	}
/*
	protected static Extension getExtension(Element element,
			Stereotype stereotype) {

//		for (Property attribute : stereotype.getAllAttributes()) {
		for (Property attribute : StereotypeOperations.getAllAttributes(stereotype)) {
			Association association = attribute.getAssociation();

			if (association instanceof Extension) {
				String name = attribute.getName();

				if (!isEmpty(name)
					&& name.startsWith(ExtensionOperations.METACLASS_ROLE_PREFIX)) {

					Type type = attribute.getType();

					if (type instanceof Class) {
						EClassifier eClassifier = getEClassifier((Class) type);

						if (eClassifier != null
							&& eClassifier.isInstance(element)) {

							return (Extension) association;
						}
					}
				}
			}
		}

		return null;
	}
	*/
/*
	protected static EClass getDefinition(Element element, Stereotype stereotype) {

		if (stereotype != null) {
			Profile profile = stereotype.getProfile();

			if (profile != null) {
//				Package package_ = ElementOperations.getNearestPackage(element);
				Package package_ = getNearestPackage(element);

				if (package_ != null) {
//					ProfileApplication profileApplication = package_.getProfileApplication(profile, true);
					ProfileApplication profileApplication = PackageOperations.getProfileApplication(package_,profile, true);

					if (profileApplication != null) {
						ENamedElement appliedDefinition = ProfileApplicationOperations.getAppliedDefinition(profileApplication,stereotype);

						if (appliedDefinition instanceof EClass) {
							EClass eClass = (EClass) appliedDefinition;

							if (!eClass.isAbstract()) {
								return eClass;
							}
						}
					}
				}
			}
		}

		return null;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified stereotype is applicable to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isStereotypeApplicable(Element element,
			Stereotype stereotype) {
		/*
		return getDefinition(element, stereotype) != null
			&& getExtension(element, stereotype) != null;
			*/
		return StereotypesHelper.canApplyStereotype(element,stereotype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified stereotype is required for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isStereotypeRequired(Element element,
			Stereotype stereotype) {
/*
		if (getDefinition(element, stereotype) != null) {
			Extension extension = getExtension(element, stereotype);

			return extension != null && extension.isRequired();
		}

		return false;
		*/
		return StereotypesHelper.isRequiredStereotypeForElement(stereotype,element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified stereotype is applied to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */

	public static boolean isStereotypeApplied(Element element,
			Stereotype stereotype) {
		return ElementOperations.getStereotypeApplication(element,stereotype) != null;
	}

	/*
	protected static EList<EObject> applyAllStereotypes(Element element,
			Map<EClassifier, Map<Stereotype, EClass>> definitions,
			EList<EObject> stereotypeApplications) {

		if (!element.eIsProxy()) {

			for (Map.Entry<EClassifier, Map<Stereotype, EClass>> stereotypeEntry : definitions
				.entrySet()) {

				if (stereotypeEntry.getKey().isInstance(element)) {

					for (Map.Entry<Stereotype, EClass> definitionEntry : stereotypeEntry
						.getValue().entrySet()) {

						if (!ElementOperations.isStereotypeApplied(element,definitionEntry
							.getKey())) {

							stereotypeApplications.add(applyStereotype(element,
								definitionEntry.getValue()));
						}
					}
				}
			}
		}

		return stereotypeApplications;
	}
*/
	/*
	protected static EList<EObject> applyAllStereotypes(Element element,
			Map<EClassifier, Map<Stereotype, EClass>> definitions,
			boolean resolve) {
		EList<EObject> stereotypeApplications = new UniqueEList.FastCompare<EObject>();

		applyAllStereotypes(element, definitions, stereotypeApplications);

		if (!element.eContents().isEmpty()) {

			for (TreeIterator<EObject> allContents = EcoreUtil.getAllContents(
				element, resolve); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
					applyAllStereotypes((Element) eObject, definitions,
						stereotypeApplications);
				}
			}
		}

		return stereotypeApplications;
	}
	*/
/*
	public static EList<EObject> applyAllRequiredStereotypes(Element element) {
		return applyAllRequiredStereotypes(element, true);
	}

	public static EList<EObject> applyAllRequiredStereotypes(Element element,
			boolean resolve) {
		Package package_ = ElementOperations.getNearestPackage(element);

		if (package_ != null) {
			Map<EClassifier, Map<Stereotype, EClass>> definitions = new HashMap<EClassifier, Map<Stereotype, EClass>>();

//			for (ProfileApplication profileApplication : package_.getAllProfileApplications()) {
			for (ProfileApplication profileApplication : PackageOperations.getAllProfileApplications(package_)) {

				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {

//					for (Extension ownedExtension : appliedProfile.getOwnedExtensions(true)) {
					for (Extension ownedExtension : ProfileOperations.getOwnedExtensions(appliedProfile,true)) {

						Class metaclass = ownedExtension.getMetaclass();

						if (metaclass != null) {
							EClassifier eClassifier = getEClassifier(metaclass);

							if (eClassifier != null) {
//								Stereotype stereotype = ownedExtension.getStereotype();
								Stereotype stereotype = ExtensionOperations.getStereotype(ownedExtension);

								if (stereotype != null) {
//									ENamedElement appliedDefinition = profileApplication.getAppliedDefinition(stereotype);
									ENamedElement appliedDefinition = ProfileApplicationOperations.getAppliedDefinition(profileApplication,stereotype);

									if (appliedDefinition instanceof EClass
										&& !((EClass) appliedDefinition)
											.isAbstract()) {

										Map<Stereotype, EClass> stereotypes = definitions
											.get(eClassifier);

										if (stereotypes == null) {
											definitions
												.put(
													eClassifier,
													stereotypes = new HashMap<Stereotype, EClass>());
										}

										if (!stereotypes
											.containsKey(stereotype)) {

											stereotypes.put(stereotype,
												(EClass) appliedDefinition);
										}
									}
								}
							}
						}
					}
				}
			}

			if (!definitions.isEmpty()) {
				return applyAllStereotypes(element, definitions, resolve);
			}
		}

		return ECollections.emptyEList();
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the specified stereotype to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype to apply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void/*EObject*/ applyStereotype(Element element, Stereotype stereotype) {
		StereotypesHelper.addStereotype( element,  stereotype) ;
		/*
		EClass definition = getDefinition(element, stereotype);

		if (definition == null || getExtension(element, stereotype) == null
			|| ElementOperations.getStereotypeApplication(element,stereotype) != null) {

			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		return applyStereotype(element, definition);
		*/
	}
/*
	protected static EList<EObject> unapplyAllNonApplicableStereotypes(
			Element element, EList<EObject> nonApplicableStereotypes) {

		if (!element.eIsProxy()) {

			for (EObject stereotypeApplication : getStereotypeApplications(element)) {
//			for (EObject stereotypeApplication : element.getStereotypeApplications()) {

				if (!isStereotypeApplicable(element,getStereotype(stereotypeApplication))) {
//				if (!element.isStereotypeApplicable(getStereotype(stereotypeApplication))) {

					nonApplicableStereotypes.add(stereotypeApplication);

					destroy(stereotypeApplication);
				}
			}
		}

		return nonApplicableStereotypes;
	}

	public static EList<EObject> unapplyAllNonApplicableStereotypes(
			Element element) {
		return unapplyAllNonApplicableStereotypes(element, true);
	}

	public static EList<EObject> unapplyAllNonApplicableStereotypes(
			Element element, boolean resolve) {
		EList<EObject> nonApplicableStereotypes = new UniqueEList.FastCompare<EObject>();

		unapplyAllNonApplicableStereotypes(element, nonApplicableStereotypes);

		if (!element.eContents().isEmpty()) {

			for (TreeIterator<EObject> allContents = EcoreUtil.getAllContents(
				element, resolve); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
					unapplyAllNonApplicableStereotypes((Element) eObject,
						nonApplicableStereotypes);
				}
			}
		}

		return nonApplicableStereotypes;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified stereotype from this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype to unapply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EObject unapplyStereotype(Element element,
			Stereotype stereotype) {

		if (stereotype == null || isStereotypeRequired(element,stereotype)) {
//		if (stereotype == null || element.isStereotypeRequired(stereotype)) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		EObject stereotypeApplication = ElementOperations.getStereotypeApplication(element,stereotype);

		if (stereotypeApplication == null) {
			throw new IllegalArgumentException(String.valueOf(stereotype));
		}

		destroy(stereotypeApplication);

		return stereotypeApplication;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotypes that are applicable to this element, including those that are required and/or may already be applied.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EList<Stereotype> getApplicableStereotypes(Element element) {
		Package package_ = ElementOperations.getNearestPackage(element);

		if (package_ != null) {
			EList<Stereotype> applicableStereotypes = new UniqueEList.FastCompare<Stereotype>();

//			for (ProfileApplication profileApplication : package_.getAllProfileApplications()) {
			for (ProfileApplication profileApplication : PackageOperations.getAllProfileApplications(package_)) {

				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {

					for (Stereotype stereotype : appliedProfile
						.getOwnedStereotype()) {

//						ENamedElement appliedDefinition = profileApplication.getAppliedDefinition(stereotype);
						ENamedElement appliedDefinition = ProfileApplicationOperations.getAppliedDefinition(profileApplication,stereotype);

						if (appliedDefinition instanceof EClass
							&& !((EClass) appliedDefinition).isAbstract()
							&& getExtension(element, stereotype) != null) {

							applicableStereotypes.add(stereotype);
						}
					}
				}
			}

			return ECollections.unmodifiableEList(applicableStereotypes);
		}

		return ECollections.emptyEList();
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype with the specified qualified name that is applicable to this element, or null if no such stereotype is applicable.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param qualifiedName The qualified name of the applicable stereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static Stereotype getApplicableStereotype(Element element,
			String qualifiedName) {

		for (Stereotype applicableStereotype : getApplicableStereotypes(element)) {
//		for (Stereotype applicableStereotype : element.getApplicableStereotypes()) {

			if (safeEquals(applicableStereotype.getQualifiedName(),
				qualifiedName)) {

				return applicableStereotype;
			}
		}

		return null;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this element has the specified keyword.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param keyword The keyword in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean hasKeyword(Element element, String keyword) {
//		MDExtension eAnnotation = element.getMDExtension(UML2_UML_PACKAGE_2_0_NS_URI);
		MDExtension eAnnotation = getMDExtension(element,UML2_UML_PACKAGE_2_0_NS_URI);

		return eAnnotation != null
			&& getDetails(eAnnotation).containsKey(keyword);
//		&& eAnnotation.getDetails().containsKey(keyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destroys this element by removing all cross references to/from it and removing it from its containing resource or object.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static void destroy(Element element) {
		destroy((EObject) element);
	}

	protected static void destroy(EObject ancestorEObject) {

		if (ancestorEObject.eContents().isEmpty()) {

			if (ancestorEObject instanceof Element) {
//				destroyAll(((Element) ancestorEObject).getStereotypeApplications());
				destroyAll(getStereotypeApplications(((Element) ancestorEObject)));
				removeReferences(ancestorEObject, ancestorEObject);
				ancestorEObject.eAdapters().clear();
			} else {
				removeReferences(ancestorEObject, null);
			}
		} else {

			for (TreeIterator<EObject> allContents = getAllContents(
				ancestorEObject, true, false); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
//					destroyAll(((Element) eObject).getStereotypeApplications());
					destroyAll(getStereotypeApplications(((Element) eObject)));
				}
			}

			for (TreeIterator<EObject> allContents = getAllContents(
				ancestorEObject, true, false); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
					removeReferences(eObject, ancestorEObject);
				} else {
					removeReferences(eObject, null);
				}
			}

			for (TreeIterator<EObject> allContents = getAllContents(
				ancestorEObject, true, false); allContents.hasNext();) {

				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
					eObject.eAdapters().clear();
				}
			}
		}

		EcoreUtil.remove(ancestorEObject);
	}

	protected static void destroyAll(Collection<EObject> eObjects) {

		for (Iterator<EObject> o = eObjects.iterator(); o.hasNext();) {
			destroy(o.next());
		}
	}
*/
	protected static EList<Element> allOwnedElements(Element element,
			EList<Element> allOwnedElements) {

		for (Element ownedElement : element.getOwnedElement()) {

			if (allOwnedElements.add(ownedElement)) {
				allOwnedElements(ownedElement, allOwnedElements);
			}
		}

		return allOwnedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect owned elements of an element.
	 * result = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Element> allOwnedElements(Element element) {
		return ECollections.unmodifiableEList(allOwnedElements(element,
			new UniqueEList.FastCompare<Element>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * result = true
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(Element element) {
		return true;
	}
	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected static EObject create(EClass eClass) {
		return EcoreUtil.create(eClass);
	}

} // ElementOperations
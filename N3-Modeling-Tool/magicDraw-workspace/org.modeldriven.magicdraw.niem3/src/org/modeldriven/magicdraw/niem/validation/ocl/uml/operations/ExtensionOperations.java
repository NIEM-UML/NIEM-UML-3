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
 * $Id: ExtensionOperations.java,v 1.12 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ExtensionEnd;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.mdprofiles.metadata.MdprofilesPackage;
/*
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extension</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Extension#validateNonOwnedEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#validateIsBinary(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is Binary</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getStereotypeEnd() <em>Get Stereotype End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getStereotype() <em>Get Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#metaclassEnd() <em>Metaclass End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getMetaclass() <em>Get Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#isRequired() <em>Is Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionOperations
		extends AssociationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionOperations() {
		super();
	}
	/**
	 * The prefix for metaclass role names.
	 */
	static public String METACLASS_ROLE_PREFIX = "base_"; //$NON-NLS-1$

	/**
	 * The prefix for stereotype role names.
	 */
	static public String STEREOTYPE_ROLE_PREFIX = "extension_"; //$NON-NLS-1$
	static public Property createOwnedEnd(Extension extension,String name, Type type) {
		ExtensionEnd newOwnedEnd = (ExtensionEnd) create(UMLPackage.Literals.EXTENSION_END);
		extension.getOwnedEnd().add(newOwnedEnd);
		if (name != null)
			newOwnedEnd.setName(name);
		if (type != null)
			newOwnedEnd.setType(type);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The non-owned end of an Extension is typed by a Class.
	 * metaclassEnd()->notEmpty() and metaclass()->oclIsKindOf(Class)
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonOwnedEnd(Extension extension,
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
						UMLValidator.EXTENSION__NON_OWNED_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNonOwnedEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extension, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extension}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Extension is binary, i.e., it has only two memberEnds.
	 * memberEnd->size() = 2
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIsBinary(Extension extension,
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
						UMLValidator.EXTENSION__IS_BINARY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIsBinary", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extension, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extension}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the extension end that is typed by a stereotype (as opposed to a metaclass).
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property getStereotypeEnd(Extension extension) {
		List<Property> ownedEnds = extension.getOwnedEnd();
		return ownedEnds.size() > 0
			? ownedEnds.get(0)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype that extends a metaclass through this extension.
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Stereotype getStereotype(Extension extension) {
//		Property stereotypeEnd = extension.getStereotypeEnd();
		Property stereotypeEnd = getStereotypeEnd(extension);

		if (stereotypeEnd != null) {
			Type type = stereotypeEnd.getType();

			if (type instanceof Stereotype) {
				return (Stereotype) type;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclassEnd() returns the Property that is typed by a metaclass (as opposed to a stereotype).
	 * result = memberEnd->reject(ownedEnd)
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property metaclassEnd(Extension extension) {
		List<Property> ownedEnds = extension.getOwnedEnd();

		for (Property memberEnd : extension.getMemberEnd()) {

			if (!ownedEnds.contains(memberEnd)) {
				return memberEnd;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclass() returns the metaclass that is being extended (as opposed to the extending stereotype).
	 * result = metaclassEnd().type
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Class getMetaclass(Extension extension) {
//		Property metaclassEnd = extension.metaclassEnd();
		Property metaclassEnd = metaclassEnd(extension);

		if (metaclassEnd != null) {
			Object type = metaclassEnd.eGet(
					UMLPackage.Literals.TYPED_ELEMENT__TYPE, false);

			if (type instanceof org.eclipse.uml2.uml.Class) {
				return (org.eclipse.uml2.uml.Class) type;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRequired() is true if the owned end has a multiplicity with the lower bound of 1.
	 * result = (ownedEnd->lowerBound() = 1)
	 * @param extension The receiving '<em><b>Extension</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRequired(Extension extension) {
		List<Property> ownedEnds = extension.getOwnedEnd();
		return ownedEnds.size() > 0 && ownedEnds.get(0).getLower()/*lowerBound()*/ == 1;
	}

} // ExtensionOperations
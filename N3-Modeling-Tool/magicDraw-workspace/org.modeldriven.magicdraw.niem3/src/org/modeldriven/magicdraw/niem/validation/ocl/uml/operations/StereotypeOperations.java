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
 * $Id: StereotypeOperations.java,v 1.16 2007/06/01 16:00:39 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ExtensionEnd;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Image;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.mdprofiles.metadata.MdprofilesPackage;
/*
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Stereotype</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateNameNotClash(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Name Not Clash</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#validateGeneralize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalize</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createExtension(org.eclipse.uml2.uml.Class, boolean) <em>Create Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getProfile() <em>Get Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword() <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getKeyword(boolean) <em>Get Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses() <em>Get Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses() <em>Get All Extended Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getDefinition() <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String) <em>Create Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#createIcon(java.lang.String, java.lang.String) <em>Create Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StereotypeOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype names should not clash with keyword names for the extended model element.
	 * true
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNameNotClash(Stereotype stereotype,
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
						UMLValidator.STEREOTYPE__NAME_NOT_CLASH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNameNotClash", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stereotype, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Stereotype may only generalize or specialize another Stereotype.
	 * generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) 
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralize(Stereotype stereotype,
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
						UMLValidator.STEREOTYPE__GENERALIZE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGeneralize", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stereotype, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stereotype}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (required) extension of the specified metaclass with this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param metaclass The metaclass for the new extension.
	 * @param isRequired Whether the new extension should be required.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Extension createExtension(Stereotype stereotype,
			Class metaclass, boolean isRequired) {
		String name = stereotype.getName();

		if (isEmpty(name)) {
			throw new IllegalStateException();
		}

		Profile profile = stereotype.getProfile();

		if (profile == null) {
			throw new IllegalStateException();
		}

//		if (metaclass == null || !metaclass.isMetaclass()
		if (metaclass == null || !ClassOperations.isMetaclass(metaclass)
//				|| stereotype.getExtendedMetaclasses().contains(metaclass)) {
			|| StereotypeOperations.getExtendedMetaclasses(stereotype).contains(metaclass)) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

//		if (!profile.getReferencedMetaclasses().contains(metaclass)
		if (!ProfileOperations.getReferencedMetaclasses(profile).contains(metaclass)
//				&& !profile.getReferencedMetamodels()
			&& !ProfileOperations.getReferencedMetamodels(profile)
//				.contains(metaclass.getModel())) {
				.contains(ClassOperations.getModel(metaclass))) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		String metaclassName = metaclass.getName();
//		Extension extension = (Extension) profile.createOwnedType(metaclassName
		Extension extension = (Extension) ProfileOperations.createOwnedType(profile,metaclassName
			+ '_' + name, UMLPackage.Literals.EXTENSION);

//		ExtensionEnd extensionEnd = (ExtensionEnd) extension.createOwnedEnd(
		ExtensionEnd extensionEnd = (ExtensionEnd) ExtensionOperations.createOwnedEnd(extension,
			ExtensionOperations.STEREOTYPE_ROLE_PREFIX + name, stereotype,
			UMLPackage.Literals.EXTENSION_END);
		extensionEnd.setAggregation(AggregationKindEnum.COMPOSITE);

		if (isRequired) {
//			extensionEnd.setLower(1);
			ExtensionEndOperations.setLower(extensionEnd,1);
		}

//		Property property = stereotype.createOwnedAttribute(
		Property property = StereotypeOperations.createOwnedAttribute(stereotype,
			ExtensionOperations.METACLASS_ROLE_PREFIX + metaclassName, metaclass);
		property.setAssociation(extension);

		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile that owns this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getProfile(Stereotype stereotype) {
		Package package_ = stereotype.getPackage();
		return package_ instanceof Profile
			? (Profile) package_
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the localized keyword for this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getKeyword(Stereotype stereotype) {
//		return stereotype.getKeyword(true);
		return getKeyword(stereotype,true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the keyword for this stereotype, localized if indicated.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param localize Whether to localize the keyword.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getKeyword(Stereotype stereotype, boolean localize) {
		String qualifiedName = stereotype.getQualifiedName();
		String keyword = getString(stereotype,
			getValidJavaIdentifier(isEmpty(qualifiedName)
				? EMPTY_STRING
				: qualifiedName.replace(':', '_')), EMPTY_STRING, localize);

		if (isEmpty(keyword)) {
			String identifier = getValidJavaIdentifier(stereotype.getName());

			keyword = identifier.length() > 0
				? Character.toLowerCase(identifier.charAt(0))
					+ identifier.substring(1)
				: identifier;
		}

		return keyword;
	}

	protected static EList<Class> getExtendedMetaclasses(
			Stereotype stereotype,
			EList<Class> extendedMetaclasses) {

		for (Property ownedAttribute : stereotype.getOwnedAttribute()) {

			if (ownedAttribute.getAssociation() instanceof Extension) {
				Type type = ownedAttribute.getType();

				if (type instanceof org.eclipse.uml2.uml.Class) {
					extendedMetaclasses.add((Class) type);
				}
			}
		}

		return extendedMetaclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metaclasses extended by this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Class> getExtendedMetaclasses(
			Stereotype stereotype) {
		return ECollections.unmodifiableEList(getExtendedMetaclasses(
			stereotype,
			new UniqueEList.FastCompare<Class>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the metaclasses extended by this stereotype, including the metaclasses extended by its superstereotypes.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Class> getAllExtendedMetaclasses(
			Stereotype stereotype) {
		EList<Class> allExtendedMetaclasses = getExtendedMetaclasses(
			stereotype,
			new UniqueEList.FastCompare<Class>());

		for (Classifier parent : ClassifierOperations.allParents(stereotype)) {

			if (parent instanceof Stereotype) {
				getExtendedMetaclasses((Stereotype) parent,
					allExtendedMetaclasses);
			}
		}

		return ECollections.unmodifiableEList(allExtendedMetaclasses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EClass getDefinition(Stereotype stereotype) {
		Profile profile = stereotype.getProfile();
		return profile == null
			? null
//					: (EClass) profile.getDefinition(stereotype);
			: (EClass) ProfileOperations.getDefinition(profile,(NamedElement)stereotype);
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified location for this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param location The location for the new icon.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Image createIcon(Stereotype stereotype, String location) {
//		Image icon = stereotype.createIcon();
		Image icon = createIcon(stereotype);
		icon.setLocation(location);
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified format and content for this stereotype.
	 * @param stereotype The receiving '<em><b>Stereotype</b></em>' model object.
	 * @param format The format for the new icon.
	 * @param content The content for the new icon.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Image createIcon(Stereotype stereotype, String format,
			String content) {
//		Image icon = stereotype.createIcon();
		Image icon = createIcon(stereotype);
		icon.setFormat(format);
		icon.setContent(content);
		return icon;
	}
	static public Image createIcon(Stereotype stereotype) {
		Image newIcon = (Image) create(com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.IMAGE);
		stereotype.getIcon().add(newIcon);
		return newIcon;
	}

} // StereotypeOperations
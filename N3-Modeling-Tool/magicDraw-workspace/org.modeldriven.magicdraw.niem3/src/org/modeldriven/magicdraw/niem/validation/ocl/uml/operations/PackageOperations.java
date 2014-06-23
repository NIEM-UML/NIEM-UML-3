/*
 * Copyright (c) 2005, 2009 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 271470
 *
 * $Id: PackageOperations.java,v 1.40 2009/05/15 20:43:20 jbruck Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.ocl.parser.AbstractOCLAnalyzer;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
//import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.metadata.MdinterfacesPackage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.mdprofiles.metadata.MdprofilesPackage;
/*
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile) <em>Is Profile Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile) <em>Apply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile) <em>Unapply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfiles() <em>Get Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllAppliedProfiles() <em>Get All Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllProfileApplications() <em>Get All Profile Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isModelLibrary() <em>Is Model Library</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageOperations
		extends NamespaceOperations {
/*
	protected static class StereotypeApplicationCopier
			extends EcoreUtil.Copier {

		private static final long serialVersionUID = 1L;

		protected final Profile profile;

		protected StereotypeApplicationCopier(Profile profile) {
			super();

			this.profile = profile;
		}

		@Override
		protected EObject createCopy(EObject eObject) {
			Element baseElement = getBaseElement(eObject);
			return baseElement == null
				? super.createCopy(eObject)
				: applyStereotype(baseElement, getTarget(eObject.eClass()));
		}

		@Override
		protected EClass getTarget(EClass eClass) {
//			return (EClass) profile.getDefinition(getNamedElement(eClass));
			return (EClass) ProfileOperations.getDefinition(profile,getNamedElement(eClass));
		}

		@Override
		protected EStructuralFeature getTarget(
				EStructuralFeature eStructuralFeature) {
//			return (EStructuralFeature) profile.getDefinition(getNamedElement(eStructuralFeature));
			return (EStructuralFeature) ProfileOperations.getDefinition(profile,getNamedElement(eStructuralFeature));
		}

		@Override
		protected void copyAttribute(EAttribute eAttribute, EObject eObject,
				EObject copyEObject) {

			if (!eAttribute.isUnsettable() || eObject.eIsSet(eAttribute)) {

				try {
					if (eAttribute.getEType().eClass().getClassifierID() == EcorePackage.EENUM) {
						copyEEnumAttribute(eAttribute, eObject, copyEObject);
					} else {
						copyEDataTypeAttribute(eAttribute, eObject, copyEObject);
					}
				} catch (Exception e) {
					NIEMResourceLoader.INSTANCE.log(e);
				}
			}
		}

		protected void copyEDataTypeAttribute(EAttribute eAttribute,
				EObject eObject, EObject copyEObject) {
			EDataType eDataType = eAttribute.getEAttributeType();
			EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();

			EAttribute targetEAttribute = (EAttribute) getTarget(eAttribute);

			if (targetEAttribute != null && targetEAttribute.isChangeable()) {
				EDataType targetEDataType = targetEAttribute
					.getEAttributeType();
				EFactory targetEFactory = targetEDataType.getEPackage()
					.getEFactoryInstance();

				if (targetEAttribute.isMany()) {
					@SuppressWarnings("unchecked")
					EList<Object> copyValues = (EList<Object>) copyEObject
						.eGet(targetEAttribute);

					if (eAttribute.isMany()) {
						EList<?> values = (EList<?>) eObject.eGet(eAttribute);

						for (int i = 0, size = values.size(); i < size; i++) {
							copyValues.add(i, targetEFactory.createFromString(
								targetEDataType, eFactory.convertToString(
									eDataType, values.get(i))));
						}
					} else {
						copyValues.add(targetEFactory.createFromString(
							targetEDataType, eFactory.convertToString(
								eDataType, eObject.eGet(eAttribute))));
					}
				} else {
					copyEObject.eSet(targetEAttribute, targetEFactory
						.createFromString(targetEDataType, eFactory
							.convertToString(eDataType, eAttribute.isMany()
								? ((EList<?>) eObject.eGet(eAttribute)).get(0)
								: eObject.eGet(eAttribute))));
				}
			}
		}

		protected void copyEEnumAttribute(EAttribute eAttribute,
				EObject eObject, EObject copyEObject) {
			EAttribute targetEAttribute = (EAttribute) getTarget(eAttribute);

			if (targetEAttribute != null && targetEAttribute.isChangeable()) {
				EEnum targetEEnum = (EEnum) targetEAttribute
					.getEAttributeType();

				if (targetEAttribute.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EEnumLiteral> copyValues = (EList<EEnumLiteral>) copyEObject
						.eGet(targetEAttribute);

					if (eAttribute.isMany()) {
						@SuppressWarnings("unchecked")
						EList<EEnumLiteral> values = (EList<EEnumLiteral>) eObject
							.eGet(eAttribute);

						for (int i = 0, size = values.size(); i < size; i++) {
							EEnumLiteral value = targetEEnum
								.getEEnumLiteral(values.get(i).getName());

							if (value != null) {
								copyValues.add(value);
							}
						}
					} else {
						EEnumLiteral value = targetEEnum
							.getEEnumLiteral(((EEnumLiteral) eObject
								.eGet(eAttribute)).getName());

						if (value != null) {
							copyValues.add(value);
						}
					}
				} else {
					EEnumLiteral value = targetEEnum
						.getEEnumLiteral(((EEnumLiteral) (eAttribute.isMany()
							? ((EList<?>) eObject.eGet(eAttribute)).get(0)
							: eObject.eGet(eAttribute))).getName());

					if (value != null) {
						copyEObject.eSet(targetEAttribute, value);
					}
				}
			}
		}

		@Override
		protected void copyContainment(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eReference)) {
				Object value = eObject.eGet(eReference);

				try {
					EReference targetEReference = (EReference) getTarget(eReference);

					if (targetEReference != null
						&& targetEReference.isChangeable()) {

						if (targetEReference.isMany()) {
							@SuppressWarnings("unchecked")
							EList<EObject> copyValues = (EList<EObject>) copyEObject
								.eGet(targetEReference);

							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								EList<EObject> values = (EList<EObject>) value;
								copyValues.addAll(copyAll(values));
							} else if (value != null) {
								copyValues.add(copy((EObject) value));
							}
						} else {

							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								EList<EObject> values = (EList<EObject>) value;
								copyEObject.eSet(targetEReference, copy(values
									.get(0)));
							} else {
								copyEObject.eSet(targetEReference,
									copy((EObject) value));
							}
						}
					}
				} catch (Exception e) {
					NIEMResourceLoader.INSTANCE.log(e);
				}
			}
		}

		@Override
		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {

			if (eObject.eIsSet(eReference)) {
				Object value = eObject.eGet(eReference);

				try {
					EReference targetEReference = (EReference) getTarget(eReference);

					if (targetEReference != null
						&& targetEReference.isChangeable()) {

						if (targetEReference.isMany()) {
							@SuppressWarnings("unchecked")
							InternalEList<EObject> copyValues = (InternalEList<EObject>) copyEObject
								.eGet(targetEReference);

							if (eReference.isMany()) {
								EReference targetEOpposite = targetEReference
									.getEOpposite();
								int index = 0;

								@SuppressWarnings("unchecked")
								Iterator<EObject> v = ((EList<EObject>) value)
									.iterator();

								while (v.hasNext()) {
									value = v.next();
									EObject copyValue = get(value);

									if (copyValue == null) {

										if (targetEOpposite == null) {
											copyValues.addUnique(index++,
												(EObject) value);
										}
									} else {

										if (targetEOpposite != null) {
											int position = copyValues
												.indexOf(copyValue);

											if (position == -1) {
												copyValues.addUnique(index++,
													copyValue);
											} else if (position != index) {
												copyValues.move(index++,
													copyValue);
											}
										} else {
											copyValues.addUnique(index++,
												copyValue);
										}
									}
								}
							} else if (value != null) {
								EObject copyValue = get(value);

								if (copyValue == null) {

									if (targetEReference.getEOpposite() == null) {
										copyValues.addUnique((EObject) value);
									}
								} else {
									copyValues.addUnique(copyValue);
								}
							}
						} else {

							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								EList<EObject> values = (EList<EObject>) value;
								value = values.get(0);
							}

							Object copyValue = get(value);

							if (copyValue == null) {

								if (targetEReference.getEOpposite() == null) {
									copyEObject.eSet(targetEReference, value);
								}
							} else {
								copyEObject.eSet(targetEReference, copyValue);
							}
						}
					}
				} catch (Exception e) {
					NIEMResourceLoader.INSTANCE.log(e);
				}
			}
		}
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element that is owned by a package has visibility, it is public or private.
	 * self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateElementsPublicOrPrivate(
			Package package_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (Element ownedElement : package_.getOwnedElement()) {

			if (ownedElement instanceof NamedElement) {
				VisibilityKind visibility = ((NamedElement) ownedElement)
					.getVisibility();

				if (visibility != null
					&& visibility != VisibilityKindEnum.PUBLIC
					&& visibility != VisibilityKindEnum.PRIVATE) {

					result = false;

					if (diagnostics == null) {
						return result;
					} else {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
								NIEMResourceLoader.INSTANCE
									.getString(
										"_UI_Package_ElementsPublicOrPrivate_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											ownedElement, package_)),
								new Object[]{package_, ownedElement}));
					}
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	// this should never be called in this context
	public static org.eclipse.uml2.uml.Class createOwnedClass(
			org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {
		org.eclipse.uml2.uml.Class ownedClass = (org.eclipse.uml2.uml.Class) package_
			.createOwnedType(name, UMLPackage.Literals.CLASS);
		ownedClass.setIsAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	// should not be called in this context
	public static Enumeration createOwnedEnumeration(
			org.eclipse.uml2.uml.Package package_, String name) {
		return (Enumeration) package_.createOwnedType(name,
				UMLPackage.Literals.ENUMERATION);
	}
    public static Package getNestedPackage(Package pkg, String name) {
        Package result = null;
        for(PackageableElement pe:pkg.getPackagedElement()){
        	if(Package.class.isInstance(pe) && name.equals(pe.getName()))return (Package)pe;
        }
        return result;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
    // should not be called in this context
	public static PrimitiveType createOwnedPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {
		return (PrimitiveType) package_.createOwnedType(name,
				UMLPackage.Literals.PRIMITIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified profile is applied to this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile in question.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isProfileApplied(
			Package package_, Profile profile) {
		return getProfileApplication(package_, profile) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definition of the specified profile to this package and automatically applies required stereotypes in the profile to elements within this package's namespace hieararchy. If a different definition is already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile to apply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static void applyProfile(
			Package package_, Profile profile) {
		StereotypesHelper.applyProfile(package_, profile);
		/*
	public static EList<EObject> applyProfile(
			Package package_, Profile profile) {
		package_.
		if (profile == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

//		EPackage profileDefinition = profile.getDefinition();
//		EPackage profileDefinition = ProfileOperations.getDefinition(profile);
		Package profileDefinition = ProfileOperations.getDefinition(profile);

		if (profileDefinition == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}
		if (getProfileApplication(package_,profile) == null) {
			createProfileApplication(package_).setAppliedProfile(profile);
		}

		EList<EObject> stereotypeApplications = new UniqueEList.FastCompare<EObject>();
		StereotypeApplicationCopier copier = new StereotypeApplicationCopier(
			profile);

		for (TreeIterator<EObject> allContents = getAllContents(package_, true,
			false); allContents.hasNext();) {

			EObject eObject = allContents.next();

			if (eObject instanceof Element) {
				Element element = (Element) eObject;

				if (element instanceof Package) {

					for (ProfileApplication profileApplication : ((Package) element)
						.getProfileApplication()) {

						if (profileApplication.getAppliedProfile() == profile) {
							EList<EObject> references = getEAnnotation(
								profileApplication,
								UML2_UML_PACKAGE_2_0_NS_URI, true)
								.getReferences();

							if (references.isEmpty()) {
								references.add(profileDefinition);
							} else {
								references.set(0, profileDefinition);
							}
						}
					}
				}

//				for (EObject stereotypeApplication : element.getStereotypeApplications()) {
				for (EObject stereotypeApplication : ElementOperations.getStereotypeApplications(element)) {
					Stereotype stereotype = getStereotype(stereotypeApplication);

					if (stereotype != null
						&& stereotype.getProfile() == profile) {

//						if (element.isStereotypeApplicable(stereotype)) {
						if (ElementOperations.isStereotypeApplicable(element,stereotype)) {
							EObject copy = copier.copy(stereotypeApplication);
							Resource eResource = stereotypeApplication
								.eResource();

							if (eResource != null) {

								if (eResource instanceof XMLResource) {
									XMLResource xmlResource = (XMLResource) eResource;
									xmlResource.setID(copy, xmlResource
										.getID(stereotypeApplication));
								}

								EList<EObject> contents = eResource
									.getContents();

								if (eResource == copy.eResource()) {
									contents.move(contents
										.indexOf(stereotypeApplication), copy);
								} else {
									contents.set(contents
										.indexOf(stereotypeApplication), copy);
								}
							}
						}

						stereotypeApplications.add(stereotypeApplication);
					}
				}
			}
		}

		copier.copyReferences();

		for (EObject key : copier.keySet()) {
			EObject copy = copier.get(key);

			for (Setting setting : new ArrayList<EStructuralFeature.Setting>(
				getNonNavigableInverseReferences(key))) {

				EStructuralFeature eStructuralFeature = setting
					.getEStructuralFeature();

				if (eStructuralFeature != null
					&& eStructuralFeature.isChangeable()) {

					if (eStructuralFeature.isMany()) {
						Object value = setting.getEObject().eGet(
							eStructuralFeature);

						@SuppressWarnings("unchecked")
						EList<EObject> list = ((EList<EObject>) value);
						list.set(list.indexOf(key), copy);
					} else {
						setting.set(copy);
					}
				}
			}
		}

		destroyAll(stereotypeApplications);

//		return profile.getOwnedExtensions(true).isEmpty()
		return ProfileOperations.getOwnedExtensions(profile,true).isEmpty()
			? ECollections.<EObject> emptyEList()
			: applyAllRequiredStereotypes(package_);
			*/
	}
	static public ProfileApplication createProfileApplication(Package package_) {
		ProfileApplication newProfileApplication = (ProfileApplication) create(UMLPackage.Literals.PROFILE_APPLICATION);
		package_.getProfileApplication().add(newProfileApplication);
		return newProfileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified profile from this package and automatically unapplies stereotypes in the profile from elements within this package's namespace hieararchy.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile to unapply.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static EList<EObject> unapplyProfile(
			Package package_, Profile profile) {

//		if (profile == null || package_.getProfileApplication(profile) == null) {
		if (profile == null || PackageOperations.getProfileApplication(package_,profile) == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		EList<ProfileApplication> profileApplications = new UniqueEList.FastCompare<ProfileApplication>();

		for (TreeIterator<EObject> allContents = getAllContents(package_, true,
			false); allContents.hasNext();) {

			EObject eObject = allContents.next();

			if (eObject instanceof org.eclipse.uml2.uml.Package) {

				for (ProfileApplication profileApplication : ((Package) eObject)
					.getProfileApplication()) {

					if (profileApplication.getAppliedProfile() == profile) {
						profileApplications.add(profileApplication);
					}
				}
			}
		}

		destroyAll(profileApplications);

//		return package_.getAllAppliedProfiles().contains(profile)
		return PackageOperations.getAllAppliedProfiles(package_).contains(profile)
			? ECollections.<EObject> emptyEList()
			: unapplyAllNonApplicableStereotypes(package_);
	}
*/
	protected static EList<Profile> getAppliedProfiles(
			Package package_,
			EList<Profile> appliedProfiles) {

//		for (ProfileApplication profileApplication : package_.getProfileApplications()) {
		for (ProfileApplication profileApplication : getProfileApplications(package_)) {
			Profile appliedProfile = profileApplication.getAppliedProfile();

			if (appliedProfile != null) {
				appliedProfiles.add(appliedProfile);
			}
		}

		return appliedProfiles;
	}
	static public Collection<ProfileApplication> getProfileApplications(Package package_) {
		return package_.getProfileApplication();
		/*
//		if (profileApplications == null) {
			EList<ProfileApplication> profileApplications = new EObjectContainmentWithInverseEList.Resolving<ProfileApplication>(
				ProfileApplication.class, this,
				UMLPackage.PACKAGE__PROFILE_APPLICATION,
				UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
//		}
		return profileApplications;
		*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profiles that are applied to this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Profile> getAppliedProfiles(
			Package package_) {
		return getAppliedProfiles(package_,
			new UniqueEList.FastCompare<Profile>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package, or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			Package package_, String qualifiedName) {

		for (ProfileApplication profileApplication : package_
			.getProfileApplication()) {

			Profile appliedProfile = profileApplication.getAppliedProfile();

			if (appliedProfile != null
				&& safeEquals(appliedProfile.getQualifiedName(), qualifiedName)) {

				return appliedProfile;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			Package package_, String qualifiedName,
			boolean recurse) {
//		Profile appliedProfile = package_.getAppliedProfile(qualifiedName);
		Profile appliedProfile = getAppliedProfile(package_,qualifiedName);

		if (appliedProfile == null && recurse) {

			for (Iterator<Package> otherApplyingPackages = ProfileApplicationHelper.INSTANCE
				.getOtherApplyingPackages(package_).iterator(); otherApplyingPackages
				.hasNext()
				&& appliedProfile == null;) {

//				appliedProfile = otherApplyingPackages.next().getAppliedProfile(qualifiedName);
				appliedProfile = PackageOperations.getAppliedProfile(otherApplyingPackages.next(),qualifiedName);
			}
		}

		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profile applications for this package, including profile applications for its nesting package(s).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<ProfileApplication> getAllProfileApplications(
			Package package_) {
		EList<ProfileApplication> allProfileApplications = new UniqueEList.FastCompare<ProfileApplication>(
			package_.getProfileApplication());

		for (Package applyingPackage : ProfileApplicationHelper.INSTANCE
			.getOtherApplyingPackages(package_)) {

			allProfileApplications.addAll(applyingPackage
				.getProfileApplication());
		}

		return ECollections.unmodifiableEList(allProfileApplications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package, or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile whose application to retrieve.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			Package package_, Profile profile) {

		for (ProfileApplication profileApplication : package_
			.getProfileApplication()) {

			if (profileApplication.getAppliedProfile() == profile) {
				return profileApplication;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile whose application to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			Package package_, Profile profile,
			boolean recurse) {
//		ProfileApplication profileApplication = package_.getProfileApplication(profile);
		ProfileApplication profileApplication = getProfileApplication(package_,profile);

		if (profileApplication == null && recurse) {

			for (Iterator<Package> otherApplyingPackages = ProfileApplicationHelper.INSTANCE
				.getOtherApplyingPackages(package_).iterator(); otherApplyingPackages
				.hasNext()
				&& profileApplication == null;) {

//				profileApplication = otherApplyingPackages.next().getProfileApplication(profile);
				profileApplication = getProfileApplication(otherApplyingPackages.next(),profile);
			}
		}

		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Interface createOwnedInterface(
			Package package_, String name) {
//		return (Interface) package_.createOwnedType(name,MdinterfacesPackage.Literals.INTERFACE);
		return (Interface) createOwnedType(package_,name,UMLPackage.Literals.INTERFACE);
	}
	static public Type createOwnedType(Package package_,String name, EClass eClass) {
		Type newOwnedType = (Type) create(eClass);
		package_.getOwnedType().add(newOwnedType);
		if (name != null)
			newOwnedType.setName(name);
		return newOwnedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this package is a model library.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isModelLibrary(org.eclipse.uml2.uml.Package package_) {
		return package_.getAppliedStereotype("Standard" //$NON-NLS-1$
			+ NamedElementOperations.SEPARATOR + "ModelLibrary") != null; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profiles that are applied to this package, including profiles applied to its nesting package(s).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Profile> getAllAppliedProfiles(
			Package package_) {
		EList<Profile> allAppliedProfiles = getAppliedProfiles(package_,
			new UniqueEList.FastCompare<Profile>());

		for (Package applyingPackage : ProfileApplicationHelper.INSTANCE.getOtherApplyingPackages(package_)) {

			getAppliedProfiles(applyingPackage, allAppliedProfiles);
		}

		return ECollections.unmodifiableEList(allAppliedProfiles);
	}

	protected static EList<Package> getAllImportedPackages(
			Package package_,
			EList<Package> allImportedPackages) {

		for (PackageImport packageImport : package_.getPackageImport()) {

			if (packageImport.getVisibility() == VisibilityKindEnum.PUBLIC) {
				Package importedPackage = packageImport
					.getImportedPackage();

				if (importedPackage != null
					&& allImportedPackages.add(importedPackage)) {

					getAllImportedPackages(importedPackage, allImportedPackages);
				}
			}
		}

		return allImportedPackages;
	}

	protected static EList<PackageableElement> visibleMembers(
			Package package_,
			EList<PackageableElement> visibleMembers) {

		for (NamedElement ownedMember : package_.getOwnedMember()) {

			if (ownedMember instanceof PackageableElement
				&& ownedMember.getVisibility() == VisibilityKindEnum.PUBLIC) {

				visibleMembers.add((PackageableElement) ownedMember);
			}
		}

		for (ElementImport elementImport : package_.getElementImport()) {

			if (elementImport.getVisibility() == VisibilityKindEnum.PUBLIC) {
				PackageableElement importedElement = elementImport
					.getImportedElement();

				if (importedElement != null) {
					visibleMembers.add(importedElement);
				}
			}
		}

		return visibleMembers;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * result = member->select( m | self.makesVisible(m))
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> visibleMembers(
			Package package_) {
		EList<PackageableElement> visibleMembers = visibleMembers(package_,
			new UniqueEList.FastCompare<PackageableElement>());

		for (Package importedPackage : getAllImportedPackages(
			package_,
			new UniqueEList.FastCompare<Package>())) {

			visibleMembers(importedPackage, visibleMembers);
		}

		return ECollections.unmodifiableEList(visibleMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * self.member->includes(el)
	 * result = (ownedMember->includes(el)) or
	 * (elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el)) or
	 * (packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean makesVisible(Package package_,
			NamedElement el) {

		if (package_.getOwnedMember().contains(el)) {
			return el.getVisibility() == VisibilityKindEnum.PUBLIC;
		}

		for (ElementImport elementImport : package_.getElementImport()) {

			if (safeEquals(elementImport.getImportedElement(), el)) {
				return elementImport.getVisibility() == VisibilityKindEnum.PUBLIC;
			}
		}

		for (PackageImport packageImport : package_.getPackageImport()) {

			if (packageImport.getVisibility() == VisibilityKindEnum.PUBLIC) {
				Package importedPackage = packageImport
					.getImportedPackage();

				return importedPackage != null
					&& visibleMembers(importedPackage).contains(el);
//				&& importedPackage.visibleMembers().contains(el);
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner.
	 * result = false
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(Package package_) {
//	public static boolean mustBeOwned(org.eclipse.uml2.uml.Package package_) {
		return false;
	}
	public static  Type getOwnedType(Package package_,java.lang.String name) {
		for(Type type:package_.getOwnedType())if(name.equals(type.getName()))return type;
		return null;
	}
	 
	protected static boolean containsSpecializations(
			Package package_, Classifier classifier) {

		for (Type ownedType : package_.getOwnedType()) {

			if (ownedType instanceof Classifier
				&& ClassifierOperations.allParents(((Classifier) ownedType)).contains(classifier)) {

				return true;
			}
		}

		return false;
	}
	static public PackageableElement createPackagedElement(Package package_,String name, EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) create(eClass);
		package_.getPackagedElement().add(newPackagedElement);
		if (name != null)
			newPackagedElement.setName(name);
		return newPackagedElement;
	}

} // PackageOperations
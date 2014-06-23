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
 * $Id: NamespaceOperations.java,v 1.15 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKind;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
/*
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Namespace</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#validateMembersDistinguishable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createElementImport(org.eclipse.uml2.uml.PackageableElement, org.eclipse.uml2.uml.VisibilityKind) <em>Create Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#createPackageImport(org.eclipse.uml2.uml.Package, org.eclipse.uml2.uml.VisibilityKind) <em>Create Package Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedElements() <em>Get Imported Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedPackages() <em>Get Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getImportedMembers() <em>Get Imported Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#getNamesOfMember(org.eclipse.uml2.uml.NamedElement) <em>Get Names Of Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the members of a Namespace are distinguishable within it.
	 * membersAreDistinguishable()
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMembersDistinguishable(Namespace namespace,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		
		if (!membersAreDistinguishable(namespace)) {
//		if (!namespace.membersAreDistinguishable()) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
					NIEMResourceLoader.INSTANCE.getString(
						"_UI_Namespace_MembersDistinguishable_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namespace)),
					new Object[]{namespace}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an import of the specified element into this namespace with the specified visibility.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param element The element to import.
	 * @param visibility The visibility for the new element import.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static ElementImport createElementImport(Namespace namespace,
			PackageableElement element, VisibilityKind visibility) {

		if (element == null
//				|| namespace.getImportedElements().contains(element)) {
			|| getImportedElements(namespace).contains(element)) {

			throw new IllegalArgumentException(String.valueOf(element));
		}

		if (visibility == null) {
			throw new IllegalArgumentException(String.valueOf(visibility));
		}

//		ElementImport elementImport = namespace.createElementImport(element);
		ElementImport elementImport = createElementImport(namespace,element);
		elementImport.setVisibility(visibility);

		return elementImport;
	}
	static public ElementImport createElementImport(Namespace namespace,PackageableElement importedElement) {
		ElementImport newElementImport = (ElementImport) create(UMLPackage.Literals.ELEMENT_IMPORT);
		namespace.getElementImport().add(newElementImport);
		if (importedElement != null)
			newElementImport.setImportedElement(importedElement);
		return newElementImport;
	}
	
	public static NamedElement getMember(Namespace namespace,java.lang.String name){
		NamedElement result=null;
		for(NamedElement ne:namespace.getMember())if(name.equals(ne.getName()))return ne;
		return result;
	}
	public static NamedElement getMember(Namespace namespace,java.lang.String name,boolean ignoreCase,
            org.eclipse.emf.ecore.EClass eClass){
		NamedElement result=null;
		for(NamedElement ne:namespace.getMember()){
			if(ignoreCase?name.equalsIgnoreCase(ne.getName()):name.equals(ne.getName())){
//				if((eClass==null)||eClass.equals(ne.eClass()))return ne;
				if((eClass==null)
						||eClass.isInstance(ne)
//						||eClass.equals(ne.eClass())
//						||eClass.isSuperTypeOf(ne.eClass())
						)return ne;
				//log("getMember EClass mismatch for member "+ne.getQualifiedName()+", sought class "+eClass.getName()+", member class "+ne.eClass().getName());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an import of the specified package into this namespace with the specified visibility.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * @param package_ The package to import.
	 * @param visibility The visibility for the new package import.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static PackageImport createPackageImport(Namespace namespace,
			Package package_, VisibilityKind visibility) {

		if (package_ == null
//				|| namespace.getImportedPackages().contains(package_)) {
			|| getImportedPackages(namespace).contains(package_)) {

			throw new IllegalArgumentException(String.valueOf(package_));
		}

		if (visibility == null) {
			throw new IllegalArgumentException(String.valueOf(visibility));
		}

//		PackageImport packageImport = namespace.createPackageImport(package_);
		PackageImport packageImport = createPackageImport(namespace,package_);
		packageImport.setVisibility(visibility);

		return packageImport;
	}
	static public PackageImport createPackageImport(Namespace namespace,
			Package importedPackage) {
		PackageImport newPackageImport = (PackageImport) create(UMLPackage.Literals.PACKAGE_IMPORT);
		namespace.getPackageImport().add(newPackageImport);
		if (importedPackage != null)
			newPackageImport.setImportedPackage(importedPackage);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the elements imported by this namespace.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> getImportedElements(
			Namespace namespace) {
		EList<PackageableElement> importedElements = new UniqueEList.FastCompare<PackageableElement>();

		for (ElementImport elementImport : namespace.getElementImport()) {
			PackageableElement importedElement = elementImport
				.getImportedElement();

			if (importedElement != null) {
				importedElements.add(importedElement);
			}
		}

		return ECollections.unmodifiableEList(importedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the packages imported by this namespace.
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Package> getImportedPackages(
			Namespace namespace) {
		EList<Package> importedPackages = new UniqueEList.FastCompare<Package>();

		for (PackageImport packageImport : namespace.getPackageImport()) {
			Package importedPackage = packageImport
				.getImportedPackage();

			if (importedPackage != null) {
				importedPackages.add(importedPackage);
			}
		}

		return ECollections.unmodifiableEList(importedPackages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The importedMember property is derived from the ElementImports and the PackageImports. References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * result = self.importMembers(self.elementImport.importedElement.asSet()-
	 * >union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> getImportedMembers(
			Namespace namespace) {
		EList<PackageableElement> importedMembers = new UniqueEList.FastCompare<PackageableElement>();

		for (ElementImport elementImport : namespace.getElementImport()) {
			PackageableElement importedElement = elementImport
				.getImportedElement();

			if (importedElement != null) {
				importedMembers.add(importedElement);
			}
		}

		for (PackageImport packageImport : namespace.getPackageImport()) {
			Package importedPackage = packageImport
				.getImportedPackage();

			if (importedPackage != null) {
//				importedMembers.addAll(importedPackage.visibleMembers());
				importedMembers.addAll(PackageOperations.visibleMembers(importedPackage));
			}
		}

		return new UnionEObjectEList<PackageableElement>(
			(InternalEObject) namespace,
			UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER, importedMembers
				.size(), importedMembers.toArray());
	}

	protected static EList<String> getNamesOfMember(Namespace namespace,
			NamedElement element, EList<Namespace> namespaces,
			EList<String> namesOfMember) {

		if (!namespaces.contains(namespace)) {
			namespaces.add(namespace);

			if (namespace.getOwnedMember().contains(element)) {
				String name = element.getName();

				if (!isEmpty(name)) {
					namesOfMember.add(name);
				}
			} else {
				EList<String> elementImportNames = new UniqueEList<String>();

				for (ElementImport elementImport : namespace
					.getElementImport()) {

					if (elementImport.getImportedElement() == element) {
//						String name = elementImport.getName();
						String name = ElementImportOperations.getName(elementImport);

						if (!isEmpty(name)) {
							elementImportNames.add(name);
						}
					}
				}

				if (elementImportNames.isEmpty()) {

					for (PackageImport packageImport : namespace
						.getPackageImport()) {

						Package importedPackage = packageImport
							.getImportedPackage();

						if (importedPackage != null
//								&& importedPackage.visibleMembers().contains(
							&& PackageOperations.visibleMembers(importedPackage).contains(
								element)) {

							getNamesOfMember(importedPackage, element,
								namespaces, namesOfMember);
						}
					}
				} else {
					namesOfMember.addAll(elementImportNames);
				}
			}
		}

		return namesOfMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getNamesOfMember() takes importing into account. It gives back the set of names that an element would have in an importing namespace, either because it is owned, or if not owned then imported individually, or if not individually then from a package.
	 * The query getNamesOfMember() gives a set of all of the names that a member would have in a Namespace. In general a member can have multiple names in a Namespace if it is imported more than once with different aliases. The query takes account of importing. It gives back the set of names that an element would have in an importing namespace, either because it is owned, or if not owned then imported individually, or if not individually then from a package.
	 * result = if self.ownedMember ->includes(element)
	 * then Set{}->include(element.name)
	 * else let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in
	 *   if elementImports->notEmpty()
	 *   then elementImports->collect(el | el.getName())
	 *   else self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))
	 *   endif
	 * endif
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<String> getNamesOfMember(Namespace namespace,
			NamedElement element) {
		return ECollections.unmodifiableEList(getNamesOfMember(namespace,
			element, new UniqueEList.FastCompare<Namespace>(),
			new UniqueEList<String>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespace's members are distinguishable within it.
	 * result = self.member->forAll( memb |
	 * self.member->excluding(memb)->forAll(other |
	 * memb.isDistinguishableFrom(other, self)))
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean membersAreDistinguishable(Namespace namespace) {
		Collection<NamedElement> namespaceMembers = namespace.getMember();

		for (NamedElement member : namespaceMembers) {

			for (NamedElement otherMember : namespaceMembers) {

				if (member != otherMember
//						&& !member.isDistinguishableFrom(otherMember, namespace)) {
					&& !NamedElementOperations.isDistinguishableFrom(member,otherMember, namespace)) {

					return false;
				}
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query importMembers() defines which of a set of PackageableElements are actually imported into the namespace. This excludes hidden ones, i.e., those which have names that conflict with names of owned members, and also excludes elements which would have the same name when imported.
	 * result = self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem |
	 * mem.imp.isDistinguishableFrom(mem, self)))
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> importMembers(Namespace namespace,
			EList<PackageableElement> imps) {
		EList<PackageableElement> importMembers = new UniqueEList.FastCompare<PackageableElement>();
		Collection<NamedElement> ownedMembers = namespace.getOwnedMember();

//		excludeCollisionsLoop : for (PackageableElement excludeCollision : namespace.excludeCollisions(imps)) {
		excludeCollisionsLoop : for (PackageableElement excludeCollision : NamespaceOperations.excludeCollisions(namespace,imps)) {

			for (NamedElement ownedMember : ownedMembers) {

//				if (!excludeCollision.isDistinguishableFrom(ownedMember,
				if (!NamedElementOperations.isDistinguishableFrom(excludeCollision,ownedMember,
					namespace)) {

					continue excludeCollisionsLoop;
				}
			}

			importMembers.add(excludeCollision);
		}

		return ECollections.unmodifiableEList(importMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query excludeCollisions() excludes from a set of PackageableElements any that would not be distinguishable from each other in this namespace.
	 * result = imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))
	 * @param namespace The receiving '<em><b>Namespace</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> excludeCollisions(
			Namespace namespace, EList<PackageableElement> imps) {
		EList<PackageableElement> excludeCollisions = new UniqueEList.FastCompare<PackageableElement>();

		imps1Loop : for (PackageableElement imp1 : imps) {

			for (PackageableElement imp2 : imps) {

				if (imp1 != imp2
//						&& !imp1.isDistinguishableFrom(imp2, namespace)) {
					&& !NamedElementOperations.isDistinguishableFrom(imp1,imp2, namespace)) {

					continue imps1Loop;
				}
			}

			excludeCollisions.add(imp1);
		}

		return ECollections.unmodifiableEList(excludeCollisions);
	}

} // NamespaceOperations
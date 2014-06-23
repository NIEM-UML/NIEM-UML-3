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
 * $Id: ComponentOperations.java,v 1.15 2008/10/02 20:56:22 jbruck Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import java.util.Iterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
//import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.metadata.MdinterfacesPackage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.ComponentRealization;
//import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.metadata.MdbasiccomponentsPackage;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
/*
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#realizedInterfaces(org.eclipse.uml2.uml.Classifier) <em>Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#usedInterfaces(org.eclipse.uml2.uml.Classifier) <em>Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getRequireds() <em>Get Requireds</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Component#getProvideds() <em>Get Provideds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentOperations
		extends ClassOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Class createOwnedClass(
			Component component, String name, boolean isAbstract) {
		Class ownedClass = (Class) createPackagedElement(component
			,name, UMLPackage.Literals.CLASS);
		ownedClass.setAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Enumeration createOwnedEnumeration(Component component,
			String name) {
		return (Enumeration) createPackagedElement(component,name,
				UMLPackage.Literals.ENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static PrimitiveType createOwnedPrimitiveType(Component component,
			String name) {
		return (PrimitiveType) createPackagedElement(component,name,
				UMLPackage.Literals.PRIMITIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as a packaged element of this component.
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Interface createOwnedInterface(Component component,
			String name) {
		return (Interface) createPackagedElement(component,name,
				UMLPackage.Literals.INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of realized interfaces of a component:
	 * result = (classifier.clientDependency->
	 * select(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->
	 * collect(dependency|dependency.client)
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> realizedInterfaces(Component component,
			Classifier classifier) {
		return ECollections.unmodifiableEList(realizedInterfaces(component,
			classifier, true));
	}

	protected static EList<Interface> realizedInterfaces(Component component,
			Classifier classifier, boolean resolve) {
		return realizedInterfaces(component, classifier, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> realizedInterfaces(Component component,
			Classifier classifier, boolean resolve,
			EList<Interface> realizedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependency()) {

			if (clientDependency instanceof Realization) {
				Iterator<NamedElement> suppliers = resolve
					? clientDependency.getSupplier().iterator()
					: ((InternalEList<NamedElement>) clientDependency
						.getSupplier()).basicIterator();

				while (suppliers.hasNext()) {
					NamedElement supplier = suppliers.next();

					if (supplier instanceof Interface) {
						realizedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return realizedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of used interfaces of a component:
	 * result = (classifier.supplierDependency->
	 * select(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->
	 * collect(dependency|dependency.supplier)
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> usedInterfaces(Component component,
			Classifier classifier) {
		return ECollections.unmodifiableEList(usedInterfaces(component,
			classifier, true));
	}

	protected static EList<Interface> usedInterfaces(Component component,
			Classifier classifier, boolean resolve) {
		return usedInterfaces(component, classifier, resolve,
			new UniqueEList.FastCompare<Interface>());
	}

	protected static EList<Interface> usedInterfaces(Component component,
			Classifier classifier, boolean resolve,
			EList<Interface> usedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependency()) {

			if (clientDependency instanceof Usage) {
				Iterator<NamedElement> suppliers = resolve
					? clientDependency.getSupplier().iterator()
					: ((InternalEList<NamedElement>) clientDependency
						.getSupplier()).basicIterator();

				while (suppliers.hasNext()) {
					NamedElement supplier = suppliers.next();

					if (supplier instanceof Interface) {
						usedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = let usedInterfaces = UsedInterfaces(self) and
	 *   let realizingClassifierUsedInterfaces = UsedInterfaces(self.realizingClassifier) and
	 *   let typesOfUsedPorts = self.ownedPort.required in
	 *     ((usedInterfaces->union(realizingClassifierUsedInterfaces))->
	 *       union(typesOfUsedPorts))->asSet()
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getRequireds(Component component) {
		EList<Interface> requireds = usedInterfaces(component, component,
			false, new UniqueEList.FastCompare<Interface>());

		for (ComponentRealization realization : component.getRealization()) {

			for (Classifier realizingClassifier : realization
				.getRealizingClassifier()) {

				if (realizingClassifier != null) {
					usedInterfaces(component, realizingClassifier, false,
						requireds);

					for (Classifier parent : ClassifierOperations.allParents(realizingClassifier)) {
						usedInterfaces(component, parent, false, requireds);
					}
				}
			}
		}

		for (Port ownedPort : component.getOwnedPort()) {
			requireds.addAll(((InternalEList<Interface>) ownedPort
				.getRequired()).basicList());
		}

		return new UnionEObjectEList<Interface>((InternalEObject) component,
				UMLPackage.Literals.COMPONENT__REQUIRED, requireds.size(),
			requireds.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = let implementedInterfaces = self.implementation->collect(impl|impl.contract) and
	 *   let realizedInterfaces = RealizedInterfaces(self) and
	 *   let realizingClassifierInterfaces = RealizedInterfaces(self.realizingClassifier) and
	 *   let typesOfRequiredPorts = self.ownedPort.provided in
	 *     (((implementedInterfaces->union(realizedInterfaces)->union(realizingClassifierInterfaces))->
	 *       union(typesOfRequiredPorts))->asSet()
	 * @param component The receiving '<em><b>Component</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getProvideds(Component component) {
		EList<Interface> provideds = realizedInterfaces(component, component,
			false, new UniqueEList.FastCompare<Interface>());

		for (ComponentRealization realization : component.getRealization()) {
			for (Classifier realizingClassifier : realization
				.getRealizingClassifier()) {

				if (realizingClassifier != null) {
					realizedInterfaces(component, realizingClassifier, false,
						provideds);

					for (Classifier parent : ClassifierOperations.allParents(realizingClassifier)) {
						realizedInterfaces(component, parent, false, provideds);
					}
				}
			}
		}

		for (Port ownedPort : component.getOwnedPort()) {
			provideds.addAll(((InternalEList<Interface>) ownedPort
				.getProvided()).basicList());
		}

		return new UnionEObjectEList<Interface>((InternalEObject) component,
				UMLPackage.Literals.COMPONENT__PROVIDED, provideds.size(),
			provideds.toArray());
	}

	protected static EList<Interface> getAllProvideds(Component component,
			EList<Interface> allProvideds) {
		allProvideds.addAll(component.getProvided());

		for (Classifier parent : ClassifierOperations.allParents(component)) {

			if (parent instanceof Component) {
				allProvideds.addAll(((Component) parent).getProvided());
			} else {
				realizedInterfaces(component, parent, true, allProvideds);
			}
		}

		return allProvideds;
	}

	protected static EList<Interface> getAllRequireds(Component component,
			EList<Interface> allRequireds) {
		allRequireds.addAll(component.getRequired());

		for (Classifier parent : ClassifierOperations.allParents(component)) {

			if (parent instanceof Component) {
				allRequireds.addAll(((Component) parent).getRequired());
			} else {
				usedInterfaces(component, parent, true, allRequireds);
			}
		}

		return allRequireds;
	}
	static public PackageableElement createPackagedElement(Component component,String name, EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) create(eClass);
		component.getPackagedElement().add(newPackagedElement);
		if (name != null)
			newPackagedElement.setName(name);
		return newPackagedElement;
	}

} // ComponentOperations

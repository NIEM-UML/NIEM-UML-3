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
 * $Id: ClassOperations.java,v 1.21 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

//import org.eclipse.uml2.uml.Operation;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.RedefinableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
/*
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Class#validatePassiveClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Passive Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#getExtensions() <em>Get Extensions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#isMetaclass() <em>Is Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Class#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassOperations
		extends StructuredClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOperations() {
		super();
	}
	static public Property createOwnedAttribute(Class c,String name, Type type) {
		return createOwnedAttribute(c,name, type, UMLPackage.Literals.PROPERTY);
	}
	static public Property createOwnedAttribute(Class c,String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) create(eClass);
		c.getOwnedAttribute().add(newOwnedAttribute);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A passive class may not own receptions.
	 * not self.isActive implies self.ownedReception.isEmpty()
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validatePassiveClass(
			Class class_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (!class_.isActive() && !(class_.getOwnedReception().isEmpty())) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASS__PASSIVE_CLASS, NIEMResourceLoader.INSTANCE
						.getString("_UI_Class_PassiveClass_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, class_)),
					new Object[]{class_}));
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
	public static EList<Extension> getExtensions(
			Class class_) {
		EList<Extension> extensions = ECollections.<Extension> emptyEList();

		if (ClassOperations.isMetaclass(class_)) {
			extensions = new UniqueEList.FastCompare<Extension>();

			for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(class_)) {

				if (nonNavigableInverseReference.getEStructuralFeature() == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
					EObject eObject = nonNavigableInverseReference.getEObject();

					if (eObject instanceof Property) {
						Association association = ((Property) eObject)
							.getAssociation();

						if (association instanceof Extension) {
							extensions.add((Extension) association);
						}
					}
				}
			}
		}

		return new UnionEObjectEList<Extension>((InternalEObject) class_,
				UMLPackage.Literals.CLASS__EXTENSION, extensions.size(), extensions
				.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this class.
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(
			Class class_, String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		return TypeOperations.createOwnedOperation(class_, name,
			parameterNames, parameterTypes, returnType);
	}
	static public Operation createOwnedOperation(Class class_,String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		Operation newOwnedOperation = (Operation) create(UMLPackage.Literals.OPERATION);
		class_.getOwnedOperation().add(newOwnedOperation);
		if (name != null)
			newOwnedOperation.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null
			? 0
			: ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null
			? 0
			: ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
//			newOwnedOperation.createOwnedParameter(i < ownedParameterNamesSize
			OperationOperations.createOwnedParameter(newOwnedOperation,i < ownedParameterNamesSize
				? (String) ownedParameterNames.get(i)
				: null, i < ownedParameterTypesSize
				? (Type) ownedParameterTypes.get(i)
				: null);
		}
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this class is a metaclass.
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isMetaclass(Class class_) {
//		return class_.getAppliedStereotype("Standard" //$NON-NLS-1$
		return ElementOperations.getAppliedStereotype(class_,"Standard" //$NON-NLS-1$
			+ NamedElementOperations.SEPARATOR + "Metaclass") != null; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * result = inhs->excluding(inh | ownedMember->select(oclIsKindOf(RedefinableElement))->select(redefinedElement->includes(inh)))
	 * @param class_ The receiving '<em><b>Class</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> inherit(
			Class class_, EList<NamedElement> inhs) {
		EList<NamedElement> inherit = new UniqueEList.FastCompare<NamedElement>();
		EList<RedefinableElement> redefinedElements = new UniqueEList.FastCompare<RedefinableElement>();

		for (NamedElement ownedMember : class_.getOwnedMember()) {

			if (ownedMember instanceof RedefinableElement) {
				redefinedElements.addAll(((RedefinableElement) ownedMember)
					.getRedefinedElement());
			}
		}

		for (NamedElement inh : inhs) {

			if (!redefinedElements.contains(inh)) {
				inherit.add(inh);
			}
		}

		return ECollections.unmodifiableEList(inherit);
	}

} // ClassOperations
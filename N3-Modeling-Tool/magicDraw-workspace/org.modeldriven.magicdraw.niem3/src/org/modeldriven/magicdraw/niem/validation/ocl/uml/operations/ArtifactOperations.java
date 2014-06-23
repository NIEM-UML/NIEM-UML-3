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
 * $Id: ArtifactOperations.java,v 1.8 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
/*
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Artifact</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#createOwnedOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, org.eclipse.uml2.uml.Type) <em>Create Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Artifact#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this artifact.
	 * @param artifact The receiving '<em><b>Artifact</b></em>' model object.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for  the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation createOwnedOperation(Artifact artifact,
			String name, EList<String> parameterNames,
			EList<Type> parameterTypes, Type returnType) {
		return TypeOperations.createOwnedOperation(artifact, name,
			parameterNames, parameterTypes, returnType);
	}
	static public Operation createOwnedOperation(Artifact artifact,String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		Operation newOwnedOperation = (Operation) create(UMLPackage.Literals.OPERATION);
		artifact.getOwnedOperation().add(newOwnedOperation);
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
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this artifact.
	 * @param artifact The receiving '<em><b>Artifact</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property createOwnedAttribute(Artifact artifact, String name,
			Type type, int lower, int upper) {
		return TypeOperations.createOwnedAttribute(artifact, name, type, lower,
			upper);
	}
	static public Property createOwnedAttribute(Artifact artifact,String name, Type type) {
		return createOwnedAttribute(artifact,name, type, UMLPackage.Literals.PROPERTY);
	}
	
	static public Property createOwnedAttribute(Artifact artifact,String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) create(eClass);
		artifact.getOwnedAttribute().add(newOwnedAttribute);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		return newOwnedAttribute;
	}

} // ArtifactOperations
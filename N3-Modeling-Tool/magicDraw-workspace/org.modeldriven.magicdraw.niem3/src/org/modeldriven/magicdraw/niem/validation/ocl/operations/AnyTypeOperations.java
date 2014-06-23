/**
 * <copyright>
 * 
 * Copyright (c) 2008 Zeligsoft Inc. and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Zeligsoft - initial API and implementation
 * 
 * </copyright>
 * 
 * $Id: AnyTypeOperations.java,v 1.1 2008/11/24 00:24:01 cdamus Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.operations;

import org.eclipse.emf.common.util.EList;
import org.modeldriven.magicdraw.niem.validation.ocl.AnyType;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
/*
import org.eclipse.ocl.uml.AnyType;

import org.eclipse.uml2.uml.Operation;

import org.eclipse.uml2.uml.internal.operations.ClassifierOperations;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Any Type</b></em>' model objects.
 * @since 2.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.utilities.PredefinedType#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.utilities.PredefinedType#oclOperations() <em>Ocl Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class AnyTypeOperations
		extends ClassifierOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyTypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getName(AnyType anyType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList<Operation> oclOperations(AnyType anyType) {
		throw new UnsupportedOperationException();
	}

} // AnyTypeOperations
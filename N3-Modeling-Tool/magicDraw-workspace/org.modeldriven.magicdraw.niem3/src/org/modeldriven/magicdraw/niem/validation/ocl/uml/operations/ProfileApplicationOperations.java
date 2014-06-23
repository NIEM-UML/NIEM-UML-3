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
 * $Id: ProfileApplicationOperations.java,v 1.8 2007/05/04 20:35:34 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
/*
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ProfileApplication;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Profile Application</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition() <em>Get Applied Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition(org.eclipse.uml2.uml.NamedElement) <em>Get Applied Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the definition (Ecore representation) of the profile associated with this profile application.
	 * @param profileApplication The receiving '<em><b>Profile Application</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedDefinition(
			ProfileApplication profileApplication) {
		return profileApplication.getAppliedProfile();
	}
	/*
	public static EPackage getAppliedDefinition(
			ProfileApplication profileApplication) {
		profileApplication.getAppliedProfile()
		EAnnotation eAnnotation = profileApplication
			.getEAnnotation(UML2_UML_PACKAGE_2_0_NS_URI);

		if (eAnnotation != null) {
			EList<EObject> references = eAnnotation.getReferences();

			if (references.size() > 0) {
				return (EPackage) references.get(0);
			}
		}

		return null;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the definition (Ecore representation) of the specified named element in the profile associated with this profile application.
	 * @param profileApplication The receiving '<em><b>Profile Application</b></em>' model object.
	 * @param namedElement The named element for which to retrieve the applied definition.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	/*
	public static ENamedElement getAppliedDefinition(
			ProfileApplication profileApplication, NamedElement namedElement) {
		return ProfileOperations.getDefinition(profileApplication
			.getAppliedProfile(), namedElement, 
			getAppliedDefinition(profileApplication));
//		profileApplication.getAppliedDefinition());
	}
	*/

} // ProfileApplicationOperations
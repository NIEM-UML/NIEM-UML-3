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
 * $Id: DeploymentTargetOperations.java,v 1.9 2007/05/03 21:11:51 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Manifestation;
//import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.metadata.MdartifactsPackage;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.DeployedArtifact;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.Deployment;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.DeploymentTarget;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.metadata.MdnodesPackage;
/*
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Deployment Target</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DeploymentTarget#getDeployedElements() <em>Get Deployed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentTargetOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)
	 * @param deploymentTarget The receiving '<em><b>Deployment Target</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<PackageableElement> getDeployedElements(
			DeploymentTarget deploymentTarget) {
		EList<PackageableElement> deployedElements = new UniqueEList.FastCompare<PackageableElement>();

		for (Deployment deployment : deploymentTarget.getDeployment()) {

			for (DeployedArtifact deployedArtifact : deployment
				.getDeployedArtifact()) {

				if (deployedArtifact instanceof Artifact) {

					for (Manifestation manifestation : ((Artifact) deployedArtifact)
						.getManifestation()) {

						PackageableElement utilizedElement = (PackageableElement) manifestation
							.eGet(
									UMLPackage.Literals.MANIFESTATION__UTILIZED_ELEMENT,
								false);

						if (utilizedElement != null) {
							deployedElements.add(utilizedElement);
						}
					}
				}
			}
		}

		return new UnionEObjectEList<PackageableElement>(
			(InternalEObject) deploymentTarget,
			UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
			deployedElements.size(), deployedElements.toArray());
	}

} // DeploymentTargetOperations
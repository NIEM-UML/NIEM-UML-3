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
 * $Id: RedefinableElementOperations.java,v 1.10 2007/05/03 21:11:52 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.RedefinableTemplateSignature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.RedefinableElement;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Region;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.StateMachine;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition;
/*
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Redefinable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableElementOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one of the redefinition contexts of the redefining element must be a specialization of at least one of the redefinition contexts for each redefined element.
	 * self.redefinedElement->forAll(e | self.isRedefinitionContextValid(e))
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionContextValid(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (RedefinableElement redefinedElement : redefinableElement
			.getRedefinedElement()) {

			if (!RedefinableElementOperations.isRedefinitionContextValid(redefinableElement,redefinedElement)) {
//			if (!redefinableElement.isRedefinitionContextValid(redefinedElement)) {

				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID,
							NIEMResourceLoader.INSTANCE
								.getString(
									"_UI_RedefinableElement_RedefinitionContextValid_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										redefinableElement, redefinedElement)),
							new Object[]{redefinableElement, redefinedElement}));
				}
			}
		}

		return result;
	}
	static protected Collection<RedefinableElement> getRedefinedProperties(Property redefinee){
		// includes explicit redefinition plus implicit redefinition via name
		Collection<RedefinableElement> properties=new HashSet<RedefinableElement>();
		properties.addAll(redefinee.getRedefinedProperty());
		if(redefinee.getOwner() instanceof Classifier){// tjd: sometimes this is Property
			Classifier owner=(Classifier)redefinee.getOwner();
			// tjd: do not check property holders
			if(!NIEMHelper.isPropertyHolder(owner))
				// tjd: or choice property
			if(!NIEMHelper.isChoice(owner))	
			for(Classifier general:ClassifierOperations.allParents(owner)){
				Property redefined=ClassifierOperations.getAttribute(general,redefinee.getName(),null);
				if(redefined!=null){
					properties.add(redefined);
				}
			}
		}
		return properties;
	}
	static protected Collection<RedefinableElement> getRedefinedElement(RedefinableElement redefinableElement){
		// includes explicit redefinition plus implicit redefinition via name
		if(Property.class.isInstance(redefinableElement)){
			return getRedefinedProperties((Property)redefinableElement);
		}
		return redefinableElement.getRedefinedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefining element must be consistent with each redefined element.
	 * self.redefinedElement->forAll(re | re.isConsistentWith(self))
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionConsistent(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (RedefinableElement redefinedElement : getRedefinedElement(redefinableElement)) {

			if (!isConsistentWith(redefinedElement,redefinableElement)) {
				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
							NIEMResourceLoader.INSTANCE
								.getString(
									"_UI_RedefinableElement_RedefinitionConsistent_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										redefinableElement, redefinedElement)),
							new Object[]{redefinableElement, redefinedElement}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of this RedefinableElement are properly related to the redefinition contexts of the specified RedefinableElement to allow this element to redefine the other. By default at least one of the redefinition contexts of this element must be a specialization of at least one of the redefinition contexts of the specified element.
	 * result = redefinitionContext->exists(c | c.allParents()->includes(redefined.redefinitionContext)))
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(
			RedefinableElement redefinableElement,
			RedefinableElement redefinable) {
		if(State.class.isInstance(redefinableElement)&&State.class.isInstance(redefinable))return StateOperations.isRedefinitionContextValid((State)redefinableElement,(State)redefinable);
		if(StateMachine.class.isInstance(redefinableElement)&&StateMachine.class.isInstance(redefinable))return StateMachineOperations.isRedefinitionContextValid((StateMachine)redefinableElement,(StateMachine)redefinable);
		if(Region.class.isInstance(redefinableElement)&&Region.class.isInstance(redefinable))return RegionOperations.isRedefinitionContextValid((Region)redefinableElement,(Region)redefinable);
		Collection<Classifier> rRedefinitionContexts = redefinable
			.getRedefinitionContext();

		for (Classifier reRedefinitionContext : redefinableElement
			.getRedefinitionContext()) {

			EList<Classifier> reRedefinitionContextAllParents = ClassifierOperations.allParents(reRedefinitionContext);

			for (Classifier rRedefinitionContext : rRedefinitionContexts) {

				if (reRedefinitionContextAllParents
					.contains(rRedefinitionContext)) {

					return true;
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context in which redefinition is possible, whether redefinition would be logically consistent. By default, this is false; this operation must be overridden for subclasses of RedefinableElement to define the consistency conditions.
	 * redefinee.isRedefinitionContextValid(self)
	 * result = false
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(
			RedefinableElement redefinableElement, RedefinableElement redefinee) {
		if(Operation.class.isInstance(redefinableElement))return OperationOperations.isConsistentWith((Operation)redefinableElement, redefinee);
		if(Property.class.isInstance(redefinableElement))return PropertyOperations.isConsistentWith((Property)redefinableElement, redefinee);
		if(RedefinableTemplateSignature.class.isInstance(redefinableElement))return RedefinableTemplateSignatureOperations.isConsistentWith((RedefinableTemplateSignature)redefinableElement, redefinee);
		if(Region.class.isInstance(redefinableElement))return RegionOperations.isConsistentWith((Region)redefinableElement, redefinee);
		if(StateMachine.class.isInstance(redefinableElement))return StateMachineOperations.isConsistentWith((StateMachine)redefinableElement, redefinee);
		if(State.class.isInstance(redefinableElement))return StateOperations.isConsistentWith((State)redefinableElement, redefinee);
		if(Transition.class.isInstance(redefinableElement))return TransitionOperations.isConsistentWith((Transition)redefinableElement, redefinee);
		return false;
	}

	protected static EList<RedefinableElement> getAllRedefinedElements(
			RedefinableElement redefinableElement,
			EList<RedefinableElement> allRedefinedElements) {

		for (RedefinableElement redefinedElement : redefinableElement
			.getRedefinedElement()) {

			if (allRedefinedElements.add(redefinedElement)) {
				getAllRedefinedElements(redefinedElement, allRedefinedElements);
			}
		}

		return allRedefinedElements;
	}

	protected static EList<RedefinableElement> getAllRedefinedElements(
			RedefinableElement redefinableElement) {
		return getAllRedefinedElements(redefinableElement,
			new UniqueEList.FastCompare<RedefinableElement>());
	}

	protected static <E extends Element> EList<E> excludeRedefinedElements(
			EList<E> redefineableElements) {
		EList<RedefinableElement> allRedefinedElements = new UniqueEList.FastCompare<RedefinableElement>();

		for (Element redefinableElement : redefineableElements) {

			if (redefinableElement instanceof RedefinableElement) {
				getAllRedefinedElements(
					(RedefinableElement) redefinableElement,
					allRedefinedElements);
			}
		}

		for (Iterator<?> re = redefineableElements.iterator(); re.hasNext();) {

			if (allRedefinedElements.contains(re.next())) {
				re.remove();
			}
		}

		return redefineableElements;
	}

} // RedefinableElementOperations

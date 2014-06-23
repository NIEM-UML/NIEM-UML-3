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
 * $Id: ClassifierOperations.java,v 1.22 2008/04/28 17:44:48 jbruck Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.eclipse.uml2.uml.Usage;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validation.NIEMResourceLoader;
import org.modeldriven.magicdraw.niem.validation.UMLValidator;

import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Substitution;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesPackage;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
/*
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateGeneralizationHierarchies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Generalization Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maps To Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperations() <em>Get Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllOperations() <em>Get All Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>Get Generals</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers() <em>Get Inherited Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Classifier) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allParents() <em>All Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierOperations
		extends NamespaceOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierOperations() {
		super();
	}
	static public Property getAttribute(Classifier classifier,String name, Type type) {
		return getAttribute(classifier,name, type, false, null);
	}
	static public Property getAttribute(Classifier classifier,String name, Type type, boolean ignoreCase,
			EClass eClass) {
		attributeLoop : for (Property attribute : classifier.getAttribute()) {
			if (eClass != null && !eClass.isInstance(attribute))
				continue attributeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(attribute.getName())
				: name.equals(attribute.getName())))
				continue attributeLoop;
			if (type != null && !type.equals(attribute.getType()))
				continue attributeLoop;
			return attribute;
		}
		return null;
	}
	
	static public Substitution createSubstitution(Classifier classifier,String name, Classifier contract) {
		Substitution newSubstitution = (Substitution) create(UMLPackage.Literals.SUBSTITUTION);
		classifier.getSubstitution().add(newSubstitution);
		if (name != null)
			newSubstitution.setName(name);
		if (contract != null)
			newSubstitution.setContract(contract);
		return newSubstitution;
	}
	static public Substitution getSubstitution(Classifier classifier,String name, Classifier contract) {
		return getSubstitution(classifier,name, contract, false, false);
	}
	static public Substitution getSubstitution(Classifier classifier,String name, Classifier contract,
			boolean ignoreCase, boolean createOnDemand) {
		substitutionLoop : for (Substitution substitution : classifier.getSubstitution()) {
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(substitution.getName())
				: name.equals(substitution.getName())))
				continue substitutionLoop;
			if (contract != null
				&& !contract.equals(substitution.getContract()))
				continue substitutionLoop;
			return substitution;
		}
		return createOnDemand
			? createSubstitution(classifier,name, contract)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * not self.allParents()->includes(self)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNoCyclesInGeneralization(
			Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		if (ClassifierOperations.allParents(classifier).contains(classifier)) {
			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
					NIEMResourceLoader.INSTANCE.getString(
						"_UI_Classifier_NoCyclesInGeneralization_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, classifier)),
					new Object[]{classifier}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSpecializeType(Classifier classifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;

		for (Classifier parent : ClassifierOperations.parents(classifier)) {

			if (!ClassifierOperations.maySpecializeNiemType(classifier,parent)) {
				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.CLASSIFIER__SPECIALIZE_TYPE,
							NIEMResourceLoader.INSTANCE.getString(
								"_UI_Classifier_SpecializeType_diagnostic", //$NON-NLS-1$
								getMessageSubstitutions(context, classifier,
									parent)), new Object[]{classifier, parent}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * not self.allParents()->includes(self)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralizationHierarchies(
			Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.CLASSIFIER__GENERALIZATION_HIERARCHIES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateGeneralizationHierarchies", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses.
	 * true
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMapsToGeneralizationSet(
			Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
						UMLValidator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMapsToGeneralizationSet", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{classifier}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the attributes of this classifier, including those inherited from its parents.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Property> getAllAttributes(Classifier classifier) {
		EList<Property> allAttributes = new UniqueEList.FastCompare<Property>();

		for (Feature feature : ClassifierOperations.allFeatures(classifier)) {

			if (feature instanceof Property) {
				allAttributes.add((Property) feature);
			}
		}

		return ECollections.unmodifiableEList(allAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the operations of this classifier.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Operation> getOperations(Classifier classifier) {
		EList<Operation> operations = new UniqueEList.FastCompare<Operation>();

		for (Feature feature : classifier.getFeature()) {

			if (feature instanceof Operation) {
				operations.add((Operation) feature);
			}
		}

		return ECollections.unmodifiableEList(operations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the operations of this classifier, including those inherited from its parents.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Operation> getAllOperations(Classifier classifier) {
		EList<Operation> allOperations = new UniqueEList.FastCompare<Operation>();

		for (Feature feature : ClassifierOperations.allFeatures(classifier)) {

			if (feature instanceof Operation) {
				allOperations.add((Operation) feature);
			}
		}

		return ECollections.unmodifiableEList(allOperations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation getOperation(Classifier classifier, String name,
			EList<String> parameterNames, EList<Type> parameterTypes) {
		return ClassifierOperations.getOperation(classifier,name, parameterNames, parameterTypes,
			false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier, ignoring case if indicated.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * @param ignoreCase Whether to ignore case in String comparisons.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Operation getOperation(Classifier classifier, String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			boolean ignoreCase) {
		operationLoop : for (Operation operation : ClassifierOperations.getOperations(classifier)) {

			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(operation.getName())
				: name.equals(operation.getName())))

				continue operationLoop;

			List<Parameter> ownedParameterList = operation
				.getOwnedParameter();
			int ownedParameterListSize = ownedParameterList.size();

			if (parameterNames != null
				&& parameterNames.size() != ownedParameterListSize
				|| (parameterTypes != null && parameterTypes.size() != ownedParameterListSize))

				continue operationLoop;

			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);

				if (parameterNames != null
					&& !(ignoreCase
						? parameterNames.get(j).equalsIgnoreCase(
							ownedParameter.getName())
						: parameterNames.get(j)
							.equals(ownedParameter.getName())))

					continue operationLoop;

				if (parameterTypes != null
					&& !parameterTypes.get(j).equals(ownedParameter.getType()))

					continue operationLoop;
			}

			return operation;
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this classifier has a usage dependency.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getUsedInterfaces(Classifier classifier) {
		return getUsedInterfaces(classifier,
			new UniqueEList.FastCompare<Interface>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this classifier or any of its parents has a usage dependency.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Interface> getAllUsedInterfaces(Classifier classifier) {
		return getAllUsedInterfaces(classifier,
			new UniqueEList.FastCompare<Interface>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = self.oclIsKindOf(c.oclType)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean maySpecializeType(Classifier classifier, Classifier c) {
		// allow datatype to specialize primitiveType via restriction
		return c.eClass().isSuperTypeOf(classifier.eClass());
	}
	public static boolean maySpecializeNiemType(Classifier classifier, Classifier c) {
		// allow datatype to specialize primitiveType via restriction
		if((classifier.getGeneralization().size()==0)&&(classifier instanceof DataType)&&(c instanceof PrimitiveType)){
			return true;
		}
		return maySpecializeType(classifier,c);
	}

	protected static class GeneralEList
			extends DerivedSubsetEObjectEList<Object> {

		protected GeneralEList(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		@Override
		public List<Object> basicList() {
			return new GeneralEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				@Override
				public ListIterator<Object> listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		@Override
		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}

		@Override
		protected Object derive(Object object) {
			return ((Generalization) object).getGeneral();
		}

		@Override
		protected Object validate(int index, Object object) {
			Generalization generalization = UMLFactory.eINSTANCE
				.createGeneralization();
			generalization.setGeneral((Classifier) super
				.validate(index, object));
			return generalization;
		}

	}
	static public Generalization createGeneralization(Classifier classifier,Classifier general) {
		Generalization newGeneralization = (Generalization) create(UMLPackage.Literals.GENERALIZATION);
		classifier.getGeneralization().add(newGeneralization);
		if (general != null)
			newGeneralization.setGeneral(general);
		return newGeneralization;
	}

	protected static final int[] GENERAL_ESUPERSETS = new int[]{UMLPackage.CLASS__GENERALIZATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general classifiers are the classifiers referenced by the generalization relationships.
	 * result = self.parents()
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public static EList<Classifier> getGenerals(Classifier classifier) {
		return (EList<Classifier>) ((EList<?>) new GeneralEList(
			Classifier.class, (InternalEObject) classifier,
			UMLPackage.CLASSIFIER__GENERAL, GENERAL_ESUPERSETS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents.
	 * result = self.inherit(self.parents()->collect(p | p.inheritableMembers(self))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> getInheritedMembers(Classifier classifier) {
		EList<NamedElement> inheritedMembers = new UniqueEList.FastCompare<NamedElement>();

		for (Classifier parent : ClassifierOperations.parents(classifier)) {
			inheritedMembers.addAll(ClassifierOperations.inheritableMembers(parent,classifier));
		}

		EList<NamedElement> inherit = ClassifierOperations.inherit(classifier,inheritedMembers);

		return new UnionEObjectEList<NamedElement>(
			(InternalEObject) classifier,
			UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER, inherit.size(),
			inherit.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the features in the namespace of the classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * result = member->select(oclIsKindOf(Feature))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Feature> allFeatures(Classifier classifier) {
		EList<Feature> allFeatures = new UniqueEList.FastCompare<Feature>();

		for (NamedElement member : getMember(classifier)) {
//		for (NamedElement member : classifier.getMember()) {

			if (member instanceof Feature) {
				allFeatures.add((Feature) member);
			}
		}

		return ECollections.unmodifiableEList(allFeatures);
	}
	static protected Collection<NamedElement> getMember(Classifier classifier){
		// include owned NamedElements plus inherited NamedElements, if this is in an <<InformationModel>>
		if(!NIEMHelper.isInInformationModel(classifier))return classifier.getMember();
		EList<NamedElement> allFeatures = new UniqueEList.FastCompare<NamedElement>();
		allFeatures.addAll(classifier.getOwnedMember());
		allFeatures.addAll(classifier.getImportedMember());
		Classifier baseClassifier=NIEMHelper.getBaseExtensionClassifier(classifier);
		if(baseClassifier!=null)allFeatures.addAll(getMember(baseClassifier));
		return ECollections.unmodifiableEList(allFeatures);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * result = generalization.general
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Classifier> parents(Classifier classifier) {
		EList<Classifier> parents = new UniqueEList.FastCompare<Classifier>();
// tjd: for niem-uml, use base
		if(NIEMHelper.isInInformationModel(classifier)&&!NIEMHelper.isPropertyHolder(classifier)){
			Classifier base=NIEMHelper.getBaseClassifier(classifier);
			if(base!=null)parents.add(base);
		}else{
		for (Generalization generalization : classifier.getGeneralization()) {
			Classifier general = generalization.getGeneral();

			if (general != null) {
				parents.add(general);
			}
		}
		}
		return ECollections.unmodifiableEList(parents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * c.allParents()->includes(self)
	 * result = member->select(m | c.hasVisibilityOf(m))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> inheritableMembers(Classifier classifier,
			Classifier c) {
		EList<NamedElement> inheritableMembers = new UniqueEList.FastCompare<NamedElement>();

		if (c == classifier || !ClassifierOperations.allParents(c).contains(classifier)
			|| ClassifierOperations.allParents(classifier).contains(c)) {

			return inheritableMembers;
		}

		for (NamedElement member : classifier.getMember()) {

			if (ClassifierOperations.hasVisibilityOf(c,member)) {
				inheritableMembers.add(member);
			}
		}

		return ECollections.unmodifiableEList(inheritableMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a named element is visible in the classifier. By default all are visible. It is only called when the argument is something owned by a parent.
	 * self.allParents()->collect(c | c.member)->includes(n)
	 * result = if (self.inheritedMember->includes(n)) then (n.visibility <> #private) else true
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean hasVisibilityOf(Classifier classifier, NamedElement n) {

		for (Classifier parent : ClassifierOperations.allParents(classifier)) {

			if (parent != classifier
				&& !ClassifierOperations.allParents(parent).contains(classifier)
				&& parent.getMember().contains(n)) {
				return n.getVisibility() != VisibilityKindEnum.PRIVATE;
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a classifier that defines a type that conforms to another. This is used, for example, in the specification of signature conformance for operations.
	 * result = (self=other) or (self.allParents()->includes(other))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean conformsTo(Classifier classifier, Classifier other) {
		return classifier == other || ClassifierOperations.allParents(classifier).contains(other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * The query inherit() defines how to inherit a set of elements. Here the operation is defined to inherit them all. It is intended to be redefined in circumstances where inheritance is affected by redefinition.
	 * result = inhs
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<NamedElement> inherit(Classifier classifier,
			EList<NamedElement> inhs) {
		return ECollections.unmodifiableEList(inhs);
	}

	protected static EList<Classifier> allParents(Classifier classifier,
			EList<Classifier> allParents) {

		for (Classifier parent : ClassifierOperations.parents(classifier)) {

			if (allParents.add(parent)) {
				allParents(parent, allParents);
			}
		}

		return allParents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * result = self.parents()->union(self.parents()->collect(p | p.allParents())
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Classifier> allParents(Classifier classifier) {
		return ECollections.unmodifiableEList(allParents(classifier,
			new UniqueEList.FastCompare<Classifier>()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this templateable element is actually a template.
	 * result = oclAsType(TemplatableElement).isTemplate() or general->exists(g | g.isTemplate())
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isTemplate(Classifier classifier) {

		if (classifier.getOwnedTemplateSignature() == null) {

			for (Classifier parent : ClassifierOperations.allParents(classifier)) {

				if (parent.getOwnedTemplateSignature() != null) {
					return true;
				}
			}

			return false;
		}

		return true;
	}

	protected static EList<Interface> getUsedInterfaces(Classifier classifier,
			EList<Interface> usedInterfaces) {

		for (Dependency clientDependency : classifier.getClientDependency()) {

			if (clientDependency instanceof Usage) {

				for (NamedElement supplier : clientDependency.getSupplier()) {

					if (supplier instanceof Interface) {
						usedInterfaces.add((Interface) supplier);
					}
				}
			}
		}

		return usedInterfaces;
	}

	protected static EList<Interface> getAllUsedInterfaces(
			Classifier classifier, EList<Interface> allUsedInterfaces) {
		getUsedInterfaces(classifier, allUsedInterfaces);

		for (Classifier parent : ClassifierOperations.allParents(classifier)) {
			getUsedInterfaces(parent, allUsedInterfaces);
		}

		return allUsedInterfaces;
	}
	public static EList<Classifier> specific(Classifier classifier) {
		EList<Classifier> specifics = new UniqueEList.FastCompare<Classifier>();

		for (DirectedRelationship directedRelationship : getTargetDirectedRelationships(classifier)) {
			if(!Generalization.class.isInstance(directedRelationship))continue;
			specifics.add(((Generalization)directedRelationship).getSpecific());
		}
		return ECollections.unmodifiableEList(specifics);
	}

} // ClassifierOperations
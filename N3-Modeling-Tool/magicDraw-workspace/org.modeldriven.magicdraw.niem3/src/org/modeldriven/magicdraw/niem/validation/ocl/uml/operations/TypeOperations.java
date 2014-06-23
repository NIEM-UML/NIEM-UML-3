/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *
 * $Id: TypeOperations.java,v 1.17 2008/01/09 18:56:10 khussey Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl.uml.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLSwitch;

//import com.nomagic.magicdraw.properties.Property;
//import com.io_software.catools.tas.mof.model.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Signal;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.StructuredClassifier;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
/*
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLSwitch;
*/
/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Type#createAssociation(boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int, org.eclipse.uml2.uml.Type, boolean, org.eclipse.uml2.uml.AggregationKind, java.lang.String, int, int) <em>Create Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Type#getAssociations() <em>Get Associations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Type#conformsTo(org.eclipse.uml2.uml.Type) <em>Conforms To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOperations() {
		super();
	}

	protected static void validateTypeAndBounds(Type type, int lower, int upper) {

		if (type == null) {
			throw new IllegalArgumentException(String.valueOf(type));
		}

		if (lower < 0) {
			throw new IllegalArgumentException(String.valueOf(lower));
		}

		if (upper != LiteralUnlimitedNaturalOperations.UNLIMITED
			&& (upper == 0 || upper < lower)) {

			throw new IllegalArgumentException(String.valueOf(upper));
		}
	}

	protected static Property createOwnedProperty(Type type, final String name,
			final Type propertyType, int lower, int upper) {
		Property ownedProperty = new UMLSwitch<Property>() {

			@Override
			public Property caseArtifact(Artifact artifact) {
//				return artifact.createOwnedAttribute(name, propertyType);
				return ArtifactOperations.createOwnedAttribute(artifact,name, propertyType);
			}

			@Override
			public Property caseAssociation(Association association) {
//				return association.createOwnedEnd(name, propertyType);
				return AssociationOperations.createOwnedEnd(association,name, propertyType);
			}

			@Override
			public Property caseAssociationClass(
					AssociationClass associationClass) {
//				return associationClass.createOwnedAttribute(name, propertyType);
				return AssociationClassOperations.createOwnedAttribute(associationClass,name, propertyType);
			}

			@Override
			public Property caseDataType(DataType dataType) {
//				return dataType.createOwnedAttribute(name, propertyType);
				return DataTypeOperations.createOwnedAttribute(dataType,name, propertyType);
			}

			@Override
			public Property caseInterface(Interface interface_) {
//				return interface_.createOwnedAttribute(name, propertyType);
				return InterfaceOperations.createOwnedAttribute(interface_,name, propertyType);
			}

			@Override
			public Property caseSignal(Signal signal) {
//				return signal.createOwnedAttribute(name, propertyType);
				return SignalOperations.createOwnedAttribute(signal,name, propertyType);
			}

			@Override
			public Property caseStructuredClassifier(
					StructuredClassifier structuredClassifier) {
//				return structuredClassifier.createOwnedAttribute(name,
				return StructuredClassifierOperations.createOwnedAttribute(structuredClassifier,name,
					propertyType);
			}
		}.doSwitch(type);

//		ownedProperty.setLower(lower);
//		ownedProperty.setUpper(upper);
		MultiplicityElementOperations.setLower(ownedProperty,lower);
		MultiplicityElementOperations.setUpper(ownedProperty,upper);

		return ownedProperty;
	}

	public static Property createOwnedAttribute(Type type, String name,
			Type attributeType, int lower, int upper) {

		if (getOwnedAttributes(type) == null) {
			throw new UnsupportedOperationException();
		}

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		validateTypeAndBounds(attributeType, lower, upper);

		return createOwnedProperty(type, name, attributeType, lower, upper);
	}

	protected static Property createAssociationEnd(Type type,
			Association association, boolean isNavigable,
			AggregationKind aggregation, String name, int lower, int upper,
			Type endType) {
		EList<Property> ownedAttributes = getOwnedAttributes(type);
		Property associationEnd = createOwnedProperty(ownedAttributes == null
			|| !isNavigable
			? association
			: type, name, endType, lower, upper);

		associationEnd.setAggregation(aggregation);

		if (isNavigable) {

			if (ownedAttributes == null) {
				association.getNavigableOwnedEnd().add(associationEnd);
			} else {
				association.getMemberEnd().add(associationEnd);
			}
		}

		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (binary) association between this type and the specified other type, with the specified navigabilities, aggregations, names, lower bounds, and upper bounds, and owned by this type's nearest package.
	 * @param type The receiving '<em><b>Type</b></em>' model object.
	 * @param end1IsNavigable The navigability for the first end of the new association.
	 * @param end1Aggregation The aggregation for the first end of the new association.
	 * @param end1Name The name for the first end of the new association.
	 * @param end1Lower The lower bound for the first end of the new association.
	 * @param end1Upper The upper bound for the first end of the new association.
	 * @param end1Type The type for the first end of the new association.
	 * @param end2IsNavigable The navigability for the second end of the new association.
	 * @param end2Aggregation The aggregation for the second end of the new association.
	 * @param end2Name The name for the second end of the new association.
	 * @param end2Lower The lower bound for the second end of the new association.
	 * @param end2Upper The upper bound for the second end of the new association.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Association createAssociation(Type type,
			boolean end1IsNavigable, AggregationKind end1Aggregation,
			String end1Name, int end1Lower, int end1Upper, Type end1Type,
			boolean end2IsNavigable, AggregationKind end2Aggregation,
			String end2Name, int end2Lower, int end2Upper) {
		return createAssociation(type, end1IsNavigable, end1Aggregation,
			end1Name, end1Lower, end1Upper, end1Type, end2IsNavigable,
			end2Aggregation, end2Name, end2Lower, end2Upper,
			UMLPackage.Literals.ASSOCIATION);
	}

	protected static Association createAssociation(Type type,
			boolean end1IsNavigable, AggregationKind end1Aggregation,
			String end1Name, int end1Lower, int end1Upper, Type end1Type,
			boolean end2IsNavigable, AggregationKind end2Aggregation,
			String end2Name, int end2Lower, int end2Upper, EClass eClass) {
		validateTypeAndBounds(end1Type, end1Lower, end1Upper);

		validateTypeAndBounds(type, end2Lower, end2Upper);

		Package package_ = ElementOperations.getNearestPackage(type);

		if (package_ == null) {
			throw new IllegalStateException();
		}

		if (end1Aggregation == null) {
			throw new IllegalArgumentException(String.valueOf(end1Aggregation));
		}

		if (end2Aggregation == null) {
			throw new IllegalArgumentException(String.valueOf(end2Aggregation));
		}

//		Association association = (Association) package_.createOwnedType(null,
		Association association = (Association) PackageOperations.createOwnedType(package_,null,
			eClass);

		createAssociationEnd(type, association, end1IsNavigable,
			end1Aggregation, end1Name, end1Lower, end1Upper, end1Type);

		createAssociationEnd(end1Type, association, end2IsNavigable,
			end2Aggregation, end2Name, end2Lower, end2Upper, type);

		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the associations in which this type is involved.
	 * @param type The receiving '<em><b>Type</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList<Association> getAssociations(Type type) {
		EList<Association> associations = new UniqueEList.FastCompare<Association>();

		for (EStructuralFeature.Setting nonNavigableInverseReference : getNonNavigableInverseReferences(type)) {

			if (nonNavigableInverseReference.getEStructuralFeature() == UMLPackage.Literals.TYPED_ELEMENT__TYPE) {
				EObject eObject = nonNavigableInverseReference.getEObject();

				if (eObject instanceof Property) {
					Association association = ((Property) eObject)
						.getAssociation();

					if (association != null) {
						associations.add(association);
					}
				}
			}
		}

		return ECollections.unmodifiableEList(associations);
	}

	public static Operation createOwnedOperation(Type type, final String name,
			final EList<String> parameterNames,
			final EList<Type> parameterTypes, Type returnType) {
/*
		if (getOwnedOperations(type) == null) {
			throw new UnsupportedOperationException();
		}
*/
		Operation ownedOperation = new UMLSwitch<Operation>() {

			@Override
			public Operation caseArtifact(Artifact artifact) {
//				return artifact.createOwnedOperation(name, parameterNames,
				return ArtifactOperations.createOwnedOperation(artifact,name, parameterNames,
					parameterTypes);
			}

			@Override
			public Operation caseClass(Class class_) {
//				return class_.createOwnedOperation(name, parameterNames,
				return ClassOperations.createOwnedOperation(class_,name, parameterNames,
					parameterTypes);
			}

			@Override
			public Operation caseDataType(DataType dataType) {
//				return dataType.createOwnedOperation(name, parameterNames,
				return DataTypeOperations.createOwnedOperation(dataType,name, parameterNames,
					parameterTypes);
			}

			@Override
			public Operation caseInterface(Interface interface_) {
//				return interface_.createOwnedOperation(name, parameterNames,
				return InterfaceOperations.createOwnedOperation(interface_,name, parameterNames,
					parameterTypes);
			}
		}.doSwitch(type);

		if (returnType != null) {
//			ownedOperation.createReturnResult(null, returnType);
			OperationOperations.createReturnResult(ownedOperation,null, returnType);
		}

		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a type that conforms to another. By default, two types do not conform to each other. This query is intended to be redefined for specific conformance situations.
	 * result = false
	 * @param type The receiving '<em><b>Type</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean conformsTo(Type type, Type other) {
		if(Classifier.class.isInstance(type)&&Classifier.class.isInstance(other))return ClassifierOperations.conformsTo((Classifier)type,(Classifier)other);
		return false;
	}

} // TypeOperations
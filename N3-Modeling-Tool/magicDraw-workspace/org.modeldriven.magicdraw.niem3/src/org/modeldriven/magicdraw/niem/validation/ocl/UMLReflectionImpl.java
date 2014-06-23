/**
 * <copyright>
 *
 * Copyright (c) 2006, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 245897
 *	 E.D.Willink Bug 298128
 *
 * </copyright>
 *
 * $Id: UMLReflectionImpl.java,v 1.2 2010/02/08 20:57:13 ewillink Exp $
 */

package org.modeldriven.magicdraw.niem.validation.ocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.types.BagType;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.types.OrderedSetType;
import org.eclipse.ocl.types.PrimitiveType;
import org.eclipse.ocl.types.SequenceType;
import org.eclipse.ocl.types.SetType;
/*
import org.eclipse.ocl.uml.UMLEnvironment;
import org.eclipse.ocl.uml.options.UMLParsingOptions;
import org.eclipse.ocl.uml.util.OCLUMLUtil;
*/
import org.eclipse.ocl.util.ObjectUtil;
//import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.OCLFactory;
import org.eclipse.ocl.utilities.UMLReflection;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.BehavioralFeatureOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.BehavioredClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.EnumerationOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.MultiplicityElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.OperationOperations;
//import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
//import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.metadata.MdbasicactionsFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.impl.ConstraintImpl;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.BehavioredClassifier;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Reception;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Signal;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
/*
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLFactory;
*/
/**
 * Implementation of the UML reflection service for the UML environment.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class UMLReflectionImpl
    implements
    UMLReflection<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint> {

	private static Set<String> ECORE_INTEGER_TYPES = new java.util.HashSet<String>(
		Arrays.asList(EcorePackage.Literals.EINT.getName(),
			EcorePackage.Literals.EINTEGER_OBJECT.getName(),
			EcorePackage.Literals.ELONG.getName(),
			EcorePackage.Literals.ELONG_OBJECT.getName(),
			EcorePackage.Literals.ESHORT.getName(),
			EcorePackage.Literals.ESHORT_OBJECT.getName(),
			EcorePackage.Literals.EBIG_INTEGER.getName()));

	private static Set<String> ECORE_REAL_TYPES = new java.util.HashSet<String>(
		Arrays.asList(EcorePackage.Literals.EFLOAT.getName(),
			EcorePackage.Literals.EFLOAT_OBJECT.getName(),
			EcorePackage.Literals.EDOUBLE.getName(),
			EcorePackage.Literals.EDOUBLE_OBJECT.getName(),
			EcorePackage.Literals.EBIG_DECIMAL.getName()));

	private static Set<String> ECORE_BOOLEAN_TYPES = new java.util.HashSet<String>(
		Arrays.asList(EcorePackage.Literals.EBOOLEAN.getName(),
			EcorePackage.Literals.EBOOLEAN_OBJECT.getName()));
	
    private final UMLEnvironment env;
    
    public UMLReflectionImpl(UMLEnvironment env) {
        this.env = env;
    }
    
    final java.lang.Class<? extends Association> getAssociationClassType() {
        return env.getValue(UMLParsingOptions.ASSOCIATION_CLASS_TYPE);
    }
    
    /**
     * Default implementation just gets the name of the named element's
     * {@link org.eclipse.emf.ecore.EObject#eClass() metaclass} or, if it is a
     * {@link TypedElement}, the name of its type.
     */
    public String getDescription(Object namedElement) {
        if (namedElement instanceof TypedElement) {
            Type type = ((TypedElement) namedElement).getType();
            return (type == null) ? OCLStandardLibraryImpl.INSTANCE
                .getOclVoid().getName()
                : type.getName();
        } else if (namedElement instanceof EnumerationLiteral) {
            return ((EnumerationLiteral) namedElement).getEnumeration()
                .getName();
        } else if (namedElement == null) {
            return null;
        }

        return ((EObject) namedElement).eClass().getName();
    }
    
    public String getName(Object namedElement) {
        return (namedElement instanceof NamedElement)?
            ((NamedElement) namedElement).getName() : null;
    }
    
    public String getQualifiedName(Object namedElement) {
        return (namedElement instanceof NamedElement)?
            ((NamedElement) namedElement).getQualifiedName() : null;
    }
    protected Project getProject(){return Application.getInstance().getProject();}
    public Classifier getOCLType(Object metaElement) {
        Classifier result = null;
        //log("getOCLType "+metaElement);
        
        if (metaElement instanceof TypedElement) {
            TypedElement typedElement = (TypedElement) metaElement;
            result = (Classifier) typedElement.getType();
            if (result == null) {
                // absence of a type in UML indicates void type
                result = OCLStandardLibraryImpl.INSTANCE.getOclVoid();
            }
            
            if (isMany(typedElement)) {
                result = getOCLCollectionType(
                        result,
                        isOrdered(typedElement),
                        isUnique(typedElement));
            } else {
                result = getOCLType(result);
            }
            /*
            if(TypeExp.class.isInstance(metaElement)){
                log("getOCLType TypeExp "+((TypeExp)metaElement).getName()+" = "+result);
            }
            if(OperationCallExp.class.isInstance(metaElement)){
                log("getOCLType OperationCallExp "+((OperationCallExp)metaElement).getName()+" = "+result);
            }
            */
        } else if (metaElement instanceof Operation) {
            // Operations are not TypedElements!
            Operation operation = (Operation) metaElement;
            result = (Classifier) operation.getType();
            //System.out.println("getOCLType "+operation.getName()+", "+result);
            /*
            if("oclAsType".equals(operation.getName())){
                //log("getOCLType operation "+operation.getQualifiedName()+"("+operation.getClass().getName()+") = "+result);
                for (Parameter p : operation.getOwnedParameter()) {
            	Type pType=p.getType();
            	log("getOCLType.parameters oclAsType "+p.getName()+", "+pType.getQualifiedName()+", "+pType.getClass().getName());
                	if(TypeType.class.isInstance(pType)){
                		Classifier referredType=((TypeType)pType).getReferredType();
                    	if(referredType!=null)log("getOCLType.parameters parameter type "+referredType+" = "+referredType.getQualifiedName()+", "+referredType.getClass().getName());
                		
                	}
                }
            }
                */
            if (result == null) {
                // absence of a type in UML indicates void type
                result = OCLStandardLibraryImpl.INSTANCE.getOclVoid();
            }
            
            if (isMany(operation)) {
                result = getOCLCollectionType(
                        result,
                        isOrdered(operation),
                        isUnique(operation));
            } else {
                result = getOCLType(result);
            }
//            log("getOCLType operation "+operation.getQualifiedName()+"("+operation.getClass().getName()+") = "
//            		+result+", "+(result==null?"null":(result.getQualifiedName()+"("+result.getClass().getName()+")")));
        } else if (metaElement instanceof Classifier) {
            result = getOCLType((Classifier) metaElement);
        }
        
        return result;
    }
    
    public boolean isMany(Object metaElement) {
        if (metaElement instanceof MultiplicityElement) {
//            return ((MultiplicityElement) metaElement).isMultivalued();
            return MultiplicityElementOperations.isMultivalued((MultiplicityElement) metaElement);
        } else if (metaElement instanceof Operation) {
            int upper = ((Operation) metaElement).getUpper();
            return (upper > 1) || (upper < 0);
        }
        
        return false;
    }
    
    /**
     * Queries whether the specified {@link MultiplicityElement} or
     * {@link Operation} is unique.
     * 
     * @param metaElement a multiplicity-element or operation
     * @return whether it is unique
     */
    protected boolean isUnique(Object metaElement) {
        if (metaElement instanceof MultiplicityElement) {
            return ((MultiplicityElement) metaElement).isUnique();
        } else if (metaElement instanceof Operation) {
            return ((Operation) metaElement).isUnique();
        }
        
        return false;
    }
    
    /**
     * Queries whether the specified {@link MultiplicityElement} or
     * {@link Operation} is ordered.
     * 
     * @param metaElement a multiplicity-element or operation
     * @return whether it is ordered
     */
    protected boolean isOrdered(Object metaElement) {
        if (metaElement instanceof MultiplicityElement) {
            return ((MultiplicityElement) metaElement).isOrdered();
        } else if (metaElement instanceof Operation) {
            return ((Operation) metaElement).isOrdered();
        }
        
        return false;
    }
    
    public Classifier asOCLType(Classifier modelType) {
        Classifier result= getOCLType(modelType);
        //System.out.println("asOCLType "+modelType.getQualifiedName()+", "+result.getQualifiedName());
        return result;
//        return getOCLType(modelType);
    }
    
    public Package getNestingPackage(Package pkg) {
        return pkg.getNestingPackage();
    }
    
    public List<Package> getNestedPackages(Package pkg) {
        return new Vector(pkg.getNestedPackage());
    }
    
    public Package getPackage(Classifier classifier) {
        return ElementOperations.getNearestPackage(classifier);
    }
    
    public List<Classifier> getClassifiers(Package pkg) {
        EList<Type> types = new BasicEList<Type>(pkg.getOwnedType());
        List<Classifier> result = new java.util.ArrayList<Classifier>(types.size());
        
        for (Type t : types) {
            if (t instanceof Classifier) {
                result.add((Classifier) t);
            }
        }
        
        return result;
    }
    
    public Classifier getOwningClassifier(Object feature) {
        Classifier result = null;
        
        if (feature instanceof Feature) {
            result = (Classifier) ((Feature) feature).getOwner();
        }
        
        if (result instanceof Class) {
            Classifier shadowed = OCLStandardLibraryImpl.getRealClassifier(
                (Class) result);
            
            if (shadowed != null) {
            	/*
                log("getOwningClassifier shadowed "+(Feature.class.isInstance(feature)?
                		((Feature)feature).getQualifiedName()+"("+feature.getClass().getName()+")"
                		:feature
                		)
                		+" = "+(result==null?"null":result.getQualifiedName()+"("+result.getClass().getName()+")")
                		+" = shadow "+shadowed.getQualifiedName()+"("+shadowed.getClass().getName()+")"
                		);
                		*/
                result = shadowed;
            }
        }
        /*
        log("getOwningClassifier "+(Feature.class.isInstance(feature)?
        		((Feature)feature).getQualifiedName()+"("+feature.getClass().getName()+")"
        		:feature
        		)
        		+" = "+(result==null?"null":result.getQualifiedName()+"("+result.getClass().getName()+")")
        		);
        		*/
        return result;
    }
    
    public List<Parameter> getParameters(Operation operation) {
        List<Parameter> result = new java.util.ArrayList<Parameter>(
                operation.getOwnedParameter().size());
        
        for (Parameter p : operation.getOwnedParameter()) {
            if (p.getDirection() != ParameterDirectionKindEnum.RETURN) {
                result.add(p);
                /*
                if("oclAsType".equals(operation.getName())){
                	Type pType=p.getType();
                	log("getParameters oclAsType "+p.getName()+", "+pType.getQualifiedName()+", "+pType.getClass().getName());
                    	if(TypeType.class.isInstance(pType)){
                    		Classifier referredType=((TypeType)pType).getReferredType();
                        	if(referredType!=null)log("getParameters parameter type "+referredType+" = "+referredType.getQualifiedName()+", "+referredType.getClass().getName());
                    		
                    	}
                }
                */
            }
        }
        
        return result;
    }
    
    public Operation createOperation(String name, Classifier resultType,
            List<String> paramNames, List<Classifier> paramTypes) {
        
        Operation result = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createOperation();
        result.setName(name);
        
        // OCL can only define query operations
        result.setQuery(true);
        
        if (resultType != null) {
            OperationOperations.setType(result,resultType);
        }
        
        int i = 0;
        for (String pname : paramNames) {
            BehavioralFeatureOperations.createOwnedParameter(result,pname, paramTypes.get(i++));
        }
    	//System.out.println("createOperation -----------"+name);
        /*
        if("oclAsType".equals(name)){
        	log("createOperation "+result.getQualifiedName()+", "+resultType.getQualifiedName()+", "+resultType.getClass().getName());
        	i = 0;
            for (String pname : paramNames) {
            	Classifier pType=paramTypes.get(i++);
            	log("createOperation parameter "+pname+" = "+pType.getQualifiedName()+", "+pType.getClass().getName());
            	if(TypeType.class.isInstance(pType)){
            		Classifier referredType=((TypeType)pType).getReferredType();
                	if(referredType!=null)log("createOperation parameter type "+referredType+" = "+referredType.getQualifiedName()+", "+referredType.getClass().getName());
            		
            	}
            }
        }
       */
        
        return result;
    }
    
    public List<Operation> getOperations(Classifier classifier) {
        return OCLUMLUtil.getAllOperations(classifier);
    }
    
    public Property createProperty(String name, Classifier resultType) {
        Property result = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createProperty();
        
        result.setName(name);
        result.setType(resultType);
        
        return result;
    }
    protected static void log(String text){
    	QvtCommonAction.log(text);
    }
    
    public List<Property> getAttributes(Classifier classifier) {
    	List<Property> result=OCLUMLUtil.getAllAttributes(classifier);
    	//log("UMLReflectionImpl.getAttributes "+classifier.getQualifiedName()+", "+classifier.getClass().getName()+", "+result);
        return result;
    }
    
    public Collection<? extends Classifier> getAllSupertypes(
            Classifier classifier) {
        
        return ClassifierOperations.allParents(classifier);
    }
    
    public boolean isQuery(Operation operation) {
        return operation.isQuery();
    }
    
    public boolean isStatic(Object feature) {
        return (feature instanceof Feature) && ((Feature) feature).isStatic();
    }
    
    public boolean setIsStatic(Object feature, boolean isStatic) {
        if (!(feature instanceof Feature))
        	return false;
        ((Feature) feature).setStatic(isStatic);
        return true;
    }

    public boolean isAssociationClass(Classifier classifier) {
        return getAssociationClassType().isInstance(classifier);
    }
    
    public Classifier getAssociationClass(Property property) {
        return getAssociationClassType().isInstance(property.getAssociation())?
                property.getAssociation() : null;
    }
    
    public List<Property> getMemberEnds(Classifier associationClass) {
        if (getAssociationClassType().isInstance(associationClass)) {
            return ((Association) associationClass).getMemberEnd();
        }
        
        return Collections.emptyList();
    }

    public boolean isOperation(Object metaElement) {
        return metaElement instanceof Operation;
    }

	public boolean isPackage(Object metaElement) {
        return metaElement instanceof Package;
	}
    
    public boolean isProperty(Object metaElement) {
        return metaElement instanceof Property;
    }
    
    public boolean isClassifier(Object metaElement) {
        return metaElement instanceof Classifier;
    }
    
    public boolean isClass(Object metaElement) {
        return metaElement instanceof Class;
    }

	public boolean isConstraint(Object metaElement) {
        return metaElement instanceof Constraint;
	}
    
    public boolean isDataType(Object metaElement) {
        return metaElement instanceof DataType;
    }
    
    public boolean isStereotype(Classifier type) {
        return type instanceof Stereotype;
    }

    public Object getStereotypeApplication(Object baseElement,
            Classifier stereotype) {
        Object result = null;
        
        if (baseElement instanceof Element) {
            Element element = (Element) baseElement;
            Stereotype stereo = (Stereotype) stereotype;
            
            if (ElementOperations.isStereotypeApplied(element,stereo)) {
                result = ElementOperations.getStereotypeApplication(element,stereo);
            }
 /*
    		if (result == null) {
    			// maybe some specializing stereotype is applied?

				List<Stereotype> applied = ElementOperations.getAppliedSubstereotypes(element
					,stereo);
				if (!applied.isEmpty()) {
					return ElementOperations.getStereotypeApplication(element,applied.get(0));
				}
    		}
*/    		
       }
        
        return result;
    }

    public boolean isEnumeration(Classifier type) {
        return type instanceof Enumeration;
    }

    public Classifier getEnumeration(EnumerationLiteral enumerationLiteral) {
        return enumerationLiteral.getEnumeration();
    }

    public List<EnumerationLiteral> getEnumerationLiterals(Classifier enumerationType) {
        return ((Enumeration) enumerationType).getOwnedLiteral();
    	// extend this to generals
        /* this will not validate, so skip
    	List<EnumerationLiteral> result=new Vector<EnumerationLiteral>(((Enumeration) enumerationType).getOwnedLiteral());
		for(Classifier general:enumerationType.getGeneral()){
			if(general instanceof Enumeration){
				result.addAll(getEnumerationLiterals(general));
			}
		}
    	return result;
    	*/
    }
    
    public EnumerationLiteral getEnumerationLiteral(Classifier enumerationType,
            String literalName) {
        return EnumerationOperations.getOwnedLiteral(((Enumeration) enumerationType),literalName);
    }
    
    public boolean isComparable(Classifier type) {
        if ((type instanceof PrimitiveType<?>)
            || (ClassifierOperations.getOperation(type,"<", null, null) != null)) { //$NON-NLS-1$
            
            return true;
        }
        /*
        EClassifier eclassifier = env.getEClassifier(type, null);
        
        return (eclassifier != null)
            && Comparable.class.isAssignableFrom(eclassifier.getInstanceClass());
            */
//        Class eclassifier = StereotypesHelper.getUML2BaseClass(type);
        Class eclassifier = OCLUMLUtil.getMetaclass(type);
        
        return (eclassifier != null)
            && Comparable.class.isAssignableFrom(eclassifier.getClassType());
    }
    
    public Operation getOperation(CallOperationAction callOperationAction) {
        return callOperationAction.getOperation();
    }
    
    public Classifier getSignal(SendSignalAction sendSignalAction) {
        return sendSignalAction.getSignal();
    }
    
    public String getStereotype(Constraint constraint) {
        List<String> keywords = ElementOperations.getKeywords(constraint);
        return keywords.isEmpty()? null : keywords.get(0);
    }
    
    public void setStereotype(Constraint constraint, String stereotype) {
        // first, clear existing keywords (there wouldn't usually be any)
        for (String keyword : ElementOperations.getKeywords(constraint)) {
            ElementOperations.removeKeyword(constraint,keyword);
        }
        
        ElementOperations.addKeyword(constraint,stereotype);
    }
    
    public String getConstraintName(Constraint constraint) {
        return constraint.getName();
    }
    
    public void setConstraintName(Constraint constraint, String name) {
        constraint.setName(name);
    }
    
    public ExpressionInOCL/*<Classifier, Parameter>*/
    getSpecification(Constraint constraint) {
        
        if (constraint.getSpecification() instanceof ExpressionInOCL/*<?, ?>*/) {
            return (ExpressionInOCL) constraint.getSpecification();
        }
        
        return null;
    }
    
    public void setSpecification(
            Constraint constraint,
            org.eclipse.ocl.utilities.ExpressionInOCL<Classifier, Parameter> specification) {
        
        constraint.setSpecification(
            (ExpressionInOCL) specification);
    }
    
    public Constraint getConstraint(
    		org.eclipse.ocl.utilities.ExpressionInOCL<Classifier, Parameter>/*<Classifier, Parameter>*/ specification) {
        EObject container = specification.eContainer();
        
        if (container instanceof Constraint) {
            return (Constraint) container;
        }
        
        return null;
    }
    
    public List<Element> getConstrainedElements(Constraint constraint) {
        return constraint.getConstrainedElement();
    }

	public void addConstrainedElement(Constraint constraint, EObject constrainedElement) {
		constraint.getConstrainedElement().add((Element) constrainedElement);
	}
    
    public List<Property> getQualifiers(Property property) {
        return property.getQualifier();
    }

    public Classifier getCommonSuperType(Classifier type1, Classifier type2) {
    
        if (ObjectUtil.equal(type1, type2)) {
            return type2;
        }
        
        if (ClassifierOperations.conformsTo(type1,type2)) {
            return type2;
        }
        if (ClassifierOperations.conformsTo(type2,type1)) {
            return type1;
        }
        List<Classifier> type1Ancestors = new ArrayList<Classifier>(
        		ClassifierOperations.allParents(type1));
        
        List<Classifier> type2Ancestors = new ArrayList<Classifier>(
        		ClassifierOperations.allParents(type2));
        
        type1Ancestors.retainAll(type2Ancestors);
        if (!type1Ancestors.isEmpty()) {
            // the least common ancestor type will be the first, because UML
            //   computes the ancestors starting with the immediate parents
            return type1Ancestors.get(0);
        }
    
        return null;
    }

    public int getRelationship(Classifier type1, Classifier type2) {
        if (ObjectUtil.equal(type1, type2)) {
            return SAME_TYPE;
        }
        
        if (ClassifierOperations.conformsTo(type2,type1)) {
            return STRICT_SUPERTYPE;
        } else if (ClassifierOperations.conformsTo(type1,type2)) {
            return STRICT_SUBTYPE;
        } else if ((type2 instanceof BehavioredClassifier) && (type1 instanceof Interface)) {
            for (Interface i : BehavioredClassifierOperations.getAllImplementedInterfaces((BehavioredClassifier) type2)) {
                if (ClassifierOperations.conformsTo(i,type1)) {
                    return STRICT_SUPERTYPE;
                }
            }
        } else if ((type1 instanceof BehavioredClassifier) && (type2 instanceof Interface)) {
            for (Interface i : BehavioredClassifierOperations.getAllImplementedInterfaces(((BehavioredClassifier) type1))) {
                if (ClassifierOperations.conformsTo(i,type2)) {
                    return STRICT_SUBTYPE;
                }
            }
        }
    
        return UNRELATED_TYPE;
    }

    /**
     * Translator from primitive UML types to OCL types
     * 
     * @param dataType a data type in the UML metamodel
     * @return the corresponding OCL classifier
     */
    private Classifier getOCLTypeFor(DataType dataType) {
    
        // First check if it is already an OCL data type (Enumerations represent
        //    themselves)
        if (dataType instanceof Enumeration) {
            return dataType;
        }
        if (dataType instanceof CollectionType<?, ?>) {
            return dataType;
        }
        if (dataType instanceof PrimitiveType<?>) {
            return dataType;
        }
    
        if (dataType instanceof com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType) {
            // Boolean -> OCL_BOOLEAN
//            if (PrimitiveType.BOOLEAN_NAME.equals(dataType.getName())) {
            if (PrimitiveType.BOOLEAN_NAME.equalsIgnoreCase(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getBoolean();
            } else if (PrimitiveType.REAL_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getReal();
//            } else if (PrimitiveType.STRING_NAME.equals(dataType.getName())) {
            } else if (PrimitiveType.STRING_NAME.equalsIgnoreCase(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getString();
//            } else if (PrimitiveType.INTEGER_NAME.equals(dataType.getName())) {
            } else if (PrimitiveType.INTEGER_NAME.equalsIgnoreCase(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getInteger();
            } else if (PrimitiveType.UNLIMITED_NATURAL_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getUnlimitedNatural();
            } else if (SequenceType.SINGLETON_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getSequence();
            } else if (SetType.SINGLETON_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getSet();
            } else if (BagType.SINGLETON_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getBag();
            } else if (OrderedSetType.SINGLETON_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getOrderedSet();
            } else if (CollectionType.SINGLETON_NAME.equals(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getCollection();
            } else if ("Object".equals(dataType.getName())) { //$NON-NLS-1$
                return OCLStandardLibraryImpl.INSTANCE.getOclAny();
            } else if (ECORE_INTEGER_TYPES.contains(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getInteger();
            } else if (ECORE_REAL_TYPES.contains(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getReal();
            } else if (ECORE_BOOLEAN_TYPES.contains(dataType.getName())) {
                return OCLStandardLibraryImpl.INSTANCE.getBoolean();
            } else if ("EString".equals(dataType.getName())) { //$NON-NLS-1$
                return OCLStandardLibraryImpl.INSTANCE.getString();
            }
        }
        
        // All other data types map to themselves
        return dataType;
    }

    /**
     * Obtains the appropriate OCL type for a {@link Classifier}, if it
     * corresponds to an OCL primitive type.
     * 
     * @param type the type to convert to an OCL type
     * @return the corresponding OCL type
     */ 
    Classifier getOCLType(Classifier type) {
        Classifier resultType = type;
    
        if (resultType instanceof DataType) {
            resultType = getOCLTypeFor((DataType) resultType);
            /*
            if("Boolean".equals(type.getName())){
            log("getOCLType "+type+" "+type.getQualifiedName()+"("+type.getClass().getName()
            		+")"+type.hashCode()+" = "+resultType+" "+resultType.getQualifiedName()+"("+resultType.getClass().getName()
            		+")"+resultType.hashCode()+", "
            		+(resultType==OCLStandardLibraryImpl.INSTANCE.getBoolean())
            		);
            }
            */
        }
        return resultType;
    }

    /**
     * Obtains the appropriate OCL collection type for a {@link Classifier}, 
     * according to the collection's orderedness and uniqueness.  The mapping is
     * as follows:
     * <ul>
     *   <li>ordered, unique: ordered set type</li>
     *   <li>ordered, non-unique: sequence type</li>
     *   <li>non-ordered, unique: set type</li>
     *   <li>non-ordered, non-unique: bag type</li>
     * </ul>
     * <p>
     * Note that the collection's element <code>type</code> is mapped to an
     * OCL primitive type where possible.
     * </p>
     * 
     * @param type the type to get the corresponding OCL collection type for
     * @param isOrdered whether the OCL type should be ordered
     * @param isUnique whether the OCL type should be unique
     * 
     * @return the corresponding OCL type
     * 
     * @see #getOCLType(Classifier)
     */ 
    Classifier getOCLCollectionType(Classifier type,
            boolean isOrdered, boolean isUnique) {
        Classifier resultType = type;
    
        if (resultType instanceof DataType) {
            resultType = getOCLTypeFor((DataType) resultType);
        }
        
        OCLFactory oclFactory = OCLFactoryImpl.INSTANCE;
        
        if (isOrdered) {
            if (isUnique) {
                resultType = (Classifier) oclFactory.createOrderedSetType(resultType);
            } else {
                resultType = (Classifier) oclFactory.createSequenceType(resultType);
            }
        } else {
            if (isUnique) {
                resultType = (Classifier) oclFactory.createSetType(resultType);
            } else {
                resultType = (Classifier) oclFactory.createBagType(resultType);
            }
        }
        
        return resultType;
    }

    public List<Classifier> getSignals(Classifier owner) {
        if (owner instanceof Class) {
            List<Reception> receptions = OCLUMLUtil.getAllReceptions((Class) owner);
            
            if (!receptions.isEmpty()) {
                List<Classifier> result = new java.util.ArrayList<Classifier>(
                        receptions.size());
                
                for (Reception r : receptions) {
                    if (r.getSignal() != null) {
                        result.add(r.getSignal());
                    }
                }
                
                return result;
            }
        }
        
        return Collections.emptyList();
    }

    public CallOperationAction createCallOperationAction(Operation operation) {
        CallOperationAction result = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createCallOperationAction();
        result.setOperation(operation);
        return result;
    }

    public SendSignalAction createSendSignalAction(Classifier signal) {
        SendSignalAction result = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createSendSignalAction();
        result.setSignal((Signal) signal);
        return result;
    }

    public Constraint createConstraint() {
    	//return new ConstraintImpl();
     return com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createConstraint();
    }

    public ExpressionInOCL/*<Classifier, Parameter>*/ createExpressionInOCL() {
        return UMLFactory.eINSTANCE.createExpressionInOCL();
    }
    
    public void setName(
    		org.eclipse.ocl.utilities.TypedElement<Classifier> element,
    		String name) {
    	element.setName(name);
    }
    
    public void setType(
    		org.eclipse.ocl.utilities.TypedElement<Classifier> element,
    		Classifier type) {
    	element.setType(type);
    }
}

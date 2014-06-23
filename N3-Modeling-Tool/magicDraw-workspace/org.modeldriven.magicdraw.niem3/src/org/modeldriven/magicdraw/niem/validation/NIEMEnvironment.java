/**
 * 
 */
package org.modeldriven.magicdraw.niem.validation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EnvironmentFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validation.ocl.OCLUMLFactory;
import org.modeldriven.magicdraw.niem.validation.ocl.OCLUMLUtil;
import org.modeldriven.magicdraw.niem.validation.ocl.SequenceType;
import org.modeldriven.magicdraw.niem.validation.ocl.SetType;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLEnvironment;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.BehavioralFeatureOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.DataTypeOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementImportOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ExtensionOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.NamedElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.NamespaceOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.OperationOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PackageOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PropertyOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.RedefinableElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.TypeOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ValueSpecificationOperations;
//import org.modeldriven.magicdraw.niem.validation.ocl.UMLFactory;
//import org.modeldriven.magicdraw.niem.validation.ocl.UMLFactory;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.foundation.MDExtension;
import com.nomagic.magicdraw.foundation.MDFoundationFactory;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesPackage;
//import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.metadata.MdinterfacesPackage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.BehavioralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.RedefinableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.impl.OperationImpl;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
//import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.metadata.MdbasicbehaviorsPackage;
//import com.nomagic.uml2.ext.magicdraw.extensions.ExtensionsFactory;
//import com.nomagic.uml2.ext.magicdraw.extensions.MDExtension;

//import com.nomagic.uml2.ext.magicdraw.mdprofiles.metadata.MdprofilesPackage;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import com.nomagic.uml2.impl.ElementsFactory;
/*
import org.eclipse.ocl.uml.SetType;
import org.eclipse.ocl.uml.UMLEnvironment;
import org.eclipse.ocl.uml.util.OCLUMLUtil;
*/
/*
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
*/
/**
 * @author Tom
 *
 */
public class NIEMEnvironment extends UMLEnvironment {
    //Operation regexMatch;
    
    // this constructor is used to initialize the root environment
    NIEMEnvironment(EPackage.Registry registry, ResourceSet rset) {
        super(registry,rset);
        defineCustomOperations();
    }
    
    // this constructor is used to initialize child environments
    NIEMEnvironment(NIEMEnvironment parent) {
        super(parent);
        
        // get the parent's custom operations
//        regexMatch = parent.regexMatch;
    }
	
	// override this to provide visibility of the inherited protected method
    @Override
    protected void setFactory(
            EnvironmentFactory<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> factory) {
        super.setFactory(factory);
    }
    
    protected void addCustomOperation(Classifier operationClassifier,String operationName,Type returnType,String parmName,Type parmType,String parmName2,Type parmType2) {
        // pattern-matching operation
    	//System.out.println("addCustomOperation "+operationName+" in "+operationClassifier.getQualifiedName());
	  Operation      regexMatch = UMLFactory.eINSTANCE.createOperation();
	        regexMatch.setQuery(true);
	        regexMatch.setName(operationName);
	        OperationOperations.setType(regexMatch,returnType);
	        if(parmType!=null){
		        Parameter parm = UMLFactory.eINSTANCE.createParameter();
		        parm.setName(parmName);
		        parm.setType(parmType);
		        regexMatch.getOwnedParameter().add(parm);
	        }
	        if(parmType2!=null){
		        Parameter parm = UMLFactory.eINSTANCE.createParameter();
		        parm.setName(parmName2);
		        parm.setType(parmType2);
		        regexMatch.getOwnedParameter().add(parm);
	        }
	        // annotate it so that we will recognize it in the evaluation environment
//	        MDExtension annotation = ExtensionsFactory.eINSTANCE.createMDExtension();
//	        MDExtension annotation = UMLFactory.eINSTANCE.createMDExtension();
	        MDExtension annotation = MDFoundationFactory.eINSTANCE.createMDExtension();
	        
	        annotation.setSource("NIEMEnvironment");

	        regexMatch.getMdExtensions().add(annotation);
	        /*
	        Constraint annotation = MdkernelFactory.eINSTANCE.createConstraint();
	        annotation.setName("NIEMEnvironment");

	        regexMatch.setBodyCondition(annotation);
	        */
	        /*
	        EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
	        annotation.setSource("NIEMEnvironment");

	        regexMatch.getEAnnotations().add(annotation);
	        */
	        // define it as an additional operation on OCL String
	        addOperation(operationClassifier, regexMatch);
    	}
    // use the AbstractEnvironment's mechanism for defining "additional operations"
    // to add our custom operation to OCL's String primitive type
    protected void defineCustomOperations() {
    	//if(true)return  ;// TODO is any of the following corrupting model?   model corrupt before here   
    	//System.out.println("defineCustomOperations");
    	Classifier oclString=getOCLStandardLibrary().getString();
    	Classifier oclBoolean=getOCLStandardLibrary().getBoolean();
    	Classifier oclInteger=getOCLStandardLibrary().getInteger();
    	Classifier oclFloat=getOCLStandardLibrary().getReal();
    	
    	Classifier oclAny=getOCLStandardLibrary().getOclAny();
    	Classifier oclSequence=getOCLStandardLibrary().getSequence();
    	Classifier oclType=getOCLStandardLibrary().getOclType();
    	
    	
    	//if(true)return  ;// is any of the following corrupting model?   corruption occurs before here   
    	    	/*
    	ElementsFactory elementsFactory=Application.getInstance().getProject().getElementsFactory();
    	elementsFactory.getPackageClass().
    	Classifier umlPackage=OCLUMLUtil.getClassifier(elementsFactory.getPackageClass(),this.getResourceSet());
    	*/
//    	if(true)return  ;      
    	    	
    	ResourceSet resourceSet=getResourceSet();
    	
    	UMLPackage umlInstancePackage=UMLPackage.eINSTANCE;
//    	Classifier umlPackage=OCLUMLUtil.getClassifier(MdkernelPackage.eINSTANCE.getPackage(),this.getResourceSet());
    	
    	Classifier umlPackageableElement=OCLUMLUtil.getClassifier(umlInstancePackage.getPackageableElement(),resourceSet);
    	Classifier umlExtension=OCLUMLUtil.getClassifier(umlInstancePackage.getExtension(),resourceSet);
    	
    	Classifier umlPackage=OCLUMLUtil.getClassifier(umlInstancePackage.getPackage(),resourceSet);
    	Classifier umlFeature=OCLUMLUtil.getClassifier(umlInstancePackage.getFeature(),resourceSet);
    	
    	Classifier umlElement=OCLUMLUtil.getClassifier(umlInstancePackage.getElement(),resourceSet);
    	Classifier umlValueSpecification=OCLUMLUtil.getClassifier(umlInstancePackage.getValueSpecification(),resourceSet);
    	
    	Classifier umlInterface=OCLUMLUtil.getClassifier(umlInstancePackage.getInterface(),resourceSet);
    	Classifier umlBehavioredClassifier=OCLUMLUtil.getClassifier(umlInstancePackage.getBehavioredClassifier(),resourceSet);
    	Classifier umlClass=OCLUMLUtil.getClassifier(umlInstancePackage.getClass_(),resourceSet);
    	Classifier umlDataType=OCLUMLUtil.getClassifier(umlInstancePackage.getDataType(),resourceSet);
    	Classifier umlRedefinableElement=OCLUMLUtil.getClassifier(umlInstancePackage.getRedefinableElement(),resourceSet);
    	Classifier umlProperty=OCLUMLUtil.getClassifier(umlInstancePackage.getProperty(),resourceSet);
    	Classifier umlElementImport=OCLUMLUtil.getClassifier(umlInstancePackage.getElementImport(),resourceSet);
    	
    	Classifier umlClassifier=OCLUMLUtil.getClassifier(umlInstancePackage.getClassifier(),resourceSet);
    	Classifier umlNamespace=OCLUMLUtil.getClassifier(umlInstancePackage.getNamespace(),resourceSet);
    	Classifier umlNamedElement=OCLUMLUtil.getClassifier(umlInstancePackage.getNamedElement(),resourceSet);
    	Classifier umlBehavioralFeature=OCLUMLUtil.getClassifier(umlInstancePackage.getBehavioralFeature(),resourceSet);
    	
    	Classifier umlType=OCLUMLUtil.getClassifier(umlInstancePackage.getType(),resourceSet);
    	Classifier umlAssociation=OCLUMLUtil.getClassifier(umlInstancePackage.getAssociation(),resourceSet);
    	Classifier umlStereotype=OCLUMLUtil.getClassifier(umlInstancePackage.getStereotype(),resourceSet);
    	Classifier umlDirectedRelationship=OCLUMLUtil.getClassifier(umlInstancePackage.getDirectedRelationship(),resourceSet);


    	
//    	if(true)return  ;      
    	    	
    	
    	//Classifier oclSetElement=getOCLStandardLibrary().getSet();
//    	oclSetElement.createOwnedTemplateSignature(UMLPackage.eINSTANCE.getElement());
//    	oclSetElement.createOwnedTemplateSignature(oclSetElement.eClass());
    	OCLUMLFactory oclUmlFactory=OCLUMLFactory.eINSTANCE;
    	
    	
    	SequenceType listNamedElementType=oclUmlFactory.createSequenceType();
    	listNamedElementType.setElementType(umlNamedElement);
    	SequenceType listPackageableElementType=oclUmlFactory.createSequenceType();
    	listPackageableElementType.setElementType(umlPackageableElement);
    	SequenceType listPackageType=oclUmlFactory.createSequenceType();
    	listPackageType.setElementType(umlPackage);
    	SequenceType listFeatureType=oclUmlFactory.createSequenceType();
    	listFeatureType.setElementType(umlFeature);
    	SequenceType listClassifierType=oclUmlFactory.createSequenceType();
    	listClassifierType.setElementType(umlClassifier);
    	
    	SequenceType listTypeType=oclUmlFactory.createSequenceType();
    	listTypeType.setElementType(umlType);
    	SequenceType listNamespaceType=oclUmlFactory.createSequenceType();
    	listNamespaceType.setElementType(umlNamespace);
    	SequenceType listOclStringType=oclUmlFactory.createSequenceType();
    	listOclStringType.setElementType(oclString);
    	SequenceType listElementType=oclUmlFactory.createSequenceType();
    	listElementType.setElementType(umlElement);
    	
    	SetType setType=oclUmlFactory.createSetType();
    	setType.setElementType(umlElement);
    	
    	SetType setInterfaceType=oclUmlFactory.createSetType();
    	setInterfaceType.setElementType(umlInterface);
    	
    	SetType setNamedElementType=oclUmlFactory.createSetType();
    	setNamedElementType.setElementType(umlNamedElement);
    	
    	SetType setElementType=oclUmlFactory.createSetType();
    	setNamedElementType.setElementType(umlElement);
    	
    	SetType setAssociationType=oclUmlFactory.createSetType();
    	setAssociationType.setElementType(umlAssociation);
    	
    	SetType setStereotypeType=oclUmlFactory.createSetType();
    	setStereotypeType.setElementType(umlStereotype);
    	
    	
    	SetType setClassifierType=oclUmlFactory.createSetType();
    	setClassifierType.setElementType(umlClassifier);

    	SetType setDirectedRelationshipType=oclUmlFactory.createSetType();
    	setDirectedRelationshipType.setElementType(umlDirectedRelationship);
    	/*
    	org.eclipse.ocl.uml.UMLPackage.eINSTANCE.getSetType().

    	TemplateSignature ts=oclSetElement.createOwnedTemplateSignature(UMLPackage.eINSTANCE.getRedefinableTemplateSignature());
    	TemplateBinding tb=oclSetElement.createTemplateBinding(ts);
    	TemplateParameterSubstitution tps=tb.createParameterSubstitution(); 
    	*/
    	
        // pattern-matching operation
   		//addCustomOperation(oclString,"regexMatch",oclString,"pattern",oclString);
        // pattern-matching operation
    	
//if(true)return  ;      
    	// we should do qvt operations, uml defined operations, then perhaps niem operations
    	// string
   		addCustomOperation(oclString,"firstToUpper",oclString,"pattern",null,null,null);
   		addCustomOperation(oclString,"match",oclBoolean,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"endsWith",oclBoolean,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"startsWith",oclBoolean,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"contains",oclBoolean,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"normalizeSpace",oclString,"pattern",null,null,null);
    	// new
   		addCustomOperation(oclString,"substringBefore",oclString,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"substringAfter",oclString,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"lastToUpper",oclString,"pattern",null,null,null);
   		addCustomOperation(oclString,"trim",oclString,"pattern",null,null,null);
   		addCustomOperation(oclString,"replace",oclString,"regex",oclString,"replaceWith",oclString);
   		addCustomOperation(oclString,"quotify",oclString,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"unquotify",oclString,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"matchBoolean",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclString,"matchInteger",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclString,"matchFloat",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclString,"matchInteger",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclString,"matchIdentifier",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclString,"asBoolean",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclString,"asInteger",oclInteger,"pattern",null,null,null);
   		addCustomOperation(oclString,"asFloat",oclFloat,"pattern",null,null,null);
   		addCustomOperation(oclString,"indexOf",oclInteger,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"find",oclInteger,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"rfind",oclInteger,"pattern",oclString,null,null);
   		addCustomOperation(oclString,"isQuoted",oclBoolean,"pattern",oclString,null,null);
    	
    	///////////////////////////////
   		addCustomOperation(oclString,"isAbsoluteURI",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(oclAny,"repr",oclString,"pattern",null,null,null);
   		//addCustomOperation(oclString,"normalizeSpace",oclString,"pattern",null);
   		
if(true){// are these corrupting the model?   	
	////////QVT Element level operations
		addCustomOperation(umlElement,"metaClassName",oclString,"name",null,null,null);
		addCustomOperation(umlElement,"subobjects",setElementType,"name",null,null,null);
		addCustomOperation(umlElement,"allSubobjects",setElementType,"name",null,null,null);
		addCustomOperation(umlElement,"subobjectsOfType",setElementType,"type",oclType,null,null);
		addCustomOperation(umlElement,"allSubobjectsOfType",setElementType,"type",oclType,null,null);
		addCustomOperation(umlElement,"subobjectsOfKind",setElementType,"type",oclType,null,null);
		addCustomOperation(umlElement,"allSubobjectsOfKind",setElementType,"type",oclType,null,null);
	
	
	
	
   		//addCustomOperation(umlPackage,"validateValueSetVersionEnumeration",oclBoolean,"pattern",null,null,null);
   		addCustomOperation(umlElement,"hasAppliedStereotype",oclBoolean,"name",oclString,null,null);
//   		addCustomOperation(umlElement,"allOwningMembers",oclSetElement,"name",null);
   		addCustomOperation(umlElement,"allOwningMembers",setType,"name",null,null,null);
   		addCustomOperation(umlElement,"metaClass",umlClass,"name",null,null,null);
   		addCustomOperation(umlElement,"getOwningStereotype",setStereotypeType,"name",oclString,null,null);
   		addCustomOperation(umlBehavioredClassifier,"allImplementedInterfaces",setInterfaceType,"name",null,null,null);
   		addCustomOperation(umlClassifier,"allUsedInterfaces",setInterfaceType,"name",null,null,null);
   		addCustomOperation(umlClassifier,"specific",setClassifierType,"name",null,null,null);
   		
   		addCustomOperation(umlType,"associations",setAssociationType,"name",null,null,null);
   		addCustomOperation(umlNamespace,"allMembers",setNamedElementType,"name",null,null,null);
   		addCustomOperation(umlElement,"stereotypedBy",oclBoolean,"name",oclString,null,null);
   		//addCustomOperation(umlProperty,"isComposite",oclBoolean,"name",null,null,null);
   		addCustomOperation(umlRedefinableElement,"isConsistentWith",oclBoolean,"redefinee",umlRedefinableElement,null,null);
   		addCustomOperation(umlProperty,"isConsistentWith",oclBoolean,"redefinee",umlRedefinableElement,null,null);
   		addCustomOperation(umlElement,"getNearestPackage",umlPackage,"name",null,null,null);
   		addCustomOperation(umlElement,"getTargetDirectedRelationships",setDirectedRelationshipType,"name",null,null,null);
   		addCustomOperation(umlElement,"getSourceDirectedRelationships",setDirectedRelationshipType,"name",null,null,null);
   		
   		addCustomOperation(umlClass,"inherit",listNamedElementType,"name",listNamedElementType,null,null);
   		addCustomOperation(umlDataType,"inherit",listNamedElementType,"name",listNamedElementType,null,null);
   		addCustomOperation(umlClassifier,"inherit",listNamedElementType,"name",listNamedElementType,null,null);
   		
   		addCustomOperation(umlPackage,"mustBeOwned",oclBoolean,"name",null,null,null);
   		addCustomOperation(umlElement,"mustBeOwned",oclBoolean,"name",null,null,null);
   		addCustomOperation(umlPackage,"visibleMembers",listPackageableElementType,"name",null,null,null);
   		addCustomOperation(umlPackage,"makesVisible",oclBoolean,"name",umlNamedElement,null,null);
   		addCustomOperation(umlExtension,"metaclassEnd",umlProperty,"name",null,null,null);
   		addCustomOperation(umlProperty,"subsettingContext",listTypeType,"name",null,null,null);
   		addCustomOperation(umlElementImport,"getName",oclString,"name",null,null,null);
   		addCustomOperation(umlBehavioralFeature,"isDistinguishableFrom",oclBoolean,"namedElement",umlNamedElement,"namespace",umlNamespace);
   		addCustomOperation(umlNamedElement,"isDistinguishableFrom",oclBoolean,"namedElement",umlNamedElement,"namespace",umlNamespace);
   		addCustomOperation(umlRedefinableElement,"isRedefinitionContextValid",oclBoolean,"redefined",umlRedefinableElement,null,null);

   		addCustomOperation(umlNamedElement,"allOwningPackages",listPackageType,"name",null,null,null);
   		addCustomOperation(umlClassifier,"allFeatures",listFeatureType,"name",null,null,null);
   		addCustomOperation(umlClassifier,"parents",listClassifierType,"name",null,null,null);
   		addCustomOperation(umlClassifier,"conformsTo",oclBoolean,"other",umlClassifier,null,null);
   		addCustomOperation(umlType,"conformsTo",oclBoolean,"other",umlType,null,null);
   		addCustomOperation(umlType,"conformsTo",oclBoolean,"other",umlType,null,null);
   		addCustomOperation(umlNamedElement,"allNamespaces",listNamespaceType,"other",null,null,null);
   		addCustomOperation(umlNamedElement,"separator",oclString,"other",null,null,null);
   		addCustomOperation(umlNamedElement,"getNamesOfMember",listOclStringType,"other",umlNamedElement,null,null);
   		addCustomOperation(umlNamespace,"membersAreDistinguishable",oclBoolean,"other",null,null,null);
   		addCustomOperation(umlElement,"allOwnedElements",listElementType,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"isComputable",oclBoolean,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"integerValue",oclInteger,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"realValue",oclFloat,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"booleanValue",oclBoolean,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"stringValue",oclString,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"unlimitedValue",oclInteger,"other",null,null,null);
   		addCustomOperation(umlValueSpecification,"isNull",oclBoolean,"other",null,null,null);
   		addCustomOperation(umlClassifier,"allParents",listClassifierType,"other",null,null,null);
   		addCustomOperation(umlClassifier,"inheritableMembers",listNamedElementType,"other",umlClassifier,null,null);
   		addCustomOperation(umlClassifier,"hasVisibilityOf",oclBoolean,"other",umlNamedElement,null,null);
   		addCustomOperation(umlClassifier,"maySpecializeType",oclBoolean,"other",umlClassifier,null,null);
   		
}   		
// XML Primitive Types
Package xmlPrimitiveTypesPackage=NIEMHelper.getXMLLibrary();
if(xmlPrimitiveTypesPackage!=null){
	Classifier xmlString=findClassifierFor("string", xmlPrimitiveTypesPackage);
	addCustomOperation(xmlString,"endsWith",oclBoolean,"pattern",oclString,null,null);
	addCustomOperation(xmlString,"startsWith",oclBoolean,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"firstToUpper",oclString,"pattern",null,null,null);
		addCustomOperation(xmlString,"match",oclBoolean,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"contains",oclBoolean,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"normalizeSpace",oclString,"pattern",null,null,null);
	// new
		addCustomOperation(xmlString,"substringBefore",oclString,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"substringAfter",oclString,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"lastToUpper",oclString,"pattern",null,null,null);
		addCustomOperation(xmlString,"trim",oclString,"pattern",null,null,null);
		addCustomOperation(xmlString,"replace",oclString,"regex",oclString,"replaceWith",oclString);
		addCustomOperation(xmlString,"quotify",oclString,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"unquotify",oclString,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"matchBoolean",oclBoolean,"pattern",null,null,null);
		addCustomOperation(xmlString,"matchInteger",oclBoolean,"pattern",null,null,null);
		addCustomOperation(xmlString,"matchFloat",oclBoolean,"pattern",null,null,null);
		addCustomOperation(xmlString,"matchInteger",oclBoolean,"pattern",null,null,null);
		addCustomOperation(xmlString,"matchIdentifier",oclBoolean,"pattern",null,null,null);
		addCustomOperation(xmlString,"asBoolean",oclBoolean,"pattern",null,null,null);
		addCustomOperation(xmlString,"asInteger",oclInteger,"pattern",null,null,null);
		addCustomOperation(xmlString,"asFloat",oclFloat,"pattern",null,null,null);
		addCustomOperation(xmlString,"indexOf",oclInteger,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"find",oclInteger,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"rfind",oclInteger,"pattern",oclString,null,null);
		addCustomOperation(xmlString,"isQuoted",oclBoolean,"pattern",oclString,null,null);
}
//System.out.println("defineCustomOperations end");
    }
    protected Classifier findClassifierFor(String name,Package p){
    	for(Type type:p.getOwnedType()){
    		if(name.equals(type.getName()))return (Classifier)type;
    	}
    	return null;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
}

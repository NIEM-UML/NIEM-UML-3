/**
 * 
 */
package org.modeldriven.magicdraw.niem.validation;

import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
/*
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.action.ValidateAction.EclipseResourcesUtil;
*/
import org.eclipse.emf.validation.internal.service.LiveValidator;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.preferences.EMFModelValidationPreferences;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintFilter;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CallExp;
import org.eclipse.ocl.expressions.FeatureCallExp;
import org.eclipse.ocl.expressions.LoopExp;
import org.eclipse.ocl.expressions.NavigationCallExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.OCLHelper;

import org.eclipse.ocl.internal.helper.HelperUtil;
import org.eclipse.ocl.lpg.ProblemHandler;
import org.eclipse.ocl.parser.OCLAnalyzer;
import org.eclipse.ocl.parser.ValidationVisitor;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.util.OCLUtil;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.OCLFactory;
import org.eclipse.ocl.utilities.UMLReflection;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validation.ocl.OCLUMLUtil;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLEnvironmentFactory;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.OperationOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ParameterableElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PropertyOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.RedefinableElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.StereotypeOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.TypeOperations;
/*
import org.eclipse.ocl.uml.UMLEnvironmentFactory;
import org.eclipse.ocl.uml.util.OCLUMLUtil;
*/
//import org.eclipse.papyrus.modelexplorer.commands.ValidationTool;
/*
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLValidator;
*/
//import org.eclipse.wst.validation.ValidationResult;
//import org.eclipse.wst.validation.ValidatorMessage;

import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.ParameterableElement;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateParameter;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateParameterSubstitution;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.RedefinableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;


/**
 * @author Tom
 *
 */
public class NIEMValidator extends UMLValidator implements NIEMConstraints{

    //private final IBatchValidator batchValidator;
//    private final LiveValidator batchValidator;
    public static NIEMValidator INSTANCE=new NIEMValidator();
    public NIEMValidator() {
        super();
  /*
        System.out.println("NIEMValidator");
        batchValidator =(IBatchValidator) ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
//        batchValidator =(LiveValidator) ModelValidationService.getInstance().newValidator(EvaluationMode.LIVE);
        batchValidator.setIncludeLiveConstraints(true);
        batchValidator.setReportSuccesses(false);
*/
    }
    /*
	@Override
	public boolean validateBehavior_validateFeatureOfContextClassifier(
			Behavior behavior, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		//return behavior.validateFeatureOfContextClassifier(diagnostics, context);
		return true;
	}
    */
	@Override
	public boolean validate_BidirectionalReferenceIsPaired(EObject eObject,
			EReference eReference, EReference eOpposite,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// work around missing constraints
		return eReference==UMLPackage.Literals.CLASSIFIER__FEATURE
		||
			super.validate_BidirectionalReferenceIsPaired(eObject,
				eReference, eOpposite, diagnostics, context);
	}
	/**
	 * Validates the validateRedefinitionConsistent constraint of '<em>Redefinable Element</em>'.
	 * correction for redefinition of untyped parameters of operation
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_validateRedefinitionConsistent(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if(Operation.class.isInstance(redefinableElement)){
			if( validateRedefinitionConsistent(redefinableElement,diagnostics,	context)) return true;
			// fall through to actual uml validation
		}
			 
//		return redefinableElement.validateRedefinitionConsistent(diagnostics,
		return RedefinableElementOperations.validateRedefinitionConsistent(redefinableElement,diagnostics,
			context);
	}
	  public static boolean validateRedefinitionConsistent(
		      RedefinableElement redefinableElement, DiagnosticChain diagnostics,
		      Map<Object, Object> context) {
		    boolean result = true;

		    for (RedefinableElement redefinedElement : redefinableElement
		      .getRedefinedElement()) {
		    	if(Operation.class.isInstance(redefinedElement)){
				      if (!isConsistentWith((Operation)redefinedElement,redefinableElement)) {
					        result = false;
				      }
		    	}
				      /*
		      if (!redefinedElement.isConsistentWith(redefinableElement)) {
		        result = false;
		        if (diagnostics == null) {
		          return result;
		        } else {
		          diagnostics
		            .add(new BasicDiagnostic(
		              Diagnostic.WARNING,
		              UMLValidator.DIAGNOSTIC_SOURCE,
		              UMLValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
		              UMLPlugin.INSTANCE
		                .getString(
		                  "_UI_RedefinableElement_RedefinitionConsistent_diagnostic", //$NON-NLS-1$
		                  getMessageSubstitutions(context,
		                    redefinableElement, redefinedElement)),
		              new Object[]{redefinableElement, redefinedElement}));
		        }
		      }
		        */
		    }

		    return result;
		  }
    
	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * <!-- begin-model-doc -->
	   * The query isConsistentWith() specifies, for any two Operations in a context in which redefinition is possible, whether redefinition would be consistent in the sense of maintaining type covariance. Other senses of consistency may be required, for example to determine consistency in the sense of contravariance. Users may define alternative queries under names different from 'isConsistentWith()', as for example, users may define a query named 'isContravariantWith()'.
	   * A redefining operation is consistent with a redefined operation if it has the same number of owned parameters, and the type of each owned parameter conforms to the type of the corresponding redefined parameter. 
	   * redefinee.isRedefinitionContextValid(self)
	   * result = (redefinee.oclIsKindOf(Operation) and
	   * let op: Operation = redefinee.oclAsType(Operation) in
	   * self.ownedParameter.size() = op.ownedParameter.size() and
	   * forAll(i | op.ownedParameter[i].type.conformsTo(self.ownedParameter[i].type))
	   * )
	   * @param operation The receiving '<em><b>Operation</b></em>' model object.
	   * <!-- end-model-doc -->
	   * @generated NOT
	   */
	  public static boolean isConsistentWith(Operation operation,
	      RedefinableElement redefinee) {

	    if (redefinee instanceof Operation
//	  	      && redefinee.isRedefinitionContextValid(operation)) {
	      && RedefinableElementOperations.isRedefinitionContextValid(redefinee,operation)) {

	      Operation op = (Operation) redefinee;

	      List<Parameter> ownedParameters = operation.getOwnedParameter();
	      int ownedParametersSize = ownedParameters.size();
	      List<Parameter> opOwnedParameters = op.getOwnedParameter();

	      List<Parameter> returnResult = OperationOperations.returnResult(operation);
	      int returnResultSize = returnResult.size();
	      List<Parameter> opReturnResult = OperationOperations.returnResult(op);

	      if (ownedParametersSize == opOwnedParameters.size()
	        && returnResultSize == opReturnResult.size()) {

	        for (int i = 0; i < ownedParametersSize; i++) {
	          Type opOwnedParameterType = opOwnedParameters.get(i)
	            .getType();
	          Type ownedParameterType = ownedParameters.get(i).getType();
if(ownedParameterType==null)continue;
if(!Classifier.class.isInstance(opOwnedParameterType)||!Classifier.class.isInstance(ownedParameterType))continue;
	          if (opOwnedParameterType == null
	            ? ownedParameterType != null
	            : !TypeOperations.conformsTo((Classifier)opOwnedParameterType,(Classifier)ownedParameterType)) {

	            return false;
	          }
	        }

	        for (int i = 0; i < returnResultSize; i++) {
	          Type opReturnResultType = opReturnResult.get(i).getType();
	          Type returnResultType = returnResult.get(i).getType();
	          if(returnResultType==null)continue;
	          if(!Classifier.class.isInstance(opReturnResultType)||!Classifier.class.isInstance(returnResultType))continue;
	          if (opReturnResultType == null
	            ? returnResultType != null
	            : !ClassifierOperations.conformsTo((Classifier)opReturnResultType,(Classifier)returnResultType)) {

	            return false;
	          }
	        }

	        return true;
	      }
	    }

	    return false;
	  }
	    public boolean validateInstanceSpecificationConstraints(Constraint constraint,InstanceSpecification instanceSpecification, DiagnosticChain diagnostics,
	            Map context) {
	        //System.out.println("NIEMValidator.validate EObject");
	        IStatus status = Status.OK_STATUS;
		    // validate ocl constraints 
		    for(Classifier instanceClassifier:instanceSpecification.getClassifier()){
		    	validate_EveryMultiplicityConformsClassifierConstraint(constraint,instanceClassifier,instanceSpecification,diagnostics,context);
		    }
	        
	        if (diagnostics != null) {
	                appendDiagnostics(status, diagnostics);
	        }
	        return status.isOK();
	    }

    public boolean validate(EObject eObject, DiagnosticChain diagnostics,
            Map context) {
        //System.out.println("NIEMValidator.validate EObject");
        return validate(eObject.eClass(), eObject, diagnostics, context);
    }
    public boolean validate(EClass eClass, EObject eObject,
            DiagnosticChain diagnostics, Map context) {
//    		log("NIEMValidator.validate "+getQualifiedName(eObject));
//        System.out.println("NIEMValidator.validate ");
//if(true)return true;        
    	// make sure uml metamodel in resource set
    	/*
    	ResourceSet resourceSet=eObject.eResource().getResourceSet();
    		Resource res = resourceSet.getResource(
    				URI.createURI(UMLResource.UML_METAMODEL_URI), true);
*/
        IStatus status = Status.OK_STATUS;
//        System.out.println("NIEMValidator.validate EClass "+eClass.getName()+", "+eObject+", "+hasProcessed(eObject, context));
        super.validate(eClass, eObject, diagnostics, context);
        // do our extended validation
//		computeDiagnostic(eClass, eObject, diagnostics, context);
//		if(true)return true;

        
        if (diagnostics != null) {
//            if (!hasProcessed(eObject, context)) {
            	/* TODO
                status = batchValidator.validate(
                    eObject,
                    new NullProgressMonitor());
                */
                //IStatus results = batchValidator.validate(notifications);
                
//                    processed(eObject, context, status);
//                processed(eObject, context, status);
                
                appendDiagnostics(status, diagnostics);
                /*
                for(EObject content:eObject.eContents()){
                	log("NIEMValidator.validate content "+content);
                }
                */
                /*
        		if(Diagnostic.class.isInstance(diagnostics)){
        			Diagnostic diagnostic=(Diagnostic)diagnostics;
        			try {
						validateDiagnostic(diagnostic);
					} catch (Exception e) {
						
						e.printStackTrace();
					}
        		}
        */
//            }
        }
        
        return status.isOK();
    }
/*    
    private void processed(EObject eObject, Map context, IStatus status) {
        if (context != null) {
            context.put(eObject, status);
        }
    }
*/    
/*    
    private boolean hasProcessed(EObject eObject, Map context) {
        boolean result = false;
if(false)        
        if (context != null) {
            while (eObject != null) {
                if (context.containsKey(eObject)) {
                    result = true;
                    eObject = null;
                } else {
                    eObject = eObject.eContainer();
                }
            }
        }
        
        return result;
    }
    */
    private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
    	//System.out.println("appendDiagnostics TEST "+status.getMessage());
        if (status.isMultiStatus()) {
            IStatus[] children = status.getChildren();
            
            for (int i = 0; i < children.length; i++) {
                appendDiagnostics(children[i], diagnostics);
            }
        } else
        	/*
        	if (status instanceof IConstraintStatus) {
        	//System.out.println("appendDiagnostics "+status.getMessage());
            diagnostics.add(new BasicDiagnostic(
                status.getSeverity(),
                status.getPlugin(),
                status.getCode(),
                status.getMessage(),
                ((IConstraintStatus) status).getResultLocus().toArray()));
        }
        */
        {
            diagnostics.add(new BasicDiagnostic(
                    status.getSeverity(),
                    status.getPlugin(),
                    status.getCode(),
                    status.getMessage()
                    ,new Object[]{}));
        	
        }
    }
	/**
	 * Get  the DiagnosticChain result for validating resource.
	 * @param resource The Resource to be validated.
	 * @return the DiagnosticChain result for validating resource.
	 */
    /* this should be hooked into/extend appropriate elements of uml validation
	public void  computeDiagnostic(EClass eClass, EObject eObject,
            DiagnosticChain diagnostics, Map context){
		/ *
 		boolean isStereotypeValuesDisabled=EMFModelValidationPreferences.isConstraintDisabled(STEREOTYPE_VALUES);
 		//boolean isHl7StereotypeConstraintsDisabled=EMFModelValidationPreferences.isConstraintDisabled(STEREOTYPE_CONSTRAINTS);
 		boolean isEccfStereotypeConstraintsDisabled=EMFModelValidationPreferences.isConstraintDisabled(NIEMSTEREOTYPE_CONSTRAINTS);
 		//boolean isValueSetEnumerationDisabled=EMFModelValidationPreferences.isConstraintDisabled(VALUE_SET_ENUMERATION);
 		//boolean isCompletenessDisabled=EMFModelValidationPreferences.isConstraintDisabled(COMPLETENESS_CONSTRAINTS);
 		boolean isUmlDisabled=EMFModelValidationPreferences.isConstraintDisabled(UML_CONSTRAINTS);
 		boolean isRefinementDisabled=EMFModelValidationPreferences.isConstraintDisabled(NIEM_REFINEMENT_CONSTRAINTS);
 		boolean isStereotypeConstraintsDisabled=isEccfStereotypeConstraintsDisabled;
 		* /
 		boolean isStereotypeValuesDisabled=false;
 		boolean isEccfStereotypeConstraintsDisabled=false;
 		boolean isUmlDisabled=false;
 		boolean isRefinementDisabled=false;
 		boolean isStereotypeConstraintsDisabled=false;
 		/ *
 		Preferences prefs=EMFModelValidationPlugin.getPlugin().getPluginPreferences();
 		for(String name:prefs.propertyNames()){
 		System.out.println("computeDiagnostic preferences "+name);
 		}
 		* /
 		if(isStereotypeValuesDisabled&&isStereotypeConstraintsDisabled//&&isValueSetEnumerationDisabled
 				//&&isCompletenessDisabled
 				&&isUmlDisabled){
 			log("NIEMValidator all constraints disabled");
 			return;
 		}
		Statistics statistics=new Statistics();
		statistics.diagnostics=diagnostics;
		
//		if(true)return;
		
		
		Map<Class,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap=new HashMap<Class,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>>();
		Map<Property,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> propertyBodyMap
			=new HashMap<Property,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>>();
//		UMLEnvironmentFactory umlFactory = new NIEMUMLEnvironmentFactory(eObject.eResource().getResourceSet());
		UMLEnvironmentFactory umlFactory = new NIEMUMLEnvironmentFactory(new ResourceSetImpl());
		
		OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl;
		
//		if(true)return;
		
		
		ocl = OCL.newInstance(umlFactory);
		
//if(true)return;
		
		
		// create an OCL helper object
		OCLHelper<Classifier, Operation, Property, Constraint> helper = ocl
				.createOCLHelper();
		EValidator.Registry registry=EValidator.Registry.INSTANCE; 
		/ *
		if(context!=null){
		Diagnostician diagnostician=new Diagnostician(registry);
			diagnostician.validate(eObject, diagnostics);
		}
		* /
		
//		if(true)return;
		
		
			if (Element.class.isInstance(eObject)) {
				Element c = (Element) eObject;
				statistics.classifiers++;
				Collection<Stereotype> hdfStereotypes=getHdfStereotypes( c,isEccfStereotypeConstraintsDisabled);
				/ *
				if(!isCompletenessDisabled){
					if(hdfStereotypes.size()!=1
							&&!ValueSpecification.class.isInstance(c)
							&&!ProfileApplication.class.isInstance(c)
							&&!InterfaceRealization.class.isInstance(c)
							&&!TemplateSignature.class.isInstance(c)
							&&!Region.class.isInstance(c)
							&&!TemplateBinding.class.isInstance(c)
							&&!Comment.class.isInstance(c)
							&&!Enumeration.class.isInstance(c)
							&&!EnumerationLiteral.class.isInstance(c)
							&&!TemplateParameterSubstitution.class.isInstance(c)
							&&!(Parameter.class.isInstance(c)&&(((Parameter)c).getDirection()==ParameterDirectionKind.RETURN_LITERAL))
							&&!(Parameter.class.isInstance(c)&&!Operation.class.isInstance(c.eContainer()))
							){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Element "+getQualifiedName(c)+" must have exactly one HDF Stereotype applied",new Object [] {c }));

					}
				}
				* /
				if(!isUmlDisabled){
					umlConstraintCheck(diagnostics,c,isRefinementDisabled);
				}
				for (Stereotype s : hdfStereotypes) {
					statistics.stereotypes++;
			 		if(!isStereotypeValuesDisabled){
			 			validateAppliedStereotypeData(helper,statistics,s,ocl,c);
			 		}
			 		if(!isStereotypeConstraintsDisabled 
			 				//||("HDFValueSetVersion".equals(s.getName())&&!isValueSetEnumerationDisabled)
			 				){
						for (Constraint constraint : getAllRules(s)) {
							validateConstraint(helper,c,statistics,s,ocl,constraint,propertyBodyMap,classBodyMap);
						}
			 		}
				}
			}
/ *			
		System.out.println("OCL Validation for "+eObject.eResource().getURI()+", elements="+statistics.classifiers
				+", stereotypes="+statistics.stereotypes+", constraints="+statistics.constraints+", specifications="
				+statistics.specifications+", languages="+statistics.languages+", ocllanguages="
				+statistics.ocllanguages+", ocl bodies="+statistics.bodies
				+", stereotypeValues="+statistics.stereotypeValues
				+", stereotypeValueConstraints="+statistics.stereotypeValueConstraints
				+", complexDatatypeValues="+statistics.complexDatatypeValues
				+", complexDatatypeConstraints="+statistics.complexDatatypeConstraints
				+"\nEnablement:"+isStereotypeValuesDisabled+","+isStereotypeConstraintsDisabled
				//+","+isValueSetEnumerationDisabled+","+isCompletenessDisabled
				+","+isUmlDisabled
				);
* /
// TODO: timing
		
		return;
	}
	
	protected Set<Constraint> getAllRules(Namespace namespace){
		Set<Constraint> result=new HashSet(namespace.getOwnedRule());
		if(Classifier.class.isInstance(namespace)){
			for(Classifier parent:ClassifierOperations.allParents(((Classifier)namespace))){
				result.addAll(parent.getOwnedRule());
			}
		}
		return result;
	}

    protected Collection<Stereotype> getHdfStereotypes(Element c,boolean isEccfStereotypeConstraintsDisabled){
		Collection<Stereotype> hdfStereotypes=new Vector<Stereotype>();
		for (Stereotype s : ElementOperations.getAppliedStereotypes(c)) {
			if(
					//(!isHl7StereotypeConstraintsDisabled&&s.getName().startsWith("HDF"))
					//||
//					(!isEccfStereotypeConstraintsDisabled&&s.getProfile().getName().equals("eccf-profile"))){
				(!isEccfStereotypeConstraintsDisabled)){
				hdfStereotypes.add(s);
			}
		}
		return hdfStereotypes;
	}
    */    
    /*
	protected Collection<Property> getRedefinedProperties(Property redefinee){
		// includes explicit redefinition plus implicit redefinition via name
		Collection<Property> properties=new HashSet<Property>();
		properties.addAll(redefinee.getRedefinedProperty());
		Classifier owner=(Classifier)redefinee.getOwner();
		for(Classifier general:ClassifierOperations.allParents(owner)){
//			Property redefined=general.getAttribute(redefinee.getName(),null);
			Property redefined=ClassifierOperations.getAttribute(general,redefinee.getName(),null);
			if(redefined!=null){
				properties.add(redefined);
			}
		}
		return properties;
	}
	*/
	// this should be done as extension of uml validation
    /*
	protected void umlConstraintCheck(DiagnosticChain diagnostics,Element c,boolean isRefinementDisabled){
		if(Property.class.isInstance(c)){
			Property redefinee=(Property)c;
			Class class_=redefinee.getUMLClass();//getClass_();
			if(class_!=null){
				if(!class_.equals(redefinee.eContainer())){
					System.out.println("umlConstraintCheck class!=container "+getQualifiedName(class_)+", "+getQualifiedName((Element)redefinee.eContainer()));
				}
				Collection<Property> properties=getRedefinedProperties(redefinee);
				if(!isRefinementDisabled){
					Package p=ElementOperations.getNearestPackage(class_);
					if(properties.size()==0){
						// redefinition not required in a datatypeModelLibrary
						/ *
						if(hasStereotype(p,"HDFDatatypeModelLibrary")||isRIMPackage(p)){
							
						}else
						* /
						/ * redefinition not required, may be adding
						{
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+" must redefine an existing property",new Object [] {redefinee }));
						}
						* /
					}
				}
			Classifier type=(Classifier)redefinee.getType();
//			Collection<Classifier> redefineeClients=getHDFDatatypeRefs(redefinee);
			if(redefinee.getName()==null){
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "Property of parent "+getQualifiedName(redefinee.getOwner())+"["+redefinee.getLower()+".."+redefinee.getUpper()+"] must be named ",new Object [] {redefinee}));
				
			}else
			if(type==null && !class_.isAbstract()){
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"["+redefinee.getLower()+".."+redefinee.getUpper()+"] must be typed ",new Object [] {redefinee}));
				
			}else{
			for(Property redefinedProperty:properties){
				// additional check if there is a client dependency DatatypeRef
				/ *
				Collection<Classifier> redefinedClients=getHDFDatatypeRefs(redefinedProperty);
				for(Classifier redefineeClassifier:redefineeClients){
					for(Classifier redefinedClassifier:redefinedClients){
						if(!redefineeClassifier.isCompatibleWith(redefinedClassifier)){
							diagnostics.add(createDiagnostic
								    (Diagnostic.ERROR,
							                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+" sub datatype "+getQualifiedName(redefineeClassifier)+" must be consistent with its redefined property "+getQualifiedName(redefinedProperty)+" "+getQualifiedName(redefinedClassifier),new Object [] {redefinee ,redefinedProperty,redefineeClassifier,redefinedClassifier}));
							
						}
					}
					
				}
				* /
if(false){		// emf uml based check		
//	if(!redefinedProperty.isConsistentWith(redefinee)){
				if(!PropertyOperations.isConsistentWith(redefinedProperty,redefinee)){
//					if(!redefinee.isConsistentWith(redefinedProperty)){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(redefinee.getType())+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] must be consistent with its redefined property "+getQualifiedName(redefinedProperty)+" {"+getQualifiedName(redefinedProperty.getType())+"}["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
						
					}
}else{				
				
				Class redefinedClass_=redefinedProperty.getUMLClass();//getClass_();
				Classifier redefinedType=(Classifier)redefinedProperty.getType();
				if(AssociationClass.class.isInstance(class_)){
					// limited consistency check: 
					if(!conformsTo(type,redefinedType)){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Association Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(type)+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] type must conform to its redefined property type "+getQualifiedName(redefinedProperty)+" ("+getQualifiedName(redefinedType)+")["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
						
					}
					if(redefinee.getLower()<redefinedProperty.getLower()||
							(redefinedProperty.getUpper()>0 && (redefinee.getUpper()<0||redefinee.getUpper()>redefinedProperty.getUpper()))
							){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Association Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(redefinee.getType())+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] cardinality must conform to its redefined property cardinality "+getQualifiedName(redefinedProperty)+" ("+getQualifiedName(redefinedProperty.getType())+")["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
						
					}
				}else{
					if(!conformsTo(class_,redefinedClass_)){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(type)+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] class must conform to its redefined property class "+getQualifiedName(redefinedProperty)+" ("+getQualifiedName(redefinedType)+")["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
					}else					if(redefinedType==null){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
						                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(type)+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] type not specified for redefined property type "+getQualifiedName(redefinedProperty)+"["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
						
					}else					if(!conformsTo(type,redefinedType)){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
//						                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(type)+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] type must conform to its redefined property type "+getQualifiedName(redefinedProperty)+" ("+getQualifiedName(redefinedType)+")["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
		                DIAGNOSTIC_SOURCE,1, "Property "+redefinee.getName()+"{"+type.getName()+"} must conform to its redefined property type "+redefinedType.getName(),new Object [] {redefinee ,redefinedProperty}));
						
					}else	if(redefinee.getLower()<redefinedProperty.getLower()||
								(redefinedProperty.getUpper()>0 && (redefinee.getUpper()<0||redefinee.getUpper()>redefinedProperty.getUpper()))
								){
							diagnostics.add(createDiagnostic
								    (Diagnostic.ERROR,
							                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(redefinee.getType())+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] cardinality must conform to its redefined property cardinality "+getQualifiedName(redefinedProperty)+" ("+getQualifiedName(redefinedProperty.getType())+")["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
					}else if((redefinedProperty.isDerived()?!redefinee.isDerived():false)
							||(redefinedProperty.isComposite()?!redefinee.isComposite():false)){
						diagnostics.add(createDiagnostic
							    (Diagnostic.ERROR,
//						                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(redefinee.getType())+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"]"+redefinee.isComposite()+","+redefinee.isComposite()+" composite/derived must conform to its redefined property composite/derived "+getQualifiedName(redefinedProperty)+" ("+getQualifiedName(redefinedProperty.getType())+")["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]"+redefinedProperty.isComposite()+","+redefinedProperty.isComposite(),new Object [] {redefinee ,redefinedProperty}));
		                DIAGNOSTIC_SOURCE,1, "Property "+redefinee.getName()+" derived/composite="+redefinee.isDerived()+"/"+redefinee.isComposite()+" must conform to its redefined property derived/composite "+redefinedProperty.isDerived()+"/"+redefinedProperty.isComposite(),new Object [] {redefinee ,redefinedProperty}));
					}else if (false){
						// following fails even when above do not

//						if(!redefinedProperty.isConsistentWith(redefinee)){
						if(!PropertyOperations.isConsistentWith(redefinedProperty,redefinee)){
//						if(!redefinee.isConsistentWith(redefinedProperty)){
							diagnostics.add(createDiagnostic
								    (Diagnostic.ERROR,
							                DIAGNOSTIC_SOURCE,1, "Property "+getQualifiedName(redefinee)+"{"+getQualifiedName(redefinee.getType())+"}["+redefinee.getLower()+".."+redefinee.getUpper()+"] must be consistent with its redefined property "+getQualifiedName(redefinedProperty)+" {"+getQualifiedName(redefinedProperty.getType())+"}["+redefinedProperty.getLower()+".."+redefinedProperty.getUpper()+"]",new Object [] {redefinee ,redefinedProperty}));
							
						}

					}
				}
}				
				/ *
				// the redefinedProperty must exist in the inheritance hierachy
				// the type of this property must conform to the type of the redefined property
				// the cardinality must conform
				class_.isConsistentWith(redefinee);
				boolean isInherited=false;
				for(Property check:class_.getAllAttributes()){
					if(redefinedProperty.equals(check)){
						isInherited=true;
						break;
					}
				}
				if(!isInherited){
					diagnostics.add(createDiagnostic
						    (Diagnostic.ERROR,
					                DIAGNOSTIC_SOURCE,1, "A redefined property must exist in same context as redefinee property",new Object [] {redefinee }));
					
				}
				* /
			}
			}
			}
		}else if(Parameter.class.isInstance(c)){
			Parameter parameter=(Parameter)c;
			Classifier type=(Classifier)parameter.getType();
			if(type==null){
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "Parameter "+getQualifiedName(parameter)+"["+parameter.getLower()+".."+parameter.getUpper()+"] must be typed ",new Object [] {parameter}));
				
			}else{
			}
		}else if(TemplateParameterSubstitution.class.isInstance(c)){
			TemplateParameterSubstitution templateParameterSubstitution=(TemplateParameterSubstitution)c;
			ParameterableElement actual=templateParameterSubstitution.getActual();
			TemplateParameter formal=templateParameterSubstitution.getFormal();
			if(actual==null){
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "TemplateParameterSubstitution "+getQualifiedName(templateParameterSubstitution)+" must have actual parameter substitution ",new Object [] {templateParameterSubstitution}));
				
			}else if(formal==null){
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "TemplateParameterSubstitution "+getQualifiedName(templateParameterSubstitution)+" must have formal parameter ",new Object [] {templateParameterSubstitution}));
//			}else if(!actual.isCompatibleWith(formal.getParameteredElement())){ 
			}else if(!ParameterableElementOperations.isCompatibleWith(actual,formal.getParameteredElement())){ 
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "TemplateParameterSubstitution "+getQualifiedName(templateParameterSubstitution)+" must have actual parameter compatible with formal parameter",new Object [] {templateParameterSubstitution}));
				
			}else{
			}
			/ *
		}else if(TemplateParameterSubstitution.class.isInstance(c)){
			TemplateParameterSubstitution templateParameterSubstitution=(TemplateParameterSubstitution)c;
			if(!templateParameterSubstitution.getActual().isCompatibleWith(templateParameterSubstitution.getFormal().getParameteredElement())){ 
				diagnostics.add(createDiagnostic
					    (Diagnostic.ERROR,
				                DIAGNOSTIC_SOURCE,1, "TemplateParameterSubstitution "+getQualifiedName(templateParameterSubstitution)+" must have actual parameter compatible with formal parameter",new Object [] {templateParameterSubstitution}));
				
			}else{
			}
			* /
		}
		
	}
	*/

	protected String getQualifiedName(Element element){
		String result="null";
		if(element!=null){
			String prefix="("+element.eClass().getName()+")";
			result=prefix+getQualifiedNameFragment(element);
		}
		return result;
	}
	protected String getQualifiedNameFragment(Element element){
		String result="";
		if(element!=null){
			if(NamedElement.class.isInstance(element)){
				result=getQualifiedNameFragment((Element)element.eContainer())+"::"+((NamedElement)element).getName();
			}else{
				result=getQualifiedNameFragment((Element)element.eContainer())+"::?";
			}
		}
		return result;
	}

	  /**
	   * Creates a new {@link BasicDiagnostic#BasicDiagnostic(int, String, int, String, Object[]) basic diagnostic}.
	   * If the source is {@link #DIAGNOSTIC_SOURCE "org.eclipse.emf.ecore"}, 
	   * it calls {@link #getEcoreString(String, Object[])};
	   * otherwise it calls {@link #getString(String, Object[])}.
	   * @param severity an indicator of the severity of the problem.
	   * @param source the unique identifier of the source.
	   * @param code the source-specific identity code.
	   * @param message the message.
	   * @param data the data associated with the diagnostic
	   * @return a new diagnostic.
	   */

	  protected BasicDiagnostic createDiagnostic
	    (int severity, String source, int code, String message, Object[] data)
	  {
		  //log("createDiagnostic "+severity+" "+message+", "+data[0]);
		  BasicDiagnostic result= new BasicDiagnostic(severity, source, code, message, data);
		  // can not set markers here since they are cleared in outer validate
		  //handleDiagnostic(result);
	    return result;
	  }

/*	  
		protected boolean conformsTo(Classifier type,Type redefinedType){
			boolean result=false;
			if(Classifier.class.isInstance(redefinedType))result=TypeOperations.conformsTo(type,(Classifier)redefinedType);
			return result;
		}
*/		
/*	  
		 protected void validateAppliedStereotypeData(OCLHelper<Classifier, Operation, Property, Constraint> helper,
					Statistics statistics,Stereotype s,
					OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
					Element c) {
				// look at all the data in the applied stereotype, validate if the property has a constraint
//				for(Property property:s.getAllAttributes()){
				for(Property property:StereotypeOperations.getAllAttributes(s)){
//					Object value=c.getValue(s,property.getName());
					Object value=ElementOperations.getValue(c,s,property.getName());
					// check cardinality
					if(property.getUpper()==0){
						if(value!=null){
							log("ERROR: value exists when max cardinality is 0");
						}
					}else if(property.getUpper()==1){
						if((value==null)&&(property.getLower()==1)){
							log("ERROR: value does not exist when min cardinality is 1");
						}
					}else if(!Collection.class.isInstance(value)){
						log("ERROR: value is not a collection when max cardinality > 1");
					}else if(((Collection)value).size()<property.getLower()){
						log("ERROR: collection size < min cardinality");
					}else if((property.getUpper()>1)&&(((Collection)value).size()>property.getUpper())){
						log("ERROR: collection size > max cardinality");
					}
					if(Collection.class.isInstance(value)){
						for(Object item:(Collection)value){
							validateStereotypeProperty(helper,property,statistics,s,ocl,item);
						}
					}else {
						if(value!=null)
							validateStereotypeProperty(helper,property,statistics,s,ocl,value);
					}
				}
			}
			 protected void validateStereotypeProperty(OCLHelper<Classifier, Operation, Property, Constraint> helper,
					Property property,Statistics statistics,Stereotype s,
					OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
					Object value) {
				statistics.stereotypeValues++;
				// NOTE: already done for stereotype level?
				if (EObject.class.isInstance(value)){
					validateComplexDatatype(helper,property,statistics,ocl,(EObject)value);
					}else{
						// verify primitive type
						if(String.class.isInstance(value)){
							if(!"String".equals(property.getType().getName())){
								 log("validateStereotypeProperty value is String, but does not match type "+property.getQualifiedName()+"("+property.getType().getQualifiedName()+") = "+value);
							}
						}else if(Integer.class.isInstance(value)){
							if(!"Integer".equals(property.getType().getName())){
								 log("validateStereotypeProperty value is Integer, but does not match type "+property.getQualifiedName()+"("+property.getType().getQualifiedName()+") = "+value);
							}
						}else if(Boolean.class.isInstance(value)){
							if(!"Boolean".equals(property.getType().getName())){
								 log("validateStereotypeProperty value is Boolean, but does not match type "+property.getQualifiedName()+"("+property.getType().getQualifiedName()+") = "+value);
							}
							
						}else{
							 log("validateStereotypeProperty unhandled type "+property.getQualifiedName()+"("+property.getType().getQualifiedName()+") = "+value);
						 //log("validateStereotypeProperty "+property.getQualifiedName()+" = "+value);
						}
					}
			}
			 protected void validateComplexDatatype(OCLHelper<Classifier, Operation, Property, Constraint> helper,
					 Property umlproperty,Statistics statistics,
					OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
					EObject complexObject) {
				 log("validateComplexDatatype "+complexObject);
				EClass eClass=complexObject.eClass();// the ecore implementation
				Classifier umlClass=getUmlClass(eClass);// the uml definition
				if(umlClass==null)return;// probably a uml meta-class
				for(EStructuralFeature property:eClass.getEAllStructuralFeatures()){
					Object value=complexObject.eGet(property);
					if(Collection.class.isInstance(value)){
						for(Object item:(Collection)value){
							validateComplexProperty(helper,property,statistics,umlClass,ocl,item);
						}
					}else if(value!=null){
						validateComplexProperty(helper,property,statistics,umlClass,ocl,value);
					}
				}
			}
			 protected void validateComplexProperty(OCLHelper<Classifier, Operation, Property, Constraint> helper,
						EStructuralFeature property,Statistics statistics,Classifier umlClass,
						OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
						Object value) {
					statistics.complexDatatypeValues++;
					for(Constraint constraint:umlClass.getOwnedRule()){
						for(Element constrainedElement:constraint.getConstrainedElement()){
							if(Property.class.isInstance(constrainedElement)&&((Property)constrainedElement).getName().equals(property.getName())){
								statistics.complexDatatypeConstraints++;
								ValueSpecification vs = constraint.getSpecification();
								if (OpaqueExpression.class.isInstance(vs)) {
									OpaqueExpression oe = (OpaqueExpression) vs;
									for (String language : oe.getLanguage()) {
										statistics.languages++;
										if ("OCL".equals(language)) {
											for (String body : oe.getBody()) {
												try{
											    helper.setInstanceContext(value);
												Constraint invariant= helper.createInvariant(body);
												org.eclipse.ocl.Query<Classifier, Class, EObject> eval = ocl.createQuery(invariant);
												check(statistics,helper,eval,ocl,value,constraint);
												} catch (Throwable t2) {
													if(hadError)return;
													hadError=true;
													//t2.printStackTrace();
													// System.out.println("ERROR invariant  = "+body+", "+ocl.getEnvironment().getUMLReflection()+","+t2);
													System.out
															.println("ERROR invariant  = "
																	+ body
//																	+ ", "+ ocl.getEnvironment().getUMLReflection().getSpecification(constraint)
																	+ ","
																	+ constraint
																			.getSpecification()
																	+ "," + t2);

												}
											}
										}
									}
								}
							}
						}
					}
					if (EObject.class.isInstance(value)){
						validateComplexDatatype(helper,statistics,ocl,(EObject)value);
						}
				}
				*/
	  /*
				 protected void validateConstraint(OCLHelper<Classifier, Operation, Property, Constraint> helper,
						Element c,Statistics statistics,Stereotype s,
						OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
						Constraint constraint,
						Map<Property,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> propertyBodyMap,
						Map<Class,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap){
					ValueSpecification vs = constraint.getSpecification();
					statistics.constraints++;
					if (OpaqueExpression.class.isInstance(vs)) {
						statistics.specifications++;
						OpaqueExpression oe = (OpaqueExpression) vs;
						Vector<String> languages=new Vector<String>(oe.getLanguage());
						Vector<String> bodies=new Vector<String>(oe.getBody());
						for(int i=0;i<languages.size();i++){
							String language=languages.get(i);
							if (language.startsWith("OCL")&&i<bodies.size()) {
								String body=bodies.get(i);
								validateBody(statistics,helper,c,body,s,ocl,constraint,propertyBodyMap,classBodyMap);
							}
							
						}
						/ *
						for (String language : oe.getLanguages()) {
							statistics.languages++;
							if (language.startsWith("OCL")) {
								statistics.ocllanguages++;
								for (String body : oe.getBodies()) {
									statistics.bodies++;
									validateBody(statistics,helper,c,body,s,ocl,constraint,propertyBodyMap,classBodyMap);
								}
							}else{
								if(false)
								if(statistics.languages<10){
									System.out.println("NOT AN OCL LANGUAGE "+language+" for stereotype "+s.getName());
								}
							}
						}
						* /
					}
				}
					static protected boolean hadError=false;
				 protected void validateBody(Statistics statistics,
							OCLHelper<Classifier, Operation, Property, Constraint> helper,
							Element c,String body,Stereotype s,
							OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
							Constraint constraint,
							Map<Property,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> propertyBodyMap,
							Map<Class,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap){
						try {
							 log("validateBody "+body+" : "+constraint.getName());
							for(Element element:constraint.getConstrainedElement()){
								String constraintName=constraint.getName();
								
								if(Class.class.isInstance(element)){
//									Class metac = (Class)element;//OCLUMLUtil.getMetaclass(element);
									//Class metac = OCLUMLUtil.getMetaclass(c);
									//helper.setContext(metac);
									org.eclipse.ocl.Query<Classifier, Class, EObject> eval=getClassQuery(helper,body,ocl,c,classBodyMap);
									eval.getExpression().setName(constraintName);
									check(statistics,helper,eval,ocl,c,constraint);
								}else if (Property.class.isInstance(element)){
									// TODO:enable
									if(false)return;					
									// property constraint
									Property property=(Property)element;
//									Object value=c.getValue(s,property.getName());
									Object value=ElementOperations.getValue(c,s,property.getName());
									//helper.setContext(s);
									//helper.setAttributeContext(s, property);
									//Class metac = (Class)property.getType();//OCLUMLUtil.getMetaclass(property.getType());
									if(Collection.class.isInstance(value)){
										for(Object o:((Collection)value)){
//										    helper.setInstanceContext(o);
											org.eclipse.ocl.Query<Classifier, Class, EObject> eval=getPropertyQuery(helper,body,ocl,property,o,propertyBodyMap);
											eval.getExpression().setName(constraintName);
											check(statistics,helper,eval,ocl,o,constraint);
										}
									}
									else if(value!=null){
//									    helper.setInstanceContext(value);
										org.eclipse.ocl.Query<Classifier, Class, EObject> eval=getPropertyQuery(helper,body,ocl,property,value,propertyBodyMap);
										eval.getExpression().setName(constraintName);
										check(statistics,helper,eval,ocl,value,constraint);
									}
								}else{
									System.out.println("UNHANDLED constrained element "+element.eClass().getName());
								}
							}
						} catch (Throwable t2) {
							if(hadError)return;
							hadError=true;
							t2.printStackTrace();
							// System.out.println("ERROR invariant  = "+body+", "+ocl.getEnvironment().getUMLReflection()+","+t2);
							System.out
									.println("ERROR invariant  = "
											+ body
//											+ ", "+ ocl.getEnvironment().getUMLReflection().getSpecification(constraint)
											+ ","
											+ constraint
													.getSpecification()
											+ "," + t2);

						}
						
					}
					*/
	  /*
					protected  org.eclipse.ocl.Query<Classifier, Class, EObject> getPropertyQuery( 
							OCLHelper<Classifier, Operation, Property, Constraint> helper,
							String body,
							OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
							Property property,Object value,
							Map<Property,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> propertyBodyMap) throws ParserException{
						Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>> classQueryMap=propertyBodyMap.get(property);
						if(classQueryMap==null){
							classQueryMap=new HashMap<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>();
							propertyBodyMap.put(property,classQueryMap);
						}
						org.eclipse.ocl.Query<Classifier, Class, EObject> eval = classQueryMap.get(body);
						if(eval!=null)return eval;
					    helper.setInstanceContext(value);
						Constraint invariant= helper.createInvariant(body);
						eval = ocl.createQuery(invariant);
						classQueryMap.put(body,eval);
						return eval;
					}
					*/
					protected int getDiagnosticError(Constraint constraint){
						int result=Diagnostic.ERROR;
						// base on visibility of constraint
						if(VisibilityKindEnum.PROTECTED.equals(constraint.getVisibility())){
							result=Diagnostic.WARNING;
						}
						else if(!VisibilityKindEnum.PUBLIC.equals(constraint.getVisibility())){
							result=Diagnostic.INFO;
						}
						return result;
					}
/*					
					protected  void check(Statistics statistics, OCLHelper<Classifier, Operation, Property, Constraint> helper,
//							String body,
							org.eclipse.ocl.Query<Classifier, Class, EObject> eval,
							OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
							Object c,Constraint constraint
							) throws ParserException{
//						Constraint invariant= helper.createInvariant(body);
//						org.eclipse.ocl.Query<Classifier, Class, EObject> eval = ocl.createQuery(invariant);
						boolean check = eval.check(c);
//						System.out.println("check "+check+" "+eval.getExpression().getName()+" "+eval.queryText()+", "+c);
						if (!check) {
							DiagnosticChain diagnostics=statistics.diagnostics;
							
							diagnostics.add(createDiagnostic
					    (getDiagnosticError(constraint),
				                DIAGNOSTIC_SOURCE,1, "OCL: "+eval.getExpression().getName()+" at "+(Element.class.isInstance(c)?getQualifiedName((Element)c):(c==null?"":c))
				                //+" "+eval.queryText()+" "+getHdfStereotypes((Element)c,false)
				                ,new Object [] {c }));
							/ *
							System.out
									.println("found invariant "
											+eval.getExpression()
											+ " = "
//											+ body
											+ ", "
											+ check
//											+ ", stereotyped with "
//											+ s.getName()
											+", value="+c+"("+c.getClass().getName()+")"
											);
											* /
						}
						
					}
					*/
protected String filterHtml(String html){
	String result=html;
	int body=result.indexOf("<body>");
	if(body>=0)result=result.substring(body+6);
	body=result.indexOf("</body>");
	if(body>=0)result=result.substring(0,body);
	result=result.replaceAll("</p>","").replaceAll("<b>","").replaceAll("</b>","")
		.replaceAll("<i>","").replaceAll("</i>","")
		.replaceAll("<p[^>]*>","")
		.replaceAll("<a[^>]*>","")
		.replaceAll("<font[^>]*>","").replaceAll("</font>","")
		.replaceAll("</a>","")
		.replaceAll("&quot;","\"")
		.replaceAll("&amp;","&")
		.replaceAll("&lt;","<")
		.replaceAll("&gt;",">")
		;
	// whitespace
	return result.replaceAll("\\n"," ").replaceAll("\\t"," ").replaceAll("\\r"," ").replaceAll("  "," ");
}
	protected  void oclCheck(DiagnosticChain diagnostics, org.eclipse.ocl.Query<Classifier, Class, EObject> eval,Object c,Constraint constraint
		) {
		//System.out.println("oclCheck SUPPRESS start "+constraint.getQualifiedName()+", "+(NamedElement.class.isInstance(c)?((NamedElement)c).getQualifiedName():c));
	
		boolean check = eval.check(c);
		//log("oclCheck done constraint="+constraint.getQualifiedName()+", "+(NamedElement.class.isInstance(c)?((NamedElement)c).getQualifiedName():c)+" = "+check);
		//log("oclCheck "+check+" "+eval.getExpression().getName()+" "+eval.queryText()+", "+c);
		if (!check) {
			String constraintComment=" ";
			// there may be additional info in tags; qualified name probably not needed
			// or do we reroute the error to an Annotation?
			// abbreviation, errorMessage, severity
			
			for(Comment comment:constraint.getOwnedComment()){
				constraintComment+=filterHtml(comment.getBody());
			}
			diagnostics.add(createDiagnostic(getDiagnosticError(constraint),
                DIAGNOSTIC_SOURCE,1, 
                "OCL: "+eval.getExpression().getName()
                +" "
//                +" at "+(Element.class.isInstance(c)?getQualifiedName((Element)c):(c==null?"":c))
                +constraintComment
                ,new Object [] {c })
              );
		}
	}
					
	public  org.eclipse.ocl.Query<Classifier, Class, EObject> getClassQuery(String body,Classifier c) throws ParserException{
		//try {
			return getClassQuery(getOCLHelper(),body,getOCL(),c,getClassBodyMap());
			/*
		} catch (ParserException e) {
			log("ERROR:getClassQuery "+e);
			return null;
		}
		*/
	}
	protected  org.eclipse.ocl.Query<Classifier, Class, EObject> getMetaClassQuery(String body,Element c) throws ParserException{
		//try {
			return getMetaClassQuery(getOCLHelper(),body,getOCL(),c,getClassBodyMap());
			/*
		} catch (ParserException e) {
			log("ERROR:getClassQuery "+e);
			return null;
		}
		*/
	}
	//protected Map<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap=new HashMap<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>>();
	protected Map<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> getClassBodyMap(){
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null){
			return new HashMap<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>>();
		}
		return projectCache.getClassBodyMap();
//		return classBodyMap;
		}
	protected UMLEnvironmentFactory umlFactory = new NIEMUMLEnvironmentFactory(new ResourceSetImpl());
	protected OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl
		= OCL.newInstance(umlFactory);
	protected OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> getOCL(){return ocl;}
	protected OCLHelper<Classifier, Operation, Property, Constraint> helper = ocl.createOCLHelper();
	protected OCLHelper<Classifier, Operation, Property, Constraint> getOCLHelper(){return helper;}
	protected  org.eclipse.ocl.Query<Classifier, Class, EObject> getMetaClassQuery( 
			OCLHelper<Classifier, Operation, Property, Constraint> helper,
			String body,
			OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
			Element c,
			Map<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap) throws ParserException{
		Class metac = OCLUMLUtil.getMetaclass(c);
		return getClassQuery(helper,body,ocl,metac,classBodyMap);
	}					
					protected  org.eclipse.ocl.Query<Classifier, Class, EObject> getClassQuery( 
							OCLHelper<Classifier, Operation, Property, Constraint> helper,
							String body,
							OCL<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> ocl,
//							Element c,
							Classifier metac,
							Map<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap) throws ParserException{
//System.out.println("getClassQuery "+body+", "+metac.getQualifiedName());						
						//Class metac = OCLUMLUtil.getMetaclass(c);
						Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>> classQueryMap=classBodyMap.get(metac);
						if(classQueryMap==null){
							classQueryMap=new HashMap<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>();
							classBodyMap.put(metac,classQueryMap);
						}
						org.eclipse.ocl.Query<Classifier, Class, EObject> eval = classQueryMap.get(body);
						if(eval!=null)return eval;
						helper.setContext(metac);
						Constraint invariant= null;
//System.out.println("getClassQuery SUPPRESS createInvariant "+body+", "+metac.getQualifiedName()+", "+helper.getClass().getName()+", "+ocl.getClass().getName());
//if(true)return null;// up to this point no corruption
//helper.setValidating(false);
						 //org.eclipse.ocl.internal.helper.OCLHelperImpl x;
						// startup session here for created Constraint, then back out updates
						boolean isSessionCreated=NIEMHelper.createSession("invariant construction");
						try{
						//try{
							// this causes model corruption
//						 invariant= helper.createInvariant(body);
						 invariant= createInvariant(helper,body);
						 /*
						}catch(Exception e){
							
							log("getClassQuery invariant EXCEPTION context "+((NamedElement)metac).getQualifiedName()+", "+metac.getQualifiedName()+", body "+body+" : "+e);
							return null;
						}
						*/
						/*
System.out.println("getClassQuery SUPPRESS createQuery "+invariant+", "+body+", "+metac.getQualifiedName()+", "+helper.getClass().getName()+", "+ocl.getClass().getName());
if(true){
	// can we destroy the constraint now?
	// must be in session
	if(invariant!=null){
		boolean isSessionCreated=NIEMHelper.createSession("destroy constraint");
		try{
		metac.getOwnedRule().add(invariant);// needs to have some parent before being destroyed
		NIEMHelper.removeElement(invariant);
		}finally{
			NIEMHelper.closeSession(isSessionCreated);
		}
	}
	
	return null;
}
*/
						try{
						eval = ocl.createQuery(invariant);
						}catch(Exception e){
							log("getClassQuery createQuery EXCEPTION "+invariant+" : "+e);
							return null;
						}
						showEval(eval);
						classQueryMap.put(body,eval);
					}finally{
						NIEMHelper.cancelSession(isSessionCreated);
					}
					//	System.out.println("getClassQuery complete "+invariant+", "+body+", "+metac.getQualifiedName()+", "+helper.getClass().getName()+", "+ocl.getClass().getName());
							// can we destroy the constraint now?
							// must be in session
						/*
							if(invariant!=null){
								boolean isSessionCreated=NIEMHelper.createSession("destroy constraint");
								try{
								metac.getOwnedRule().add(invariant);// needs to have some parent before being destroyed
								NIEMHelper.removeElement(invariant);
								}finally{
									NIEMHelper.closeSession(isSessionCreated);
								}
							}
							*/
						return eval;
					}
					protected void showEval(org.eclipse.ocl.Query<Classifier, Class, EObject> eval){
						if(eval==null)return;
						OCLExpression expression=eval.getExpression();
						showExpression(expression);
					}
					protected void showExpression(OCLExpression expression){
if(true)return;// TODO						
						if(expression==null)return;
						Object type=expression.getType();
						System.out.println("eval expression "+expression+", "+expression.getName()+", "+type+", "+((type instanceof Type)?((Type)type).getQualifiedName()+"/"+type.getClass().getName():"")+", "+expression.getClass().getName());
						if(expression instanceof CallExp){
							CallExp callExp=(CallExp)expression;
							OCLExpression source=callExp.getSource();
							System.out.println("eval callExp source "+source);
							if(source!=null)showExpression(source);
							if(expression instanceof FeatureCallExp){
								FeatureCallExp featureCallExp=(FeatureCallExp)expression;
								//System.out.println("eval featureCallExp ");
								if(expression instanceof OperationCallExp){
									OperationCallExp operationCallExp=(OperationCallExp)expression;
									Object operation=operationCallExp.getReferredOperation();
									System.out.println("eval operationCallExp "+operation+", "+((operation instanceof Operation)?((Operation)operation).getQualifiedName():""));
									for(Object oce:operationCallExp.getArgument()){
										System.out.println("eval argument "+oce+", "+oce.getClass().getName());
										if(oce instanceof OCLExpression){
											showExpression((OCLExpression)oce);
										}
									}
								}
								else if(expression instanceof NavigationCallExp){
									NavigationCallExp navigationCallExp=(NavigationCallExp)expression;
									Object navigationSource=navigationCallExp.getNavigationSource();
									System.out.println("eval navigationCallExp navigationSource "+navigationSource+", "+((navigationSource instanceof Property)?((Property)navigationSource).getQualifiedName():""));
									if(expression instanceof PropertyCallExp){
										PropertyCallExp propertyCallExp=(PropertyCallExp)expression;
										Object referredProperty=propertyCallExp.getReferredProperty();
										System.out.println("eval PropertyCallExp referredProperty "+referredProperty+", "+((referredProperty instanceof Property)?((Property)referredProperty).getQualifiedName():""));
									}
								}
							}
							else if(expression instanceof LoopExp){
								LoopExp loopExp=(LoopExp)expression;
								OCLExpression body=loopExp.getBody();
								System.out.println("eval loopExp body "+body);
								for(Object variableTest:loopExp.getIterator()){
									Variable variable=(Variable)variableTest;
									System.out.println("eval loopExp variable "+variable);
								}
								if(body!=null)showExpression(body);
							}
						}
						
					}
					private boolean validating = true;

					protected Constraint createInvariant(OCLHelper<Classifier, Operation, Property, Constraint> helper,String expression)
						throws ParserException
					{
						if (removeOCLComments(expression).length() > 0) {
							// be sure to pass the original expression along to get the right
							//    position information when parse fails
							try {
								return parseInvariant(
										helper, expression, validating, ocl.isParseTracingEnabled());
							} catch (RuntimeException e) {
								try {
									propagate(e, "createInvariant");
								} catch (ParserException e1) {
									
									System.out.println("createInvariant "+e1);
									e1.printStackTrace();
								} //$NON-NLS-1$
								/*
							} catch (ParserException e) {
								
								System.out.println("createInvariant "+e);
								e.printStackTrace();
								*/
							}
						}
						
						return createNullCondition(helper,helper.getEnvironment().getOCLStandardLibrary().getBoolean());

					}
					private <C> Constraint createNullCondition(OCLHelper<Classifier, Operation, Property, Constraint> helper,Classifier type) {
						UMLReflection<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint> uml = ocl.getEnvironment().getUMLReflection();
				        OCLFactory oclFactory = ocl.getEnvironment().getOCLFactory();

						OCLExpression<Classifier> condition;
						
				        OCLStandardLibrary<Classifier> stdlib = helper.getEnvironment().getOCLStandardLibrary();
				        
						if (type == stdlib.getBoolean()) {
							BooleanLiteralExp<Classifier> literal =
								oclFactory.createBooleanLiteralExp();
							condition = literal;
							uml.setType(literal, helper.getEnvironment().getOCLStandardLibrary().getBoolean());
							literal.setBooleanSymbol(Boolean.FALSE);
						} else {
							UnspecifiedValueExp<Classifier> unspec =
								oclFactory.createUnspecifiedValueExp();
							condition = unspec;
							
							if (type == null) {
								type = helper.getEnvironment().getOCLStandardLibrary().getOclVoid();
							}
							
							uml.setType(unspec, type);
						}
						
						Constraint result = uml.createConstraint();
						
						ExpressionInOCL<Classifier, Parameter> spec = uml.createExpressionInOCL();
						spec.setBodyExpression(condition);
						spec.setContextVariable((Variable<Classifier, Parameter>) helper.getEnvironment().getSelfVariable());
						
						uml.setSpecification(result, spec);
						return result;
					}
					
//					static 
					<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
//					<PK, Classifier, Operation, Property, EL,PM,S,COA,SSA, Constraint, CLS,E>
					Constraint
//					CT
					parseInvariant(
							OCLHelper<Classifier, Operation, Property, Constraint> helper,
							String expression,
							boolean validate,
				            boolean trace) throws ParserException {
						
						Environment<?, Classifier, Operation, Property, ?, ?, ?, ?, ?, Constraint, ?, ?> env = helper.getEnvironment();
						
						OCLAnalyzer<?, Classifier, Operation, Property, ?, ?, ?, ?, ?, Constraint, ?, ?> analyzer =
//						OCLAnalyzer<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> analyzer =
								createAnalyzer(env, "inv:", expression, trace); //$NON-NLS-1$
//System.out.println("parseInvariant SUPPRESS parseInvOrDefCS "+expression+", "+trace+","+analyzer);
//if(true)return null;// ok to here
						Constraint
						//CT
						result = analyzer.parseInvOrDefCS();
//System.out.println("parseInvariant SUPPRESS checkForErrors "+expression+", "+trace+","+analyzer+", "+result+", "+result.getQualifiedName());
//if(true)return result;// failes before here
						//System.out.println("parseInvariant  checkForErrors "+expression+", "+trace+","+analyzer+", "+result+", "+result.getQualifiedName());
						checkForErrors(helper);
						//System.out.println("parseInvariant  validate ");
						ValueSpecification debugVS=result.getSpecification();
						if(debugVS instanceof ExpressionInOCL){
							ExpressionInOCL expressionInOCL=(ExpressionInOCL)debugVS;
							OCLExpression oclExpression=expressionInOCL.getBodyExpression();
							//System.out.println("parseInvariant  oclExpression "+oclExpression);
							//showExpression(oclExpression);
						}
						
						if (validate) {
							validate(env, result);
						}
						
						finishAnalyzing(helper);
						
						persist(helper, result);
						
						return result;
					}
					private static <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
					void persist(
							OCLHelper<Classifier, Operation, Property, Constraint> helper,
							Constraint constraint) {
						
						EObject constraintEObject = (EObject) constraint;
						
						if (constraintEObject.eResource() == null) {
							helper.getEnvironment().getTypeResolver().getResource().getContents().add(
							    constraintEObject);
						}
						
						helper.getOCL().getConstraints().add(constraint);
					}
					
					private 
					//static 
					<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
					void finishAnalyzing(OCLHelper<Classifier, Operation, Property, Constraint> helper)
					throws ParserException {
						
						ProblemHandler ph = OCLUtil.getAdapter(helper.getEnvironment(),
							ProblemHandler.class);
						if (ph != null) {
							ph.endParse();
						}
						
						checkForErrors(helper);
					}
					
					private static <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
					void validate(
							Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> env,
							CT constraint) throws ParserException {
						
						ValidationVisitor.getInstance(env).visitConstraint(constraint);
					}
					
					private 
					//static 
					<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
					void checkForErrors(
							OCLHelper<Classifier, Operation, Property, Constraint> helper)
						throws ParserException {
						
						try {
							setProblems(OCLUtil.checkForErrors(helper.getEnvironment()));
						} catch (ParserException e) {
							//System.out.println("checkForErrors "+e+", "+e.getDiagnostic());
							setProblems(e.getDiagnostic());
							throw e;
						}
					}
					//static 
					void setProblems(Diagnostic problemsIn) {
//						NIEMValidator.problems = problems;
						problems = problemsIn;
					}
					public Diagnostic getProblems(){return problems;}
				    private 
				    //static 
				    Diagnostic problems;

					private 
					//static 
					<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
					OCLAnalyzer<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
//					OCLAnalyzer<?, Classifier, Operation, Property, ?, ?, ?, ?, ?, Constraint, ?, ?> 
					
					createAnalyzer(
							Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> env,
							String prefix,	String text,
				            boolean trace) {
						
						// we prefix the constraint with "inv:", "pre:", "def:", etc. which the
						//    user cannot see, so we want error reporting to be relative
						//    to line 0, not line 1.  Also, clear any old diagnostics
						ProblemHandler ph = OCLUtil.getAdapter(env, ProblemHandler.class);
						if (ph != null) {
							ph.setErrorReportLineOffset(-1);
							ph.beginParse();
						}
						//System.out.println("createAnalyzer "+env.getFactory().getClass().getName()+", "+env.getClass().getName());
						OCLAnalyzer<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
//						OCLAnalyzer<?, Classifier, Operation, Property, ?, ?, ?, ?, ?, Constraint, ?, ?> 
						result = 
						//env.getFactory().createOCLAnalyzer(env, prefix + '\n' + text);
						
						 new OCLAnalyzer<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>(env, prefix + '\n' + text);

						
						// offset the character position by the length of the extra text
						result.setCharacterOffset(-(prefix.length() + 1)); // one for the newline
						
						result.setTraceFlag(trace);
						
						return result;
					}
					
					/**
					 * Propagates the specified exception as a parsing exception, with
					 * the requisite tracing.
					 * 
					 * @param e the exception to propagate
					 * @param method the name of the method that caught the exception
					 * 
					 * @throws the exception wrapped in an {@link ParserException}
					 */
					private void propagate(Exception e, String method) throws ParserException {
						//OCLPlugin.catching(getClass(), method, e);
						ParserException ope = new ParserException(e.getLocalizedMessage(), e);
						//OCLPlugin.throwing(getClass(), method, ope);
						
						throw ope;
					}
					
					/**
					 * Strips any leading, trailing, or embedded comments from the specified OCL
					 * expression text.
					 * 
					 * @param txt an OCL expression
					 * @return the same, but without any comments.  Note that the result
					 *     may be an empty String if <code>txt</code> has only comments
					 */
					private String removeOCLComments(String txt) {
						try {
							return getLogicalLine(txt);
						} catch (Exception ex) {
							catchException(ex, getClass(), "removeOCLComments");//$NON-NLS-1$
						}
						return EMPTY;
					}
					static final String EMPTY = ""; //$NON-NLS-1$
					static final int NONE = -1;
					static final String OCL_COMMENT = "--"; //$NON-NLS-1$

					static void catchException(Exception exception, java.lang.Class<? extends NIEMValidator> class1,
							String methodName) {
							//OCLPlugin.catching(clazz, methodName, exception);
						}

					static String getLogicalLine(String txt) throws Exception {
						LineNumberReader reader = new LineNumberReader(new StringReader(txt
							.trim()));
						String logicalLine = EMPTY;
						int embeddedCommnetIndex = NONE;
						String line = reader.readLine();
						while (line != null) {
							line = line.trim();
							if (line.startsWith(OCL_COMMENT) == false) {
								// safe to search for index of "--" which consists of BMP code points
								embeddedCommnetIndex = line.indexOf(OCL_COMMENT);
								if (embeddedCommnetIndex != NONE) {
									line = line.substring(0, embeddedCommnetIndex);
									line = line.trim();
								}
								logicalLine = logicalLine + line + ' ';
							}
							line = reader.readLine();
						}
						return logicalLine;
					}
					
/*
					 protected Classifier getUmlClass(EClass eClass){
							EAnnotation annotation=eClass.getEAnnotation("http://www.eclipse.org/uml2/2.0.0/UML");
							if(annotation==null){
								//System.out.println("getUmlClass FAILED to get uml class for "+eClass.getName());
								return null;
							}
							return (Classifier)annotation.getReferences().get(0);
						}
						static public class Statistics{
							int classifiers = 0;
							int constraints = 0;
							int specifications = 0;
							int languages = 0;
							int ocllanguages = 0;
							int bodies = 0;
							int stereotypes = 0;
							int stereotypeValues = 0;
							int stereotypeValueConstraints = 0;
							int complexDatatypeValues = 0;
							int complexDatatypeConstraints = 0;
							DiagnosticChain diagnostics;
						}
						*/
					 	/**
					 	 * @param diagnostic
					 	 * @param result
					 	 * @param resource
					 	 * @throws Exception
					 	 */
/*					
					 	protected void validateDiagnostic(Diagnostic diagnostic) throws Exception{
					 		if(diagnostic.getSeverity()!=Diagnostic.OK){
					 			processDiagnosticError(diagnostic);
					 		}
					 		for(Diagnostic child:diagnostic.getChildren()){
					 			validateDiagnostic(child);
					 		}
					 	}
*/					 	
					 	/**
					 	 * @param diagnostic
					 	 * @param result
					 	 * @param resource
					 	 * @throws Exception
					 	 */
/*
					 	protected void processDiagnosticError(Diagnostic diagnostic) throws Exception{
					 		int severity=diagnostic.getSeverity();
					 		String errorLine=diagnostic.getMessage();
					 		String errorMessage=errorLine;
					 		if(diagnostic.getException()!=null)errorMessage+="\n"+diagnostic.getException().getMessage();
							//ValidatorMessage validatorMessage=ValidatorMessage.create(errorLine,resource); 
							//validatorMessage.setType(getMarkerType());
							boolean isFirstEObject=true;
							if(diagnostic.getData()!=null)
					 		for(Object object:diagnostic.getData()){
					 			String dataValue=object.toString();
					 			if(EObject.class.isInstance(object)){
					 				URI uri=EcoreUtil.getURI((EObject)object);
					 				if(uri!=null&&uri.fragment()!=null){
					 					dataValue=uri.fragment();
					 					if(isFirstEObject){
					 						//validatorMessage.setAttribute(IMarker.LOCATION,dataValue);
					 						//validatorMessage.setAttribute(EValidator.URI_ATTRIBUTE,uri.toString());
					 						isFirstEObject=false;
					 					}
					 				}
					 			}
					 			errorMessage+="\n"+dataValue;
					 		}
							//if(validatorMessage.getAttribute(IMarker.LOCATION)==null)return;
							/ *
							 validatorMessage.setAttribute(IMarker.SEVERITY,
							 
									severity==Diagnostic.ERROR?IMarker.SEVERITY_ERROR
											:severity==Diagnostic.WARNING?IMarker.SEVERITY_WARNING:
												IMarker.SEVERITY_INFO
									);
									* /
							//validatorMessage.setAttribute(IMarker.MESSAGE,errorMessage);
							//validatorMessage.setAttribute(IMarker.LINE_NUMBER,lineNumber);
							//result.add(validatorMessage);
									System.out.println("diagnostic "+errorMessage+", "+diagnostic.getSource());
					 	}
*/					 	
////////////////////////////////////////////////////////////////////////////////
////////////////////////
}

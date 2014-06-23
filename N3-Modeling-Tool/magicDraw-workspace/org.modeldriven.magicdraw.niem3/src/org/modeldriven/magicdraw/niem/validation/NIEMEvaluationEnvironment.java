/**
 * 
 */
package org.modeldriven.magicdraw.niem.validation;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.uml2.uml.MultiplicityElement;
/*
import org.eclipse.ocl.uml.UMLEnvironmentFactory;
import org.eclipse.ocl.uml.UMLEvaluationEnvironment;
*/
/*
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
*/
import org.modeldriven.magicdraw.niem.validation.ocl.TypeType;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLEnvironmentFactory;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLEvaluationEnvironment;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.BehavioralFeatureOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.BehavioredClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.DataTypeOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementImportOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ExtensionOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.NamedElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.NamespaceOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PackageOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PropertyOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.RedefinableElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.StereotypeOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.TypeOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ValueSpecificationOperations;

import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.BehavioralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.RedefinableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.BehavioredClassifier;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class NIEMEvaluationEnvironment extends UMLEvaluationEnvironment {
	NIEMEvaluationEnvironment(UMLEnvironmentFactory factory) {
        super(factory);
    }

	NIEMEvaluationEnvironment(
            EvaluationEnvironment<Classifier, Operation, Property, Class, EObject> parent) {
        super(parent);
    }
    
    public Object callOperation(Operation operation, int opcode, Object source,
            Object[] args) {
    	//System.out.println("callOperation "+operation.getName()+", "+source+", "+((source instanceof NamedElement)?((NamedElement)source).getQualifiedName():"")+", "+args);
    	if(source instanceof InstanceSpecification){
    		InstanceSpecification instanceSpecification=(InstanceSpecification)source;
    		if("invalid".equals(instanceSpecification.getName()))return source;
        	//System.out.println("callOperation InstanceSpecification "+instanceSpecification.getQualifiedName() +", "+instanceSpecification.getSlot());
    	}
    	//log("callOperation "+operation.getQualifiedName()+", "+opcode+", "+source+", "+args);
//    	Constraint testConstraint=operation.getBodyCondition();
//        if ((testConstraint == null)||!"NIEMEnvironment".equals(testConstraint.getName())) {
//        if (operation.getEAnnotation("NIEMEnvironment") == null) {
//        if (operation.getMDExtension("NIEMEnvironment") == null) {
      if (ElementOperations.getMDExtension(operation,"NIEMEnvironment") == null) {
            // not our custom regex operation
            return super.callOperation(operation, opcode, source, args);
        }
      String name=operation.getName();
  	//System.out.println("callOperation start");

        /*
        if ("regexMatch".equals(operation.getName())) {
            Pattern pattern = Pattern.compile((String) args[0]);
            Matcher matcher = pattern.matcher((String) source);
            
            return matcher.matches()? matcher.group() : null;
        }
        */
      // string operations from qvt
  	try{
      if ("startsWith".equals(name)) {
        	//System.out.println("startsWith start "+source+", "+args[0]);
        	if(!(source instanceof String))return true;// test
      	boolean result= ((String)source).startsWith((String) args[0]);
      	//System.out.println("startsWith "+source+", "+args[0]+" = "+result);
      	return result;
      }
      if ("endsWith".equals(name)) {
      	//System.out.println("endsWith start "+source+", "+args[0]);
      	//if(!(source instanceof String))return true;// test
    	  boolean result= ((String)source).endsWith((String) args[0]);
      	//System.out.println("endsWith "+source+", "+args[0]+" = "+result);
      	return result;
      }
      if ("match".equals(name)) {
      	return ((String)source).matches((String) args[0]);
      }
      if ("firstToUpper".equals(name)) {
      	String pattern=(String)source;
      	if((pattern==null)||(pattern.length()==0))return "";
      	if(pattern.length()==1)return pattern.toUpperCase();
      	return pattern.substring(0,1).toUpperCase()+pattern.substring(1);
      }
      
      if ("contains".equals(name)) {
      	return ((String)source).contains((String) args[0]);
      }
      if ("normalizeSpace".equals(name)) {
      	String trimmed=((String)source).trim();
      	// replaces all internal sequences of white space with a single space.
      	trimmed=trimmed.replaceAll("(\\s)+", " ");
      	return trimmed;
      }
      /////////new
      if ("substringBefore".equals(name)) {
    	  int index=((String)source).indexOf((String) args[0]);
    	  String result="";
    	  if(index>0)result=((String)source).substring(0,index);
    	  return result;
        }
      if ("substringAfter".equals(name)) {
    	  String arg=(String) args[0];
    	  String sourceString=(String)source;
    	  int index=sourceString.indexOf(arg);
    	  String result="";
    	  if(index>=0){
    		  int indexAfter=index+arg.length();
    		  if(indexAfter<sourceString.length())result=sourceString.substring(indexAfter);
    	  }
    	  return result;
        }
      if ("lastToUpper".equals(name)) {
        	String pattern=(String)source;
        	if((pattern==null)||(pattern.length()==0))return "";
        	if(pattern.length()==1)return pattern.toLowerCase();
        	return pattern.substring(0,pattern.length()-1)+pattern.substring(pattern.length()-1).toUpperCase();
        }
      if ("trim".equals(name)) {
        	String trimmed=((String)source).trim();
        	return trimmed;
        }
      if ("replace".equals(name)) {
    	  String arg=(String) args[0];
    	  String arg2=(String) args[1];
    	  String sourceString=(String)source;
    	  String result=sourceString.replace(arg,arg2);
    	  return result;
        }
      if ("quotify".equals(name)) {
    	  String arg=(String) args[0];
    	  String sourceString=(String)source;
    	  String result=arg+sourceString+arg;
    	  return result;
        }
      if ("unquotify".equals(name)) {
    	  String arg=(String) args[0];
    	  String result=(String)source;
    	  if(result.endsWith(arg))result=result.substring(0,result.length()-arg.length());
    	  if(result.startsWith(arg))result=result.substring(arg.length());
    	  return result;
        }
      ////non-string result
      if ("matchBoolean".equals(name)) {
    	  String sourceString=((String)source).toUpperCase();
    	  return ("TRUE".equals(sourceString))
    			  ||("FALSE".equals(sourceString))
    			  ||("0".equals(sourceString))
    			  ||("1".equals(sourceString))
    			  ;
        }
      if ("matchInteger".equals(name)) {
    	  String sourceString=((String)source).toUpperCase();
    	  try{
    	  Integer.parseInt(sourceString);
    	  return true;
    	  }catch(Exception e){
    		  return false;
    	  }
        }
      if ("matchFloat".equals(name)) {
    	  String sourceString=((String)source).toUpperCase();
    	  try{
    	  Float.parseFloat(sourceString);
    	  return true;
    	  }catch(Exception e){
    		  return false;
    	  }
        }
      if ("matchIdentifier".equals(name)) {
    	  String sourceString=((String)source).toUpperCase();
    	  return sourceString.matches("[a-zA-Z](\\w)*");
        }
      if ("asBoolean".equals(name)) {
    	  String sourceString=((String)source);
    	  try{
    		  return Boolean.parseBoolean(sourceString);
    	  }catch(Exception e){
    		  return null;
    	  }
        }
      if ("asInteger".equals(name)) {
    	  String sourceString=((String)source);
    	  try{
    		  return Integer.parseInt(sourceString);
    	  }catch(Exception e){
    		  return null;
    	  }
        }
     
      if ("asFloat".equals(name)) {
    	  String sourceString=((String)source);
    	  try{
    		  return Float.parseFloat(sourceString);
    	  }catch(Exception e){
    		  return null;
    	  }
        }
     
      if ("indexOf".equals(name)) {
    	  String arg=(String) args[0];
    	  String sourceString=((String)source);
    	  return sourceString.indexOf(arg);
        }
      if ("find".equals(name)) {
    	  String arg=(String) args[0];
    	  String sourceString=((String)source);
    	  return sourceString.indexOf(arg);
        }
      if ("rfind".equals(name)) {
    	  String arg=(String) args[0];
    	  String sourceString=((String)source);
    	  return sourceString.lastIndexOf(arg);
        }
      if ("isQuoted".equals(name)) {
    	  String arg=(String) args[0];
    	  String sourceString=((String)source);
    	  return sourceString.startsWith(arg)&&sourceString.endsWith(arg);
        }
      /////////////////////////////////
      if ("repr".equals(name)) {
        	return source.toString();
        }
      ///////////////////////////////// qvt element operations
      if ("metaClassName".equals(name)) {
    	Class baseClass= getBaseClass((Element)source);
    	String metaClassName=null;
    	if(baseClass!=null)metaClassName=baseClass.getName();
    	return metaClassName;
      }
      if ("subobjects".equals(name)) {
      	return getSubobjects((Element)source);
      }
      if ("allSubobjects".equals(name)) {
        	return new HashSet<Element>(ElementOperations.allOwnedElements((Element)source));
        }
      if ("subobjectsOfType".equals(name)) {
        	Set<Element> result= new HashSet<Element>();
        	Classifier baseType=(Classifier) args[0];
        	if(baseType!=null)
    	  for(Element element:getSubobjects((Element)source)){
          	Class baseClass=getBaseClass(element);
          	if(baseType.equals(baseClass))result.add(element);
    	  }
    	  return result;
      }
      if ("allSubobjectsOfType".equals(name)) {
      	Set<Element> result= new HashSet<Element>();
      	Classifier baseType=(Classifier) args[0];
      	if(baseType!=null)
  	  for(Element element:ElementOperations.allOwnedElements((Element)source)){
        	Class baseClass=getBaseClass(element);
        	if(baseType.equals(baseClass))result.add(element);
  	  }
  	  return result;
    }
      if ("subobjectsOfKind".equals(name)) {
      	Set<Element> result= new HashSet<Element>();
      	Classifier baseType=(Classifier) args[0];
      	if(baseType!=null)
	  	  for(Element element:getSubobjects((Element)source)){
	        	Class baseClass=getBaseClass(element);
	        	if(baseClass==null)continue;
	        	if(ClassOperations.maySpecializeType(baseClass, baseType))result.add(element);
	  	  }
	  	  return result;
    }
      if ("allSubobjectsOfKind".equals(name)) {
        	Set<Element> result= new HashSet<Element>();
        	Classifier baseType=(Classifier) args[0];
        	if(baseType!=null)
  	  	  for(Element element:ElementOperations.allOwnedElements((Element)source)){
  	        	Class baseClass=getBaseClass(element);
  	        	if(baseClass==null)continue;
  	        	if(ClassOperations.maySpecializeType(baseClass, baseType))result.add(element);
  	  	  }
  	  	  return result;
      }
  	      ////////////////////////////////
      // qvt specified
      if ("stereotypedBy".equals(name)) {
      	return stereotypedBy(((Element)source),(String) args[0]);
      }
      // uml Additional Operations
      if("isConsistentWith".equals(name)) {
    	  if(source instanceof Property){
    		  return PropertyOperations.isConsistentWith((RedefinableElement)source,(RedefinableElement) args[0]);
    	  }
    	  boolean result=RedefinableElementOperations.isConsistentWith((RedefinableElement)source,(RedefinableElement) args[0]);
    	  //log("isConsistentWith "+((RedefinableElement)source).getQualifiedName()+" = "+result);
        	return result;
        }
      // new uml Additional Operations

      if("inherit".equals(name)) {
    	  
    	  EList<NamedElement> inhs=new UniqueEList.FastCompare<NamedElement>((Collection)args[0]);
    	  if(source instanceof Class){
    		  return ClassOperations.inherit((Class)source, inhs);
    	  }else	  if(source instanceof DataType){
        		  return DataTypeOperations.inherit((DataType)source, inhs);
    	  }else	  if(source instanceof Classifier){
    		  return ClassifierOperations.inherit((Classifier)source, inhs);
    	  }
    	  
        }
      
      if("mustBeOwned".equals(name)) {
    	  if(source instanceof Package){
    	  return PackageOperations.mustBeOwned((Package)source);
    	  }
    	  return ElementOperations.mustBeOwned((Element)source);
        }
      if("visibleMembers".equals(name)) {
    	  return PackageOperations.visibleMembers((Package)source);
        }
      if("makesVisible".equals(name)) {
    	  NamedElement namedElement=(NamedElement)args[0];
    	  return PackageOperations.makesVisible((Package)source,namedElement);
        }
      if("metaclassEnd".equals(name)) {
    	  return ExtensionOperations.metaclassEnd((Extension)source);
        }
      if("subsettingContext".equals(name)) {
    	  return PropertyOperations.subsettingContext((Property)source);
        }
      if("getName".equals(name)) {
    	  return ElementImportOperations.getName((ElementImport)source);
        }
      if("isDistinguishableFrom".equals(name)) {
    	  NamedElement namedElement=(NamedElement)args[0];
    	  Namespace nameSpace=(Namespace)args[1];
    	  if(source instanceof BehavioralFeature){
    	  return BehavioralFeatureOperations.isDistinguishableFrom((BehavioralFeature)source,namedElement,nameSpace);
    	  }
    	  return NamedElementOperations.isDistinguishableFrom((NamedElement)source,namedElement,nameSpace);
        }
      /* maybe TODO
      if("isAttribute".equals(name)) {
    	  return PropertyOperations.isAttribute((Property)source);
        }
        */
      if("isRedefinitionContextValid".equals(name)) {
    	  RedefinableElement redefined=(RedefinableElement) args[0];
    	  return RedefinableElementOperations.isRedefinitionContextValid((RedefinableElement)source,redefined);
        }
      if("allOwningPackages".equals(name)) {
    	  return NamedElementOperations.allOwningPackages((NamedElement)source);
        }
      /*
      if("containingProfile".equals(name)) {
    	  return StereotypeOperations.containingProfile((Stereotype)source);
        }
*/
      if("allFeatures".equals(name)) {
    	  return ClassifierOperations.allFeatures((Classifier)source);
        }
      if("parents".equals(name)) {
    	  return ClassifierOperations.parents((Classifier)source);
        }
      if("conformsTo".equals(name)) {
    	  if(source instanceof Classifier){
    	  Classifier other=(Classifier)args[0];
    	  return ClassifierOperations.conformsTo((Classifier)source,other);
    	  }
    	  Type other=(Type)args[0];
    	  return TypeOperations.conformsTo((Type)source,other);
    	  
        }
      if("allNamespaces".equals(name)) {
    	  return NamedElementOperations.allNamespaces((NamedElement)source);
        }
      if("separator".equals(name)) {
    	  return NamedElementOperations.separator((NamedElement)source);
        }
      if("getNamesOfMember".equals(name)) {
    	  NamedElement namedElement=(NamedElement)args[0];
    	  return NamespaceOperations.getNamesOfMember((Namespace)source,namedElement);
        }
      if("membersAreDistinguishable".equals(name)) {
    	  return NamespaceOperations.membersAreDistinguishable((Namespace)source);
        }
      if("allOwnedElements".equals(name)) {
    	  return ElementOperations.allOwnedElements((Element)source);
        }
      if("isComputable".equals(name)) {
    	  return ValueSpecificationOperations.isComputable((ValueSpecification)source);
        }
      if("integerValue".equals(name)) {
    	  return ValueSpecificationOperations.integerValue((ValueSpecification)source);
        }
      if("realValue".equals(name)) {
    	  return ValueSpecificationOperations.realValue((ValueSpecification)source);
        }
      if("booleanValue".equals(name)) {
    	  return ValueSpecificationOperations.booleanValue((ValueSpecification)source);
        }
      if("stringValue".equals(name)) {
    	  return ValueSpecificationOperations.stringValue((ValueSpecification)source);
        }
      if("unlimitedValue".equals(name)) {
    	  return ValueSpecificationOperations.unlimitedValue((ValueSpecification)source);
        }
      if("isNull".equals(name)) {
    	  return ValueSpecificationOperations.isNull((ValueSpecification)source);
        }
      if("allParents".equals(name)) {
    	  return ClassifierOperations.allParents((Classifier)source);
        }
      if("inheritableMembers".equals(name)) {
    	  Classifier other=(Classifier)args[0];
    	  return ClassifierOperations.inheritableMembers((Classifier)source,other);
        }
      if("hasVisibilityOf".equals(name)) {
    	  NamedElement other=(NamedElement)args[0];
    	  return ClassifierOperations.hasVisibilityOf((Classifier)source,other);
        }
      if("maySpecializeType".equals(name)) {
    	  Classifier other=(Classifier)args[0];
    	  return ClassifierOperations.maySpecializeType((Classifier)source,other);
        }
      
      /* should not be necessary
      if ("isComposite".equals(name)) {
    	  boolean result=((Property)source).isComposite();
    	  //log("isComposite "+((Property)source).getQualifiedName()+" = "+result);
        	return result;
        }
        */
        /*
        if ("validateValueSetVersionEnumeration".equals(operation.getName())) {
        	return getValueSetValidator().validate((org.eclipse.uml2.uml.Package)source);
        }
        */
        
        // eclipse operations
        if ("getNearestPackage".equals(name)) {
        	return getNearestPackage(((Element)source));
        }
        if ("getTargetDirectedRelationships".equals(name)) {
          	return getTargetDirectedRelationships(((Element)source));
          }
          if ("getSourceDirectedRelationships".equals(name)) {
            	return getSourceDirectedRelationships(((Element)source));
            }
        // other operations; questionable?
          if ("allMembers".equals(name)) {
          	return allMembers((Namespace)source);
          }
          if ("associations".equals(name)) {
          	return TypeOperations.getAssociations((Type)source);
          }
          if ("allUsedInterfaces".equals(name)) {
          	return allUsedInterfaces((Classifier)source);
          }
          if ("allImplementedInterfaces".equals(name)) {
          	return allImplementedInterfaces((BehavioredClassifier)source);
          }
          if ("getOwningStereotype".equals(name)) {
          	return getOwningStereotype((Element)source,(String)args[0]);
          }
          if ("allOwningMembers".equals(name)) {
          	return allOwningMembers((Element)source);
          }
          if ("metaClass".equals(name)) {
          	return getBaseClass((Element)source);
          }
          if ("hasAppliedStereotype".equals(name)) {
          	return hasAppliedStereotype((Element)source,(String)args[0]);
          }
          
        if ("specific".equals(name)) {
          	return specific(((Classifier)source));
          }
        if ("isAbsoluteURI".equals(name)) {
        	String pattern=(String)source;
        	try {
				URI uri=new URI(pattern);
				return uri.isAbsolute();
			} catch (URISyntaxException notAuri) {
			}
			return false;
        }
  	}catch(Throwable t){
  		System.out.println("callOperation error "+t);
  		t.printStackTrace();
  	}
        throw new UnsupportedOperationException();  // unknown operation
    }
    protected Class getBaseClass(Element element){
    	return StereotypesHelper.getBaseClass(element);
    }
    protected Set<Element>getSubobjects(Element element){
      	return new HashSet<Element>(element.getOwnedElement());
    }
    protected boolean hasAppliedStereotype(Element source,String name){
    	boolean result=getAppliedStereotype(source,name)!=null;
    	return result;
    }
    protected Stereotype getAppliedStereotype(Element source,String name){
    	Stereotype result=null;
    	for(Stereotype stereotype:ElementOperations.getAppliedStereotypes(source)){
    		if(stereotype.getName().equals(name))return stereotype;
    		for(Classifier general:ClassifierOperations.allParents(stereotype)){
        		if(general.getName().equals(name))return stereotype;
    		}
    	}
    	return result;
    }
    protected Set<Interface> allImplementedInterfaces(BehavioredClassifier element){
    	Set<Interface> result=new HashSet<Interface>();
    	for(Interface ifc:BehavioredClassifierOperations.getAllImplementedInterfaces(element)){
    		result.add(ifc);
    	}
    	//System.out.println("NIEMEvaluationEnvironment.allImplementedInterfaces "+result);
    	return result;
    }
    protected Set<Interface> allUsedInterfaces(Classifier element){
    	Set<Interface> result=new HashSet<Interface>();
    	for(Interface ifc:ClassifierOperations.getAllUsedInterfaces(element)){
    		result.add(ifc);
        	for(Classifier p:ClassifierOperations.allParents(ifc)){
        		result.add((Interface)p);
        	}
    	}
    	//System.out.println("NIEMEvaluationEnvironment.allUsedInterfaces "+result);
    	return result;
    }
    protected Set<Association> getAssociations(Type element){
    	Set<Association> result=new HashSet<Association>();
    	for(Association ifc:TypeOperations.getAssociations(element)){
    		result.add(ifc);
    	}
    	return result;
    }
    protected Stereotype getOwningStereotype(Element source,String name){
    	Stereotype result=null;
    	for(Element element:allOwningMembers(source)){
    			result=getAppliedStereotype(element,name);
    			if(result!=null)break;
    	}
    	return result;
    }
    protected Boolean stereotypedBy(Element element,String name){
    	Boolean result=StereotypesHelper.isElementStereotypedBy(element, name);
    	//log("stereotypedBy "+(NamedElement.class.isInstance(element)?((NamedElement)element).getQualifiedName():element)+" name "+name+" = "+result);
    	return result;
    }
    protected Set<DirectedRelationship> getTargetDirectedRelationships(Element element){
    	Set<DirectedRelationship> result=new HashSet<DirectedRelationship>(ElementOperations.getTargetDirectedRelationships(element));
    	//log("getTargetDirectedRelationships "+(NamedElement.class.isInstance(element)?((NamedElement)element).getQualifiedName():element)+" = "+result);
    	return result;
    }
    protected Set<DirectedRelationship> getSourceDirectedRelationships(Element element){
    	Set<DirectedRelationship> result=new HashSet<DirectedRelationship>(ElementOperations.getSourceDirectedRelationships(element));
    	//log("getSourceDirectedRelationships "+(NamedElement.class.isInstance(element)?((NamedElement)element).getQualifiedName():element)+" = "+result);
    	return result;
    }
    protected com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getNearestPackage(Element element){
    	com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package result=ElementOperations.getNearestPackage(element);
    	//log("getNearestPackage "+(NamedElement.class.isInstance(element)?((NamedElement)element).getQualifiedName():element)+" = "+(result==null?"null":result.getQualifiedName()));
    	return result;
    }
    protected EList<Classifier> specific(Classifier classifier){
    	return ClassifierOperations.specific(classifier);
    }
    protected Set<Element> allOwningMembers(Element element){
    	Set<Element> result=new HashSet<Element>();
    	try{
    	// owners via containment or import
    	allOwningMembers(element,result);
    	}catch(Throwable t){
    		t.printStackTrace();
    	}
    	return result;
    }
    protected void allOwningMembers(Element element,Set<Element> elements ){
    	if(element==null)return;
    	elements.add(element);
    	allOwningMembers((Element)element.eContainer(),elements);
    	for(DirectedRelationship dr:element.get_directedRelationshipOfTarget()){
    		if(ElementImport.class.isInstance(dr)){
    			for(Element source:dr.getSource()){
    				//System.out.println("allOwningMembers "+source+" for "+element);
    				allOwningMembers(source,elements);
    			}
    		}
    		else if(PackageImport.class.isInstance(dr)){
    				allOwningMembers(((PackageImport)dr).getImportingNamespace(),elements);
    		}
    	}
    }
    protected Set<NamedElement> allMembers(Namespace element){
    	Set<NamedElement> result=new HashSet<NamedElement>();
    	try{
    	// owners via containment or import
    		allMembers(element,result);
    	}catch(Throwable t){
    		t.printStackTrace();
    	}
    	return result;
    }
    protected void allMembers(Namespace element,Set<NamedElement> elements ){
    	if(element==null)return;
    	for(NamedElement dr:element.getMember()){
        	elements.add(dr);
    		if(Namespace.class.isInstance(dr)){
				allMembers((Namespace)dr,elements);
    		}
    	}
    }
    /*
    static protected ValueSetValidator valueSetValidator=null;
    protected ValueSetValidator getValueSetValidator(){
    	if(valueSetValidator==null){
    		valueSetValidator=new ValueSetValidator();
    	}
    	return valueSetValidator;
    }
    */
}

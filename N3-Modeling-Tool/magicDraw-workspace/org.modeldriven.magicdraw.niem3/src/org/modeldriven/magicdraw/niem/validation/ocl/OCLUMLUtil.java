package org.modeldriven.magicdraw.niem.validation.ocl;


import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.NamespaceOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PackageOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ProfileApplicationOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ProfileOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PropertyOperations;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.UsageClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Reception;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
/*
import org.eclipse.ocl.uml.internal.UMLForeignMethods;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
*/
/**
 * Utilities for resolving references to packages against a resource set and
 * finding the Ecore definitions of UML packages and classifiers in support of
 * evaluation of OCL expressions.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class OCLUMLUtil extends UMLUtil {
    // not instantiable by clients
	private OCLUMLUtil() {
		super();
	}
	
	/**
	 * <i>Foreign method</i> for the <tt>getAllReceptions()</tt> query that
	 * is missing from the UML metamodel.
	 * 
	 * @param clazz a UML class
	 * 
	 * @return the receptions that it defines and/or inherits
	 */
	public static List<Reception> getAllReceptions(Class clazz) {
		List<Reception> result = new BasicEList.FastCompare<Reception>();
		
		for (NamedElement m : getInheritedMembers(clazz)) {
			if (m instanceof Reception) {
				result.add((Reception) m);
			}
		}
		
		return result;
	}
	
    /**
     * Obtains the UML metaclass of the specified model element.  The specified
     * element must be in a resource set, otherwise the UML metamodel is not
     * available.
     * 
     * @param element an element in a UML model
     * @return the element's metaclass, or <code>null</code> if the element is
     *     not in a resource set
     */
protected static boolean first=true;
    public static Class getMetaclass(Element element) {
    	if(Stereotype.class.isInstance(element))return (Stereotype)element;

    	Classifier classifier=getClassifier(element.eClass(),null);
    	if(Class.class.isInstance(classifier))return (Class)classifier;
    	if(Class.class.isInstance(element)&&StereotypesHelper.isUML2MetaClass((Class)element) )return (Class)element;
    	
//    	return StereotypesHelper.getUML2BaseClass(element);
    	Class test1= StereotypesHelper.getUML2BaseClass(element);
    	/*
    	Class test2= StereotypesHelper.getBaseClass(element);
    	if(!test1.equals(test2)){
    		log("getMetaclass diff "+test1.getQualifiedName()+", "+test2.getQualifiedName());
    	}
    	*/
    	return test1;
    	/*
        Class result = null;
        
        ResourceSet rset = null;
        Resource res = element.eResource();
        if (res != null) {
            rset = res.getResourceSet();
        }
        
        if (rset != null) {
            result = (Class) getClassifier(element.eClass(), rset);
        }
        
        return result;
        */
    }

    /**
     * Obtains the UML classifier corresponding to the specified Ecore classifier,
     * which is the type of some object in an OCL expression evaluation.
     * 
     * @param eclassifier an Ecore definition of a UML classifier
     * @param rset the resource set in which to look for the corresponding UML
     *     classifier
     *     
     * @return the corresponding UML classifier, or <code>null</code> if not found
     */
//	StereotypesHelper.getUML2BaseClass(Element element)
	public static Classifier getClassifier(EClassifier eclassifier, ResourceSet rset) {
		/*
		Classifier result = null;
		EPackage epackage = eclassifier.getEPackage();
		Package umlPackage = getUMLMetamodel(rset);
		if (umlPackage != null) {
			result = (Classifier) NamespaceOperations.getMember(umlPackage,
					eclassifier.getName(),
					false,
					MdkernelPackage.Literals.CLASSIFIER);
	    }
		*/
		// without eclipse uml model, this will never work
		for(PackageableElement root:getProject().getModel().getPackagedElement()){
			if("UML".equals(root.getName())&&Package.class.isInstance(root)){
				Classifier result = (Classifier) NamespaceOperations.getMember((Package)root,
						eclassifier.getName(),
						false,
						com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.CLASSIFIER);
				if(result!=null){
					//log("getClassifier "+eclassifier.getName()+" = "+result.getQualifiedName());
					return result;
				}
			}
		}
if(false)// we are always going to end up here, but this also corrupts model		
		log("getClassifier WARNING reverting to magicdraw for "+eclassifier.getName());
// TODO:  we end up adding operations and MDExtensions to this, and corrupting model???
		Class result= StereotypesHelper.getMetaClassByName(getProject(),eclassifier.getName());
		/* not supported
		try {
			result=(Class)result.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return result;
        //Returns meta class by name
	}
	public static Project getProject(){
		return getApplication().getProject();
	}
	public static Application getApplication(){
		return Application.getInstance();
	}
    /*
	public static Classifier getClassifier(EClassifier eclassifier, ResourceSet rset) {
		Classifier result = null;
		EPackage epackage = eclassifier.getEPackage();
		
		// easy case is the profile definition
		Profile profile = getProfile(epackage);
		if (profile != null) {
			NamedElement ne = getNamedElement(eclassifier);
			if (ne instanceof Classifier) {
				result = (Classifier) ne;
			}
		} else {
		    Package umlPackage = null;
		    
		    if (epackage == UMLPackage.eINSTANCE) {
		        // easy.  We know where the UML metamodel, itself, is
		        umlPackage = getUMLMetamodel(rset);
		    } else if (epackage == EcorePackage.eINSTANCE) {
		        // another easy one
		        umlPackage = getEcoreMetamodel(rset);
		    }
		    
		    if (umlPackage == null) {
    			// look for the UML model describing a generated EPackage
    			List<String> names = getQualifiedName(epackage);
    			
    			umlPackage = findPackage(names, rset);
		    }
		    
			if (umlPackage != null) {
//				result = (Classifier) umlPackage.getMember(
				result = (Classifier) NamespaceOperations.getMember(umlPackage,
						eclassifier.getName(),
						false,
						MdkernelPackage.Literals.CLASSIFIER);
		    }
		}
		
		return result;
	}
	*/
    /**
     * Computes the qualified name of an Ecore package.
     * 
     * @param epackage the Ecore package
     * @return its qualified name
     */
	private static List<String> getQualifiedName(EPackage epackage) {
		List<String> result = new java.util.LinkedList<String>();
		
		while (epackage != null) {
			result.add(0, epackage.getName());
			epackage = epackage.getESuperPackage();
		}
		
		return result;
	}

	/**
	 * Searches the specified resource set for a UML package.
	 * 
	 * @param packageNames the qualified package name
	 * @param rset the resource set to search
	 * @return the matching package, or <code>null</code> if not found
	 */
	public static Package findPackage(List<String> packageNames, ResourceSet rset) {
		if (packageNames.isEmpty()) {
			return null;
		}
		log("findPackage "+packageNames);
		String firstName = packageNames.get(0);
		for (Resource res : rset.getResources()) {
			for (EObject root : res.getContents()) {
				if (root instanceof Package) {
					Package pkg = (Package) root;
					
					// we are only looking for root packages
					if ((pkg.getOwner() == null)
					        && UMLForeignMethods.isNamed(firstName, pkg)) {
						for (String name : packageNames.subList(1, packageNames.size())) {
							pkg = UMLForeignMethods.getNestedPackage(pkg, name);
							
							if (pkg == null) {
								return null;
							}
						}
						
						return pkg;
					}
				}
			}
		}

		return null;
	}
	
    /**
     * Searches the specified resource set for a UML namespace (not necessarily
     * a package).
     * 
     * @param qualifiedName the qualified namespace name
     * @param rset the resource set to search
     * @return the matching namespace, or <code>null</code> if not found
     */
	public static Namespace findNamespace(List<String> qualifiedName, ResourceSet rset) {
		if (qualifiedName.isEmpty()) {
			return null;
		}
		
        Namespace result = null;
        
		
		String firstName = qualifiedName.get(0);
		for(PackageableElement root:getProject().getModel().getPackagedElement()){
//		for (Resource res : rset.getResources()) {
//			for (EObject root : res.getContents()) {
				if (root instanceof Package) {
					Namespace ns = (Package) root;
					
					// we are only looking for root namespaces
					if (
//							(ns.getOwner() == null)&& 
					        UMLForeignMethods.isNamed(firstName, ns)) {
						for (String name : qualifiedName.subList(1, qualifiedName.size())) {
							ns = (Namespace) UMLForeignMethods.getMember(
							    ns,
								name,
								com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.NAMESPACE);
							
							if (ns == null) {
								break;
							}
						}
						
                        if (ns != null) {
                            result = ns;
                            break;
                        }
					}
				}
			}
/*            
            if (result != null) {
                break;
            }
		}
*/
		
		//log("findNamespace "+qualifiedName+" = "+result);
		return result;
	}
	
    /**
     * Searches the specified package registry set for an Ecore definition of
     * the specified UML package.  If this package registry doesn't have it and
     * is not the global package registry, then the global registry is also
     * searched.
     * 
     * @param pkg the UML package
     * @param registry the registry in which to look for the Ecore definition
     * @return the matching Ecore definition, or <code>null</code> if not found
     */
	public static Package getEPackage(Package pkg, EPackage.Registry registry) {
		log("getEPackage  "+pkg.getQualifiedName());
		return pkg;
	}
	/*
	public static EPackage getEPackage(Package pkg, EPackage.Registry registry) {
		EPackage result = null;
		
		Stereotype epkgStereo = PackageOperations.getAppliedStereotype(pkg,"Ecore::EPackage"); //$NON-NLS-1$
//		Stereotype epkgStereo = pkg.getAppliedStereotype("Ecore::EPackage"); //$NON-NLS-1$
		if (epkgStereo != null) {
			String nsURI = (String) PackageOperations.getValue(pkg,
//			String nsURI = (String) pkg.getValue(
					epkgStereo,
					UMLUtil.TAG_DEFINITION__NS_URI);
			
			if (nsURI != null) {
				result = registry.getEPackage(nsURI);
			}
		}
		
		// no point in looking up a package that hasn't a valid qualified name
		if ((result == null) && (pkg.getQualifiedName() != null)) {
			List<String> names = new java.util.LinkedList<String>();
			while (pkg != null) {
				names.add(0, pkg.getName());
				pkg = pkg.getNestingPackage();
			}
			
			result = findPackage(names, registry);
		}
		
		return result;
	}
	*/
    /**
     * Looks up the Ecore definition of the specified UML classifier, using the
     * specified <code>element</code> as a context for finding profile
     * applications in the case that the classifier is a stereotype or some
     * other type in a {@link Profile}.  Finding the Ecore definition of a profile
     * type requires finding the actual applied version of the profile.
     * 
     * @param umlClassifier a UML classifier
     * @param element an element in the context of which the OCL evaluation
     *     is being performed
     * @param registry the package registry in which to search for the Ecore
     *     definition
     * @return the corresponding Ecore classifier, or <code>null</code> if not
     *     found
     */
	/*
	public static EClassifier getEClassifier(
			Classifier umlClassifier,
			Object element,
			EPackage.Registry registry) {
		EClassifier result = null;
		Package umlPackage = umlClassifier.getPackage();
		Package ecorePackage = null;
		if (umlPackage != null) {
			ecorePackage = getEPackage(umlPackage, registry);
		}
		
		if (ecorePackage != null) {
			result = ecorePackage.getEClassifier(
					UML2Util.getValidJavaIdentifier(umlClassifier.getName()));
		}
		
		return result;		
	}
	*/
	/*
	public static EClassifier getEClassifier(
			Classifier umlClassifier,
			Object element,
			EPackage.Registry registry) {
		
		EClassifier result = null;
		Package umlPackage = umlClassifier.getPackage();
//		EPackage ecorePackage = null;
		Package ecorePackage = null;
		
		if (umlPackage instanceof Profile) {
			// use the element to get the most appropriate profile definition
			Profile profile = (Profile) umlPackage;
			
			if (element instanceof Element) {
				Element umlElement = (Element) element;
				
				Package nesting = ElementOperations.getNearestPackage(umlElement);
				while (nesting != null) {
//					ProfileApplication appl = nesting.getProfileApplication(profile);
					ProfileApplication appl = PackageOperations.getProfileApplication(nesting,profile);
					if (appl != null) {
//						ecorePackage = appl.getAppliedDefinition();
						ecorePackage = ProfileApplicationOperations.getAppliedDefinition(appl);
						break;
					}
					
					nesting = (nesting.getOwner() == null)
						? null
						: ElementOperations.getNearestPackage(nesting.getOwner());
				}
			}
			
			if (ecorePackage == null) {
				// assume the latest definition of the profile (if any)
//				ecorePackage = profile.getDefinition();
				ecorePackage = ProfileOperations.getDefinition(profile);
			}
		} else if (umlPackage != null) {
			ecorePackage = getEPackage(umlPackage, registry);
		}
		
		if (ecorePackage != null) {
			result = ecorePackage.getEClassifier(
					UML2Util.getValidJavaIdentifier(umlClassifier.getName()));
		}
		
		return result;
	}
	*/
	/**
	 * Looks in the given registry for a package with the specified qualified
	 * package name.
	 * 
	 * @param packageNames the qualified package name
	 * @return the matching EPackage, or <code>null</code> if not found
	 */
	protected static EPackage findPackage(
			List<String> packageNames,
			EPackage.Registry registry) {
		
		log("findPackage2  "+packageNames);
		if (packageNames.isEmpty()) {
			return null;
		}
		
		String name = packageNames.get(0);
		for (Object next : registry.values()) {
			if (next instanceof EPackage) {
				EPackage ePackage = (EPackage) next;
				
				// only consider root-level packages when searching by name
				if ((ePackage.getESuperPackage() == null)
						&& name.equals(ePackage.getName())) {
					
					EPackage tentativeResult = findNestedPackage(
							packageNames.subList(1, packageNames.size()),
							ePackage);
					
					if (tentativeResult != null) {
						return tentativeResult;
					}
				}
			}
		}

		EPackage result = findPackageByNSPrefix(packageNames, registry);
		
		if ((result == null) && (registry != EPackage.Registry.INSTANCE)) {
			result = findPackage(packageNames, EPackage.Registry.INSTANCE);
		}
		
		return result;
	}

	/**
	 * Looks in the given Ecore package for a nested package with the specified
     * relative package name.
	 * 
	 * @param packageNames the relative package name
	 * @param package the starting package to look in
	 * @return the matching Ecore package, or <code>null</code> if not found
	 */
	private static EPackage findNestedPackage(
			List<String> packageNames,
			EPackage superpackage) {
		
		log("findNestedPackage  "+packageNames);
		if (packageNames.isEmpty()) {
			// stopping condition
			return superpackage;
		}
		
		String name = packageNames.get(0);
		
		for (EPackage next : superpackage.getESubpackages()) {
			if (name.equals(next.getName())) {
				EPackage tentativeResult = findNestedPackage(
						packageNames.subList(1, packageNames.size()),
						next);
				
				if (tentativeResult != null) {
					return tentativeResult;
				}
			}
		}

		return null;
	}

	/**
	 * Looks in the given registry for a package with the specified qualified
	 * package name, matching the name against the namespace prefixes of the
	 * packages in the registry.
	 * 
	 * @param packageNames the qualified package name
	 * @return the NSPrefix-matching EPackage, or <code>null</code> if not found
	 */
	private static EPackage findPackageByNSPrefix(
			List<String> packageNames,
			EPackage.Registry registry) {

		log("findPackageByNSPrefix  "+packageNames);
		StringBuffer stringBuffer = new StringBuffer();
		Iterator<String> it = packageNames.iterator();
		while (it.hasNext()) {
			stringBuffer.append(it.next());
			if (it.hasNext()) {
				stringBuffer.append(".");//$NON-NLS-1$
			}
		}

		String nsPrefix = stringBuffer.toString();

		for (Object next : registry.values()) {
			if (next instanceof EPackage) {
				EPackage ePackage = (EPackage) next;
				if (nsPrefix.equals(ePackage.getNsPrefix())) {
					return ePackage;
				}
			}
		}

		return null;
	}
	
    /**
     * Obtains the UML metamodel library loaded in the specified resource set,
     * loading it if necessary.
     * 
     * @param resourceSet a resource set
     * @return the UML metamodel
     */
	/*
	public static Package getUMLMetamodel(ResourceSet resourceSet) {
		Package result = null;
		Resource res = resourceSet.getResource(
				URI.createURI(UMLResource.UML_METAMODEL_URI), true);
		
		if (res != null) {
			result = (Package) EcoreUtil.getObjectByType(
					res.getContents(),
					MdkernelPackage.Literals.PACKAGE);
		}
		
		return result;
	}
*/
    /**
     * Obtains the Ecore metamodel library loaded in the specified resource set,
     * loading it if necessary.
     * 
     * @param resourceSet a resource set
     * @return the Ecore metamodel
     */
	/*
    static Package getEcoreMetamodel(ResourceSet resourceSet) {
        Package result = null;
        Resource res = resourceSet.getResource(
                URI.createURI(UMLResource.ECORE_METAMODEL_URI), true);
        
        if (res != null) {
            result = (Package) EcoreUtil.getObjectByType(
                    res.getContents(),
                    MdkernelPackage.Literals.PACKAGE);
        }
        
        return result;
    }
    */
    /**
     * A foreign method for the {@link Classifier} that obtains all members,
     * inherited or not, regardless of visibility, for OCL purposes.
     * 
     * @param classifier a classifier
     * @return all of its members, including inheritable and non-inheritable
     *     members (private members of general types) except for those
     *     that are redefined
     * 
     * @since 1.2
     */
    private static EList<NamedElement> getInheritedMembers(Classifier classifier) {
		//log("getInheritedMembers  "+classifier.getQualifiedName());
    	//classifier.refMetaObject().refImmediateComposite().
    	//classifier.r
        EList<NamedElement> result = new UniqueEList.FastCompare<NamedElement>(
                classifier.getMember());
        for (Classifier parent : ClassifierOperations.allParents(classifier)) {
            if (parent != classifier) {
                result.addAll(parent.getMember());
            }
        }
        // the magicdraw uml metamodel does not contain properties, 
        // if classifier is metamodel, then we may need to artificially construct such properties
        // would these be navigable?  featureID?  etc.
        /*
        if(Class.class.isInstance(classifier)&&StereotypesHelper.isUML2MetaClass((Class)classifier)){
        	log("getInheritedMembers from metaClass "+classifier.getQualifiedName());
        }
        */
        
        // filter out redefined members
        result = ClassifierOperations.inherit(classifier,result);

        return result;
    }
    
    /**
     * A foreign method for the {@link Classifier} that obtains all attributes
     * regardless of visibility, for OCL purposes.
     * 
     * @param classifier a classifier
     * @return all of its attributes, including inheritable and non-inheritable
     *     attributes (private attributes of general types) except for those
     *     that are redefined
     * 
     * @since 1.2
     */
    public static EList<Property> getAllAttributes(Classifier classifier) {
        EList<NamedElement> members = getInheritedMembers(classifier);
        
        EList<Property> result = new BasicEList<Property>(members.size());
        for (NamedElement next : members) {
            if (next instanceof Property) {
                result.add((Property) next);
            }
        }
		//log("getAllAttributes  "+classifier.getQualifiedName()+"("+classifier.getClass().getName()+") = "+result);
        
        return result;
    }
    
	/**
	 * A foreign method for the {@link Property} that queries whether it is a
	 * non-navigable association end of a given classifier. This means that the
	 * end is association-owned and opposite to a classifier-owned end whose
	 * type is a supertype of the specified classifier.
	 * 
	 * @param associationEnd
	 *            the purported non-navigable association end
	 * @param endClassifier
	 *            a classifier from which we purport to navigate the association
	 * @return <code>true</code> if the association-end is a non-navigable end
	 *         of the classifier; <code>false</code>, otherwise
	 * 
	 * @since 2.0
	 */
	public static boolean isNonNavigableAssocationEndOf(
			Property associationEnd, Classifier endClassifier) {
		log("isNonNavigableAssocationEndOf  "+endClassifier.getQualifiedName()+", "+associationEnd.getQualifiedName());
		
		boolean result = associationEnd.getOwningAssociation() != null;
		if (result) {
			Property otherEnd = PropertyOperations.getOtherEnd(associationEnd);
			
			result = (otherEnd != null) && (otherEnd.getType() != null) &&Classifier.class.isInstance(otherEnd.getType())
				&& ClassifierOperations.conformsTo(endClassifier,(Classifier)otherEnd.getType());
		}
		
		return result;
	}
    
    /**
     * A foreign method for the {@link Classifier} that obtains all operations
     * regardless of visibility, for OCL purposes.
     * 
     * @param classifier a classifier
     * @return all of its operations, including inheritable and non-inheritable
     *     operations (private operations of general types) except for those
     *     that are redefined
     * 
     * @since 1.2
     */
    public static EList<Operation> getAllOperations(Classifier classifier) {

        EList<NamedElement> members = getInheritedMembers(classifier);
        
        EList<Operation> result = new BasicEList<Operation>(members.size());
        for (NamedElement next : members) {
            if (next instanceof Operation) {
                result.add((Operation) next);
            }
        }
    	//log("getAllOperations  "+classifier.getQualifiedName()+", "+result);
        
        return result;
    }
}


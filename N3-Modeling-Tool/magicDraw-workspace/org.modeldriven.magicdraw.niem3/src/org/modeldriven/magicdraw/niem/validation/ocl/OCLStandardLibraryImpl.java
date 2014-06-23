/**
 * <copyright>
 *
 * Copyright (c) 2006, 2010 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bugs 252600, 248869
 *   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - Bug 297666
 *
 * </copyright>
 *
 * $Id: OCLStandardLibraryImpl.java,v 1.11 2010/02/09 10:32:31 asanchez Exp $
 */

package org.modeldriven.magicdraw.niem.validation.ocl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.types.OCLStandardLibrary;
/*
import org.eclipse.ocl.types.AnyType;
import org.eclipse.ocl.types.ElementType;
import org.eclipse.ocl.types.InvalidType;
import org.eclipse.ocl.types.MessageType;
import org.eclipse.ocl.types.PrimitiveType;
import org.eclipse.ocl.types.VoidType;
*/
/*
import org.eclipse.ocl.uml.OCL;
import org.eclipse.ocl.uml.UMLEnvironment;
import org.eclipse.ocl.uml.UMLEnvironmentFactory;
import org.eclipse.ocl.uml.UMLFactory;
import org.eclipse.ocl.uml.UMLPackage;
*/
import org.eclipse.ocl.util.OCLStandardLibraryUtil;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.OperationOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.PackageOperations;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Substitution;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
/*
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
*/
/**
 * Implementation of the {@link OCLStandardLibrary} for the UML environment.
 * 
 * @author Christian W. Damus (cdamus)
 */
public final class OCLStandardLibraryImpl implements OCLStandardLibrary<Classifier> {
	static public void log(String text){
		QvtCommonAction.log(text);
	}

    private static final String NS_URI = UMLEnvironment.OCL_STANDARD_LIBRARY_NS_URI;
    
	private static final String ITERATOR_KEYWORD = "iterator"; //$NON-NLS-1$
	
	private static Classifier OCL_ANY;
	private static Classifier OCL_ELEMENT;
	private static Classifier OCL_BOOLEAN;
    private static Classifier OCL_INTEGER;
    private static Classifier OCL_UNLIMITED_NATURAL;
	private static Classifier OCL_REAL;
	private static Classifier OCL_STRING;
	private static Classifier OCL_VOID;
	private static Classifier OCL_MESSAGE;
	private static Classifier OCL_TYPE;

    private static Classifier OCL_INVALID;
	
	private static Classifier OCL_T;
	private static Classifier OCL_T2;
	
	private static Classifier OCL_SET;
	private static Classifier OCL_ORDERED_SET;
	private static Classifier OCL_BAG;
	private static Classifier OCL_SEQUENCE;
	private static Classifier OCL_COLLECTION;
	
	private static Classifier STATE;
	private static Classifier OCL_EXPRESSION;
    
    /** The shared instance of the OCL Standard Library for the UML environment. */
    public static final OCLStandardLibraryImpl INSTANCE = new OCLStandardLibraryImpl();
    
    /** The singleton instance of the <tt>OclInvalid</tt> standard library type. */
    public static Object INVALID =
    	com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createInstanceSpecification();

    /** The package containing the OCL Standard Library classifiers. */
	public static Package stdlibPackage = init();
	
    // not instantiable by clients
	private OCLStandardLibraryImpl() {
		super();
	}
	
	public Classifier getBoolean() {
		return OCL_BOOLEAN;
	}

	public Classifier getInteger() {
		return OCL_INTEGER;
	}

    public Classifier getUnlimitedNatural() {
        return OCL_UNLIMITED_NATURAL;
    }
    
	public Classifier getOclInvalid() {
		return OCL_INVALID;
	}

	public Classifier getReal() {
		return OCL_REAL;
	}

	public Classifier getString() {
		return OCL_STRING;
	}

	public Classifier getOclAny() {
		return OCL_ANY;
	}

	public Classifier getOclElement() {
		return OCL_ELEMENT;
	}

	public Object getInvalid() {
		return INVALID;
	}

	public Classifier getState() {
		return STATE;
	}

	public Classifier getOclMessage() {
		return OCL_MESSAGE;
	}
	
	public Classifier getOclType() {
		return OCL_TYPE;
	}

	public Classifier getOclVoid() {
		return OCL_VOID;
	}
	
	public Classifier getT() {
		return OCL_T;
	}
	
	public Classifier getT2() {
		return OCL_T2;
	}
	
	public Classifier getSet() {
		return OCL_SET;
	}
	
	public Classifier getOrderedSet() {
		return OCL_ORDERED_SET;
	}
	
	public Classifier getBag() {
		return OCL_BAG;
	}
	
	public Classifier getSequence() {
		return OCL_SEQUENCE;
	}
	
	public Classifier getCollection() {
		return OCL_COLLECTION;
	}
	
	public Classifier getOclExpression() {
		return OCL_EXPRESSION;
	}
	
    private static Package init() {
        if (stdlibPackage != null) {
            return stdlibPackage;
        }
/*        
        ResourceSet rset = new ResourceSetImpl();
        // Ensure that a UMLResource factory is registered for the uml extension.
        // Note that when running standalone, a registration in the global registry is not certain.
        OCL.initialize(null);
        Resource res = null;
        
        try {
            res = rset.getResource(URI.createURI(NS_URI), true);
            stdlibPackage = (Package) res.getContents().get(0);
            
            OCL_ANY = (Classifier) PackageOperations.getOwnedType(stdlibPackage,AnyType.SINGLETON_NAME);
            OCL_ELEMENT = (Classifier) PackageOperations.getOwnedType(stdlibPackage,ElementType.SINGLETON_NAME);
            OCL_BOOLEAN = (Classifier) PackageOperations.getOwnedType(stdlibPackage,PrimitiveType.BOOLEAN_NAME);
            OCL_INTEGER = (Classifier) PackageOperations.getOwnedType(stdlibPackage,PrimitiveType.INTEGER_NAME);
            OCL_UNLIMITED_NATURAL = (Classifier) PackageOperations.getOwnedType(stdlibPackage,PrimitiveType.UNLIMITED_NATURAL_NAME);
            OCL_REAL = (Classifier) PackageOperations.getOwnedType(stdlibPackage,PrimitiveType.REAL_NAME);
            OCL_STRING = (Classifier) PackageOperations.getOwnedType(stdlibPackage,PrimitiveType.STRING_NAME);
            OCL_VOID = (Classifier) PackageOperations.getOwnedType(stdlibPackage,VoidType.SINGLETON_NAME);
            OCL_MESSAGE = (Classifier) PackageOperations.getOwnedType(stdlibPackage,MessageType.SINGLETON_NAME);

            OCL_INVALID = (Classifier) PackageOperations.getOwnedType(stdlibPackage,InvalidType.SINGLETON_NAME);
            
            OCL_T = (Classifier) PackageOperations.getOwnedType(stdlibPackage,"T"); //$NON-NLS-1$
            OCL_T2 = (Classifier) PackageOperations.getOwnedType(stdlibPackage,"T2"); //$NON-NLS-1$
            
            OCL_TYPE = (Classifier) EcoreUtil.getObjectByType(
                    stdlibPackage.getOwnedType(),
                    UMLPackage.Literals.TYPE_TYPE);
            
            OCL_SET = (Classifier) EcoreUtil.getObjectByType(
                stdlibPackage.getOwnedType(),
                UMLPackage.Literals.SET_TYPE);
            OCL_ORDERED_SET = (Classifier) EcoreUtil.getObjectByType(
                stdlibPackage.getOwnedType(),
                UMLPackage.Literals.ORDERED_SET_TYPE);
            OCL_BAG = (Classifier) EcoreUtil.getObjectByType(
                stdlibPackage.getOwnedType(),
                UMLPackage.Literals.BAG_TYPE);
            OCL_SEQUENCE = (Classifier) EcoreUtil.getObjectByType(
                stdlibPackage.getOwnedType(),
                UMLPackage.Literals.SEQUENCE_TYPE);
            
            // don't use EcoreUtil because the other collection types would match
            OCL_COLLECTION = (Classifier) PackageOperations.getOwnedType(stdlibPackage,"Collection(T)"); //$NON-NLS-1$
            
            STATE = (Classifier) PackageOperations.getOwnedType(stdlibPackage,"State"); //$NON-NLS-1$
            OCL_EXPRESSION = (Classifier) PackageOperations.getOwnedType(stdlibPackage,"OclExpression"); //$NON-NLS-1$
            
            ((InstanceSpecification) INVALID).getClassifier().add(OCL_INVALID);
            ((InstanceSpecification) INVALID).setName("invalid"); //$NON-NLS-1$
            
            addToPackageRegistry(stdlibPackage);
           
            return stdlibPackage;
        } catch (Exception e) {
            // normal case: the library file isn't there because we are
            //    generating it on the fly.  Let's do that, then
            
            return build();
        } finally {
            if (res != null) {
                // don't want this resource to be in a resource set
                rset.getResources().remove(res);
            }
        }
        */
        return build();
    }
    
    // this method is used to build the standard library when not loading it
    //   from file
	private static Package build() {
		if (stdlibPackage != null) {
			return stdlibPackage;
		}
		
		stdlibPackage = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createPackage();
		stdlibPackage.setName("oclstdlib"); //$NON-NLS-1$
		/*
		Resource res = UMLResource.Factory.INSTANCE.createResource(
				URI.createURI("http://www.eclipse.org/ocl/1.1.0/oclstdlib.uml")); //$NON-NLS-1$
		res.getContents().add(stdlibPackage);
		*/
		Resource res =null;
        Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> old = Environment.Registry.INSTANCE.getEnvironmentFor(
            EcorePackage.Literals.ECLASS);
        
        Environment.Registry.INSTANCE.deregisterEnvironment(old);
        UMLEnvironment env =
            (UMLEnvironment) new UMLEnvironmentFactory().loadEnvironment(res);
        Environment.Registry.INSTANCE.registerEnvironment(env);
        
        OCL_ANY = UMLFactory.eINSTANCE.createAnyType();
        OCL_ELEMENT = UMLFactory.eINSTANCE.createElementType();
        OCL_BOOLEAN = UMLFactory.eINSTANCE.createPrimitiveType();
        OCL_BOOLEAN.setName(PrimitiveType.BOOLEAN_NAME);
        OCL_INTEGER = UMLFactory.eINSTANCE.createPrimitiveType();
        OCL_INTEGER.setName(PrimitiveType.INTEGER_NAME);
        OCL_UNLIMITED_NATURAL = UMLFactory.eINSTANCE.createPrimitiveType();
        OCL_UNLIMITED_NATURAL.setName(PrimitiveType.UNLIMITED_NATURAL_NAME);
        OCL_REAL = UMLFactory.eINSTANCE.createPrimitiveType();
        OCL_REAL.setName(PrimitiveType.REAL_NAME);
        OCL_STRING = UMLFactory.eINSTANCE.createPrimitiveType();
        OCL_STRING.setName(PrimitiveType.STRING_NAME);
        OCL_VOID = UMLFactory.eINSTANCE.createVoidType();
        OCL_MESSAGE = UMLFactory.eINSTANCE.createMessageType();

        OCL_INVALID = UMLFactory.eINSTANCE.createInvalidType();
        
        OCL_T = UMLFactory.eINSTANCE.createAnyType();
        OCL_T.setName("T"); //$NON-NLS-1$
        OCL_T2 = UMLFactory.eINSTANCE.createAnyType();
        OCL_T2.setName("T2"); //$NON-NLS-1$
        
        OCL_TYPE = (Classifier) OCLFactoryImpl.INSTANCE.createTypeType(OCL_T);
        OCL_SET = (Classifier) OCLFactoryImpl.INSTANCE.createSetType(OCL_T);
        OCL_ORDERED_SET = (Classifier) OCLFactoryImpl.INSTANCE.createOrderedSetType(OCL_T);
        OCL_BAG = (Classifier) OCLFactoryImpl.INSTANCE.createBagType(OCL_T);
        OCL_SEQUENCE = (Classifier) OCLFactoryImpl.INSTANCE.createSequenceType(OCL_T);
        OCL_COLLECTION = (Classifier) OCLFactoryImpl.INSTANCE.createCollectionType(OCL_T);
        
        STATE = UMLFactory.eINSTANCE.createElementType();
        STATE.setName("State"); //$NON-NLS-1$
        OCL_EXPRESSION = UMLFactory.eINSTANCE.createElementType();
        OCL_EXPRESSION.setName("OclExpression"); //$NON-NLS-1$
        
		((InstanceSpecification) INVALID).getClassifier().add(OCL_INVALID);
		((InstanceSpecification) INVALID).setName("invalid"); //$NON-NLS-1$
		//log("AnyTypeOperations "+OCL_ANY.getQualifiedName());
		//addOperations(OCL_ANY,OCLStandardLibraryUtil.createAnyTypeOperations(env));
        register(OCL_ANY).addAll(OCLStandardLibraryUtil.createAnyTypeOperations(env));
		//log("AnyTypeOperations "+OCL_VOID.getQualifiedName());
        register(OCL_VOID).addAll(
            OCLStandardLibraryUtil.createAnyTypeOperations(env));
		//log("AnyTypeOperations "+OCL_INVALID.getQualifiedName());
        register(OCL_INVALID).addAll(
            OCLStandardLibraryUtil.createAnyTypeOperations(env));
        register(OCL_BOOLEAN).addAll(
            OCLStandardLibraryUtil.createBooleanOperations(env));
        register(OCL_INTEGER).addAll(
            OCLStandardLibraryUtil.createIntegerOperations(env));
        register(OCL_UNLIMITED_NATURAL).addAll(
            OCLStandardLibraryUtil.createUnlimitedNaturalOperations(env));
        register(OCL_REAL).addAll(
            OCLStandardLibraryUtil.createRealOperations(env));
        register(OCL_STRING).addAll(
            OCLStandardLibraryUtil.createStringOperations(env));
        register(OCL_TYPE).addAll(
            OCLStandardLibraryUtil.createTypeTypeOperations(env));
        register(OCL_MESSAGE).addAll(
            OCLStandardLibraryUtil.createMessageTypeOperations(env));
		register(OCL_ELEMENT);
		register(STATE);
		register(OCL_EXPRESSION);
        
        List<Operation> operations;
        List<Operation> iterators;
        
        operations = register(OCL_COLLECTION);
        operations.addAll(OCLStandardLibraryUtil.createCollectionOperations(env));
        iterators = OCLStandardLibraryUtil.createCollectionIterators(env);
        stereotypeAsIterator(iterators);
        operations.addAll(iterators);
        
        operations = register(OCL_SET);
        operations.addAll(OCLStandardLibraryUtil.createSetOperations(env));
        iterators = OCLStandardLibraryUtil.createSetIterators(env);
        stereotypeAsIterator(iterators);
        operations.addAll(iterators);
        
        operations = register(OCL_ORDERED_SET);
        operations.addAll(OCLStandardLibraryUtil.createOrderedSetOperations(env));
        iterators = OCLStandardLibraryUtil.createOrderedSetIterators(env);
        stereotypeAsIterator(iterators);
        operations.addAll(iterators);
        
        operations = register(OCL_BAG);
        operations.addAll(OCLStandardLibraryUtil.createBagOperations(env));
        iterators = OCLStandardLibraryUtil.createBagIterators(env);
        stereotypeAsIterator(iterators);
        operations.addAll(iterators);
        
        operations = register(OCL_SEQUENCE);
        operations.addAll(OCLStandardLibraryUtil.createSequenceOperations(env));
        iterators = OCLStandardLibraryUtil.createSequenceIterators(env);
        stereotypeAsIterator(iterators);
        operations.addAll(iterators);
        
        register(OCL_T);  // operations already defined by OclAny
        register(OCL_T2);  // operations already defined by OclAny
        
        addToPackageRegistry(stdlibPackage);
        
        Environment.Registry.INSTANCE.registerEnvironment(old);
		
		return stdlibPackage;
	}
    private static void addToPackageRegistry(Package pkg) {
        /*
        // ensure that this package is registered in the EPackage registry so
        //   that looking up the OCL Standard Library resource's URI finds
        //   it there (common behaviour of all resource sets)
        EAnnotation ann = pkg.createEAnnotation(Environment.OCL_NAMESPACE_URI);
        Collection<EPackage> ecore = UMLUtil.convertToEcore(pkg, null);
        ann.getContents().addAll(ecore);
        
        if (!ecore.isEmpty()) {
            EPackage epackage = ecore.iterator().next();
            
            epackage.setNsURI(pkg.eResource().getURI().toString());
            EPackage.Registry.INSTANCE.put(epackage.getNsURI(), epackage);
        }
	*/
    }
    /*
	private static void addOperations(Classifier stdType,List<Operation> operations) {
        
        if (stdType instanceof DataType) {
            ((DataType) stdType).getOwnedOperation().addAll(operations);
        } else if (stdType instanceof AnyType) {
            ((org.modeldriven.magicdraw.niem.validation.ocl.AnyType) stdType).getOwnedOperations().addAll(operations);
        	
        } else if (stdType instanceof InvalidType) {
             ((org.modeldriven.magicdraw.niem.validation.ocl.InvalidType) stdType).getOwnedOperations().addAll(operations);
        } else if (stdType instanceof VoidType) {
             ((org.modeldriven.magicdraw.niem.validation.ocl.VoidType) stdType).getOwnedOperation().addAll(operations);
        } else if (stdType instanceof MessageType) {
             ((org.modeldriven.magicdraw.niem.validation.ocl.MessageType) stdType).getOwnedOperations().addAll(operations);
        } else if (stdType instanceof TypeType) {
             ((TypeType) stdType).getOwnedOperations();
        
        }else{
        	log("UNKOWN OCL TYPE "+stdType.getQualifiedName());
        }
        
		// add the type to the standard library package
		stdlibPackage.getOwnedType().add(stdType);
 	}
 	*/
	private static List<Operation> register(Classifier stdType) {
        List<Operation> result = null;
        
        if (stdType instanceof DataType) {
            result = ((DataType) stdType).getOwnedOperation();
        } else if (stdType instanceof org.modeldriven.magicdraw.niem.validation.ocl.AnyType) {
            result = ((org.modeldriven.magicdraw.niem.validation.ocl.AnyType) stdType).getOwnedOperations();

        } else if (stdType instanceof org.modeldriven.magicdraw.niem.validation.ocl.InvalidType) {
            result = ((org.modeldriven.magicdraw.niem.validation.ocl.InvalidType) stdType).getOwnedOperations();
        } else if (stdType instanceof org.modeldriven.magicdraw.niem.validation.ocl.VoidType) {
            result = ((org.modeldriven.magicdraw.niem.validation.ocl.VoidType) stdType).getOwnedOperations();
        } else if (stdType instanceof org.modeldriven.magicdraw.niem.validation.ocl.MessageType) {
            result = ((org.modeldriven.magicdraw.niem.validation.ocl.MessageType) stdType).getOwnedOperations();
        } else if (stdType instanceof TypeType) {
            result = ((TypeType) stdType).getOwnedOperations();

        }
        //System.out.println("register "+stdType+", "+result);
		// add the type to the standard library package
//		stdlibPackage.getOwnedType().add(stdType);
		stdlibPackage.getPackagedElement().add(stdType);
        
        return result;
	}
    
    /**
     * Finds the shadow class to contain features defined for the
     * specified OCL <code>type</code>, if it already exists.
     * 
     * @param classifier an Ecore classifier
     * @param pkg the package in which to look for the shadow class
     * 
     * @return the class containing its features, or <code>null</code> if not
     *    found
     */
    public static Class findShadowClass(Classifier classifier, Package pkg) {
        for (Type next : pkg.getOwnedType()) {
            if (next instanceof Class) {
                Class clazz = (Class) next;
                
                if (getRealClassifier(clazz) == classifier) {
                    return clazz;
                }
            }
        }
        
        return null;
    }
    
    public static Classifier getRealClassifier(Class shadow) {
        Substitution sub = ClassOperations.getSubstitution(shadow,"realOwner", null); //$NON-NLS-1$
//        Substitution sub = shadow.getSubstitution("realOwner", null); //$NON-NLS-1$
        return (sub == null)? null : sub.getContract();
    }
    
    /**
     * Marks the specified operations as being collection iterators (as distinct
     * from ordinary operations).
     * 
     * @param operations operations to designate as iterators
     */
    public static void stereotypeAsIterator(Collection<Operation> operations) {
        for (Operation oper : operations) {
        	ElementOperations.addKeyword(oper,ITERATOR_KEYWORD); //$NON-NLS-1$
        }
    }
    
    /**
     * Selects from the specified operations those that are collection iterators.
     * 
     * @param operations operations
     * @return the subset that are stereotyped as iterators
     */
    public static EList<Operation> selectIterators(Collection<Operation> operations) {
        EList<Operation> result = new BasicEList.FastCompare<Operation>();
        
        for (Operation oper : operations) {
//            if (oper.hasKeyword(ITERATOR_KEYWORD)) {
            if (OperationOperations.hasKeyword(oper,ITERATOR_KEYWORD)) {
                result.add(oper);
            }
        }
        
        return result;
    }
    
    public static Collection<Operation> createCollectionTypeOperations(
            Environment<?, Classifier, Operation, ?, ?, Parameter, ?, ?, ?, ?, ?, ?> env,
            CollectionKind kind) {
        
        Collection<Operation> operations;
        Collection<Operation> iterators;
        
        switch (kind) {
        case BAG_LITERAL:
            operations = OCLStandardLibraryUtil.createBagOperations(env);
            iterators = OCLStandardLibraryUtil.createBagIterators(env);
            break;
        case SET_LITERAL:
            operations = OCLStandardLibraryUtil.createSetOperations(env);
            iterators = OCLStandardLibraryUtil.createSetIterators(env);
            break;
        case ORDERED_SET_LITERAL:
            operations = OCLStandardLibraryUtil.createOrderedSetOperations(env);
            iterators = OCLStandardLibraryUtil.createOrderedSetIterators(env);
            break;
        case SEQUENCE_LITERAL:
            operations = OCLStandardLibraryUtil.createSequenceOperations(env);
            iterators = OCLStandardLibraryUtil.createSequenceIterators(env);
            break;
        default:
            operations = OCLStandardLibraryUtil.createCollectionOperations(env);
            iterators = OCLStandardLibraryUtil.createCollectionIterators(env);
            break;
        }

        for (Operation next : iterators) {
        	ElementOperations.addKeyword(next,ITERATOR_KEYWORD);
        }
        
        Collection<Operation> result = new java.util.ArrayList<Operation>(
                operations.size() + iterators.size());
        
        result.addAll(operations);
        result.addAll(iterators);
        
        return result;
    }
}
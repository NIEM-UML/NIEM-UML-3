package org.modeldriven.magicdraw.niem.validation.ocl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.AbstractEnvironment;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.TypeResolver;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.lpg.FormattingHelper;
import org.eclipse.ocl.parser.AbstractOCLAnalyzer;
import org.eclipse.ocl.types.OCLStandardLibrary;
/*
import org.eclipse.ocl.uml.internal.OCLFactoryImpl;
import org.eclipse.ocl.uml.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.uml.internal.UMLForeignMethods;
import org.eclipse.ocl.uml.internal.UMLReflectionImpl;
import org.eclipse.ocl.uml.util.OCLUMLUtil;
*/
import org.eclipse.ocl.util.TypeUtil;
import org.eclipse.ocl.utilities.OCLFactory;
import org.eclipse.ocl.utilities.UMLReflection;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.AssociationOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ClassifierOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.ElementOperations;
import org.modeldriven.magicdraw.niem.validation.ocl.uml.operations.OperationOperations;

import com.nomagic.magicdraw.evaluation.EvaluationConfigurator;
import com.nomagic.magicdraw.foundation.MDExtension;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ParameterEffectKind;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ParameterEffectKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelPackage;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.Behavior;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.BehavioredClassifier;
//import com.nomagic.uml2.ext.magicdraw.extensions.MDExtension;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Region;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.StateMachine;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Vertex;
/*
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
*/
/**
 * Implementation of the {@link Environment} for parsing OCL expressions on UML
 * models. The <code>UMLEnvironment</code> uses a client-supplied resource set
 * to look up UML {@link Package}s in UML resources. It also uses an
 * {@link EPackage} registry to find the corresponding Ecore definitions of
 * packages when evaluating expressions on instances of the UML model (in the
 * case of evaluation on UML2-generated API objects).
 * 
 * @author Christian W. Damus (cdamus)
 */
public class UMLEnvironment
    extends
    AbstractEnvironment<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> {
	
	/**
	 * The namespace URI of the UML representation of the OCL Standard Library.
	 * 
	 * @since 2.0
	 */
	public static final String OCL_STANDARD_LIBRARY_NS_URI = "http://www.eclipse.org/ocl/1.1.0/oclstdlib.uml"; //$NON-NLS-1$
    
    //static final String ANNOTATION_SOURCE = org.eclipse.ocl.uml.UMLPackage.eNS_URI;
	static final String ANNOTATION_SOURCE = com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.eNS_URI;
    
    private static OCLStandardLibraryImpl standardLibrary;

    private UMLReflection<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint> reflection;

    /** The resource set for package lookups. */
    private ResourceSet resourceSet;

    /** The package registry for Ecore definition lookups. */
    private EPackage.Registry registry;

    private EnvironmentFactory<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> factory;

    private TypeResolver<Classifier, Operation, Property> typeResolver;

    private Package umlMetamodel;

    private Map<List<String>, Classifier> classifierCache = new java.util.HashMap<List<String>, Classifier>();

    private Map<List<String>, Package> packageCache = new java.util.HashMap<List<String>, Package>();

    /**
     * Initializes me with a package registry for looking up the Ecore
     * representations of UML packages and a resource set for looking up UML
     * packages in UML resources.
     * 
     * @param registry
     *            the Ecore package registry to use
     * @param rset
     *            the resource set to use
     */
    protected UMLEnvironment(EPackage.Registry registry, ResourceSet rset) {
        this.registry = registry;
        resourceSet = rset;

        typeResolver = createTypeResolver();
        
    }

    /**
     * Initializes me with a package registry for looking up the Ecore
     * representations of UML packages, a resource set for looking up UML
     * packages in UML resources, and a resource from which to load myself.
     * 
     * @param registry
     *            the Ecore package registry to use
     * @param rset
     *            the resource set to use
     * @param resource
     *            my resource for persistence
     */
    protected UMLEnvironment(EPackage.Registry registry, ResourceSet rset,
            Resource resource) {
        this.registry = registry;
        resourceSet = rset;

        typeResolver = createTypeResolver(resource);
    }

    /**
     * Initializes me with a parent environment. I inherit my package registry,
     * resource set, and resource from it.
     * 
     * @param parent
     *            my parent environment
     */
    protected UMLEnvironment(
            Environment<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> parent) {

        super((UMLEnvironment) parent);

        UMLEnvironment uparent = (UMLEnvironment) parent;

        if (uparent != null) {
            this.registry = uparent.registry;
            resourceSet = uparent.resourceSet;
            typeResolver = uparent.getTypeResolver();
        } else {
            this.registry = (EPackage.Registry.INSTANCE);
            resourceSet = new ResourceSetImpl();
            typeResolver = createTypeResolver();
        }
    }

    // implements the inherited specification
    public EnvironmentFactory<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> getFactory() {
        if (factory != null) {
            return factory;
        }

        if (getInternalParent() != null) {
            factory = getInternalParent().getFactory();
            if (factory != null) {
                return factory;
            }
        }

        // obtain a reasonable default factory
        factory = new UMLEnvironmentFactory(getResourceSet());

        return factory;
    }

    /**
     * Sets the factory that created me. This method should only be invoked by
     * that factory.
     * 
     * @param factory
     *            my originating factory
     */
    protected void setFactory(
            EnvironmentFactory<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> factory) {
        this.factory = factory;
    }

    /**
     * Looks up the Ecore definition of the specified UML classifier, using the
     * specified <code>element</code> as a context for finding profile
     * applications in the case that the classifier is a stereotype or some
     * other type in a {@link Profile}.  Finding the Ecore definition of a profile
     * type requires finding the actual applied version of the profile.
     * 
     * @param type a UML classifier
     * @param element an element in the context of which the OCL evaluation
     *     is being performed
     * @return the corresponding Ecore classifier, or <code>null</code> if not
     *     found
     * @since 3.0
     */
/*
	public EClassifier getEClassifier(Classifier type, Object element) {
		return OCLUMLUtil.getEClassifier(type, element, registry);
	}
*/
    
//    /**
//     * Obtains my EPackage registry, for looking up the Ecore correspondents
//     * of UML metamodel elements when working with instances of generated Java
//     * types.
//     * 
//     * @return my EPackage registry
//     */
//    EPackage.Registry getEPackageRegistry() {
//        return registry;
//    }

    // implements the inherited specification
    public void setParent(
            Environment<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> env) {
        super.setParent((UMLEnvironment) env);
    }

    // implements the inherited specification
    public OCLStandardLibrary<Classifier> getOCLStandardLibrary() {
        if (standardLibrary == null) {
            standardLibrary = OCLStandardLibraryImpl.INSTANCE;
        }

        return standardLibrary;
    }

    /**
     * Obtains the resource set in which I look for UML packages when resolving
     * package names.
     * 
     * @return my resource set
     */
    protected final ResourceSet getResourceSet() {
        return resourceSet;
    }

    /**
     * Obtains the UML metamodel library, loaded in my resource set.
     * 
     * @return the UML metamodel
     */
    /*
    protected Package getUMLMetamodel() {
        if (umlMetamodel == null) {
            if (getFactory() instanceof UMLEnvironmentFactory) {
                umlMetamodel = ((UMLEnvironmentFactory) getFactory())
                    .getUMLMetamodel();
            } else {
                umlMetamodel = OCLUMLUtil.getUMLMetamodel(getResourceSet());
            }
        }

        return umlMetamodel;
    }
*/
    // implements the inherited specification
    public TypeResolver<Classifier, Operation, Property> getTypeResolver() {
        return typeResolver;
    }

    // implements the inherited specification
    public OCLFactory getOCLFactory() {
        return OCLFactoryImpl.INSTANCE;
    }

    // implements the inherited specification
    public UMLReflection<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint> getUMLReflection() {
        if (reflection == null) {
            reflection = new UMLReflectionImpl(this);
        }

        return reflection;
    }

    /**
     * Creates a new type resolver for use with this environment, persisted
     * in a default resource. 
     * 
     * @return a new type resolver
     * 
     * @deprecated Override the {@link #createTypeResolver(Resource)} method,
     *     instead, handling the case where the resource is <code>null</code>
     */
    @Deprecated
    protected TypeResolver<Classifier, Operation, Property> createTypeResolver() {
        return createTypeResolver(null);
    }
    
    /**
     * <p>
     * Creates a new type resolver for use with this environment.
     * </p><p>
     * Subclasses may override.
     * </p>
     * 
     * @param resource the resource for the type resolver's persistence
     * @return a new type resolver
     * 
     * @since 1.2
     */
    protected TypeResolver<Classifier, Operation, Property> createTypeResolver(Resource resource) {
        return new TypeResolverImpl(this, resource);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Implements the inherited specification by looking in my resource set for
     * a resource containing the specified package.
     * </p>
     */
    public Package lookupPackage(List<String> path) {
        Package tryCache = packageCache.get(path);
        if (tryCache != null) {
            return tryCache;
        }

        Package pkg = null;
        Package currPkg = getContextPackage();

        // Check whether this package is in the default package
        if (currPkg != null) {
            List<String> lookup = path;

            while (currPkg != null) {
                pkg = currPkg;

                for (int i = 0; i < lookup.size(); i++) {
                    String name = lookup.get(i);
                    pkg = UMLForeignMethods.getNestedPackage(pkg, name);

                    if (pkg == null) {
                        break;
                    }
                }

                if (pkg != null) {
                    packageCache.put(path, pkg);
                    return pkg;
                }

                if ((currPkg == getContextPackage()) && (lookup.size() > 0)
                    && UMLForeignMethods.isNamed(lookup.get(0), currPkg)) {
                    // handle the case where the first part of the qualified
                    // name matches the context package name
                    lookup = lookup.subList(1, lookup.size());
                } else {
                    lookup = path;
                    currPkg = currPkg.getNestingPackage();
                }
            }
        }

        // Check whether this package exists in the resource set
        Package result = OCLUMLUtil.findPackage(path, getResourceSet());
        packageCache.put(path, result);
        return result;
    }

    protected static void log(String text){
    	QvtCommonAction.log(text);
    }
    // implements the inherited specification
    public Classifier lookupClassifier(List<String> names) {
    	//log("lookupClassifier "+names+", "+getContextPackage());
        Classifier tryCache = classifierCache.get(names);
        if (tryCache != null) {
            return tryCache;
        }

        Namespace ns = null;
        Namespace currNs = getContextPackage();
        if (names.size() > 1) {
            List<String> lookup = names;

            // Check whether this package is in the default package
            if (currNs != null) {
                while (currNs != null) {

                    ns = currNs;
                    int last = lookup.size() - 1;

                    for (int i = 0; i < last; i++) {
                        String name = lookup.get(i);
                        ns = (Namespace) UMLForeignMethods.getMember(ns, name,
                        		com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.NAMESPACE);

                        if (ns == null) {
                            break;
                        }
                    }

                    if (ns != null) {
                        String name = lookup.get(last);

                        Classifier member = (Classifier) UMLForeignMethods
                            .getMember(ns, name, com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.CLASSIFIER);

                        if (member != null) {
                            classifierCache.put(names, member);
                            return member;
                        }
                    }

                    if ((currNs == getContextPackage()) && (lookup.size() > 1)
                        && UMLForeignMethods.isNamed(lookup.get(0), currNs)) {
                        // handle the case where the first part of the qualified
                        // name matches the context package name
                        lookup = lookup.subList(1, lookup.size());
                    } else {
                        lookup = names;
                        currNs = currNs.getNamespace();
                    }
                }
            }

            // Check whether this package exists
            List<String> newNames = names.subList(0, names.size() - 1);
            ns = OCLUMLUtil.findNamespace(newNames, getResourceSet());
            if (ns == null) {
            	//log("lookupClassifier namespace not found "+newNames);
                return null;
            }

            String name = names.get(names.size() - 1);
            Classifier member = (Classifier) UMLForeignMethods.getMember(ns,
                name, com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.CLASSIFIER);

            if (member != null) {
                classifierCache.put(names, member);
                return member;
            }

            return member;
        } else if (getContextPackage() != null) {
            String name = names.get(0);
            Classifier result = null;
            while (currNs != null) {
                result = (Classifier) UMLForeignMethods.getMember(currNs, name,
                		com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.CLASSIFIER);

                if (result != null) {
                    classifierCache.put(names, result);
                    return result;
                }

                currNs = currNs.getNamespace();
            }
        }

    	//log("lookupClassifier not found ");
        return null;
    }

    @Override
    protected void findNonNavigableAssociationEnds(Classifier classifier,
            String name, List<Property> ends) {
        
        EList<Association> associations = UMLForeignMethods.getAllAssociations(classifier);

        // search for non-navigable, named ends
        for (Association next : associations) {
            if (AssociationOperations.isBinary(next)) {
//                Property end = next.getMemberEnd(name, null);
                Property end = AssociationOperations.getMemberEnd(next,name, null);

				if ((end != null)
					&& OCLUMLUtil
						.isNonNavigableAssocationEndOf(end, classifier)) {
					
					ends.add(end);
				}
            }
        }
    }
    
    @Override
    protected void findUnnamedAssociationEnds(Classifier classifier, String name,
            List<Property> ends) {
        
        EList<Association> associations = UMLForeignMethods.getAllAssociations(classifier);

        for (Association next : associations) {
            if (AssociationOperations.isBinary(next)) {
                for (Property end : next.getMemberEnd()) {
                    if (isUnnamed(end)) {
                        Type type = end.getType();
						if ((type != null)
							&& initialLower(type).equals(name)
							&& OCLUMLUtil.isNonNavigableAssocationEndOf(end,
								classifier)) {
							
							ends.add(end);
						}
                    }
                }
            }
        }
    }
    
    /**
     * Queries whether the specified association end has no name.
     * 
     * @param associationEnd an association end
     * 
     * @return whether it is unnamed
     */
    protected boolean isUnnamed(Property associationEnd) {
        return associationEnd.getName() == null;
    }

    // implements the inherited specification
    public List<State> getStates(Classifier owner, List<String> pathPrefix) {
        EList<State> result = new BasicEList.FastCompare<State>();

        collectStates(owner, pathPrefix, result);

        // search supertypes
        for (Classifier general : ClassifierOperations.allParents(owner)) {
            collectStates(general, pathPrefix, result);
        }

        // now, filter out redefinitions, in case our prefix match found
        // states that are redefined by other matches (as an instance of the
        // owner type cannot be in a state that is redefined by a more
        // specific state)
        Set<State> redefinitions = new java.util.HashSet<State>();
        for (State s : result) {
            State redef = s.getRedefinedState();

            while (redef != null) {
                redefinitions.add(redef);
                redef = redef.getRedefinedState();
            }
        }

        result.removeAll(redefinitions);

        return result;
    }

    /**
     * Finds all states in the specified owner type that match the given path
     * name prefix and add them to the accumulator list.
     * 
     * @param owner
     *            the owner type
     * @param pathPrefix
     *            partial qualified name, specifying the parent of the states to
     *            be collected
     * @param states
     *            a list of states directly owned by the namespace indicated by
     *            path prefix, within the owner type
     */
    private void collectStates(Classifier owner, List<String> pathPrefix,
            List<State> states) {
        if (owner instanceof BehavioredClassifier) {
            Collection<Behavior> behaviors = ((BehavioredClassifier) owner)
                .getOwnedBehavior();

            for (Behavior b : behaviors) {
                if (b instanceof StateMachine) {
                    collectStates((StateMachine) b, pathPrefix, states);
                }
            }
        }
    }

    private void collectStates(StateMachine machine, List<String> pathPrefix,
            List<State> states) {
        if (pathPrefix.isEmpty()) {
            for (Region r : machine.getRegion()) {
                collectStates(r, pathPrefix, states);
            }
        } else {
            String firstName = pathPrefix.get(0);

            if (UMLForeignMethods.isNamed(firstName, machine)) {
                // we are allowed to qualify the states by machine name
                pathPrefix = pathPrefix.subList(1, pathPrefix.size());
            }

            for (Region r : machine.getRegion()) {
                collectStates(r, pathPrefix, states);
            }
        }
    }

    private void collectStates(Region region, List<String> pathPrefix,
            List<State> states) {
        if (pathPrefix.isEmpty()) {
            // terminus of the recursion: get all the states in this region
            for (Vertex v : region.getSubvertex()) {
                if (v instanceof State) {
                    states.add((State) v);
                }
            }
        } else {
            String firstName = pathPrefix.get(0);

            Vertex v = UMLForeignMethods.getSubvertex(region, firstName);
            if (v instanceof State) {
                State state = (State) v;

                if (state.isComposite()) {
                    // recursively search the regions of this composite state
                    pathPrefix = pathPrefix.subList(1, pathPrefix.size());

                    for (Region r : state.getRegion()) {
                        collectStates(r, pathPrefix, states);
                    }
                }
            }
        }
    }

    // implements the inherited specification
    public Property defineAttribute(Classifier owner,
            Variable<Classifier, Parameter> variable, Constraint constraint) {

        Property result;

        String name = variable.getName();
        Classifier type = variable.getType();

        result = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createProperty();

        ElementOperations.addKeyword(result,UMLReflection.OCL_HELPER);

        result.setName(name);
        result.setType(type);

        annotate(result, constraint);

        addHelperProperty(owner, result);

        return result;
    }

    // implements the inherited specification
    public Operation defineOperation(Classifier owner, String name,
            Classifier type, List<Variable<Classifier, Parameter>> params,
            Constraint constraint) {
        Operation result = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createOperation();

        ElementOperations.addKeyword(result,UMLReflection.OCL_HELPER);

        result.setName(name);
        OperationOperations.setType(result,type == null ? getOCLStandardLibrary().getOclVoid()
            : type);
        result.setQuery(true); // OCL can only define queries

        for (Variable<Classifier, Parameter> next : params) {
            Parameter param = com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory.eINSTANCE.createParameter();
            param.setName(next.getName());
            param.setType(next.getType() == null ? getOCLStandardLibrary()
                .getOclVoid()
                : next.getType());

            param.setDirection(ParameterDirectionKindEnum.IN);
            param.setEffect(ParameterEffectKindEnum.READ);

            result.getOwnedParameter().add(param);
        }

        annotate(result, constraint);

        addHelperOperation(owner, result);
log("defineOperation "+result.getQualifiedName()+", "+type.getQualifiedName());
        return result;
    }
    
    private void annotate(Feature feature, Constraint definition) {
    	 MDExtension annotation = ElementOperations.getMDExtension(feature,ANNOTATION_SOURCE);
        
        if (annotation == null) {
            annotation = ElementOperations.createEAnnotation(feature,ANNOTATION_SOURCE);
        }
        
        annotation.getReferences().add(definition);
    }

    // implements the inherited specification
    public void undefine(Object feature) {
        Constraint definition = getDefinition(feature);

        if (definition == null) {
            throw new IllegalArgumentException(
                "not an additional feature: " + feature); //$NON-NLS-1$
        }

        EcoreUtil.remove((EObject) feature);
        EcoreUtil.remove(definition);

        definition.getConstrainedElement().clear();
    }

    // implements the inherited specification
    public Constraint getDefinition(Object feature) {
        Constraint result = null;
        Feature umlFeature = (Feature) feature;

        Classifier owner = (Classifier) umlFeature.getOwner();

        if (owner instanceof Class) {
            Classifier shadowed = ((TypeResolverImpl) getTypeResolver())
                .getShadowedClassifier(owner);

            if (shadowed != null) {
                owner = shadowed;
            }
        }

        if (owner != null) {
            if (feature instanceof EModelElement) {
                EAnnotation annotation = ((EModelElement) feature).getEAnnotation(
                    ANNOTATION_SOURCE);
                if (annotation != null) {
                    result = (Constraint) EcoreUtil.getObjectByType(
                        annotation.getReferences(),
                        com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage.Literals.CONSTRAINT);
                }
            }
            
            if (result == null) {
                // backward compatibility for existing serializations
                for (Constraint ct : owner.getOwnedRule()) {
                    if (ElementOperations.getKeywords(ct).contains(UMLReflection.DEFINITION)
                        && ct.getConstrainedElement().contains(umlFeature)) {
                        result = ct;
                        break;
                    }
                }
            }
        }

        return result;
    }

    // implements the inherited specification
    public boolean isInPostcondition(
            org.eclipse.ocl.expressions.OCLExpression<Classifier> exp) {

        Constraint constraint = null;
        EObject parent = exp;
        while (parent != null) {
            if (parent instanceof Constraint) {
                constraint = (Constraint) parent;
                break;
            }

            parent = parent.eContainer();
        }

        return (constraint != null)
            && (!ElementOperations.getKeywords(constraint).isEmpty())
            && UMLReflection.POSTCONDITION.equals(ElementOperations.getKeywords(constraint).get(
                0));
    }
    
    /**
     * I provide a custom formatting helper for UML metamodel.
     * 
     * @since 1.2
     */
    @Override
    public FormattingHelper getFormatter() {
        return UMLFormattingHelper.INSTANCE;
    }
    //////////////////////////////////////////////////////////////////
    // implements the interface method
    public Property lookupProperty(Classifier ownerIn, String name) {
    	Classifier owner=ownerIn;
    	if(TypeExp.class.isInstance(owner))owner=((TypeExp)owner).getReferredType();
    	if(TypeType.class.isInstance(owner))owner=((TypeType)owner).getReferredType();
    	Property result = doLookupProperty(owner, name);
        
        if ((result == null) && AbstractOCLAnalyzer.isEscaped(name)) {
              result = doLookupProperty(owner, AbstractOCLAnalyzer.unescape(name));
          }
        //if("packagedElement".equals(name))log("lookupProperty "+ownerIn.getQualifiedName()+"("+ownerIn.getClass().getName()+"), "+owner.getQualifiedName()+"("+owner.getClass().getName()+"), "+name+", "+result);
        return result;
    }
    
    private Property doLookupProperty(Classifier owner, String name) {
          if (owner == null) {
              Variable<Classifier, Parameter> vdcl = lookupImplicitSourceForProperty(name);
              if (vdcl == null) {
                  return null;
              }
              
              owner = vdcl.getType();
          }

          return TypeUtil.findAttribute(this, owner, name);
    }
    
}

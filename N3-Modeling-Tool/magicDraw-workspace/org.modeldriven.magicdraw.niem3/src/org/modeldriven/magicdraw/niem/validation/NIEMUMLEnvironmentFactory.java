/**
 * 
 */
package org.modeldriven.magicdraw.niem.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
//import org.eclipse.ocl.uml.UMLEnvironment;
//import org.eclipse.ocl.uml.UMLEnvironmentFactory;
/*
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
import org.eclipse.uml2.uml.StructuralFeature;
*/
import org.modeldriven.magicdraw.niem.validation.ocl.UMLEnvironment;
import org.modeldriven.magicdraw.niem.validation.ocl.UMLEnvironmentFactory;

import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;

/**
 * @author Tom
 *
 */
public class NIEMUMLEnvironmentFactory extends UMLEnvironmentFactory {
    /**
     * Initializes me with a resource set that the environments I create
     * will use (along with its package registry) to look up UML packages and
     * their Ecore definitions.
     * 
     * @param rset my resource set (must not by <code>null</code>)
     */
	public NIEMUMLEnvironmentFactory(ResourceSet rset) {
		this(rset.getPackageRegistry(), rset);
	}
    /**
     * Initializes me with a resource set and package registry that the
     * environments I create will use to look up UML packages and
     * their Ecore definitions.
     * 
     * @param registry my package registry (must not be <code>null</code>)
     * @param rset my resource set (must not be <code>null</code>)
     */
	public NIEMUMLEnvironmentFactory(EPackage.Registry registry, ResourceSet rset) {
		super(registry,rset);
	}
	
    public UMLEnvironment
    createEnvironment() {
        NIEMEnvironment result = new NIEMEnvironment(getEPackageRegistry(), getResourceSet());
        result.setFactory(this);
        return result;
    }
    
    public Environment<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject>
    createEnvironment(Environment<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> parent) {
        if (!(parent instanceof NIEMEnvironment)) {
            throw new IllegalArgumentException(
                "Parent environment must be my environment: " + parent);
        }
        
        NIEMEnvironment result = new NIEMEnvironment((NIEMEnvironment) parent);
        result.setFactory(this);
        return result;
    }

    public EvaluationEnvironment<Classifier, Operation, Property, Class, EObject>
    createEvaluationEnvironment() {
        return new NIEMEvaluationEnvironment(this);
    }

    public EvaluationEnvironment<Classifier, Operation, Property, Class, EObject>
    createEvaluationEnvironment(
            EvaluationEnvironment<Classifier, Operation, Property, Class, EObject> parent) {
        return new NIEMEvaluationEnvironment(parent);
    }

}

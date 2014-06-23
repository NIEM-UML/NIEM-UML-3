/**
 * <copyright>
 *
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLHelperImpl.java,v 1.4 2008/04/17 19:38:13 cdamus Exp $
 */

package org.modeldriven.magicdraw.niem.validation.ocl;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.helper.Choice;
import org.eclipse.ocl.helper.ConstraintKind;
import org.eclipse.ocl.helper.OCLHelper;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;



/**
 * Implementation of the {@link OCL.Helper} convenience interface.
 * 
 * @author Christian W. Damus (cdamus)
 */
class OCLHelperImpl implements OCL.Helper {
    private final OCLHelper<Classifier, Operation, Property, Constraint> delegate;

    OCLHelperImpl(OCLHelper<Classifier, Operation, Property, Constraint> delegate) {
        this.delegate = delegate;
    }

    public OCL getOCL() {
        return (OCL) delegate.getOCL();
    }
    
    public Environment<?, Classifier, Operation, Property, ?, ?, ?, ?, ?, Constraint, ?, ?> getEnvironment() {
        return delegate.getEnvironment();
    }
    
    public Constraint createConstraint(ConstraintKind kind, String expression)
        throws ParserException {
        return delegate.createConstraint(kind, expression);
    }
    
    public Constraint createBodyCondition(String expression)
        throws ParserException {
        return delegate.createBodyCondition(expression);
    }

    public Constraint createDerivedValueExpression(String expression)
        throws ParserException {
        return delegate.createDerivedValueExpression(expression);
    }

    public Constraint createInitialValueExpression(String expression)
        throws ParserException {
        return delegate.createInitialValueExpression(expression);
    }

    public Constraint createInvariant(String expression)
        throws ParserException {
        return delegate.createInvariant(expression);
    }

///////////////////////////////////////////////////////////////////////////////////    
	/**
	 * Strips any leading, trailing, or embedded comments from the specified OCL
	 * expression text.
	 * 
	 * @param txt an OCL expression
	 * @return the same, but without any comments.  Note that the result
	 *     may be an empty String if <code>txt</code> has only comments
	 */
/*    
	private String removeOCLComments(String txt) {
		try {
			return org.eclipse.ocl.internal.helper.HelperUtil.getLogicalLine(txt);
		} catch (Exception ex) {
			HelperUtil.catchException(ex, getClass(), "removeOCLComments");//$NON-NLS-1$
		}
		return HelperUtil.EMPTY;
	}
	private void propagate(Exception e, String method) throws ParserException {
//		OCLPlugin.catching(getClass(), method, e);
		ParserException ope = new ParserException(e.getLocalizedMessage(), e);
//		OCLPlugin.throwing(getClass(), method, ope);
		
		throw ope;
	}
	private boolean validating = true;
    
	public Constraint createInvariant(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parseInvariant(
                    this, expression, validating, delegate.getOCL().isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createInvariant"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(delegate.getEnvironment().getOCLStandardLibrary().getBoolean());
	}
	private Constraint createNullCondition(Constraint type) {
		OCLExpression<C> condition;
		
        OCLStandardLibrary<C> stdlib = env.getOCLStandardLibrary();
        
		if (type == stdlib.getBoolean()) {
			BooleanLiteralExp<C> literal =
				oclFactory.createBooleanLiteralExp();
			condition = literal;
			uml.setType(literal, env.getOCLStandardLibrary().getBoolean());
			literal.setBooleanSymbol(Boolean.FALSE);
		} else {
			UnspecifiedValueExp<C> unspec =
				oclFactory.createUnspecifiedValueExp();
			condition = unspec;
			
			if (type == null) {
				type = env.getOCLStandardLibrary().getOclVoid();
			}
			
			uml.setType(unspec, type);
		}
		
		CT result = uml.createConstraint();
		
		ExpressionInOCL<C, PM> spec = uml.createExpressionInOCL();
		spec.setBodyExpression(condition);
		spec.setContextVariable(env.getSelfVariable());
		
		uml.setSpecification(result, spec);
		return result;
	}
  */  
///////////////////////////////////////////////////////////////////////////////////    
    public Constraint createPostcondition(String expression)
        throws ParserException {
        return delegate.createPostcondition(expression);
    }

    public Constraint createPrecondition(String expression)
        throws ParserException {
        return delegate.createPrecondition(expression);
    }

    public OCLExpression createQuery(String expression)
        throws ParserException {
        return (OCLExpression) delegate.createQuery(expression);
    }

    public Property defineAttribute(String defExpression)
        throws ParserException {
        return delegate.defineAttribute(defExpression);
    }

    public Operation defineOperation(String defExpression)
        throws ParserException {
        return delegate.defineOperation(defExpression);
    }

    public Property getContextAttribute() {
        return delegate.getContextAttribute();
    }

    public Classifier getContextClassifier() {
        return delegate.getContextClassifier();
    }

    public Operation getContextOperation() {
        return delegate.getContextOperation();
    }

    public List<Choice> getSyntaxHelp(ConstraintKind constraintType, String txt) {
        return delegate.getSyntaxHelp(constraintType, txt);
    }

    public boolean isValidating() {
        return delegate.isValidating();
    }

    public void setContext(Classifier context) {
        delegate.setContext(context);
    }

    public void setAttributeContext(Classifier context, Property property) {
        delegate.setAttributeContext(context, property);
    }

    public void setOperationContext(Classifier context, Operation operation) {
        delegate.setOperationContext(context, operation);
    }
    
    public void setInstanceContext(Object instance) {
        delegate.setInstanceContext(instance);
    }
    
    public void setInstanceOperationContext(Object instance, Operation operation) {
        delegate.setInstanceOperationContext(instance, operation);
    }

    public void setInstanceAttributeContext(Object instance, Property property) {
        delegate.setInstanceAttributeContext(instance, property);
    }
    
    public void setValidating(boolean validating) {
        delegate.setValidating(validating);
    }
    
    public Diagnostic getProblems() {
    	return delegate.getProblems();
    }
}

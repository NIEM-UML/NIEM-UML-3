package org.modeldriven.magicdraw.niem.expression;
import com.nomagic.magicdraw.validation.SmartListenerConfigurationProvider;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.impl.PropertyNames;

//import javax.annotation.CheckForNull;
import javax.jmi.reflect.RefObject;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.BaseValidationRule;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import java.util.*;

public class NiemBaseClassifierExpression extends NiemNameClassifierExpression
{
    /**
     * Returns empty collection if the specified object is not an UML class.
     * If specified object is a class then returns a collection of the class attribute types.
     *
     * @param object an object.
     * @return collection of class attribute types.
     */
    @Override
  public Object getValue(/*@CheckForNull*/ RefObject object)
    {
		Classifier baseClassifier=null;
		if(Classifier.class.isInstance(object))baseClassifier=NIEMHelper.getBaseClassifier((Classifier)object);
    	return baseClassifier;
    	/*
    	if(Classifier.class.isInstance(object)){
    		Classifier clientClassifier=(Classifier)object;
    		Classifier baseClassifier=null;
    		for(Generalization generalization:clientClassifier.getGeneralization()){
    			if(NIEMHelper.isRolePlayedBy(generalization))continue;
    			if(NIEMHelper.isAugments(generalization))continue;
    			Classifier general=generalization.getGeneral();
    			if(NIEMHelper.isAugmentationType(general)&&!NIEMHelper.isAugmentationType(clientClassifier))continue;
    			baseClassifier=general;
    			break;
    		}
    		if(baseClassifier==null){
    			for(Dependency dependency:clientClassifier.getClientDependency()){
    				if(NIEMHelper.isRestriction(dependency)
    						||NIEMHelper.hasStereotype(dependency,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName))
    						){
    					for(NamedElement supplier:dependency.getSupplier()){
    						if(Classifier.class.isInstance(supplier)){
    							baseClassifier=(Classifier)supplier;
    							break;
    						}
    					}
    				}
    				if(baseClassifier!=null)break;
    			}
    		}
    		return baseClassifier;
    	}
    	return null;
    	*/
    }

}

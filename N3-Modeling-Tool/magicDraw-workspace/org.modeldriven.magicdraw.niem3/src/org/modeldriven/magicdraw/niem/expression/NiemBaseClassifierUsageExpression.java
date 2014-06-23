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

public class NiemBaseClassifierUsageExpression extends NiemNameClassifierExpression
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
   	 Collection <Classifier> result=new HashSet<Classifier>();
    	for(DirectedRelationship dr:getBaseTypeUsageRelations(object)){
			for(Element supplier:dr.getSource()){
				if(Classifier.class.isInstance(supplier)){
					result.add((Classifier)supplier);
				}
			}
    	}
    	return result;
    }
 static   public Set<DirectedRelationship> getBaseTypeUsageRelations(RefObject object)
    {
	 Set <DirectedRelationship> result=new HashSet<DirectedRelationship>();
    	if(Classifier.class.isInstance(object)){
    		Classifier general=(Classifier)object;
    		for(Generalization generalization:general.get_generalizationOfGeneral()){
    			if(NIEMHelper.isRolePlayedBy(generalization))continue;
    			if(NIEMHelper.isAugments(generalization))continue;
    			Classifier specific=generalization.getSpecific();
    			if(NIEMHelper.isAugmentationType(general)&&!NIEMHelper.isAugmentationType(specific))continue;
    			result.add(generalization);
    		}
    			for(DirectedRelationship dependency:general.get_directedRelationshipOfTarget()){
    				if(NIEMHelper.isRestriction(dependency)
    						||NIEMHelper.hasStereotype(dependency,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName))
    						){
    					for(Element supplier:dependency.getSource()){
    						if(Classifier.class.isInstance(supplier)){
    							result.add(dependency);
    						}
    					}
    				}
    			}
    	}
    	return result;
    }

}

package org.modeldriven.magicdraw.niem.expression;
import com.nomagic.magicdraw.validation.SmartListenerConfigurationProvider;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
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

public class NIEMAugmentationAppliesToClassifierExpression extends NiemNamePropertyExpression
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
    	
    	List<Classifier> result=new Vector<Classifier>();
    	if(Property.class.isInstance(object)){
    		Property clientProperty=(Property)object;
    		Type clientType=clientProperty.getType();
    		if((clientType!=null)&&Classifier.class.isInstance(clientType)){
    			Classifier augmentationClassifier=(Classifier)clientType;
    			if(NIEMHelper.isAugmentationType(augmentationClassifier)){
					for(Dependency dependency:clientProperty.getClientDependency()){
						if(NIEMHelper.hasStereotype(dependency,NIEMHelper.getCommonStereotype(AugmentationApplicationStereotypeName))
								){
							for(NamedElement supplier:dependency.getSupplier()){
								if(Classifier.class.isInstance(supplier)){
									result.add((Classifier)supplier);
								}
							}
						}
					}
    			}
    			// also any augments from augmentationClassifier
    			for(Generalization generalization:augmentationClassifier.getGeneralization()){
    				Classifier generalClassifier=generalization.getGeneral();
    				if(NIEMHelper.isAugments(generalization)&&(generalClassifier!=null)){
    					result.add(generalClassifier);
    				}
    			}
    		}
    	}
    	else if(Generalization.class.isInstance(object)){
    		Generalization clientGeneralization=(Generalization)object;
    		generalizationAugmentationAppliesTo(clientGeneralization,result);
    		/*
    		Classifier augmentationClassifier=clientGeneralization.getGeneral();
    		Classifier clientClassifier=clientGeneralization.getSpecific();
    		if((augmentationClassifier!=null)
    				&&(clientClassifier!=null)
    				&&NIEMHelper.isAugmentationType(augmentationClassifier)
    				&&!NIEMHelper.isAugmentationType(clientClassifier)
    				){
    			//  any augments from augmentationClassifier
    			for(Generalization generalization:augmentationClassifier.getGeneralization()){
    				Classifier generalClassifier=generalization.getGeneral();
    				if(NIEMHelper.isAugments(generalization)&&(generalClassifier!=null)){
    					result.add(generalClassifier);
    				}
    			}
    		}
    		*/
    	}
    	else if(Classifier.class.isInstance(object)&&NIEMHelper.isAugmentationType((Classifier)object)){
			for(Generalization generalization:((Classifier)object).getGeneralization()){
				Classifier generalClassifier=generalization.getGeneral();
				if(NIEMHelper.isAugments(generalization)&&(generalClassifier!=null)){
					result.add(generalClassifier);
				}
			}
    	}
    	return result;
    }
    protected void generalizationAugmentationAppliesTo(Generalization clientGeneralization,List<Classifier> result){
		Classifier augmentationClassifier=clientGeneralization.getGeneral();
		Classifier clientClassifier=clientGeneralization.getSpecific();
		if((augmentationClassifier!=null)
				&&(clientClassifier!=null)
				&&NIEMHelper.isAugmentationType(augmentationClassifier)
				&&!NIEMHelper.isAugmentationType(clientClassifier)
				){
			//  any augments from augmentationClassifier
			for(Generalization generalization:augmentationClassifier.getGeneralization()){
				Classifier generalClassifier=generalization.getGeneral();
				if(NIEMHelper.isAugments(generalization)&&(generalClassifier!=null)){
					result.add(generalClassifier);
				}
			}
		}
    	
    }
}

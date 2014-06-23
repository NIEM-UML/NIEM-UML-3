package org.modeldriven.magicdraw.niem.expression;
import com.nomagic.magicdraw.validation.SmartListenerConfigurationProvider;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.PropertyNames;

//import javax.annotation.CheckForNull;
import javax.jmi.reflect.RefObject;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.BaseValidationRule;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import java.util.*;

public class AllReferencedInformationModelsClassifierExpression extends NiemNameClassifierExpression implements Expression, SmartListenerConfigurationProvider
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
		Set<Package> result=new HashSet<Package>();
    	if(Classifier.class.isInstance(object)){
    			NIEMHelper.findAllInformationModelsReferencedByType((Classifier)object,result,new HashSet<NamedElement>());
    		}
    		
    	return result;
    }
 
}
package org.modeldriven.magicdraw.niem.expression;
import com.nomagic.magicdraw.validation.SmartListenerConfigurationProvider;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
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

public class ReferencesTypePropertyExpression extends NiemNamePropertyExpression
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
   	if(Property.class.isInstance(object)){
    		Property clientProperty=(Property)object;
    		// preferably use propertyholder in order to get substitutionGroup type
    		Property referenceProperty= null;
			// for substitutes, need to get via subset propertyHolder
    		Property subsetPropertyTest=NameHelper.getSubsetPropertyHolderProperty(clientProperty);
    		if(subsetPropertyTest!=null)clientProperty=subsetPropertyTest;
    		referenceProperty= NIEMHelper.getReferenceProperty(clientProperty);
    		// sometimes there is a propertyholder on subset but not on reference, so backup is to get via original property
    		if(referenceProperty==null){
    		  referenceProperty= NIEMHelper.getReferenceProperty((Property)object);
    		}
    		if(referenceProperty!=null){
    			return referenceProperty.getType();
    		}
    	}
    	return null;
    }

}

package org.modeldriven.magicdraw.niem.expression;
import com.nomagic.magicdraw.validation.SmartListenerConfigurationProvider;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
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

public class ReferencesPropertyExpression extends NiemNamePropertyExpression
{
    /**
     * Returns corresponding property from base reference model.
     *
     * @param object an object.
     * @return collection of class attribute types.
     */
    @Override
  public Object getValue(/*@CheckForNull*/ RefObject object)
    {
   	if(Property.class.isInstance(object)){
    		Property clientProperty=(Property)object;
    		return NIEMHelper.getReferenceProperty(clientProperty);
    	}
    	return null;
    }

}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
abstract public class PimProfileAction extends DrawActionCommon {

	public PimProfileAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean isEnabled(){
		return super.isEnabled()&&(getPimProfile()!=null);
	}

}

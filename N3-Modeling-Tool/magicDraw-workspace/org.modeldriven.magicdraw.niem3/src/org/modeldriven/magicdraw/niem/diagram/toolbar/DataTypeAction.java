/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class DataTypeAction extends DrawActionCommon {

	public DataTypeAction() {
		super("DataType");
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("datatype"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		return createDataType(this.getFirstSelected(),this.getDiagram(),getName());
/*
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType niemType = Application.getInstance().getProject().getElementsFactory().createDataTypeInstance();
		setSimpleTypeName(niemType);
		return niemType;
		*/
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType createDataType(PresentationElement pe,DiagramPresentationElement diagram,String name) {
		Package owningPackage=getSelectedPackage(pe,diagram);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType niemType = Application.getInstance().getProject().getElementsFactory().createDataTypeInstance();
		if(owningPackage!=null)owningPackage.getPackagedElement().add(niemType);
		NameHelper.fixClassifierName(niemType, "My"+name, SIMPLETYPE_SUFFIX);
		return niemType;
	}
	public boolean isEnabled(){return isInformationModelEnabled();}

}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import org.modeldriven.magicdraw.niem.diagram.toolbar.ClassAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DataTypeAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMTypeAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.PrimitiveTypeAction;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class AddPrimitiveTypeAction extends CommonDiagramAction {
	static protected String stereotypeName="PrimitiveType";
	public AddPrimitiveTypeAction(){
		super("add"+stereotypeName,"add "+stereotypeName,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		setSmallIcon(DrawActionCommon.getUmlIcon("primitive"));
		setDescription(PRIMITIVE_TYPE_ACTION_TOOLTIP);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		PrimitiveType niemType=PrimitiveTypeAction.createPrimitiveType(this.getFirstSelected(),this.getDiagram(),stereotypeName);
		addClassifierToDiagram(niemType);
	}
	
}

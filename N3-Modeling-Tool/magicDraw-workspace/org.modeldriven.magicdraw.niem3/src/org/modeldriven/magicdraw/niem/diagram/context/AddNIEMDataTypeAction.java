/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMDataTypeAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMTypeAction;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
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
public class AddNIEMDataTypeAction extends CommonDiagramAction {
	protected String stereotypeName=null;
	public AddNIEMDataTypeAction(String stereotypeNameIn){
		super("add"+stereotypeNameIn,"add "+stereotypeNameIn,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		stereotypeName=stereotypeNameIn;
		setSmallIcon(DrawActionCommon.getUmlIcon("datatype"));
		setDescription(getDataTypeToolTip(stereotypeName));
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		DataType niemType=NIEMDataTypeAction.createNIEMDataType(this.getFirstSelected(),this.getDiagram(),stereotypeName);
		addClassifierToDiagram(niemType);
	}
	protected String getDataTypeToolTip(String stereotypeName){
		String result=CREATES_FRAGMENT+"a &lt;&lt;"+stereotypeName+">> DataType representing a NIEM SimpleType"+
				ADDS_TO_INFORMATION_MODEL_FRAGMENT;
		if(stereotypeName.equals(ListStereotypeName)){
			result+=	"<li>Creates a Property representing the list item type</li>";
		}
		result+=		CREATES_AND_ADDS_NOTATION_FRAGMENT;
		//Stereotype stereotype=NIEMHelper.getCommonStereotype(stereotypeName);
		//String comment=getStereotypeComment(stereotype);
		//result+=comment;
		result+=HTML_TAIL_FRAGMENT;
		return result;
	}
	/*
	protected String getStereotypeComment(Stereotype stereotype){
		String result="";
		if(stereotype!=null)
		for(Comment comment:stereotype.getOwnedComment()){
			if(result.length()!=0)result+="<p/>";
			result+=comment.getBody();
		}
		return result;
	}
	*/
}

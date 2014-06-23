/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import java.awt.Rectangle;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMTypeAction;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class AddNIEMTypeAction extends CommonDiagramAction {
	protected String stereotypeName=null;
	public AddNIEMTypeAction(String stereotypeNameIn){
		super("add"+stereotypeNameIn,"add "+stereotypeNameIn,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		stereotypeName=stereotypeNameIn;
		setSmallIcon(DrawActionCommon.getUmlIcon("class"));
		setDescription(getNIEMTypeToolTip(stereotypeName));
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		Class niemType=NIEMTypeAction.createNIEMType(this.getFirstSelected(),this.getDiagram(),stereotypeName);
		addClassifierToDiagram(niemType);
	}
	protected String getNIEMTypeToolTip(String stereotypeName){
		String result=CREATES_FRAGMENT+"a &lt;&lt;"+stereotypeName+">> Class "+
				ADDS_TO_INFORMATION_MODEL_FRAGMENT;
		result+=		CREATES_AND_ADDS_NOTATION_FRAGMENT;
		result+=HTML_TAIL_FRAGMENT;
		return result;
	}

}

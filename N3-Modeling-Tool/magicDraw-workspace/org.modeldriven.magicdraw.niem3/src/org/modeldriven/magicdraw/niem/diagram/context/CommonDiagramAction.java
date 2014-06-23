/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import java.awt.Rectangle;

import javax.swing.KeyStroke;

import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;

/**
 * @author Tom
 *
 */
public class CommonDiagramAction extends DefaultDiagramAction implements NIEM_ProfileConstants,ToolTipConstants{

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public CommonDiagramAction(String actionID, String actionName, KeyStroke stroke,
			String group) {
		super(actionID, actionName, stroke, group);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void updateState() {
		setEnabled(true);
	}
	public void addClassifierToDiagram(Classifier type){
		DiagramPresentationElement dpe=getDiagram();
		if(dpe==null)return;
		PresentationElementsManager manager = PresentationElementsManager.getInstance();
		SessionManager.getInstance().createSession("Edit class A");
		try {
			ShapeElement shapeElement=PresentationElementsManager.getInstance().createShapeElement(type,dpe);
			shapeElement.addProperty(Psm2PimAction.ownerDisplayProperty);
			shapeElement.setSelected(false);
		
	          PresentationElement element = getFirstSelected();
	          int x=0;
	          int y=0;
	          if(element==null){
//	        	  Rectangle refbounds = dpe.getVisibleBounds();
	        	  Rectangle refbounds = dpe.getBounds();
	        	  //x=dpe.getCenterlinePointX();
	        	  //y=dpe.getCenterlinePointY();
	        	  if(refbounds!=null){
			          x = refbounds.x + (refbounds.width/2);
			          y=refbounds.y+(refbounds.height/2);
	        		  
	        	  }
	          }else{
		          Rectangle refbounds = element.getBounds();
		          if(refbounds!=null){
		          x = refbounds.x + refbounds.width+100;
		          y=refbounds.y;
		          }
	          }
	
				//QvtCommonAction.log("Set location for add Classifier "+x+", "+y+", "+element);
	          shapeElement.setLocation(x,y);
		} catch (Throwable e) {
			QvtCommonAction.log("ERROR during diagram add Classifier "+e);
		}finally{SessionManager.getInstance().closeSession();}
		
	}

}

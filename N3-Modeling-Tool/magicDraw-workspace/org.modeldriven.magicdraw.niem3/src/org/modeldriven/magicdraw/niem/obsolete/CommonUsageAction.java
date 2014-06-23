/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.DiagramCanvas;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class CommonUsageAction extends DrawPathActionCommon {
	// this seems to be obsolete
////////////////TEST:  we may be able to reverse this one? apparently not
	public CommonUsageAction(String name) {
		super(name);
		// this ID not sufficient
//		super("ADD_USAGE_OPPOSITE",name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("usage"));
		
	}
	/* this only tells us our own event.  how do we know when we go off the diagram and lose the transaction manager? 
	public void actionPerformed(ActionEvent event){
		System.out.println("CommonUsage action "+event+", "+event.getClass().getName()+", "+event.getActionCommand());
		super.actionPerformed(event);
	}
	*/
	/*
	protected void addOffDiagramListener(){
		DiagramCanvas canvas=getCanvas();
		if(canvas==null)return;
		
		for(MouseListener mouseListener:canvas.getMouseListeners()){
			if(mouseListener instanceof MyMouseListener)return;
		}
		MouseListener newMouseListener=new MyMouseListener();
		canvas.addMouseListener(newMouseListener);
	}
		*/
	/*
	public  class MyMouseListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent event) {
			//System.out.println("mouseFocusLost "+event+", "+event.getSource()+", "+CommonUsageAction.this.getState());
			// if transaction in progress, stop it
			SessionManager sessionManager=SessionManager.getInstance();
			if(sessionManager.isSessionCreated()){
				// if we commit, then we need to make sure original has client/supplier
//				sessionManager.closeSession();
				// if we cancel we can remove corruption, but dragging operation continues without our decorator adapter?
				sessionManager.cancelSession();
			}
			// we could remove ourselves as listener
			Object test=event.getSource();
			if(test instanceof DiagramCanvas){
				DiagramCanvas diagramCanvas=(DiagramCanvas)test;
				diagramCanvas.removeMouseListener(this);
				
			}
			//CommonUsageAction.this.replaceState();// is this disabling other items?
			// we still 
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	*/
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		
//		Usage niemType= UMLFactory.eINSTANCE.createUsage();
//		addPackagedElement(niemType);
		// need to create element or no action will occur
		//System.out.println("CommonUsage action "+this.getSelected());
		//if(this.getSelected().size()<2)return null;
		//System.out.println("creating Usage "+getName()+", "+this.getState());
		//boolean isSessionCreated=NIEMHelper.createSession("createUsage"+getName());
		try{
		Usage niemType = Application.getInstance().getProject().getElementsFactory().createUsageInstance();
//		Usage niemType = UMLFactory.eINSTANCE.createUsage();// null ptr during addStereotype
		//setName(niemType);
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getCommonStereotype(getName());
		NIEMHelper.addStereotype(niemType,stereotype);
		//System.out.println("created Usage "+getName());
		//addPackagedElement(niemType);
		
		// see if we need client/supplier? - does not work either
		//niemType.getClient().add(niemType);
		//niemType.getSupplier().add(niemType);
		//addOffDiagramListener();
		for(MouseListener listener:this.getCanvas().getMouseListeners()){
			System.out.println("CommonUsageAction createElement MouseListener "+listener);
		}
		for(MouseMotionListener listener:this.getCanvas().getMouseMotionListeners()){
			System.out.println("CommonUsageAction createElement MouseMotionListener "+listener);
		}
		
		return niemType;
		}catch(Throwable t){
			t.printStackTrace();
			return null;
		//}finally{
		//	NIEMHelper.closeSession(isSessionCreated);
		}
	}
	/*
	public boolean isEnabled(){
//		return isInformationModelEnabled();
		DiagramPresentationElement dpe=this.getDiagram();
		if(dpe==null)return false;
		Diagram diagram=dpe.getDiagram();
		if(diagram==null)return false;
		return super.isEnabled()&&NIEMHelper.isProfileApplied(diagram, NIEMHelper.getCommonProfile());
		}
*/
}

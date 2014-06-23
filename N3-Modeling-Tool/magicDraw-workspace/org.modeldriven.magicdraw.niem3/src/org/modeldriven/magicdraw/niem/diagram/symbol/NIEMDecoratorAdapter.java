/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.manipulators.ViewManipulator;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;

import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;

/**
 * @author Tom
 *
 */
public class NIEMDecoratorAdapter extends PathDecoratorAdapter implements NIEM_ProfileConstants{

	/**
	 * @param arg0
	 */
	public NIEMDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	protected boolean isSuperTypeOf(Classifier general,Classifier specific){
		if(specific==null)return false;
		if(specific.equals(general))return true;
//		for(Classifier specificSuper:specific.getGeneral()){
		for(Classifier specificSuper:NIEMHelper.getGeneral(specific)){
			if(isSuperTypeOf(general,specificSuper))return true;
		}
		return false;
	}
	protected static String statusText=null;
	static protected void baseSetStatusText(){
		if(statusText==null)return;
		Application.getInstance().getMainFrame().getStatusLine().setText(statusText);
	}
	
	protected void setStatusText(String text){
		statusText=text;
		if(statusText==null)return;
		baseSetStatusText();
		new Thread(new Runnable(){

			@Override
			public void run() {
				try {
//					Thread.sleep(400);// 500 too long?, 200 too short;
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
				baseSetStatusText();
			}
			
		}).start();
		/*
		try {
			this.wait(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		*/
	}
	
	protected boolean isInformationModel(Element clientElement,Element supplierElement){
		return isInInformationModel(clientElement)||isInInformationModel(supplierElement);
	}
	protected boolean isInInformationModel(Element clientElement){
		return NIEMHelper.isInInformationModel(clientElement);
	}
	protected boolean isNamed(NamedElement element){
		return NIEMHelper.isNamed(element);
	}
	protected boolean isInXmlTypeLibrary(Element clientElement){
		return NIEMHelper.isInXmlTypeLibrary(clientElement);
	}
}

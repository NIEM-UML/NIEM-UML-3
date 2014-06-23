/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.util.List;
import java.util.Vector;

import javax.swing.KeyStroke;

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
public class ClassAction extends DrawActionCommon {
//	public static KeyStroke keyStroke=KeyStroke.getKeyStroke('c');
	public static KeyStroke keyStroke=KeyStroke.getKeyStroke("C");

	public ClassAction() {
		super("Class",keyStroke);
		//System.out.println("ClassAction "+keyStroke);
		// may have to do this manually via environment options?
		//this.getCommandKey();
		this.setLargeIcon(getUmlIcon("class"));
		//setDescription(TOOLBAR_CLASS_ACTION_TOOLTIP);
		// the shortcut is no longer working?
/*
		List<KeyStroke> keyStrokes=new Vector<KeyStroke>();
		keyStrokes.add(keyStroke);
		this.setShortcuts(keyStrokes);
		this.addShotcut(keyStroke);
*/
	}
	public KeyStroke 	getCommandKey() {
		KeyStroke result=super.getCommandKey();
		//System.out.println("getCommandKey "+result);
		return result;
		//return keyStroke;
	}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		return createClass(this.getFirstSelected(),this.getDiagram(),getName());
		/*
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class niemType= UMLFactory.eINSTANCE.createClass();
	    com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class niemType = Application.getInstance().getProject().getElementsFactory().createClassInstance();
//		addPackagedElement(niemType);
//		niemType.setName(this.getName());
		DiagramPresentationElement diagram=this.getDiagram();
		if(diagram!=null){
			Element element=diagram.getElement();
			if(element!=null){
				Element owner=element.getOwner();
				if(Package.class.isInstance(owner)){
					((Package)owner).getPackagedElement().add(niemType);
				}
			}
		}
	    
		setTypeName(niemType);
		return niemType;
		*/
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class createClass(PresentationElement pe,DiagramPresentationElement diagram,String name) {
		//System.out.println("createClass "+pe+", "+diagram+", "+name);
		Package owningPackage=getSelectedPackage(pe,diagram);
	    com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class niemType = Application.getInstance().getProject().getElementsFactory().createClassInstance();
		if(owningPackage!=null)owningPackage.getPackagedElement().add(niemType);
		NameHelper.fixClassifierName(niemType, "My"+name, TYPE_SUFFIX);
		return niemType;
	}

	public boolean isEnabled(){
		if(true)return true;
		return isInformationModelEnabled();
		}

}

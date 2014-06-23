/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import org.modeldriven.magicdraw.niem.diagram.toolbar.ClassAction;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.DiagramContextAMConfigurator;
import com.nomagic.magicdraw.actions.MDActionsManager;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.options.EnvironmentOptions;
import com.nomagic.magicdraw.core.options.KeyboardOptionsGroup;
import com.nomagic.magicdraw.properties.PropertyManager;
import com.nomagic.magicdraw.properties.Style;
import com.nomagic.magicdraw.ui.DiagramToolbarConfiguration;
import com.nomagic.magicdraw.ui.ImageIconProxy;
import com.nomagic.magicdraw.ui.ResizableIconHelper;
import com.nomagic.magicdraw.ui.VectorImageIconControler;
import com.nomagic.magicdraw.ui.actions.BaseDiagramContextAMConfigurator;
import com.nomagic.magicdraw.ui.actions.ClassDiagramShortcutsConfigurator;
import com.nomagic.magicdraw.uml.DiagramDescriptor;
import com.nomagic.magicdraw.uml.DiagramType;
import com.nomagic.magicdraw.uml.diagrams.UMLDiagramDescriptor;
import com.nomagic.ui.ResizableIcon;

/**
 * @author Tom
 *
 */
//public class NIEMDiagramDescriptor extends UMLDiagramDescriptor {
public class NIEMDiagramDescriptor extends DiagramDescriptor {
	  public static final String NIEM_DIAGRAM = "NIEM Information Model Diagram";

	/**
	 * 
	 */
	public NIEMDiagramDescriptor() {
	}

	protected DiagramDescriptor getDelegate() {
		try{
		return Application.getInstance().getDiagramDescriptor(DiagramType.UML_CLASS_DIAGRAM);
		}catch(Throwable t){
			t.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getDiagramActions()
	 */

	@Override
	public MDActionsManager getDiagramActions() {
		DiagramDescriptor delegate= getDelegate();
		//if(delegate!=null)return delegate.getDiagramActions();
		
		return NIEMDiagramActions.ACTIONS;
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getDiagramContextConfigurator()
	 */

	@Override
	public DiagramContextAMConfigurator getDiagramContextConfigurator() {
		DiagramDescriptor delegate= getDelegate();
		//System.out.println("getDiagramContextConfigurator "+delegate);
		//if(delegate!=null)return delegate.getDiagramContextConfigurator();
	    return new BaseDiagramContextAMConfigurator();
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getDiagramShortcutsConfigurator()
	 */

	@Override
	public AMConfigurator getDiagramShortcutsConfigurator() {
		DiagramDescriptor delegate= getDelegate();
		//System.out.println("getDiagramShortcutsConfigurator "+delegate);
		//if(delegate!=null)return delegate.getDiagramShortcutsConfigurator();

	    return new ClassDiagramShortcutsConfigurator(){
	    	  public void 	configure(ActionsManager manager) {
	    		  super.configure(manager);
	    		  manager.updateCommandKeysFrom(NIEMDiagramActions.ACTIONS);// does nothing?
	    	  }
	    };
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getDiagramToolbarConfigurator()
	 */
	
	@Override
	public AMConfigurator getDiagramToolbarConfigurator() {
		DiagramDescriptor delegate= getDelegate();
//		if(delegate!=null)return delegate.getDiagramToolbarConfigurator();
	
	    return new NIEMDiagramToolbarConfigurator(getSuperType());
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getDiagramTypeId()
	 */
	@Override
	public String getDiagramTypeId() {
	    return NIEM_DIAGRAM;
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getLargeIcon()
	 */
	@Override
	public ImageIcon getLargeIcon() {
		//return QvtCommonAction.getNiemIcon();
	    return new ImageIconProxy(new VectorImageIconControler(getClass(), getIconPath(), 16, VectorImageIconControler.SVG));
//	    return new ImageIconProxy(new VectorImageIconControler(BaseCustomizableDiagramAction.class, "com/nomagic/magicdraw/ui/diagrams/precreated/icons/svg/classdiagram.svg", 16, VectorImageIconControler.SVG));
	    //return new ImageIconProxy(new VectorImageIconControler(getClass(), "icons/specificdiagram.svg", 16, VectorImageIconControler.SVG));
	    
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getPluralDiagramTypeHumanName()
	 */
	@Override
	public String getPluralDiagramTypeHumanName() {
		return NIEM_DIAGRAM+"s";
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getSVGIcon()
	 */
	@Override
	public ResizableIcon getSVGIcon() {
	    return ResizableIconHelper.createSVGIcon(getSVGIconURL());
	}
	  private URL getSVGIconURL()
	  {
	    return getClass().getResource(getIconPath());
	  }
protected String getIconPath(){
	//return "com/nomagic/magicdraw/ui/diagrams/precreated/icons/svg/classdiagram.svg";
	return "/org/modeldriven/magicdraw/niem/diagram/symbol/classdiagram.svg";
}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getSingularDiagramTypeHumanName()
	 */
	@Override
	public String getSingularDiagramTypeHumanName() {
		return NIEM_DIAGRAM;
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getSmallIconURL()
	 */
	@Override
	public URL getSmallIconURL() {
		//System.out.println("getSmallIconURL "+getSVGIconURL());
	    return getSVGIconURL();
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#getSuperType()
	 */
	@Override
	public String getSuperType() {
		return DiagramType.UML_CLASS_DIAGRAM;
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.uml.DiagramDescriptor#isCreatable()
	 */
	@Override
	public boolean isCreatable() {
		return true;
	}

}

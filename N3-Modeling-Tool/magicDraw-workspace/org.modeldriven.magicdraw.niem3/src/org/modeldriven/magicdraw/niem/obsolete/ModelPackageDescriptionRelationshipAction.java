/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.SymbolDecorator;
import com.nomagic.magicdraw.uml.symbols.paths.DependencyView;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecorator;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.magicdraw.uml.symbols.paths.UsageView;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class ModelPackageDescriptionRelationshipAction extends DrawPathActionCommon {

	public ModelPackageDescriptionRelationshipAction() {
		super(ModelPackageDescriptionRelationshipStereotypeName);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("dependency"));
		
	}
	/*
	protected PathElement createPathElement(){
		PathElement pathElement=new DependencyView(){
//			PathDecorator pathDecorator=new PathDecorator(){
			PathDecorator pathDecorator=new PathDecoratorAdapter(new PathRenderer(){}){
				public boolean isConnectable2Obj(PathElement pe,PresentationElement supplierPE,PresentationElement clientPE){
					// source must be mpd  target must be mpd
					Element supplierElement=((supplierPE==null)?null:supplierPE.getElement());
					Element clientElement=((clientPE==null)?null:clientPE.getElement());
					if(clientElement==null)return false;
					if(supplierElement==null)return true;	
					if((supplierPE!=null) && Component.class.isInstance(supplierElement)){
						// must be stereotyped
						return true;
					}
					return false;
					//return isConnectable2Obj(pe,pres,pres2);
				}
			};
			public SymbolDecorator getRenderer(){
				return pathDecorator;
			}
		};
		return pathElement;
		//return super.createPathElement();
		
	}
*/
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
//		Dependency niemType= UMLFactory.eINSTANCE.createDependency();
//		addPackagedElement(niemType);
		Dependency niemType = Application.getInstance().getProject().getElementsFactory().createDependencyInstance();
		//setName(niemType);
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getMpdStereotype(getName());
		applyStereotype(niemType,stereotype);
		return niemType;
	}
	
	//public boolean isEnabled(){return isMpdEnabled();}

}

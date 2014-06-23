/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import java.awt.Graphics;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.SymbolDecorator;
import com.nomagic.magicdraw.uml.symbols.SymbolDecoratorProvider;
import com.nomagic.magicdraw.uml.symbols.SymbolRendererManager;
import com.nomagic.magicdraw.uml.symbols.paths.ContainerLinkView;
import com.nomagic.magicdraw.uml.symbols.paths.DependencyView;
import com.nomagic.magicdraw.uml.symbols.paths.LinkWithStereotype;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecorator;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.magicdraw.uml.symbols.paths.UsageView;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
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
public class ModelPackageDescriptionFileAction extends DrawPathActionCommon {

	public ModelPackageDescriptionFileAction() {
		super(ModelPackageDescriptionFileStereotypeName);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("usage"));
	}
	protected PathElement createPathElementY(){
		//ContainerLinkView x;
PresentationElement parent=this.getDiagram();
PathElement pathElement=new UsageView(parent);
/*
		PathElement pathElement=super.createPathElement();
		log("createPathElement "+pathElement);
		*/
		return pathElement;
	}

	protected PathElement createPathElementX(){
		//ContainerLinkView x;
//UsageView x;
		UsageView uv=new UsageView();
		com.nomagic.magicdraw.uml.symbols.SymbolRendererManager x;
		//x.addProvider(arg0);
		SymbolDecoratorProvider y;
		//y.getSymbolDecorator(arg0);
		
		PathElement pathElement=new UsageView(){
			/*
			PathDecorator pathDecorator=new PathDecorator(){
				public boolean isConnectable2Obj(PathElement pe,PresentationElement pres,PresentationElement pres2){
					// source must be mpd or mpdFileSet; target must be Namespace
					if((pres!=null) 
//							&& Component.class.isInstance(pres.getElement())
							){
						// must be stereotyped
						return true;
					}
					return true;
//					return false;
					//return isConnectable2Obj(pe,pres,pres2);
				}
			};
			*/
//			PathRenderer pr=new PathDecoratorAdapter(new PathRenderer(){}){};
			PathDecorator pathDecorator=new PathDecoratorAdapter(new PathRenderer(){}){
				public boolean isConnectable2Obj(PathElement pe,PresentationElement pres,PresentationElement pres2){
					// source must be mpd  target must be mpd
					if((pres!=null) 
//							&& Component.class.isInstance(pres.getElement())
							){
						// must be stereotyped
						return true;
					}
					return true;
//					return false;
					//return isConnectable2Obj(pe,pres,pres2);
				}
			};
/*			
			public SymbolDecorator getRenderer(){
				//com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter x;
			
				log("getRenderer "+super.getRenderer());
				return pathDecorator;
			}
*/			
		};
		return pathElement;
		//return super.createPathElement();
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
//		Usage niemType= UMLFactory.eINSTANCE.createUsage();
//		addPackagedElement(niemType);
		Usage niemType = Application.getInstance().getProject().getElementsFactory().createUsageInstance();
		//setName(niemType);
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getMpdStereotype(getName());
		applyStereotype(niemType,stereotype);
		Profile mpdProfile=NIEMHelper.getMpdProfile();
		Enumeration natureCode=(Enumeration)getType(mpdProfile,NatureCodeName);
		Enumeration purposeCode=(Enumeration)getType(mpdProfile,PurposeCodeName);
		EnumerationLiteral defaultPurpose=getOwnedLiteral(purposeCode,subset_schemaLiteralName);
		EnumerationLiteral defaultNature=getOwnedLiteral(natureCode,xsdLiteralName);
		setStereotypePropertyValue(niemType,stereotype,natureCodeTagName,defaultNature);
		setStereotypePropertyValue(niemType,stereotype,purposeCodeTagName,defaultPurpose);
		NIEMHelper.setStereotypePropertyValue(niemType,stereotype,relativePathNameTagName,"");
		setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"Serves the purpose of an XML schema that has been derived from a NIEM reference schema and represents a subset of the reference schema.");
		
		return niemType;
	}
	//public boolean isEnabled(){return isMpdEnabled();}

}

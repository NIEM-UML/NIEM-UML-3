/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.Icon;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.io_software.catools.tas.mof.model.DataType;
import com.io_software.catools.tas.mof.model.PrimitiveType;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.ui.MainFrame;
import com.nomagic.magicdraw.ui.ResizableIconHelper;
import com.nomagic.magicdraw.uml.symbols.DiagramObjectViewContainer;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElementRendererProvider;
import com.nomagic.magicdraw.uml.symbols.SymbolDecorator;
import com.nomagic.magicdraw.uml.symbols.SymbolDecoratorProvider;
import com.nomagic.magicdraw.uml.symbols.SymbolDecoratorProviderAdapter;
import com.nomagic.magicdraw.uml.symbols.manipulators.ViewManipulator;
import com.nomagic.magicdraw.uml.symbols.paths.AssociationClassView;
import com.nomagic.magicdraw.uml.symbols.paths.AssociationView;
import com.nomagic.magicdraw.uml.symbols.paths.ContainerLinkView;
import com.nomagic.magicdraw.uml.symbols.paths.DependencyView;
import com.nomagic.magicdraw.uml.symbols.paths.GeneralizationView;
import com.nomagic.magicdraw.uml.symbols.paths.LinkWithEndsView;
import com.nomagic.magicdraw.uml.symbols.paths.LinkWithRolesView;
import com.nomagic.magicdraw.uml.symbols.paths.LinkWithStereotype;
import com.nomagic.magicdraw.uml.symbols.paths.PackageImportView;
import com.nomagic.magicdraw.uml.symbols.paths.PathConnector;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathEndAdornment;
import com.nomagic.magicdraw.uml.symbols.paths.PathEndAdornmentModifier;
import com.nomagic.magicdraw.uml.symbols.paths.PathEndRenderer;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;

import com.nomagic.magicdraw.uml.symbols.paths.RealizationView;
import com.nomagic.magicdraw.uml.symbols.paths.UsageView;
import com.nomagic.magicdraw.uml.symbols.shapes.ComponentView;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.ui.ResizableIcon;
import com.nomagic.ui.SwingImageIcon;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdcollaborations.Collaboration;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class NIEMSymbolDecoratorProvider implements SymbolDecoratorProvider,NIEM_ProfileConstants {
	protected void setStatusText(String text){
		Application.getInstance().getMainFrame().getStatusLine().setText(text);
	}
	/**
	 */
	@Override
	public SymbolDecorator getSymbolDecorator(PresentationElement pe) {
// TODO: either fix this stuff or check if DSL handling
		// TODO:  layout in separate session
if(true)return null;// TODO:  test suppress this stuff		
		try{
		if(pe==null)return null;
		Element element=pe.getElement();
		/*
		if(UsageView.class.isInstance(pe)){
			UsageView usageView=(UsageView)pe;
			if(element instanceof Usage){
				Usage usage=(Usage)element;
			System.out.println("UsageView "+usageView.getID()+", "+usageView.getName()+", "+usage.getName());
			}
			
		}
		*/
		 if(element==null)return null;
		 DiagramPresentationElement diagram=null;
		 if(DiagramPresentationElement.class.isInstance(pe))diagram=(DiagramPresentationElement)pe;
		 else diagram=pe.getDiagramPresentationElement();
		 if((diagram==null)||(diagram.getElement()==null))return null;
		 Element diagramContext=diagram.getElement().getOwner();
		 if(diagramContext==null)return null;
		//String metaClassName=element.eClass().getName();
		// inverse does not work here either for our created Usage
		// normal MD: for inverse: initial selection in pres2, but when there is a second then they are swapped

		if(UsageView.class.isInstance(pe)){
			
			if(NIEMHelper.isModelPackageDescriptionFile(element)){
				return new PathDecoratorAdapter(new UsageRenderer()){
					public boolean isConnectable2Obj(PathElement pe,PresentationElement pres,PresentationElement pres2){
						if((pres2==null)
								||(pres2.getElement()==null)
								)return false;
						if(!(NIEMHelper.isModelPackageDescription(pres2.getElement())
								||NIEMHelper.hasStereotype(pres2.getElement(),NIEMHelper.getMpdStereotype(ModelPackageDescriptionFileSetStereotypeName))
							)){
							setStatusText("Client must be a <<ModelPackageDescription>> or  a <<ModelPackageDescriptionFileSet>>");
							return false;
							
						}
						// source must be mpd;  target must be Namespace
						if((pres==null)||(pres.getElement()==null))return true; 
//						if(hasStereotype(pres.getElement(),getCommonStereotype(NamespaceStereotypeName)))return true;
						Element element=pres.getElement();
						if(!((element instanceof Package)||(element instanceof Class)||(element instanceof Collaboration))){
							setStatusText("<<ModelPackageDescriptionFile>> Supplier must be a Package, Collaboration, or Class");
							return false;
						}
						return true;
					}
				};
			}
			if(NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(AugmentationApplicationStereotypeName))){
				return new AugmentationApplicationDecoratorAdapter(new UsageRenderer());
			}
			
			if(NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(MetadataApplicationStereotypeName))){
				return new MetadataApplicationDecoratorAdapter(new UsageRenderer());
			}
			if(NIEMHelper.isUnionOf(element)){
				return new UnionOfDecoratorAdapter(new UsageRenderer());
			}
		}
		if(DependencyView.class.isInstance(pe)){
			if(NIEMHelper.hasStereotype(element,NIEMHelper.getMpdStereotype(ModelPackageDescriptionRelationshipStereotypeName))){
				return new PathDecoratorAdapter(new DependencyRenderer()){
					public boolean isConnectable2Obj(PathElement pe,PresentationElement pres,PresentationElement pres2){
						if((pres2==null)
								||(pres2.getElement()==null)
//								||!NIEMHelper.isModelPackageDescription(pres2.getElement())
								)return false;
						if(!NIEMHelper.isModelPackageDescription(pres2.getElement())){
							setStatusText("<<ModelPackageDescriptionRelation>> Client must be a <<ModelPackageDescription>>");
							return false;
							
						}
						// source must be mpd;  target must be mpd
						if((pres==null)||(pres.getElement()==null))return true; 
						if(!(NIEMHelper.isModelPackageDescription(pres.getElement())
								||Artifact.class.isInstance(pres.getElement())
								)){
							setStatusText("<<ModelPackageDescriptionRelation>> Supplier must be a <<ModelPackageDescription>> or Artifact");
							return false;
							
						}
						return true;
					}
				};
			}
		}
		if(GeneralizationView.class.isInstance(pe)){
			//GeneralizationView  x;	
			// x.set
//			PathRenderer renderer=((GeneralizationView)pe).getRgetRenderer();
			//SymbolDecorator renderer=((GeneralizationView)pe).getRenderer();
		
			if(NIEMHelper.hasStereotype(element,NIEMHelper.getPimStereotype(AugmentsStereotypeName))){
				return new AugmentsDecoratorAdapter(new GeneralizationRenderer());
			}
//			if(NIEMHelper.hasStereotype(element,NIEMHelper.getPimStereotype(RolePlayedByStereotypeName))){
			if(NIEMHelper.isRolePlayedBy(element)){
				return new RolePlayedByDecoratorAdapter(new GeneralizationRenderer());
			}
			// if selected element is in <<InformationModel>> or diagram context is an <<InformationModel>>
			// actually, we better check all cases and then test if informationModel
//			if(NIEMHelper.isInformationModel(element)||NIEMHelper.isInformationModel(diagramContext)){
			{
				return new GeneralizationDecoratorAdapter(new GeneralizationRenderer());
				
			}
			//GeneralizationView gv=(GeneralizationView)pe;
			//Generalization g=(Generalization)gv.getElement();
			//log("NIEMSymbolDecorator generalization "+g.getSpecific()+", "+g.getGeneral()+", "+gv.getClient()+", "+gv.getSupplier());
		}
		if(AssociationClassView.class.isInstance(pe)){
			// if in context of <<InformationModel>>; no - probably has no owner yet
			//if(NIEMHelper.isInInformationModel(element)){
			//	QvtCommonAction.log("getSymbolDecorator "+pe+", "+element);
				return new AssociationClassDecoratorAdapter(new AssociationClassRenderer());
			//}
		}
		if(AssociationView.class.isInstance(pe)){
			AssociationView associationView=(AssociationView)pe;
			Association association=(Association)element;
			String name=association.getName();
			if(RoleOfStereotypeName.equals(name)){
				//log("RoleOfDecoratorAdapter create");
				SymbolDecorator result= new RoleOfDecoratorAdapter(new DirectedAssociationRenderer());
				//log("RoleOfDecoratorAdapter create done");
				return result;
			}
			if(REFERENCE.equals(name)){
				return new ReferenceDecoratorAdapter(new DirectedAssociationRenderer());
			}
			if(CONTENT.equals(name)){
				return new ContentDecoratorAdapter(new DirectedAggregationRenderer());
			}
			if(ASSOCIATION.equals(name)){
				return new AssociationDecoratorAdapter(new AssociationRenderer());
			}
			// for InformationModel, see if the association is a directed association?
			//log("AssociationView "+associationView.getHelpID()+", "+associationView.getHumanName()+", "+associationView.getHumanType());
		}
		if(RealizationView.class.isInstance(pe)){
			// inverse does not work
			/* no need for this
			if(NIEMHelper.hasStereotype(element,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName))){
				return new PathDecoratorAdapter(new RealizationRenderer()){
					public boolean isConnectable2Obj(PathElement pe,PresentationElement pres,PresentationElement pres2){
//						log("Realization MPD TEST "+pres+", "+pres2);//////TEST THIS
//if(true)return true;						
						if((pres2==null)
								||(pres2.getElement()==null)
								)return false;
						Element element=pres2.getElement();
						String metaClassName=element.eClass().getName();
						if((
								(NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName))
										||("Class".equals(metaClassName)&&!NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(NIEMTypeStereotypeName)))
								)		
								&&(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)element).getOwnedAttribute().isEmpty())
								&&(((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)element).getGeneralization().isEmpty())
						)
						||(
								Enumeration.class.isInstance(element)
							&&((Enumeration)element).getOwnedLiteral().isEmpty()
							)
						){}else return false;
						
						// source must be mpd;  target must be mpd
						if((pres==null)||(pres.getElement()==null))return true; 
						if(PrimitiveType.class.isInstance(pres.getElement())
								||(Enumeration.class.isInstance(pres.getElement())&&!((Enumeration)pres.getElement()).getOwnedLiteral().isEmpty())
								)return true;
						return false;
					}
				};
			}
			*/
			Realization realization=(Realization)element;
			String name=realization.getName();
			if(NIEMHelper.isRestriction(element)&&(name!=null)&&"ProxyRestriction".equals(name)){
				return new SimpleContentRestrictionDecoratorAdapter(new RealizationRenderer());
			}
			else if(NIEMHelper.isReferences(element)){
				return new ReferencesDecoratorAdapter(new RealizationRenderer());
//				return new ReferencesDecoratorAdapter(new ReferencesRealizationRenderer());
			}
			else if(NIEMHelper.isRestriction(element)){
				return new RestrictionDecoratorAdapter(new RealizationRenderer());
			}
			/*
			// check if candidate for union realization 
			if(NIEMHelper.canBeUnionClient(element)){
				return new UnionClientDecoratorAdapter(new RealizationRenderer());
			}
			*/
		}
		}catch(Throwable t){
			log("ERROR: NIEMSymbolDecorator "+t);
			t.printStackTrace();
		}
		return null;
	}
	static public void log(String text){
		Application.getInstance().getGUILog().log(text);
	}
	/*
	protected Collection<Property> getAllAttributes(Classifier c){
		Set<Property> properties=new HashSet<Property>();
		properties.addAll(c.getAttribute());
		for(Classifier general:getAllParents(c))properties.addAll(general.getAttribute());
		return properties;
	}
	protected Collection<Classifier> getAllParents(Classifier c){
		Set<Classifier> classifiers=new HashSet<Classifier>();
		for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
		return classifiers;
	}
	
	protected void addAllParents(Classifier c,Collection<Classifier> classifiers){
		classifiers.add(c);
		for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
	}

	protected boolean hasStereotype(Element element, Stereotype stereotype){
		//log("hasStereotype "+element+", "+stereotype);
//		return StereotypesHelper.hasStereotype(element,stereotype);
		return StereotypesHelper.hasStereotypeOrDerived(element,stereotype);
	}
	protected Stereotype getMpdStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getMpdProfile()); 
	}
	protected Stereotype getPimStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getPimProfile()); 
	}
	protected Stereotype getPsmStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getPsmProfile()); 
	}
	protected Stereotype getCommonStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getCommonProfile()); 
	}
	protected Profile getPimProfile(){
		return getProfile(PimProfileName); 
	}
	protected Profile getPsmProfile(){
		return getProfile(PsmProfileName); 
	}
	protected Profile getMpdProfile(){
		return getProfile(MpdProfileName); 
	}
	protected Profile getCommonProfile(){
		return getProfile(CommonProfileName); 
	}
	protected Profile getProfile(String profileName){
		return StereotypesHelper.getProfile(getProject(),profileName);
	}
	protected Project getProject(){
		return Application.getInstance().getProject();
	}
	*/
	///////////////////////////////////////////////////////////////////////////
	public static class DependencyRenderer extends PathRenderer{
		@Override
		protected BasicStroke getPathStroke(PathElement pe) {
			// TODO Auto-generated method stub
			return PresentationElement.getStroke(PresentationElement.DASHED_STROKE);
			//return super.getPathStroke(arg0);
		}
		@Override
		protected PathEndRenderer getSupplierEndRenderer(
				PathElement arg0) {
			// TODO Auto-generated method stub
			//return super.getSupplierEndRenderer(arg0);
			return new PathEndRenderer(PathEndAdornment.ARROW);
		}
		
	}

	public static class DependencyInverseRenderer extends PathRenderer{
		@Override
		protected BasicStroke getPathStroke(PathElement pe) {
			// TODO Auto-generated method stub
			return PresentationElement.getStroke(PresentationElement.DASHED_STROKE);
			//return super.getPathStroke(arg0);
		}
		@Override
		protected PathEndRenderer getClientEndRenderer(
				PathElement arg0) {
			// TODO Auto-generated method stub
			//return super.getSupplierEndRenderer(arg0);
			return new PathEndRenderer(PathEndAdornment.ARROW);
		}
		
	}

public static class UsageRenderer extends DependencyRenderer{
}
public static class RealizationRenderer extends DependencyRenderer{
	@Override
	protected PathEndRenderer getSupplierEndRenderer(
			PathElement arg0) {
		// TODO Auto-generated method stub
		//return super.getSupplierEndRenderer(arg0);
//		return new PathEndRenderer(new SwingImageIcon(DrawActionCommon.getUmlImage("package")));
//		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
		
	}
}
/*
public static class ReferencesRealizationRenderer extends RealizationRenderer{
	@Override
	protected PathEndRenderer getSupplierEndRenderer(
			PathElement pe) {
		// if client is property and no supplier, then render a class icon
		PresentationElement clientPE=pe.getClient();
		PresentationElement supplierPE=pe.getSupplier();
		if(clientPE!=null){
			Element element=clientPE.getElement();
			if((element!=null)&&(element instanceof Property)){
				if((supplierPE==null)||(supplierPE.getElement()==null)){
					// use a class icon
					ResizableIcon icon=getSVGIcon();
					System.out.println("ReferencesRealiation icon");
					return new PathEndRenderer(icon);
				}
			}
		}
		return super.getSupplierEndRenderer(pe);
		
	}
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
	
}
*/
/*
public static class NIEMResizableIcon implements ResizableIcon{
	protected Icon localIcon;
	public NIEMResizableIcon(Icon icon){
		localIcon=icon;
		com.nomagic.ui.SwingImageIcon
	}
	@Override
	public void paintIcon(java.awt.Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	public Object clone(){
		return new NIEMResizableIcon(localIcon);
	}
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void paintIcon(java.awt.Component arg0, Graphics arg1, int arg2,
			int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		
	}
	
}
*/
/*
public static class RealizationInverseRenderer extends DependencyInverseRenderer{
	@Override
	protected PathEndRenderer getClientEndRenderer(
			PathElement arg0) {
		// TODO Auto-generated method stub
		//return super.getSupplierEndRenderer(arg0);
		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
	}
}
*/
public static class GeneralizationRenderer extends PathRenderer{
	@Override
	protected PathEndRenderer getSupplierEndRenderer(
			PathElement pathElement) {
		if(GeneralizationView.class.isInstance(pathElement)
				&&((GeneralizationView)pathElement).isSimple()
				){
//				log("GeneralizationRenderer.getSupplierEndRenderer "+pathElement.getSupplierPoint()+", "+pathElement.getBreakPointCount()+", "+pathElement);
				return new PathEndRenderer(PathEndAdornment.NONE);
		}
		else{
//			log("GeneralizationRenderer.getSupplierEndRenderer YYY "+pathElement);
		}
		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
	}
	@Override
	protected BasicStroke getPathStroke(PathElement pe) {
		// TODO Auto-generated method stub
		return PresentationElement.getStroke(PresentationElement.SOLID_STROKE);
		//return super.getPathStroke(arg0);
	}
}
public static class DirectedAssociationRenderer extends PathRenderer{
	@Override
	protected PathEndRenderer getSupplierEndRenderer(
			PathElement arg0) {
		// TODO Auto-generated method stub
		//return super.getSupplierEndRenderer(arg0);
//		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
		return new PathEndRenderer(PathEndAdornment.ARROW);
	}
	@Override
	protected BasicStroke getPathStroke(PathElement pe) {
		// TODO Auto-generated method stub
		return PresentationElement.getStroke(PresentationElement.SOLID_STROKE);
		//return super.getPathStroke(arg0);
	}
}
public static class AssociationRenderer extends PathRenderer{
	@Override
	protected PathEndRenderer getSupplierEndRenderer(
			PathElement pathElement) {
		// TODO Auto-generated method stub
		//return super.getSupplierEndRenderer(arg0);
//		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
//		return new PathEndRenderer(PathEndAdornment.ARROW);
		Element element=pathElement.getElement();
		if(Association.class.isInstance(element)){
			Association association=(Association)element;
			List<Property> members=association.getMemberEnd();
			if(members.size()==2){
				Property client=members.get(0);
				Property supplier=members.get(1);
				// depends on aggregation and ownership
				if(supplier.getOwningAssociation()!=null){
					return new PathEndRenderer(PathEndAdornment.ARROW);
				} else if(AggregationKindEnum.NONE.equals(supplier.getAggregation())){
					return new PathEndRenderer(PathEndAdornment.NONE);
				} else if(AggregationKindEnum.SHARED.equals(supplier.getAggregation())){
					return new PathEndRenderer(PathEndAdornment.DIAMOND);
				}else{
					return new PathEndRenderer(PathEndAdornment.DIAMOND,PathEndAdornmentModifier.FILLED);
				}
			}
		}
		return new PathEndRenderer(PathEndAdornment.NONE);
	}
	@Override
	protected PathEndRenderer getClientEndRenderer(
			PathElement pathElement) {
		// TODO Auto-generated method stub
		//return super.getSupplierEndRenderer(arg0);
//		return new PathEndRenderer(PathEndAdornment.ARROW,PathEndAdornmentModifier.CLOSED);
//		return new PathEndRenderer(PathEndAdornment.ARROW);
		Element element=pathElement.getElement();
		if(Association.class.isInstance(element)){
			Association association=(Association)element;
			List<Property> members=association.getMemberEnd();
			if(members.size()==2){
				Property client=members.get(1);
				Property supplier=members.get(0);
				// depends on aggregation and ownership
				if(supplier.getOwningAssociation()!=null){
					return new PathEndRenderer(PathEndAdornment.ARROW);
				} else if(AggregationKindEnum.NONE.equals(supplier.getAggregation())){
					return new PathEndRenderer(PathEndAdornment.NONE);
				} else if(AggregationKindEnum.SHARED.equals(supplier.getAggregation())){
					return new PathEndRenderer(PathEndAdornment.DIAMOND);
				}else{
					return new PathEndRenderer(PathEndAdornment.DIAMOND,PathEndAdornmentModifier.FILLED);
				}
			}
		}
		return new PathEndRenderer(PathEndAdornment.NONE);
	}
	@Override
	protected BasicStroke getPathStroke(PathElement pe) {
		// TODO Auto-generated method stub
		return PresentationElement.getStroke(PresentationElement.SOLID_STROKE);
		//return super.getPathStroke(arg0);
	}
}
public static class DirectedAggregationRenderer extends DirectedAssociationRenderer{
	@Override
	protected PathEndRenderer getClientEndRenderer(
			PathElement arg0) {
		return new PathEndRenderer(PathEndAdornment.DIAMOND);
	}
}
public static class AssociationClassRenderer extends PathRenderer{
	@Override
	protected BasicStroke getPathStroke(PathElement pe) {
		return PresentationElement.getStroke(PresentationElement.SOLID_STROKE);
	}
}
}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ClassDiagramLayouterOptionsGroup;
import com.nomagic.magicdraw.core.options.HierarchicLayouterOptionsGroup;
import com.nomagic.magicdraw.core.options.OrthogonalLayouterOptionsGroup;
import com.nomagic.magicdraw.core.options.OrthogonalRouterOptionsGroup;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.properties.ColorProperty;
import com.nomagic.magicdraw.properties.PropertyID;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.ui.dialogs.SelectElementInfo;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlgFactory;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.layout.ClassDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.layout.HierarchicDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.layout.OrthogonalDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.layout.OrthogonalLinkDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.paths.PathConnector;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class DiagramDialogHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	
	static public void EntityDiagramDialog(){
		try{
			// selection dialog consisting of editable <<InformationModel>> classifiers which are entity-like
			//  after selection, create diagrams owned by those classifiers and focused on them
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Entities to be Diagrammmed","niem_uml_modeling_workingwithmodelelements_selectinganelement_entitydiagram");
			 
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Package root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){

				@Override
				public boolean accept(BaseElement baseElement) {
					return acceptEntityDiagramContext(baseElement);
				}
				@Override
				public boolean accept(BaseElement baseElement,
						boolean arg1) {
					return accept(baseElement);
				}
				protected Collection<java.lang.Class> types=null;
				@Override
				public Collection<?> getTypes() {
					if(types==null){
						types=new Vector();
//						types.add(Classifier.class);
						types.add(Class.class);
						types.add(DataType.class);
						types.add(Enumeration.class);
						types.add(PrimitiveType.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ENTITY_DIAGRAM_DIALOG_DESCRIPTION_TITLE,ENTITY_DIAGRAM_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 // each of these is a classifier to be diagrammed;
			    	 createEntityDiagram((Classifier)baseElement,QvtCommonAction.getProject());
			     }
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During entity diagramming "+t);
			}
	}
	protected static ColorProperty otherColorProperty=new ColorProperty(PropertyID.FILL_COLOR,Psm2PimAction.getColor(255,255,204));
	
	static protected void colorOtherClassShape(PresentationElement presentationElement){
		if(presentationElement instanceof ShapeElement){
			ShapeElement shapeElement=(ShapeElement)presentationElement;
			Color externalColor=Psm2PimAction.externalColorProperty.getColor();
			com.nomagic.magicdraw.properties.Property shapeProperty=shapeElement.getProperty(PropertyID.FILL_COLOR);
			if((shapeProperty!=null)&&(shapeProperty instanceof ColorProperty)){
				Color shapeColor=((ColorProperty)shapeProperty).getColor();
			//System.out.println("colorOtherClassShape test "+shapeElement+", "+externalColor+", "+shapeColor);
			if(externalColor.equals(shapeColor))return;
			
			shapeElement.addProperty(otherColorProperty);
			//System.out.println("colorOtherClassShape "+shapeElement+", "+otherColorProperty);
			}
		}
	}
	static public void createEntityDiagram(Classifier type,Project project) throws ReadOnlyElementException{
		if(Relationship.class.isInstance(type))return;
		DiagramPresentationElement dpe=null;
		Package model=NIEMHelper.getNearestPackage(type);
		// access singleton instance by using getInstance()
		// only one session can be active, so check this.
		 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
		if (!isSessionCreated)
		{
		// create new session.
		SessionManager.getInstance().createSession("entitydiagram");
		}			
		PresentationElement centerElement=null;
		Set<PresentationElement> topElements=new HashSet<PresentationElement>();
		Set<PresentationElement> bottomElements=new HashSet<PresentationElement>();
		Set<PresentationElement> leftElements=new HashSet<PresentationElement>();
		Set<PresentationElement> rightElements=new HashSet<PresentationElement>();
		try{
			dpe= createDiagram(type,project,"");
			//QvtCommonAction.log("Entity diagram "+type.getQualifiedName()+", "+dpe);
			// generalizations
//					try {
					PresentationElement specificPE=Psm2PimAction.getPresentationElement(dpe,type);
					if(specificPE==null){
						QvtCommonAction.log("ERROR: Failed to get presentation element for "+type.getQualifiedName());
						//continue;
						return;
					}
					centerElement=specificPE;
					for(Generalization g:((Classifier)type).getGeneralization()){
						if((g.getSpecific()==null)||(g.getGeneral()==null)){
							QvtCommonAction.log("ERROR: corrupted generalization for supertype of "+type.getQualifiedName()+", "+g.getGeneral());
							continue;
						}
		                //Element specific = ModelHelper.getClientElement(g);
		                Element general = ModelHelper.getSupplierElement(g);
						if(general==null){
							QvtCommonAction.log("ERROR: Failed to get general for "+type.getQualifiedName());
							continue;
						}
						PresentationElement generalPE=null;//getPresentationElement(dpe,general);
						try{
							generalPE=Psm2PimAction.getPresentationElement(dpe,general);
						} catch (Throwable ee) {
							QvtCommonAction.log("ERROR during inheritance diagram gen for general "+((NamedElement)general).getQualifiedName()+" : "+ee);
							continue;
						}
						if((g!=null)&&(generalPE!=null)){
							PresentationElement pathElement=Psm2PimAction.getPathPresentationElement(dpe, specificPE, generalPE,g);
//							PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(g, specificPE, generalPE);
							if(pathElement==null){
								QvtCommonAction.log("ERROR: Failed to create inheritance path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
								continue;
							}
							colorOtherClassShape(generalPE);
							pathElement.setSelected(false);
							topElements.add(generalPE);
						}else{
							QvtCommonAction.log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
						}
					}
					// find elements for which this type is the general 
					for(DirectedRelationship dr:type.get_directedRelationshipOfTarget()){
						if(Generalization.class.isInstance(dr)){
							Generalization g=(Generalization)dr;
							if((g.getSpecific()==null)||(g.getGeneral()==null)){
								QvtCommonAction.log("ERROR: corrupted generalization for subtype of "+type.getQualifiedName()+", "+g.getSpecific());
								continue;
							}
							if(g.getSpecific().getNamespace()==null){
								QvtCommonAction.log("ERROR: Failed to get namespace for "+g.getSpecific());
								continue;
							}
							//if(!g.getSpecific().getNamespace().equals(model)){
				                Element specific = ModelHelper.getClientElement(g);
				                Element general = ModelHelper.getSupplierElement(g);
								if((specific==null)||(general==null)){
									QvtCommonAction.log("ERROR: corrupted off-package generalization for subtype of "+type.getQualifiedName()+", "+g.getSpecific());
									continue;
								}
				                PresentationElement generalPE=Psm2PimAction.getPresentationElement(dpe,general);
				                PresentationElement specificPE2=Psm2PimAction.getPresentationElement(dpe,specific);
								if((g!=null)&&(specificPE2!=null)&&(generalPE!=null)){
									PresentationElement pathElement=Psm2PimAction.getPathPresentationElement(dpe, specificPE2, generalPE,g);
									//PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(g, specificPE2, generalPE);
									if(pathElement==null){
										QvtCommonAction.log("ERROR: Failed to create inheritance inverse path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
										continue;
									}
									colorOtherClassShape(specificPE2);
									pathElement.setSelected(false);
//									bottomElements.add(generalPE);
									bottomElements.add(specificPE2);
								}else{
									QvtCommonAction.log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+g.getSpecific());
								}
								
							//}
						}
					}
					
					// associations
					for(Property property:type.getAttribute()){
						Association association=property.getAssociation();
						if(association==null)continue;
					//for(Association association:associations){
		                Element type0 = ModelHelper.getClientElement(association);
						if((type0==null)){
							QvtCommonAction.log("ERROR: memberEnd types unspecified client "+association.getQualifiedName());
							continue;
						}
//						 DisplayRelatedSymbols.displayRelatedSymbols(pe0, info);

		                 Element type1 = ModelHelper.getSupplierElement(association);
		                
						if((type0==null)||(type1==null)){
							QvtCommonAction.log("ERROR: memberEnd types unspecified supplier "+association.getQualifiedName());
							continue;
						}
						PresentationElement pe0=Psm2PimAction.getPresentationElement(dpe,type0);
						PresentationElement pe1=Psm2PimAction.getPresentationElement(dpe,type1);
						if((pe0==null)||(pe1==null)){
							QvtCommonAction.log("ERROR:failed to resolve presentations elements for "+association.getQualifiedName());
						}else{
							try{
//						PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(association, pe0, pe1);
						PresentationElement pathElement=Psm2PimAction.getAssociationPathPresentationElement(dpe, pe0, pe1,association);
						//if(!topElements.contains(generalPE))bottomElements.add(generalPE);
						if(pe0.equals(centerElement))colorOtherClassShape(pe1); else colorOtherClassShape(pe0);
						addRightBox(pe0,centerElement,topElements,bottomElements,rightElements);
						addRightBox(pe1,centerElement,topElements,bottomElements,rightElements);
						pathElement.setSelected(false);
							} catch (Throwable e) {
								QvtCommonAction.log("ERROR during association path gen "+e);
//								e.printStackTrace();
							}
						}

					//}
					}
					// inverse associations
					for(TypedElement typedElement:type.get_typedElementOfType()){
						if(Property.class.isInstance(typedElement)){
							Property property=(Property)typedElement;
							//if(property.getAggregation()==AggregationKindEnum.NONE){
								Association association=property.getAssociation();
								if(association==null)continue;
					                Element type0 = ModelHelper.getClientElement(association);
									if((type0==null)){
										QvtCommonAction.log("ERROR: memberEnd types unspecified client "+association.getQualifiedName());
										continue;
									}
					                 Element type1 = ModelHelper.getSupplierElement(association);
									if((type0==null)||(type1==null)){
										QvtCommonAction.log("ERROR: memberEnd types unspecified supplier "+association.getQualifiedName());
										continue;
									}
									PresentationElement pe0=Psm2PimAction.getPresentationElement(dpe,type0);
									PresentationElement pe1=Psm2PimAction.getPresentationElement(dpe,type1);
									if((pe0==null)||(pe1==null)){
										QvtCommonAction.log("ERROR:failed to resolve presentations elements for "+association.getQualifiedName());
									}else{
										try{
//									PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(association, pe0, pe1);
									PresentationElement pathElement=Psm2PimAction.getAssociationPathPresentationElement(dpe, pe0, pe1,association);
									pathElement.setSelected(false);
									if(pe0.equals(centerElement))colorOtherClassShape(pe1); else colorOtherClassShape(pe0);
									
									addLeftBox(pe0,centerElement,topElements,bottomElements,rightElements,leftElements);
									addLeftBox(pe1,centerElement,topElements,bottomElements,rightElements,leftElements);
										} catch (Throwable e) {
											QvtCommonAction.log("ERROR during association path gen "+e);
//											e.printStackTrace();
										}
									}
							//}
						}
					}
					// get a stereotype
					Stereotype stereotype = StereotypesHelper.getStereotype(project,"HyperlinkOwner");
					// apply a stereotype
					StereotypesHelper.addStereotype(type, stereotype);
					// add hyperlinks
					Diagram activeLinkedElement=dpe.getDiagram();
					StereotypesHelper.setStereotypePropertyValue(type, stereotype,"hyperlinkModelActive", activeLinkedElement, true);					
					} catch (Throwable eee) {
						QvtCommonAction.log("ERROR during inheritance diagram gen type "+type.getQualifiedName()+" : "+eee);
					}finally{
						  // apply changes and add command into command history.
						if (!isSessionCreated)
						{
							SessionManager.getInstance().closeSession();
						}								 
						
					}

		layout(dpe,centerElement,topElements,bottomElements,rightElements,leftElements);
}

	static protected void addLeftBox(PresentationElement pe1,PresentationElement centerElement,Set<PresentationElement> topElements,Set<PresentationElement> bottomElements,Set<PresentationElement> rightElements,Set<PresentationElement> leftElements){
		if(centerElement.equals(pe1))return;
		if(topElements.contains(pe1))return;
		if(bottomElements.contains(pe1))return;
		if(rightElements.contains(pe1))return;
		leftElements.add(pe1);
	}
	static protected void addRightBox(PresentationElement pe1,PresentationElement centerElement,Set<PresentationElement> topElements,Set<PresentationElement> bottomElements,Set<PresentationElement> rightElements){
		if(centerElement.equals(pe1))return;
		if(topElements.contains(pe1))return;
		if(bottomElements.contains(pe1))return;
		rightElements.add(pe1);
	}

	static protected String getEntityDiagramName(Classifier model,String suffix){
		return "NIEM_Entity_"+model.getName()+suffix;
	}
	static public DiagramPresentationElement createDiagram(Classifier model,Project project,String suffix) throws ReadOnlyElementException{
		Diagram diagram= ModelElementsManager.getInstance().createDiagram(DiagramTypeConstants.UML_CLASS_DIAGRAM, model);
		diagram.setName(getEntityDiagramName(model,suffix));
		DiagramPresentationElement dpe=project.getDiagram(diagram);
		dpe.open();
		dpe.addProperty(Psm2PimAction.ownerDisplayProperty);
		Psm2PimAction.element2presentation.clear();
		return dpe;
	}
	//static protected Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
	static protected void layout(DiagramPresentationElement dpe,PresentationElement centerElement,Set<PresentationElement> topElements,Set<PresentationElement> bottomElements,Set<PresentationElement> rightElements,Set<PresentationElement> leftElements){
		// layout works if we close and create a new session
		if(dpe==null)return;
		if(centerElement==null)return;
		sizingLayout(dpe);
		 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
		if (!isSessionCreated)
		{
		// create new session.
		SessionManager.getInstance().createSession("entitydiagram");
		}			
		//createSession();
		try{
			dpe.setSelected(false);
			dpe.setAllSelected(false);
			dpe.open();
			// make sure sizes are ok
			HierarchicLayouterOptionsGroup options2=new HierarchicLayouterOptionsGroup();
			options2.setDefaultValues();
			dpe.layout(false,new HierarchicDiagramLayouter(),options2);
			// determine position: below top, to right of left
			// determine size: at least as wide as top or bottom, at least as high as right or left
			// keep nominal size of others
			// top align top elements with vertical spacers
			// left align left elements with horizontal spacers
			// bottom align bottom elements
			// right align right elements
			Dimension topDimension=getHorizontalDimension(topElements);
			Dimension bottomDimension=getHorizontalDimension(bottomElements);
			Dimension leftDimension=getVerticalDimension(leftElements);
			Dimension rightDimension=getVerticalDimension(rightElements);
			Rectangle centerRectangle=getCenterRectangle(centerElement,topDimension,bottomDimension,leftDimension,rightDimension);
			Rectangle topRectangle=getTopRectangle(centerRectangle,topDimension);
			Rectangle bottomRectangle=getBottomRectangle(centerRectangle,bottomDimension);
			Rectangle leftRectangle=getLeftRectangle(centerRectangle,leftDimension);
			Rectangle rightRectangle=getRightRectangle(centerRectangle,rightDimension);
			reshapeShapeElement(centerElement,centerRectangle);
			reshapeTopElements(topRectangle,topElements);
			reshapeBottomElements(bottomRectangle,bottomElements);
			reshapeLeftElements(leftRectangle,leftElements);
			reshapeRightElements(rightRectangle,rightElements);
		}finally{
			  // apply changes and add command into command history.
			if (!isSessionCreated)
			{
				SessionManager.getInstance().closeSession();
			}								 
			
		}	
		pathLayout(dpe);
	}
	static protected void pathLayout(DiagramPresentationElement dpe){
		// layout works if we close and create a new session
		 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
		if (!isSessionCreated)
		{
		// create new session.
		SessionManager.getInstance().createSession("entitydiagram");
		}			
		//createSession();
		try{
			dpe.setSelected(false);
			dpe.setAllSelected(false);
			dpe.open();
			
			
			OrthogonalRouterOptionsGroup options=new OrthogonalRouterOptionsGroup();
//			OrthogonalLayouterOptionsGroup options=new OrthogonalLayouterOptionsGroup();
			
			options.setDefaultValues();

			options.setMinimalLinkDistance(40);
//			options.setMinimalLinkDistance(20);
			options.setLocalCrossingMinimization(true);
			double sc=0.0;
//			double sc=1.0;
			options.setSpaceCenterDrivenSearch(sc);
//			options.setCustomMinimalDistanceToNodes(20);
			options.setCustomMinimalDistanceToNodes(40);

			options.setMoveToFreeSpace(true);
			options.setRouteOnGrid(true);
			
//			options.setCrossingPostprocessing(true);
			//options.set
			dpe.layout(false,new OrthogonalLinkDiagramLayouter(),options);
/*			
//			ClassDiagramLayouterOptionsGroup options=new ClassDiagramLayouterOptionsGroup();
//			OrthogonalLayouterOptionsGroup options=new OrthogonalLayouterOptionsGroup();
			HierarchicLayouterOptionsGroup options=new HierarchicLayouterOptionsGroup();
			options.setDefaultValues();
			//log("layout options "+options.getLayoutType());
			//options.setLayoutType(ClassDiagramLayouterOptionsGroup.ASSOCIATION_BASED);
//			dpe.layout(false,new ClassDiagramLayouter(),options);
//			dpe.layout(false,new OrthogonalDiagramLayouter(),options);
			dpe.layout(false,new HierarchicDiagramLayouter(),options);
			//dpe.ensureLoaded();
			//dpe.update();
			 * 
			 */
		}finally{
			  // apply changes and add command into command history.
			if (!isSessionCreated)
			{
				SessionManager.getInstance().closeSession();
			}								 
			
		}	
	}
	static protected void sizingLayout(DiagramPresentationElement dpe){
		 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
		if (!isSessionCreated)
		{
		// create new session.
		SessionManager.getInstance().createSession("entitydiagram");
		}			
		try{
			dpe.setSelected(false);
			dpe.setAllSelected(false);
			dpe.open();
			// make sure sizes are ok
			HierarchicLayouterOptionsGroup options2=new HierarchicLayouterOptionsGroup();
			options2.setDefaultValues();
			dpe.layout(false,new HierarchicDiagramLayouter(),options2);
		}finally{
			  // apply changes and add command into command history.
			if (!isSessionCreated)
			{
				SessionManager.getInstance().closeSession();
			}								 
			
		}	
	}
	static protected int horizontalSpacer=300;
	static protected int horizontalSpacerInheritance=40;
	static protected int verticalSpacer=100;
	static protected int leftMargin=25;
	static protected int topMargin=50;
	static protected Dimension getHorizontalDimension(Set<PresentationElement> topElements){
		Dimension dimension=new Dimension();
		for(PresentationElement pe:topElements){
			int height=pe.getBounds().height;
			int width=pe.getBounds().width;
			dimension.width+=width;
			dimension.width+=horizontalSpacerInheritance;
			height+=verticalSpacer;
			if(height>dimension.height)dimension.height=height;
		}
		return dimension;
	}
	static protected Dimension getVerticalDimension(Set<PresentationElement> topElements){
		Dimension dimension=new Dimension();
		for(PresentationElement pe:topElements){
			adjustVertical(pe);
			int height=pe.getBounds().height;
			int width=pe.getBounds().width;
			dimension.height+=height;
			dimension.height+=verticalSpacer;
			width+=horizontalSpacer;
			if(width>dimension.width)dimension.width=width;
		}
		return dimension;
	}
	static protected void adjustVertical(PresentationElement pe){
		if(!PathConnector.class.isInstance(pe))return;
		PathConnector pc=(PathConnector)pe;
		if(pc.getConnectedPathElementCount()<=1)return;
		// make sure at least 150 * path count
		int minHeight=150*pc.getConnectedPathElementCount();
		Rectangle r=pe.getBounds();
		if(minHeight<r.height)return;
		r.height=minHeight;
		reshapeShapeElement(pe,r);
	}
	
static protected Rectangle getCenterRectangle(PresentationElement centerElement,Dimension topDimension,Dimension bottomDimension,Dimension leftDimension,Dimension rightDimension){
	Rectangle r=new Rectangle(centerElement.getBounds());
	r.y=topDimension.height+topMargin;
	r.x=leftDimension.width+leftMargin;
	int maxWidth=topDimension.width;
	if(bottomDimension.width>maxWidth)maxWidth=bottomDimension.width;
	int maxHeight=leftDimension.height;
	if(rightDimension.height>maxHeight)maxHeight=rightDimension.height;
	
	if(maxWidth>r.width)r.width=maxWidth;
	if(maxHeight>r.height)r.height=maxHeight;
	/*
	int canvasWidth=leftDimension.width+r.width+rightDimension.width;
	if(maxWidth>canvasWidth)canvasWidth=maxWidth;
	int canvasHeight=topDimension.height+r.height+bottomDimension.height;
	if(maxHeight>canvasHeight)canvasHeight=maxHeight;
	
	int centerWidth=canvasWidth-leftDimension.width-rightDimension.width;
	int centerHeight=canvasHeight-topDimension.height-bottomDimension.height;
	if(centerWidth>r.width)r.width=centerWidth;
	if(centerHeight>r.height)r.height=centerHeight;
	*/
	return r;
}
	
	static protected Rectangle getTopRectangle(Rectangle centerRectangle,Dimension topDimension){
		Rectangle r=new Rectangle();
		r.width=topDimension.width;
		r.height=topDimension.height;
		// centered by centerRectangle
		r.x=centerRectangle.x+(centerRectangle.width/2) - (r.width/2);
		r.y=topMargin;
		return r;
	}
	static protected Rectangle getBottomRectangle(Rectangle centerRectangle,Dimension topDimension){
		Rectangle r=new Rectangle();
		r.width=topDimension.width;
		r.height=topDimension.height;
		// centered by centerRectangle
		r.x=centerRectangle.x+(centerRectangle.width/2) - (r.width/2);
		r.y=centerRectangle.y+centerRectangle.height;
		return r;
	}
	static protected Rectangle getLeftRectangle(Rectangle centerRectangle,Dimension topDimension){
		Rectangle r=new Rectangle();
		r.width=topDimension.width;
		r.height=topDimension.height;
		// centered by centerRectangle
		r.y=centerRectangle.y+(centerRectangle.height/2) - (r.height/2);
		r.x=leftMargin;
		return r;
	}
	static protected Rectangle getRightRectangle(Rectangle centerRectangle,Dimension topDimension){
		Rectangle r=new Rectangle();
		r.width=topDimension.width;
		r.height=topDimension.height;
		// centered by centerRectangle
		r.y=centerRectangle.y+(centerRectangle.height/2) - (r.height/2);
		r.x=centerRectangle.x+centerRectangle.width;
		return r;
	}
	static protected void reshapeTopElements(Rectangle topRectangle,Set<PresentationElement> topElements){
		int offset=topRectangle.x;
		for(PresentationElement pe:topElements){
			Rectangle r=new Rectangle(pe.getBounds());
			int width=r.width;
			r.y=topRectangle.y;
			r.x=offset;
			offset+=(width+horizontalSpacerInheritance);
			reshapeShapeElement(pe,r);
		}
	}	
	static protected void reshapeBottomElements(Rectangle topRectangle,Set<PresentationElement> topElements){
		int offset=topRectangle.x;
		for(PresentationElement pe:topElements){
			Rectangle r=new Rectangle(pe.getBounds());
			int width=r.width;
			r.y=topRectangle.y+verticalSpacer;
			r.x=offset;
			offset+=(width+horizontalSpacerInheritance);
			reshapeShapeElement(pe,r);
		}
	}	
	static protected void reshapeLeftElements(Rectangle topRectangle,Set<PresentationElement> topElements){
		int offset=topRectangle.y;
		for(PresentationElement pe:topElements){
			Rectangle r=new Rectangle(pe.getBounds());
			int height=r.height;
			r.y=offset;
			r.x=topRectangle.x;
			offset+=(height+verticalSpacer);
			reshapeShapeElement(pe,r);
		}
	}	
	static protected void reshapeRightElements(Rectangle topRectangle,Set<PresentationElement> topElements){
		int offset=topRectangle.y;
		for(PresentationElement pe:topElements){
			Rectangle r=new Rectangle(pe.getBounds());
			int height=r.height;
			r.y=offset;
			r.x=(topRectangle.x+horizontalSpacer);
			offset+=(height+verticalSpacer);
			reshapeShapeElement(pe,r);
		}
	}	
	static protected void reshapeShapeElement(PresentationElement pe,Rectangle rect){
		if(ShapeElement.class.isInstance(pe)){
			
			try {
				PresentationElementsManager.getInstance().reshapeShapeElement((ShapeElement)pe,rect);
			} catch (ReadOnlyElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//////////////////////////////
	static public boolean acceptEntityDiagramContext(BaseElement baseElement) {
		if(baseElement==null)return false;
		if(!baseElement.isEditable())return false;
		if(!Classifier.class.isInstance(baseElement))return false;
		if(!NIEMHelper.isInInformationModel((Classifier)baseElement))return false;
		// TODO: if there is already a diagram?
		// looks like an entity
		if(!isEntity((Classifier)baseElement))return false;
		Classifier baseClassifier=(Classifier)baseElement;
		String diagramName=getEntityDiagramName(baseClassifier,"");
		for(Diagram diagram:baseClassifier.getOwnedDiagram()){
			if(diagramName.equals(diagram.getName())) return false;
		}
		return true;
	}
	static protected boolean isEntity(Classifier classifier){
		// not PropertyHolder
		// not choice
		// not enumeration/primitive 
		if(NIEMHelper.isPropertyHolder(classifier))return false;
		if(NIEMHelper.isChoice(classifier))return false;
		if(Enumeration.class.isInstance(classifier))return false;
		if(PrimitiveType.class.isInstance(classifier))return false;
		// should have some property with aggregation none
		if(hasAssociation(classifier))return true;
		if(referencedByAssociation(classifier))return true;
		if(hasInheritanceHierarchy(classifier))return true;
		// or referenced by such
		// or has general or subtype or realization/Usage counterpart
		return false;
	}
	static protected boolean hasInheritanceHierarchy(Classifier classifier){
		if(!classifier.getGeneral().isEmpty())return true;
		if(!classifier.get_generalizationOfGeneral().isEmpty())return true;
		// some realization/usage checks
		if(NIEMHelper.isBaseTypeRestriction(classifier))return true;
		if(!(NIEMHelper.getMetadataApplications(classifier).isEmpty()))return true;
		return false;
	}
	static protected boolean referencedByAssociation(Classifier classifier){
		for(TypedElement typedElement:classifier.get_typedElementOfType()){
			if(Property.class.isInstance(typedElement)){
				Property property=(Property)typedElement;
//				if(property.getAggregation()==AggregationKindEnum.NONE)return true;
				if(property.getAssociation()!=null)return true;
			}
		}
		return false;
	}
	static protected boolean hasAssociation(Classifier classifier){
		for(Property property:classifier.getAttribute()){
//			if(property.getAggregation()==AggregationKindEnum.NONE)return true;
			if(property.getAssociation()!=null)return true;
		}
		return false;
	}
	
}

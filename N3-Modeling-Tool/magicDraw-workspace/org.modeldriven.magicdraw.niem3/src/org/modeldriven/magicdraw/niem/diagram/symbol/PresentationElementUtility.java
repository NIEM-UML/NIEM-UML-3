package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ClassDiagramLayouterOptionsGroup;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.properties.BooleanProperty;
import com.nomagic.magicdraw.properties.ChoiceProperty;
import com.nomagic.magicdraw.properties.ColorProperty;
import com.nomagic.magicdraw.properties.Property;
import com.nomagic.magicdraw.properties.PropertyID;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.layout.ClassDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.magicdraw.uml.symbols.shapes.StructureCompartmentView;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;

public class PresentationElementUtility {
	static protected void log(String message){QvtCommonAction.log(message);}
	static public PresentationElement findPresentationElement(PresentationElement dpe,Element element,Map<Element,PresentationElement> element2presentation){
		// check all top level elements and nested elements
		if(element2presentation.containsKey(element))return element2presentation.get(element);
		if(DiagramPresentationElement.class.isInstance(dpe)){
			PresentationElement test= ((DiagramPresentationElement)dpe).findPresentationElement(element, ShapeElement.class);
			if(!(StructureCompartmentView.class.isInstance(test)&&Classifier.class.isInstance(element)))
			if(test!=null){
				//log("FOUND Presentation element ");
				return test;
			}
		}
		for(PresentationElement pe:dpe.getPresentationElements()){
			if(StructureCompartmentView.class.isInstance(pe)&&Classifier.class.isInstance(element))continue;
			if(element.equals(pe.getElement()) 
					|| element.equals(pe.getActualElement())
					){
//				QvtCommonAction.log("TEST actual Element "+pe.getActualElement()+", "+pe.getElement()+", "+element);
				return pe;
			}else{
				PresentationElement nestedPE=findPresentationElement(pe,element,element2presentation);
				if(nestedPE!=null)return nestedPE;
			}
		}
		return null;
	}
	static protected PresentationElement findPathPresentationElement(PresentationElement dpe,Element element,Map<Element,PresentationElement> element2presentation){
		// check all top level elements and nested elements
		if(element2presentation.containsKey(element))return element2presentation.get(element);
		if(DiagramPresentationElement.class.isInstance(dpe)){
			PresentationElement test= ((DiagramPresentationElement)dpe).findPresentationElement(element, PathElement.class);
			if(test!=null){
				//log("FOUND Presentation element ");
				return test;
			}
		}
		for(PresentationElement pe:dpe.getPresentationElements()){
			if(element.equals(pe.getElement()) || element.equals(pe.getActualElement())){
				return pe;
			}else{
				PresentationElement nestedPE=findPathPresentationElement(pe,element,element2presentation);
				if(nestedPE!=null)return nestedPE;
			}
		}
		return null;
	}
	static protected List<String> getOwnerDisplayChoices(){
		List<String> result=new Vector<String>();
		result.add("QNAME_DISPLAY_MODE_DO_NOT_DISPLAY");
		result.add("QNAME_DISPLAY_MODE_BELOW_NAME");
		result.add("QNAME_DISPLAY_MODE_MERGE_WITH_NAME");
		result.add("QNAME_DISPLAY_MODE_ABOVE_NAME");
		return result;
	}
	public static Property ownerDisplayProperty=new ChoiceProperty(PropertyID.QNAME_DISPLAY_MODE,"QNAME_DISPLAY_MODE_ABOVE_NAME",getOwnerDisplayChoices());
	static protected List<String> getAssociationEndsModeChoices(){
		List<String> result=new Vector<String>();
		result.add("WITHOUT_ASSOCIATION");
		result.add("DO_NOT_DISPLAY");
		result.add("ALL");
		return result;
	}
	public static Property associationEndsModeProperty=new ChoiceProperty(PropertyID.SHOW_ASSOCIATION_ENDS_MODE,"ALL",getAssociationEndsModeChoices());
	public static BooleanProperty showTaggedValuesProperty=new BooleanProperty(PropertyID.SHOW_TAGGEDVALUES,false);

	protected static Property externalColorProperty=new ColorProperty(PropertyID.FILL_COLOR,Color.green);
	 
	protected static Boolean firstTime=true;
	static protected ShapeElement createShapeElement(Element type,PresentationElement dpe,boolean useExternalColor,Map<Element,PresentationElement> element2presentation) throws ReadOnlyElementException{
		ShapeElement shapeElement=PresentationElementsManager.getInstance().createShapeElement(type,dpe);
		if(com.nomagic.magicdraw.uml.symbols.shapes.StructureCompartmentView.class.isInstance(shapeElement)){
			QvtCommonAction.log("createShapeElement StructureCompartmentView "+shapeElement+", "+type+", "+dpe+", "+(NamedElement.class.isInstance(type)?((NamedElement)type).getQualifiedName():""));
		}
		if(useExternalColor)shapeElement.addProperty(externalColorProperty);
		if(Namespace.class.isInstance(type))
			shapeElement.addProperty(ownerDisplayProperty);

		 
//		shapeElement.addProperty(associationEndsModeProperty);
		shapeElement.setSelected(false);
		if(!type.equals(shapeElement.getElement())){
			log("INTERNAL ERROR:Element not set on shape "+type+", "+shapeElement.getActualElement());
		}else{
			if(type instanceof Classifier){
				/*
				Rectangle r=shapeElement.getBounds();
				Dimension d=r.getSize();
				shapeElement.setLocation(d.width*2, d.height*2);
				*/
				Rectangle r=shapeElement.getBounds();
				Dimension d=r.getSize();
				//Point p=dpe.getMiddlePoint();
				Rectangle rd=dpe.getBounds();
				int x=rd.x+(rd.width/2);
				int y=rd.y+(rd.height/2);
				shapeElement.setLocation(x-(d.width/2), y-(d.height/2));
			}
		}
		element2presentation.put(type, shapeElement);
		return shapeElement;
	}
	static protected PathElement createPathElement(Element type,PresentationElement dpe,PresentationElement dpe2,boolean useExternalColor,Map<Element,PresentationElement> element2presentation) throws ReadOnlyElementException{
		PathElement shapeElement=PresentationElementsManager.getInstance().createPathElement(type,dpe,dpe2);
		if(shapeElement==null){
			log("INTERNAL ERROR:did not create path for "+type+", "+dpe+", "+dpe.getElement()+", "+dpe2+", "+dpe2.getElement());
			return null;
		}
		if(useExternalColor)shapeElement.addProperty(externalColorProperty);
		shapeElement.addProperty(showTaggedValuesProperty);
		if(Namespace.class.isInstance(type))
			shapeElement.addProperty(ownerDisplayProperty);

		shapeElement.setSelected(false);
		if(!type.equals(shapeElement.getElement())){
			log("INTERNAL ERROR:Element not set on shape "+type+", "+shapeElement.getActualElement());
		}
		element2presentation.put(type, shapeElement);
		return shapeElement;
	}
	static protected Namespace getDiagramElement(DiagramPresentationElement dpe){
		return dpe.getDiagram().getOwnerOfDiagram();
	}
	static public PresentationElement getPresentationElement(DiagramPresentationElement dpe,Element element,Map<Element,PresentationElement> element2presentation,Set<PresentationElement> newElements) throws ReadOnlyElementException{
		try{
			if(Comment.class.isInstance(element)){
				PresentationElement pe=findPresentationElement(dpe,element,element2presentation);
				if(pe==null){
					pe=createShapeElement(element,dpe,false,element2presentation);
					if(pe!=null){
						newElements.add(pe);
					}
				}
			return pe;
			}
			if(!Namespace.class.isInstance(element)||Artifact.class.isInstance(element)){
				PresentationElement parent=getPresentationElement(dpe,((NamedElement)element).getNamespace(),element2presentation,newElements);
				if(parent!=null){
					PresentationElement child=findPresentationElement(parent,element,element2presentation);
					if(child!=null)return child;
					child=createShapeElement(element,parent,false,element2presentation);
					if(child!=null){
						newElements.add(child);
						return child;
					}
					log("FAILED to locate child presentation element for "+((NamedElement)element).getQualifiedName());
				}
				return null;
			}
			PresentationElement pe=findPresentationElement(dpe,element,element2presentation);
			if(pe==null){
				boolean isDifferentPackage=true;
				Namespace diagrammed=getDiagramElement(dpe);
				if(Package.class.isInstance(diagrammed) && ((Package)diagrammed).getPackagedElement().contains(element))
					isDifferentPackage=false;
				//log("getPresentationElement "+isDifferentPackage+", "+dpe.getElement()+", "+element);
				pe=createShapeElement(element,dpe,isDifferentPackage,element2presentation);
				if(pe!=null)newElements.add(pe);
			}
		return pe;
		}catch(Throwable t){
			t.printStackTrace();
			log("ERROR: getPresentationElement failed on element "+element+" : "+t);
		}
		return null;
	}
//	static public PresentationElement getPathPresentationElement(DiagramPresentationElement dpe,PresentationElement source,PresentationElement target,DirectedRelationship element,Map<Element,PresentationElement> element2presentation) throws ReadOnlyElementException{
	static public PresentationElement getPathPresentationElement(DiagramPresentationElement dpe,PresentationElement source,PresentationElement target,Relationship element,Map<Element,PresentationElement> element2presentation,Set<PresentationElement> newElements) throws ReadOnlyElementException{
		try{
//			if(!Namespace.class.isInstance(element)){
//				PresentationElement parent=findPathPresentationElement(dpe,((NamedElement)element).getNamespace(),element2presentation);
//				PresentationElement parent=findPathPresentationElement(dpe,element,element2presentation);
//				if(parent!=null){
//					PresentationElement child=findPresentationElement(parent,element,element2presentation);
					PresentationElement child=findPathPresentationElement(dpe,element,element2presentation);
					if(child!=null)return child;
					child=createPathElement(element,source,target,false,element2presentation);
					if(child!=null){
						newElements.add(child);
						return child;
					}
					log("FAILED to locate child presentation element for "+element+" "+((NamedElement)element).getQualifiedName());
//				}
				return null;
				/*
			}
			PresentationElement pe=findPresentationElement(dpe,element,element2presentation);
			if(pe==null){
				boolean isDifferentPackage=true;
				Namespace diagrammed=getDiagramElement(dpe);
				if(Package.class.isInstance(diagrammed) && ((Package)diagrammed).getPackagedElement().contains(element))
					isDifferentPackage=false;
				//log("getPresentationElement "+isDifferentPackage+", "+dpe.getElement()+", "+element);
				pe=createPathElement(element,dpe,isDifferentPackage,element2presentation);
			}
		return pe;
		*/
		}catch(Throwable t){
			log("ERROR: getPathPresentationElement failed on element "+element+", "+dpe+", "+source+", "+target+" : "+t);
		}
		return null;
	}


}

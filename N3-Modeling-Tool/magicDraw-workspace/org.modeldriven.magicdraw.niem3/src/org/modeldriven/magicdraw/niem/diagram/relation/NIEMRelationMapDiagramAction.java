/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.relation;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.DiagramDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import prefuse.Visualization;
import prefuse.action.assignment.SizeAction;
import prefuse.controls.ToolTipControl;
import prefuse.data.Edge;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.tuple.TableTuple;
import prefuse.data.tuple.TupleSet;
import prefuse.visual.VisualItem;
import prefuse.visual.tuple.TableEdgeItem;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.derivedproperty.DerivedPropertyManager;
import com.nomagic.magicdraw.derivedproperty.PropertyDescriptor;
import com.nomagic.magicdraw.foundation.diagram.AbstractDiagramRepresentationObject;
import com.nomagic.magicdraw.ui.dsl.DSLManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramDescriptor;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.visualization.relationshipmap.GraphConstants;
import com.nomagic.magicdraw.visualization.relationshipmap.RelationMapManager;
import com.nomagic.magicdraw.visualization.relationshipmap.RelationMapPlugin;
import com.nomagic.magicdraw.visualization.relationshipmap.RelationMapUpdater;
import com.nomagic.magicdraw.visualization.relationshipmap.actions.CreateRelationMapDiagram;
import com.nomagic.magicdraw.visualization.relationshipmap.model.GraphDataManager;
import com.nomagic.magicdraw.visualization.relationshipmap.model.GraphDependencyCriteria;
import com.nomagic.magicdraw.visualization.relationshipmap.model.PropertiesDependencyCriterion;
import com.nomagic.magicdraw.visualization.relationshipmap.model.settings.GraphSettings;
import com.nomagic.magicdraw.visualization.relationshipmap.options.RelationMapOptionsHelper;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.RelationMapDiagramDescriptor;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.RelationMapDiagramWindowPanel;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.body.RelationMapDiagramComponent;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.AbstractGraphDisplay;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.GraphDisplay;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.GraphVisualUtilities;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.RelationMapNode;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author tom
 *
 */
public class NIEMRelationMapDiagramAction extends CreateRelationMapDiagram implements RelationMapConstants,ToolTipConstants{
	protected Element selectedElement=null;
	/**
	 * 
	public NIEMSubsettingRelationDiagramAction() {
		// TODO Auto-generated constructor stub
	}
	 */

	/**
	 * @param arg0
	 */
	public NIEMRelationMapDiagramAction(Element element) {
		super(element);
		selectedElement=element;
		this.setName(getActionName());
		this.setSmallIcon(QvtCommonAction.getNiemIcon());
		setDescription(NIEM_RELATION_MAP_DIAGRAM_ACTION_TOOLTIP);
	}
	public String getID(){
		return SUBSET_FILTER;
	}

	/**
	 * @param arg0
	public NIEMSubsettingRelationDiagramAction(DiagramDescriptor arg0) {
		super(arg0);
		
	}
	 */
	protected String getActionName(){
		return "new Relation Map Diagram";
	}
	protected String getDiagramName(){
		return "NIEM Relation Map";
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		super.actionPerformed(actionEvent);
		// can we find what was just created?
		BaseElement base=getFirstElement();
		Diagram diagram=null;
		if(!Diagram.class.isInstance(base))return;
//			List<String> newRelationCriterion=new Vector<String>();
//			populateRelationCriterion(newRelationCriterion);
			boolean isSessionStarted=NIEMHelper.createSession(getDiagramName());
			try{
			 diagram=(Diagram)base;
			diagram.setName(getDiagramName());
/*		
			//InstanceSpecification instance=diagram.getAppliedStereotypeInstance();
			Stereotype relationMap=getRelationMapStereotype(diagram);
			//QvtCommonAction.log("Diagram "+diagram+", "+diagram.getClass().getName()+", "+relationMap);
			if(relationMap!=null){
			//List elementTypes=StereotypesHelper.getStereotypePropertyValue(diagram, relationMap, "elementType"); 
			//List relationCriterion=StereotypesHelper.getStereotypePropertyValue(diagram, relationMap, "relationCriterion"); 
			//QvtCommonAction.log("elementTypes "+elementTypes);
			//QvtCommonAction.log("relationCriterion "+relationCriterion);
			List<String> newElementTypes=new Vector<String>();
			newElementTypes.add("Classifier");
			newElementTypes.add("AssociationClass");
			newElementTypes.add("Class");
			newElementTypes.add("DataType");
			newElementTypes.add("Enumeration");
			newElementTypes.add("PrimitiveType");
			newElementTypes.add("EnumerationLiteral");
			newElementTypes.add("Property");
			String NIEM_Common_Profile="NIEM_Common_Profile::";
			String NIEM_PSM_Profile="NIEM_PSM_Profile::";
			String NIEM_PIM_Profile="NIEM_PIM_Profile::";
			newElementTypes.add(NIEM_PIM_Profile+InformationModelStereotypeName);
			newElementTypes.add(NIEM_PIM_Profile+RoleOfStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+ListStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+AdapterTypeStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+AssociationTypeStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+AugmentationTypeStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+ChoiceStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+MetadataTypeStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+NIEMTypeStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+ObjectTypeStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+PropertyHolderStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+UnionStereotypeName);
			newElementTypes.add(NIEM_Common_Profile+ValueRestrictionStereotypeName);
			newElementTypes.add(NIEM_PSM_Profile+XSDRepresentationRestrictionStereotypeName);
			newElementTypes.add(NIEM_PSM_Profile+SequenceIDStereotypeName);
			newElementTypes.add(NIEM_PSM_Profile+XSDAnyPropertyStereotypeName);
			newElementTypes.add(NIEM_PSM_Profile+XSDPropertyStereotypeName);

			StereotypesHelper.setStereotypePropertyValue(diagram,relationMap, "elementType",newElementTypes);
			StereotypesHelper.setStereotypePropertyValue(diagram,relationMap, "relationCriterion",newRelationCriterion);
			Integer depth=4;
			StereotypesHelper.setStereotypePropertyValue(diagram,relationMap, "depth",depth);
			StereotypesHelper.setStereotypePropertyValue(diagram,relationMap, "ShowAppliedStereotypes",Boolean.TRUE);
			*/
			GraphSettings graphSettings=ChangeRelationMapDiagramFilterAction.getGraphSettings();
			ChangeRelationMapDiagramFilterAction.setFilterSettings(getFilter());
			graphSettings.setDepth(4);
			graphSettings.setShowStereotypes(true);
			}finally{
				NIEMHelper.closeSession(isSessionStarted);
			}
	}
	protected String getFilter(){return getID();}
	/*
	static protected String SUBSETS_NIEM_REFERENCE_MODEL="Subsets Niem Reference Model;Property;/NIEM_PIM_Profile::InformationModel.subsetsNiemReferenceModel;Source to target;;";
	static protected String TOP_LEVEL_PROPERTY_USAGE="Top Level Property Usage;Property;Property.topLevelPropertyUsage;Source to target;;";
	static protected String TOP_LEVEL_PROPERTY="Top Level Property;Property;Property.topLevelProperty;Source to target;;";
	static protected String TYPE_PACKAGE="Package;Property;Type.package;Source to target;;";
	//static protected String PACKAGE_TYPE="Owned Type;Package;Package.ownedType;Target to source;;";
	static protected String PROPERTY_CLASSIFIER="Classifier;Property;Property.classifier;Source to target;;";
	//static protected String CLASSIFIER_ATTRIBUTE="Attribute;Classifier;Classifier.attribute;Target to source;;";
//	static protected String PROPERTY_CLASSIFIER="Classifier;Property;Property.classifier;Any;;";
	static protected String NIEM_PROPERTY_CONTAINER="Niem Property Container;Property;Property.niemPropertyContainer;Source to target;;";
	static protected String SUBSETTED_PROPERTY="Subsetted Property;Property;Property.subsettedProperty;Source to target;;";
protected void populateRelationCriterion(List<String> newRelationCriterion){
		newRelationCriterion.add("Subsets Niem Reference Type;Property;Classifier.subsetsNiemReferenceType;Source to target;;");
		newRelationCriterion.add(TYPE_PACKAGE);
		//newRelationCriterion.add(PACKAGE_TYPE);
		newRelationCriterion.add(TOP_LEVEL_PROPERTY);
		newRelationCriterion.add(SUBSETTED_PROPERTY);
		
		newRelationCriterion.add(SUBSETS_NIEM_REFERENCE_MODEL);
		newRelationCriterion.add("Subsets Niem Reference Property;Property;Property.subsetsNiemReferenceProperty;Source to target;;");
		newRelationCriterion.add("Default Purpose;Tag;NIEM_PIM_Profile::InformationModel.defaultPurpose;Source to target;;");
		newRelationCriterion.add(PROPERTY_CLASSIFIER);
		//newRelationCriterion.add(CLASSIFIER_ATTRIBUTE);
	}
	public static Stereotype getRelationMapStereotype(Diagram diagram) {
		return StereotypesHelper.getAppliedStereotypeByString(diagram, "RelationMap");
	}
	*/
}

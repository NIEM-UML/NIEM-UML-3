/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.DiagramDialogHelper;
import org.modeldriven.magicdraw.niem.expression.NiemBaseClassifierExpression;
import org.modeldriven.magicdraw.niem.expression.NiemBaseClassifierUsageExpression;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.foundation.diagram.AbstractDiagramRepresentationObject;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramDescriptor;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.visualization.relationshipmap.actions.CreateRelationMapDiagram;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author tom
 *
 */
public class NIEMBaseTypeDiagramAction extends DefaultBrowserAction implements NIEM_ProfileConstants,ToolTipConstants{
	protected Classifier classifier=null;
	/**
	 * 
	 */
	public NIEMBaseTypeDiagramAction(String id, String name,Classifier classifierIn)
	{
		super(id, name,null,null);
		classifier=classifierIn;
		this.setSmallIcon(QvtCommonAction.getNiemIcon());
		setDescription(NIEM_BASE_TYPE_DIAGRAM_ACTION_TOOLTIP);
		setEnabled(false);
	}
		public void actionPerformed(ActionEvent actionEvent)
		{
//			BaseElement baseElement=this.getFirstElement();
			BaseElement baseElement=classifier;
			if(Classifier.class.isInstance(baseElement)){
			try {
				createBaseTypeDiagram((Classifier)baseElement,QvtCommonAction.getProject());
			} catch (ReadOnlyElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				QvtCommonAction.log("ERROR: during Base Type Diagram Creation: "+e);
			}
			}
			
		}
		
		public void updateState()
		{
			// enabled when selection is Classifier and it meets the other criteria

//			Boolean enabled=acceptBaseTypeDiagramContext(getFirstElement());
			Boolean enabled=acceptBaseTypeDiagramContext(classifier);
			setEnabled(enabled);
		}
		static public boolean acceptBaseTypeDiagramContext(BaseElement baseElement) {
			if(baseElement==null)return false;
			if(!baseElement.isEditable())return false;
			if(!Classifier.class.isInstance(baseElement))return false;
			if(!NIEMHelper.isInInformationModel((Classifier)baseElement))return false;
			// TODO: if there is already a diagram?
			if(!hasBaseTypeHierarchy((Classifier)baseElement))return false;

			Classifier baseClassifier=(Classifier)baseElement;
			String diagramName=getEntityDiagramName(baseClassifier,"");
			for(Diagram diagram:baseClassifier.getOwnedDiagram()){
				if(diagramName.equals(diagram.getName())) return false;
			}
			return true;
		}
		static protected String getEntityDiagramName(Classifier model,String suffix){
			return "NIEM_BaseType_"+model.getName()+suffix;
		}
		
		static protected boolean hasBaseTypeHierarchy(Classifier classifier){
			if(!classifier.getGeneral().isEmpty())return true;
			if(!classifier.get_generalizationOfGeneral().isEmpty())return true;
			// some realization/usage checks
			if(NIEMHelper.isBaseTypeRestriction(classifier))return true;
			if(!(NIEMHelper.getMetadataApplications(classifier).isEmpty()))return true;
			return false;
		}
		
		protected void createBaseTypeDiagram(Classifier type,Project project) throws ReadOnlyElementException{
			if(Relationship.class.isInstance(type))return;
			DiagramPresentationElement dpe=null;
			Package model=NIEMHelper.getNearestPackage(type);
			// access singleton instance by using getInstance()
			// only one session can be active, so check this.
			 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
			if (!isSessionCreated)
			{
			// create new session.
			SessionManager.getInstance().createSession("baseTypeDiagram");
			}			
			try{
				dpe= DiagramDialogHelper.createDiagram(type,project,"");
				Diagram diagram= dpe.getDiagram();
				diagram.setName(getEntityDiagramName(type,""));

				// generalizations
				recurseGenerals(dpe,type);
				recurseSpecifics(dpe,type);
				/*
						PresentationElement specificPE=Psm2PimAction.getPresentationElement(dpe,type);
						if(specificPE==null){
							QvtCommonAction.log("ERROR: Failed to get presentation element for "+type.getQualifiedName());
							//continue;
							return;
						}
						// we want baseTypes, not generalization and we want to recurse
						DirectedRelationship dr=NiemBaseClassifierExpression.getBaseTypeRelation(type);
						if(dr!=null){
			                Element general = ModelHelper.getSupplierElement(dr);
							if(general==null){
								QvtCommonAction.log("ERROR: Failed to get general for "+type.getQualifiedName());
								return;
							}
							PresentationElement generalPE=null;
							try{
								generalPE=Psm2PimAction.getPresentationElement(dpe,general);
							} catch (Throwable ee) {
								QvtCommonAction.log("ERROR during inheritance diagram gen for general "+((NamedElement)general).getQualifiedName()+" : "+ee);
								return;
							}
							if((dr!=null)&&(generalPE!=null)){
								PresentationElement pathElement=Psm2PimAction.getPathPresentationElement(dpe, specificPE, generalPE,dr);
								if(pathElement==null){
									QvtCommonAction.log("ERROR: Failed to create inheritance path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
									return;
								}
								pathElement.setSelected(false);
							}else{
								QvtCommonAction.log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
							}
							
						}
						// we want baseTypes, not generalization and we want to recurse
						// find elements for which this type is the general 
						Set<DirectedRelationship> baseTypeUsages=NiemBaseClassifierUsageExpression.getBaseTypeUsageRelations(type);
						for(DirectedRelationship baseTypeUsage:baseTypeUsages){
			                Element general = ModelHelper.getClientElement(baseTypeUsage);
							if(general==null){
								QvtCommonAction.log("ERROR: Failed to get specific for "+type.getQualifiedName());
								continue;
							}
							PresentationElement generalPE=null;
							try{
								generalPE=Psm2PimAction.getPresentationElement(dpe,general);
							} catch (Throwable ee) {
								QvtCommonAction.log("ERROR during inheritance diagram gen for specific "+((NamedElement)general).getQualifiedName()+" : "+ee);
								continue;
							}
							if((baseTypeUsage!=null)&&(generalPE!=null)){
								PresentationElement pathElement=Psm2PimAction.getPathPresentationElement(dpe,  generalPE,specificPE,baseTypeUsage);
								if(pathElement==null){
									QvtCommonAction.log("ERROR: Failed to create inheritance path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
									continue;
								}
								pathElement.setSelected(false);
							}else{
								QvtCommonAction.log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
							}
						}
						*/
						
						} catch (Throwable eee) {
							QvtCommonAction.log("ERROR during inheritance diagram gen type "+type.getQualifiedName()+" : "+eee);
						}finally{
							  // apply changes and add command into command history.
							if (!isSessionCreated)
							{
								SessionManager.getInstance().closeSession();
							}								 
							
						}
			Psm2PimAction.layout(dpe);
	}
		protected void recurseSpecifics(DiagramPresentationElement dpe,Classifier type) throws ReadOnlyElementException{
			PresentationElement specificPE=Psm2PimAction.getPresentationElement(dpe,type);
			if(specificPE==null){
				QvtCommonAction.log("ERROR: Failed to get presentation element for "+type.getQualifiedName());
				//continue;
				return;
			}
			Set<DirectedRelationship> baseTypeUsages=NiemBaseClassifierUsageExpression.getBaseTypeUsageRelations(type);
			for(DirectedRelationship baseTypeUsage:baseTypeUsages){
                Element general = ModelHelper.getClientElement(baseTypeUsage);
				if(general==null){
					QvtCommonAction.log("ERROR: Failed to get specific for "+type.getQualifiedName());
					continue;
				}
				PresentationElement generalPE=null;
				try{
					generalPE=Psm2PimAction.getPresentationElement(dpe,general);
				} catch (Throwable ee) {
					QvtCommonAction.log("ERROR during inheritance diagram gen for specific "+((NamedElement)general).getQualifiedName()+" : "+ee);
					continue;
				}
				if((baseTypeUsage!=null)&&(generalPE!=null)){
					PresentationElement pathElement=Psm2PimAction.getPathPresentationElement(dpe,  generalPE,specificPE,baseTypeUsage);
					if(pathElement==null){
						QvtCommonAction.log("ERROR: Failed to create inheritance path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
						continue;
					}
					pathElement.setSelected(false);
					recurseSpecifics(dpe,(Classifier)general);
				}else{
					QvtCommonAction.log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
				}
			}
			
		}
	protected void recurseGenerals(DiagramPresentationElement dpe,Classifier type) throws ReadOnlyElementException{
		PresentationElement specificPE=Psm2PimAction.getPresentationElement(dpe,type);
		if(specificPE==null){
			QvtCommonAction.log("ERROR: Failed to get presentation element for "+type.getQualifiedName());
			//continue;
			return;
		}
		// we want baseTypes, not generalization and we want to recurse
		DirectedRelationship dr=NIEMHelper.getBaseTypeRelation(type);
		if(dr!=null){
            Element general = ModelHelper.getSupplierElement(dr);
			if(general==null){
				QvtCommonAction.log("ERROR: Failed to get general for "+type.getQualifiedName());
				return;
			}
			PresentationElement generalPE=null;
			try{
				generalPE=Psm2PimAction.getPresentationElement(dpe,general);
			} catch (Throwable ee) {
				QvtCommonAction.log("ERROR during inheritance diagram gen for general "+((NamedElement)general).getQualifiedName()+" : "+ee);
				return;
			}
			if((dr!=null)&&(generalPE!=null)){
				PresentationElement pathElement=Psm2PimAction.getPathPresentationElement(dpe, specificPE, generalPE,dr);
				if(pathElement==null){
					QvtCommonAction.log("ERROR: Failed to create inheritance path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
					return;
				}
				pathElement.setSelected(false);
				if(Classifier.class.isInstance(general)){
				recurseGenerals(dpe,(Classifier)general);
				}
			}else{
				QvtCommonAction.log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
			}
			
		}

	}
}

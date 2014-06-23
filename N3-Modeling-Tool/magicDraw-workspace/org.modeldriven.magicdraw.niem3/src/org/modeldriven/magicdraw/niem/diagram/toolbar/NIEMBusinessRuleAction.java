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
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.foundation.diagram.AbstractDiagramRepresentationObject;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.magicdraw.ui.dialogs.specifications.SpecificationDialogManager;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author tom
 *
 */
public class NIEMBusinessRuleAction extends DefaultBrowserAction implements NIEM_ProfileConstants,ToolTipConstants{
	protected Classifier classifier=null;
	/**
	 * 
	 */
	public NIEMBusinessRuleAction(String id, String name,Classifier classifierIn)
	{
		super(id, name,null,null);
		classifier=classifierIn;
		this.setSmallIcon(QvtCommonAction.getNiemIcon());
		setDescription(NIEM_BUSINESS_RULE_ACTION_TOOLTIP);
		setEnabled(false);
	}
		public void actionPerformed(ActionEvent actionEvent)
		{
			BaseElement baseElement=classifier;
			if(Classifier.class.isInstance(baseElement)){
					//createBaseTypeDiagram((Classifier)baseElement,QvtCommonAction.getProject());
					// create new constraint, setup an initial OC expression, Stereotype, constrained item, name, owner
					// may need to adjust the suite too
					 boolean isSessionCreated=NIEMHelper.createSession("BusinessRule");
						Constraint constraint=null;
					 try{
						 String constraintName=NameHelper.getUniqueConstraintName(classifier,"Rule");
							Profile profile=NIEMHelper.getProfile("Validation Profile");
							if(profile==null)return;
							Stereotype validationRule=getValidationRuleStereotype(profile);
							if(validationRule==null)return;
							constraint=NIEMFactory.instance.createConstraint(classifier,constraintName,validationRule,"OCL2.0","true");
//							InstanceSpecification instanceSpecification=constraint.getAppliedStereotypeInstance();
							NIEMHelper.setStereotypePropertyValue(constraint,validationRule,"abbreviation",classifier.getName());
							NIEMHelper.setStereotypePropertyValue(constraint,validationRule,"errorMessage",classifier.getName()+" violates busines rule");
							EnumerationLiteral severityKind=getSeverityKindError(profile);
							NIEMHelper.setStereotypePropertyValue(constraint,validationRule,"severityKind",severityKind);
							NIEMHelper.setStereotypePropertyValue(constraint,validationRule,"implementation","org.modeldriven.magicdraw.niem.validate.BusinessRuleValidation");
							
						 
					}finally{
					     NIEMHelper.closeSession(isSessionCreated);
						 }
					 if(constraint!=null){
						 // bring up dialog for constraint
						 SpecificationDialogManager.getManager().editSpecification(constraint) ;				
					 }
			}
			
		}
		protected EnumerationLiteral getSeverityKindError(Profile profile){
			Enumeration severityKind=(Enumeration)NIEMHelper.getType(profile,"SeverityKind");
			EnumerationLiteral enumerationLiteral=NIEMHelper.getOwnedLiteral(severityKind,"Error");
			return enumerationLiteral;
	}
		protected Stereotype getValidationRuleStereotype(Profile profile){
				return StereotypesHelper.getStereotype(NIEMHelper.getProject(),"validationRule",profile); 
		}
		
		public void updateState()
		{
			// enabled when selection is Classifier and it meets the other criteria
			Boolean enabled=acceptBusinessRuleContext(classifier);
			setEnabled(enabled);
		}
		static public boolean acceptBusinessRuleContext(BaseElement baseElement) {
			if(baseElement==null)return false;
			if(!baseElement.isEditable())return false;
			if(!Classifier.class.isInstance(baseElement))return false;
			if(!NIEMHelper.isInInformationModel((Classifier)baseElement))return false;
			return true;
		}
}

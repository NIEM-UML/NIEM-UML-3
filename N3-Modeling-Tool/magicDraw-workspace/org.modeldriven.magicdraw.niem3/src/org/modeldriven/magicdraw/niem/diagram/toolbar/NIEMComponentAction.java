/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.util.Date;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
//import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.metadata.MdbasiccomponentsFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class NIEMComponentAction extends MpdProfileAction {

	public NIEMComponentAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("component"));
		
	}
//	static public Component createComponent(String stereotypeName) {
	static public Component initComponent(String stereotypeName,Component niemType) {
//		Component niemType= UMLFactory.eINSTANCE.createComponent();
//		addPackagedElement(niemType);
//		niemType.setName(this.getName());
//		if(ChoiceStereotypeName.equals(getName())){
		setName(niemType,stereotypeName);
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getMpdStereotype(stereotypeName);
//		applyStereotype(niemType,stereotype);
		NIEMHelper.addStereotype(niemType,stereotype);
		
		Profile mpdProfile=getMpdProfile();
		if(ModelPackageDescriptionStereotypeName.equals(stereotypeName)){
//			createDefaultValues(niemType,  stereotype,true) ;
			Enumeration classCode=(Enumeration)getType(mpdProfile,ModelPackageDescriptionClassCodeName);
			if(classCode!=null){
				EnumerationLiteral defaultClassCode=getOwnedLiteral(classCode,iepdLiteralName);
				setStereotypePropertyValue(niemType,stereotype,mpdClassCodeTagName,defaultClassCode);
			}
			setStereotypePropertyValue(niemType,stereotype,mpdVersionIDTagName,"1");
			setStereotypePropertyValue(niemType,stereotype,mpdBaseURITagName,"http://myiepd.org/mympdname/");
			setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"mympdname notifies agencies about things");
			setStereotypePropertyValue(niemType,stereotype,SecurityMarkingTextTagName,"Unclassified/public");
			setStereotypePropertyValue(niemType,stereotype,CreationDateTagName,new Date().toString());
			setStereotypePropertyValue(niemType,stereotype,StatusTextTagName,"initial implementation");
			setStereotypePropertyValue(niemType,stereotype,KeywordTextTagName,"contingency",true);
			setStereotypePropertyValue(niemType,stereotype,DomainTextTagName,"Emergency Management",true);
			setStereotypePropertyValue(niemType,stereotype,PurposeTextTagName,"intended to initiate execution of planning cycles",true);
			setStereotypePropertyValue(niemType,stereotype,ExchangePatternTextTagName,"query/response",true);
			setStereotypePropertyValue(niemType,stereotype,ExchangePartnerNameTagName,"FEMA",true);
			setStereotypePropertyValue(niemType,stereotype,ASNameTagName,"FEMA");
			setStereotypePropertyValue(niemType,stereotype,ASAddressTextTagName,"30 Dupont Cir, Wash DC, 12345, USA");
			setStereotypePropertyValue(niemType,stereotype,ASWebSiteURLTagName,"http://www.fema.gov");
			/*
			Property pocProperty;
			Slot pocs=getSlot(niemType, pocProperty,true) ;
			*/
/*			
			ca:mpdURI="http://myiepd.org/p-ord/" 
			ca:mpdClassCode="iepd" 
			ca:mpdName="Planning_Order" 
			ca:mpdVersionID="1.0.3rev2" 
			ca:descriptionText="A Planning Order notifies subordinate agencies to initiate planning for contingency operations." >			
*/			
		}else{
			Enumeration natureCode=(Enumeration)getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=getOwnedLiteral(purposeCode,subset_schema_setLiteralName);
			EnumerationLiteral defaultNature=getOwnedLiteral(natureCode,file_setLiteralName);
			setStereotypePropertyValue(niemType,stereotype,natureCodeTagName,defaultNature);
			setStereotypePropertyValue(niemType,stereotype,purposeCodeTagName,defaultPurpose);
			setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"Serves the purpose of a collection of files managed together for a specific purpose or reason.");
		}
		
		return niemType;
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
//		Component niemType= UMLFactory.eINSTANCE.createComponent();
//		addPackagedElement(niemType);
		
		Component niemType = Application.getInstance().getProject().getElementsFactory().createComponentInstance();
	return initComponent(getName(),niemType);
		/*
		Component niemType= MdbasiccomponentsFactory.eINSTANCE.createComponent();
//		niemType.setName(this.getName());
//		if(ChoiceStereotypeName.equals(getName())){
		setName(niemType);
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getMpdStereotype(getName());
		NIEMHelper.addStereotype(niemType,stereotype);
		
		Profile mpdProfile=getMpdProfile();
		if(ModelPackageDescriptionStereotypeName.equals(getName())){
			createDefaultValues(niemType,  stereotype,true) ;
			Enumeration classCode=(Enumeration)getType(mpdProfile,ModelPackageDescriptionClassCodeName);
			EnumerationLiteral defaultClassCode=getOwnedLiteral(classCode,iepdLiteralName);
			setStereotypePropertyValue(niemType,stereotype,mpdVersionIDTagName,"1");
			setStereotypePropertyValue(niemType,stereotype,mpdBaseURITagName,"http://myiepd.org/mympdname/");
			setStereotypePropertyValue(niemType,stereotype,mpdClassCodeTagName,defaultClassCode);
			setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"mympdname notifies agencies about things");
			setStereotypePropertyValue(niemType,stereotype,SecurityMarkingTextTagName,"Unclassified/public");
			setStereotypePropertyValue(niemType,stereotype,CreationDateTagName,new Date().toString());
			setStereotypePropertyValue(niemType,stereotype,StatusTextTagName,"initial implementation");
			setStereotypePropertyValue(niemType,stereotype,KeywordTextTagName,"contingency",true);
			setStereotypePropertyValue(niemType,stereotype,DomainTextTagName,"Emergency Management",true);
			setStereotypePropertyValue(niemType,stereotype,PurposeTextTagName,"intended to initiate execution of planning cycles",true);
			setStereotypePropertyValue(niemType,stereotype,ExchangePatternTextTagName,"query/response",true);
			setStereotypePropertyValue(niemType,stereotype,ExchangePartnerNameTagName,"FEMA",true);
			setStereotypePropertyValue(niemType,stereotype,ASNameTagName,"FEMA");
			setStereotypePropertyValue(niemType,stereotype,ASAddressTextTagName,"30 Dupont Cir, Wash DC, 12345, USA");
			setStereotypePropertyValue(niemType,stereotype,ASWebSiteURLTagName,"http://www.fema.gov");
			/ *
			Property pocProperty;
			Slot pocs=getSlot(niemType, pocProperty,true) ;
			* /
/ *			
			ca:mpdURI="http://myiepd.org/p-ord/" 
			ca:mpdClassCode="iepd" 
			ca:mpdName="Planning_Order" 
			ca:mpdVersionID="1.0.3rev2" 
			ca:descriptionText="A Planning Order notifies subordinate agencies to initiate planning for contingency operations." >			
* /			
		}else{
			Enumeration natureCode=(Enumeration)getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=getOwnedLiteral(purposeCode,subset_schema_setLiteralName);
			EnumerationLiteral defaultNature=getOwnedLiteral(natureCode,file_setLiteralName);
			setStereotypePropertyValue(niemType,stereotype,natureCodeTagName,defaultPurpose);
			setStereotypePropertyValue(niemType,stereotype,purposeCodeTagName,defaultNature);
			setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"Serves the purpose of a collection of files managed together for a specific purpose or reason.");
		}
		
		return niemType;
		*/
	}
	public boolean isEnabled(){
		DiagramPresentationElement dpe=this.getDiagram();
		if(dpe==null)return false;
		Diagram diagram=dpe.getDiagram();
		if(diagram==null)return false;
		if(NIEMHelper.isInInformationModel(diagram))return false;
		return super.isEnabled()&&NIEMHelper.isProfileApplied(diagram, NIEMHelper.getMpdProfile());
		}

}

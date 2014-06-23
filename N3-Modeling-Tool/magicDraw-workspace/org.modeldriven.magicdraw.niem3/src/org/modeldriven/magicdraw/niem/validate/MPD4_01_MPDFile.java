package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.change.ChangelogUtility;
import org.modeldriven.magicdraw.niem.diagram.context.AddPOCActionHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for:
 *[Rule 4-12] Every MPD that is an IEPD or EIEM MUST contain a change log artifact that: 
 *• Records changes to previous IEPD or EIEM schemas that this MPD represents. 
 *• Begins with the substring "changelog". 
 *• Resides in the root directory of the MPD.
 *
 */
public class MPD4_01_MPDFile extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addComponentAppliedStereotypeConfiguration(configMap);
//        addPropertyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}

    static protected String getNameInvalidMessage(NamedElement namedElement){
    	if(!(namedElement instanceof Component))return null;
    	Component mpd=(Component)namedElement;
		if(!namedElement.isEditable())return null;
		if(!NIEMHelper.isModelPackageDescription(namedElement))return null;
		if(QvtCommonAction.isInPSM(NIEMHelper.getNearestPackage(namedElement)))return null;
		// fixup POC entry for <<MPD>> if necessary
		Stereotype mpdStereotype=NIEMHelper.getMpdStereotype(ModelPackageDescriptionStereotypeName);
		Slot slot=StereotypesHelper.getSlot(mpd,mpdStereotype,POCTagName,false);
		if(slot==null){
			InstanceSpecification instanceSpecification=AddPOCActionHelper.addPOC(mpd);
    			QvtCommonAction.log("Warning: required tag "+POCTagName+" set on "+mpd.getQualifiedName());
			
		}
		String pattern="yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
		String dateValue=simpleDateFormat.format(new Date(System.currentTimeMillis()));
		
		conditionalSetSlotValue( mpd, mpdStereotype,SecurityMarkingTextTagName,"Unclassified/public");
		conditionalSetSlotValue( mpd, mpdStereotype,CreationDateTagName,dateValue);
		conditionalSetSlotValue( mpd, mpdStereotype,KeywordTextTagName,mpd.getName());
		conditionalSetSlotValue( mpd, mpdStereotype,DomainTextTagName,mpd.getName());
		conditionalSetSlotValue( mpd, mpdStereotype,ASNameTagName,mpd.getName());
		// check if values ok too
		// do fixup of <<MPDFile>> here too
		fixupMpdFiles(mpd);
    	Set<Component> mpdFileSets=getModelPackageDescriptionFileSets(mpd);
    	for(Component mpdFileSet:mpdFileSets){
    		fixupMpdFiles(mpdFileSet);
    	}
    	// check for duplicate entries
    	List<Dependency> mpdFiles=new Vector<Dependency>(NIEMHelper.getModelPackageDescriptionFiles(mpd));
    	int length=mpdFiles.size();
    	for(int i=0;i<length-1;i++){
    		NamedElement target1=null;
    		for(NamedElement test:mpdFiles.get(i).getSupplier()){
    			target1=test;
    			break;
    		}
    		if(target1==null)continue;
        	for(int j=i+1;j<length;j++){
        		NamedElement target2=null;
        		for(NamedElement test:mpdFiles.get(j).getSupplier()){
        			target2=test;
        			break;
        		}
            	if(target1.equals(target2)){
            		return "multiple <<ModelPackageDescriptionFile>> entries for "+target1.getQualifiedName();
            	}
        	}
    	}
    	return null;
	 	}
	protected static Set<Component> getModelPackageDescriptionFileSets(Component mpd){
		Set<Component> result=new HashSet<Component>();
		for(Dependency dependency:mpd.getClientDependency()){
			if(dependency instanceof Usage){
				for(NamedElement mpdFileSet:dependency.getSupplier()){
					if((mpdFileSet instanceof Component)&&NIEMHelper.isModelPackageDescriptionFileSet((Component)mpdFileSet)){
						result.add((Component)mpdFileSet);
					}
				}
			}
		}
		return result;
	}
    protected static void fixupMpdFiles(Component mpd){
    	List<Dependency> mpdFiles=new Vector<Dependency>(NIEMHelper.getModelPackageDescriptionFiles(mpd));
    	for(Dependency mpdFile:mpdFiles){
    		// check for missing relativePathName and fixup if necessary
//			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,relativePathNameTagName,"");
    		if(NIEMHelper.getMpdFileRelativePathName(mpdFile)==null){
    			// do fixup
    			Stereotype stereotype=NIEMHelper.getModelPackageDescriptionFileStereotype();
    			conditionalSetSlotValue(mpdFile,stereotype,relativePathNameTagName,"");
    		}
    	}
    	
    }
    protected static void conditionalSetSlotValue(NamedElement mpd,Stereotype mpdStereotype,String tagName,Object value){
		Slot slot=StereotypesHelper.getSlot(mpd,mpdStereotype,tagName,false);
		if(slot==null){
			boolean isSessionCreated=NIEMHelper.createSession("fixup mpdFile");
			try{
				NIEMHelper.setStereotypePropertyValue(mpd,mpdStereotype,tagName,value);
    			QvtCommonAction.log("Warning: required tag "+tagName+" = "+value+" set on <<"+mpdStereotype.getName()+">> "+mpd.getQualifiedName());
			
			}finally{
				NIEMHelper.closeSession(isSessionCreated);
			}
		}
    	
    }
    public static String message(Component classifier) {
		return getNameInvalidMessage(classifier);
    }    
/*
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixTargetNamespaceAction action = new FixTargetNamespaceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    */
    ///////////////////////////////////////////////
    
}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.change;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import gov.niem.niem.proxy.xsd.proxyxsd.proxyxsdFactory;
import gov.niem.niem.structures.niemstructures.ReferenceType;
import gov.niem.niem.structures.niemstructures.niemstructuresFactory;
import gov.niem.reference.niem.resource.model._1.niemmodel.FacetType;
import gov.niem.reference.niem.resource.model._1.niemmodel.NamespaceType;
import gov.niem.reference.niem.resource.model._1.niemmodel.TypeContainsPropertyType;
import gov.niem.reference.niem.resource.model._1.niemmodel.niemmodelFactory;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ChangeInformationType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ChangeLogEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ChangeLogType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ModifiedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ModifiedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ModifiedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ModifiedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ModifiedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.NewFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.NewNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.NewPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.NewTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.NewTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.RemovedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.RemovedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.RemovedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.RemovedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.RemovedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogFactory;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.diff.ElementAddition;
import com.nomagic.magicdraw.diff.ModificationKind;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.task.SimpleProgressStatus;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author tom
 *
 */
public class ChangelogExport implements NIEM_ProfileConstants,ChangelogConstants{
	// utility to populate changelog target artifact from PIM model changelog 
	protected Project sourceProject;
	protected Project getSourceProject(){return sourceProject;}
	protected ChangeLogType changeLogType;
	protected ChangeLogType getChangeLogType(){return changeLogType;}

	protected Project getSourceProject(Package changelogPackage,Project targetProject){
		ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		//Project targetProject=projectsManager.getActiveProject();
		ProjectDescriptor sourceProjectDescriptor=ChangelogUtility.getSourceProjectDescriptor(changelogPackage, targetProject);
		if(sourceProjectDescriptor==null){
			QvtCommonAction.log("changelog for initial mpd");
			return null;
		}
		Project sourceProject=projectsManager.findProject(sourceProjectDescriptor);
		if(sourceProject==null){
			SimpleProgressStatus status=new SimpleProgressStatus();
			projectsManager.loadProject(sourceProjectDescriptor,status);
			sourceProject=projectsManager.findProject(sourceProjectDescriptor);
			if(sourceProject==null){
				QvtCommonAction.log("ERROR: changelog Failed to load baseline project from "+changelogPackage.getURI());
				return null;
			}
		}
		return sourceProject;
		}
	public void pimToChangelog(Package pimChangelog,ChangeLogType changeLogTypeIn){
		ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		Project targetProject=projectsManager.getActiveProject();
		try{
		// each nested package is a ChangeInformation
		changeLogType=changeLogTypeIn;
		sourceProject=getSourceProject(pimChangelog,targetProject);
		if(sourceProject==null){
			//QvtCommonAction.log("Failed to load baseline project from "+pimChangelog.getURI());
			return;
		}
        //<xsd:element ref="log:ChangeInformation" minOccurs="0" maxOccurs="unbounded"/>
		for(Package pimChangeInformation:pimChangelog.getNestedPackage()){
			ChangeInformationType changeInformationType=mpdchangelogFactory.eINSTANCE.createChangeInformationType();
			changeInformationType.setId(pimChangeInformation.getID());
			changeLogType.getChangeInformation().add(changeInformationType);
			// get realizations and artifacts and for each create an appropriate Entry;  
			// populate Entry and make it link back to current changeInformationType
			  for(Dependency realization:pimChangeInformation.getClientDependency()){
					if(Realization.class.isInstance(realization)){
						entry((Realization)realization,pimChangeInformation,targetProject);
					}
			  }
			  for(PackageableElement artifact:pimChangeInformation.getPackagedElement()){
				  if(Artifact.class.isInstance(artifact)){
					  elementAddition((Artifact)artifact);
				  }
			  }
			  
		}
		}catch(Throwable t){
			t.printStackTrace();
			QvtCommonAction.log("ERROR: Changelog export failed "+t);
		}finally{
			projectsManager.setActiveProject(targetProject);
		}
	}
	  protected void entry(Realization realization,Package changeInformation,Project project){
		  for(NamedElement namedElement:realization.getSupplier()){
			// must be Package, Classifier, Property in an InformationModel
			if(!(Package.class.isInstance(namedElement)
					||Classifier.class.isInstance(namedElement)
					||Property.class.isInstance(namedElement)
					||EnumerationLiteral.class.isInstance(namedElement)
					))return;
			if(!ChangelogUtility.isInInformationModel(namedElement,project))return;
			  String name=realization.getName();
			  if(name.startsWith(NEW_ENTRY_PREFIX))NewEntry(realization,namedElement,changeInformation,project);
			  else if(name.startsWith(MODIFIED_ENTRY_PREFIX))ModifiedEntry(realization,namedElement,changeInformation,project);
			  else if(name.startsWith(STEREOTYPE_ENTRY_PREFIX))StereotypeEntry(realization,namedElement,changeInformation);
			  else if(name.startsWith(TAG_VALUE_ENTRY_PREFIX))TagValueEntry(realization,namedElement,changeInformation,project);
		}
		  
	  }
	  protected void TagValueEntry(Realization difference,NamedElement namedElement,Package changeInformation,Project project){
			  /*
                                        <xsd:element ref="log:ModifiedFacetEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewFacetEntry" minOccurs="0" maxOccurs="unbounded"/>****************
            <xsd:element ref="log:RemovedFacetEntry" minOccurs="0" maxOccurs="unbounded"/>*******************************************
			   */
	  		if(!DataType.class.isInstance(namedElement)) return;
	  	  	  	Slot slot=findFacetSlot( difference, namedElement);
	  			if(slot==null)return;
	  			String kind=ChangelogUtility.getKind(difference);
	  			if(kind==null)return;
					if(ModificationKind.ADDED.name().equals(kind)){
					      	BaseElement sourceElement = getSourceProject().getElementByID(namedElement.getID());
					      	if(sourceElement!=null){
					      		// resolve slot
					      		RemovedFacetEntry(difference,(DataType)sourceElement,changeInformation,project);
					      	}
						}else	if(ModificationKind.REMOVED.name().equals(kind)){
							if(slot!=null){
								NewFacetEntry(difference,(DataType)namedElement,changeInformation,project);
							}
						}else	if(ModificationKind.REPLACED.name().equals(kind)){
							if(slot!=null){
						      	BaseElement sourceElement = getSourceProject().getElementByID(namedElement.getID());
						      	if(sourceElement!=null){
						      		// resolve source slot
						      		ModifiedFacetEntry(difference,(DataType)namedElement,(DataType)sourceElement,changeInformation,project,getSourceProject());
						      	}
							}
						}

	}
	  protected boolean isFacetName(String name){
		  return "fractionDigits".equals(name)
				  ||"length".equals(name)
				  ||"maxExclusive".equals(name)
				  ||"maxInclusive".equals(name)
				  ||"maxLength".equals(name)
				  ||"minExclusive".equals(name)
				  ||"minInclusive".equals(name)
				  ||"minLength".equals(name)
				  ||"pattern".equals(name)
				  ||"totalDigits".equals(name)
				  ||"whiteSpace".equals(name)
				  ;
	  }
		protected Collection<Property> getAllAttributes(Classifier c){
			Set<Property> properties=new HashSet<Property>();
			properties.addAll(c.getAttribute());
			for(Classifier general:NIEMHelper.getAllParents(c))properties.addAll(general.getAttribute());
			return properties;
		}
		  /*
		protected Collection<Classifier> getAllParents(Classifier c){
			Set<Classifier> classifiers=new HashSet<Classifier>();
			for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
			return classifiers;
		}
		
		protected void addAllParents(Classifier c,Collection<Classifier> classifiers){
			classifiers.add(c);
			for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
		}
*/	  
	  protected void StereotypeEntry(Realization difference,NamedElement namedElement,Package changeInformation){
	}
	  protected void ModifiedEntry(Realization difference,NamedElement namedElement,Package changeInformation,Project project){
		  	/*
                                        <xsd:element ref="log:ModifiedPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:ModifiedTypeEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:ModifiedTypeContainsPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:ModifiedFacetEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:ModifiedNamespaceEntry" minOccurs="0" maxOccurs="unbounded"/>
		  	*/
		  Project sourceproject=getSourceProject();
	      	BaseElement sourceElement = sourceproject.getElementByID(namedElement.getID());
		  
		  	if(Package.class.isInstance(namedElement)) ModifiedNamespaceEntry(difference,(Package)namedElement,(Package)sourceElement,changeInformation,project,sourceproject);
		  	else if(Classifier.class.isInstance(namedElement)) ModifiedTypeEntry(difference,(Classifier)namedElement,(Classifier)sourceElement,changeInformation,project,sourceproject);
		  	else if(Property.class.isInstance(namedElement)&&ChangelogUtility.isPropertyHolder(((Property)namedElement).getClassifier(),project))
		  		ModifiedPropertyEntry(difference,(Property)namedElement,(Property)sourceElement,changeInformation,project,sourceproject);
		  	else if(Property.class.isInstance(namedElement))
		  		ModifiedTypeContainsPropertyEntry(difference,(Property)namedElement,(Property)sourceElement,changeInformation,project,sourceproject);
		  	else if(EnumerationLiteral.class.isInstance(namedElement))
		  		ModifiedFacetEntry(difference,(EnumerationLiteral)namedElement,(EnumerationLiteral)sourceElement,changeInformation,project,sourceproject);
		  	
	}
	  protected void NewEntry(Realization difference,NamedElement namedElement,Package changeInformation,Project project){
		  	/*
                                        <xsd:element ref="log:NewPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewTypeEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewTypeContainsPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewFacetEntry" minOccurs="0" maxOccurs="unbounded"/>****************
                                        <xsd:element ref="log:NewNamespaceEntry" minOccurs="0" maxOccurs="unbounded"/>
		  	*/
		  	if(Package.class.isInstance(namedElement)) NewNamespaceEntry(difference,(Package)namedElement,changeInformation,project);
		  	else if(Classifier.class.isInstance(namedElement)) NewTypeEntry(difference,(Classifier)namedElement,changeInformation,project);
		  	else if(Property.class.isInstance(namedElement)&&ChangelogUtility.isPropertyHolder(((Property)namedElement).getClassifier(),project))
		  		NewPropertyEntry(difference,(Property)namedElement,changeInformation,project);
		  	else if(Property.class.isInstance(namedElement))
		  		NewTypeContainsPropertyEntry(difference,(Property)namedElement,changeInformation,project);
		  	else if(EnumerationLiteral.class.isInstance(namedElement))
		  		NewFacetEntry(difference,(EnumerationLiteral)namedElement,changeInformation,project);
	}
	  protected void elementAddition(Artifact difference){
		  Package changeInformation=difference.getOwningPackage();

		//QvtCommonAction.log("ElementAddition difference "+elementAddition.getElementID()+", "+elementAddition.getModuleURI());
		  Project project=getSourceProject();
	   BaseElement elementByID = project.getElementByID(difference.getFileName());
		if(NamedElement.class.isInstance(elementByID)){
	  		NamedElement namedElement=(NamedElement)elementByID;
			// must be Package, Classifier, Property in an InformationModel
			if(!(
					Package.class.isInstance(namedElement)
					||Classifier.class.isInstance(namedElement)
					||Property.class.isInstance(namedElement)
					||EnumerationLiteral.class.isInstance(namedElement)
					))return;
			if(!ChangelogUtility.isInInformationModel(namedElement,project))return;
		  	QvtCommonAction.log("ElementAddition name "+namedElement.getQualifiedName());
		  	/*
            <xsd:element ref="log:RemovedPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
            <xsd:element ref="log:RemovedTypeEntry" minOccurs="0" maxOccurs="unbounded"/>
            <xsd:element ref="log:RemovedTypeContainsPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
            <xsd:element ref="log:RemovedFacetEntry" minOccurs="0" maxOccurs="unbounded"/>*******************************************
            <xsd:element ref="log:RemovedNamespaceEntry" minOccurs="0" maxOccurs="unbounded"/>
		  	*/
		  	if(Package.class.isInstance(namedElement)) RemovedNamespaceEntry((Package)namedElement,changeInformation,project);
		  	else if(Classifier.class.isInstance(namedElement)) RemovedTypeEntry((Classifier)namedElement,changeInformation,project);
		  	else if(Property.class.isInstance(namedElement)&&ChangelogUtility.isPropertyHolder(((Property)namedElement).getClassifier(),project))
		  			RemovedPropertyEntry((Property)namedElement,changeInformation,project);
		  	else if(Property.class.isInstance(namedElement))
		  		RemovedTypeContainsPropertyEntry((Property)namedElement,changeInformation,project);
		  	else if(EnumerationLiteral.class.isInstance(namedElement))
		  		RemovedFacetEntry(difference,(EnumerationLiteral)namedElement,changeInformation,project);
		}
	}
  	  protected void ModifiedTypeContainsPropertyEntry(Realization difference,Property namespace,Property source,Package pimChangeInformation,Project project,Project sourceproject){
  		ModifiedTypeContainsPropertyEntryType entry=mpdchangelogFactory.eINSTANCE.createModifiedTypeContainsPropertyEntryType();
		  TypeContainsPropertyType namespaceType=TypeContainsPropertyType(namespace,project);
		  TypeContainsPropertyType sourceType=TypeContainsPropertyType(source,sourceproject);
		  entry.setUpdatedTypeContainsProperty(namespaceType);
		  entry.setOriginalTypeContainsProperty(sourceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getModifiedTypeContainsPropertyEntry().add(entry);
	  }
	  protected void ModifiedPropertyEntry(Realization difference,Property namespace,Property source,Package pimChangeInformation,Project project,Project sourceproject){
		  ModifiedPropertyEntryType entry=mpdchangelogFactory.eINSTANCE.createModifiedPropertyEntryType();
		  gov.niem.reference.niem.resource.model._1.niemmodel.PropertyObjectType namespaceType=PropertyObjectType(namespace,project);
		  gov.niem.reference.niem.resource.model._1.niemmodel.PropertyObjectType sourceType=PropertyObjectType(source,sourceproject);
		  entry.setUpdatedProperty(namespaceType);
		  entry.setOriginalProperty(sourceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getModifiedPropertyEntry().add(entry);
	  }
	  protected void ModifiedTypeEntry(Realization difference,Classifier namespace,Classifier source,Package pimChangeInformation,Project project,Project sourceproject){
		  ModifiedTypeEntryType entry=mpdchangelogFactory.eINSTANCE.createModifiedTypeEntryType();
		  gov.niem.reference.niem.resource.model._1.niemmodel.TypeObjectType namespaceType=TypeObjectType(namespace,project);
		  gov.niem.reference.niem.resource.model._1.niemmodel.TypeObjectType sourceType=TypeObjectType(source,sourceproject);
		  entry.setUpdatedType(namespaceType);
		  entry.setOriginalType(sourceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getModifiedTypeEntry().add(entry);
	  }
	  protected void ModifiedNamespaceEntry(Realization difference,Package namespace,Package source,Package pimChangeInformation,Project project,Project sourceproject){
		  ModifiedNamespaceEntryType entry=mpdchangelogFactory.eINSTANCE.createModifiedNamespaceEntryType();
		  NamespaceType namespaceType=NamespaceType(namespace,project);
		  NamespaceType sourceType=NamespaceType(source,sourceproject);
		  entry.setUpdatedNamespace(namespaceType);
		  entry.setOriginalNamespace(sourceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getModifiedNamespaceEntry().add(entry);
	  }
		
	  	  protected void ModifiedFacetEntry(Realization difference,NamedElement namespace,NamedElement source,Package pimChangeInformation,Project project,Project sourceproject){
			  QvtCommonAction.log("Changelog modifiedFacet "+namespace.getQualifiedName());
		  		DataType dataType=getFacetDataType(namespace);
		  		if(dataType==null)return;
		  		String facetName=getFacetName(difference,namespace);
		  		if(facetName==null)return;
		  		String facetValue=getFacetValue(difference,namespace);
		  		
		  		DataType sourcedataType=getFacetDataType(source);
		  		if(sourcedataType==null)return;
		  		String sourcefacetName=getFacetName(difference,source);
		  		if(sourcefacetName==null)return;
		  		String sourcefacetValue=getFacetValue(difference,source);
	  		ModifiedFacetEntryType entry=mpdchangelogFactory.eINSTANCE.createModifiedFacetEntryType();
	  		FacetType namespaceType=FacetType(dataType,facetValue,facetName,project);
	  		FacetType sourceFacetType=FacetType(sourcedataType,sourcefacetValue,sourcefacetName,sourceproject);
			  entry.setUpdatedFacet(namespaceType);
			  entry.setOriginalFacet(sourceFacetType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getModifiedFacetEntry().add(entry);
			  QvtCommonAction.log("Changelog modifiedFacet "+facetName+"="+facetValue+"; "+sourcefacetName+"="+sourcefacetValue);
		  }
	  	  protected void NewFacetEntry(Realization difference,NamedElement namespace,Package pimChangeInformation,Project project){
			  QvtCommonAction.log("Changelog newFacet "+namespace.getQualifiedName());
		  		DataType dataType=getFacetDataType(namespace);
		  		if(dataType==null)return;
		  		String facetName=getFacetName(difference,namespace);
		  		if(facetName==null)return;
		  		String facetValue=getFacetValue(difference,namespace);
	  		NewFacetEntryType entry=mpdchangelogFactory.eINSTANCE.createNewFacetEntryType();
	  		String value=ChangelogUtility.getValue(difference);
	  		FacetType namespaceType=FacetType(dataType,facetValue,facetName,project);
			  entry.setNewFacet(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getNewFacetEntry().add(entry);
			  QvtCommonAction.log("Changelog newFacet "+facetName+"="+facetValue);
		  }
	  	  protected void RemovedFacetEntry(Realization difference,NamedElement namespace,Package pimChangeInformation,Project project){
		  		DataType dataType=getFacetDataType(namespace);
		  		if(dataType==null)return;
		  		String facetName=getFacetName(difference,namespace);
		  		if(facetName==null)return;
		  		String facetValue=getFacetValue(difference,namespace);
	  		RemovedFacetEntryType entry=mpdchangelogFactory.eINSTANCE.createRemovedFacetEntryType();
	  		FacetType namespaceType=FacetType(dataType,facetValue,facetName,project);
			  entry.setRemovedFacet(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getRemovedFacetEntry().add(entry);
		  }
	  	  protected void RemovedFacetEntry(Artifact difference,EnumerationLiteral namespace,Package pimChangeInformation,Project project){
		  		DataType dataType=namespace.getEnumeration();
		  		if(dataType==null)return;
		  		String facetName="EnumerationLiteral";
		  		String facetValue=namespace.getName();
	  		RemovedFacetEntryType entry=mpdchangelogFactory.eINSTANCE.createRemovedFacetEntryType();
	  		FacetType namespaceType=FacetType(dataType,facetValue,facetName,project);
			  entry.setRemovedFacet(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getRemovedFacetEntry().add(entry);
		  }
	  	  protected String getFacetValue(Realization difference,NamedElement namespace){
	  		  String facetValue="";
	  		if(EnumerationLiteral.class.isInstance(namespace)){
	  			facetValue=((EnumerationLiteral)namespace).getName();
	  		}else if(DataType.class.isInstance(namespace)){
	  			Slot slot=findFacetSlot(difference,namespace);
	  			if(slot==null)return "";
	  			for(ValueSpecification valueSpecification:slot.getValue()){
	  				if(LiteralString.class.isInstance(valueSpecification)){
	  					facetValue+=((LiteralString)valueSpecification).getValue();
	  				}
	  				else if(LiteralInteger.class.isInstance(valueSpecification)){
	  					facetValue+=((LiteralInteger)valueSpecification).getValue();
	  				}
	  				else if(LiteralUnlimitedNatural.class.isInstance(valueSpecification)){
	  					facetValue+=((LiteralUnlimitedNatural)valueSpecification).getValue();
	  				}
	  			}
	  		}
	  		return facetValue;
		  }
	  	  protected Slot findFacetSlot(Realization difference,NamedElement namedElement){
	  			String TVPropertyID=ChangelogUtility.getTVPropertyID(difference);
	  			if(TVPropertyID==null)return null;
	  			String kind=ChangelogUtility.getKind(difference);
	  			if(kind==null)return null;
	  			InstanceSpecification instanceSpecification=namedElement.getAppliedStereotypeInstance();
	  			for(Classifier classifier:instanceSpecification.getClassifier()){
	  				if(!Stereotype.class.isInstance(classifier))continue;
	  				for(Property property:getAllAttributes(classifier)){
	  					if(TVPropertyID.equals(property.getID())){
	  						// is this a facet property?
	  						if(isFacetName(property.getName())){
								for(Slot slotTest:instanceSpecification.getSlot()){
									if(property.equals(slotTest.getDefiningFeature())){
										return slotTest;
									}
								}
	  						}
	  					}
	  				}
	  			}
	  			return null;
	  	  }
	  	  protected String getFacetName(Realization difference,NamedElement namespace){
	  		  String facetName=null;
	  		if(EnumerationLiteral.class.isInstance(namespace)){
	  			facetName="EnumerationLiteral";
	  		}else if(DataType.class.isInstance(namespace)){
	  			Slot slot=findFacetSlot(difference,namespace);
	  			if(slot==null)return null;
	  			StructuralFeature structuralFeature=slot.getDefiningFeature();
	  			if(structuralFeature==null)return null;
	  			facetName=structuralFeature.getName();
	  		}
	  		return facetName;
		  }
	  	  protected DataType getFacetDataType(NamedElement namespace){
	  		DataType dataType=null;
	  		if(EnumerationLiteral.class.isInstance(namespace)){
	  			dataType=((EnumerationLiteral)namespace).getEnumeration();
	  		}else if(DataType.class.isInstance(namespace)){
	  			dataType=(DataType)namespace;
	  		}
	  		return dataType;
		  }
	  
	  	  protected void NewTypeContainsPropertyEntry(Realization difference,Property namespace,Package pimChangeInformation,Project project){
	  		NewTypeContainsPropertyEntryType entry=mpdchangelogFactory.eINSTANCE.createNewTypeContainsPropertyEntryType();
			  TypeContainsPropertyType namespaceType=TypeContainsPropertyType(namespace,project);
			  entry.setNewTypeContainsProperty(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getNewTypeContainsPropertyEntry().add(entry);
		  }
		  protected void NewPropertyEntry(Realization difference,Property namespace,Package pimChangeInformation,Project project){
			  NewPropertyEntryType entry=mpdchangelogFactory.eINSTANCE.createNewPropertyEntryType();
			  gov.niem.reference.niem.resource.model._1.niemmodel.PropertyObjectType namespaceType=PropertyObjectType(namespace,project);
			  entry.setNewProperty(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getNewPropertyEntry().add(entry);
		  }
		  protected void NewTypeEntry(Realization difference,Classifier namespace,Package pimChangeInformation,Project project){
			  NewTypeEntryType entry=mpdchangelogFactory.eINSTANCE.createNewTypeEntryType();
			  gov.niem.reference.niem.resource.model._1.niemmodel.TypeObjectType namespaceType=TypeObjectType(namespace,project);
			  entry.setNewType(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getNewTypeEntry().add(entry);
		  }
		  protected void NewNamespaceEntry(Realization difference,Package namespace,Package pimChangeInformation,Project project){
			  NewNamespaceEntryType entry=mpdchangelogFactory.eINSTANCE.createNewNamespaceEntryType();
			  NamespaceType namespaceType=NamespaceType(namespace,project);
			  entry.setNewNamespace(namespaceType);
			  setReference(entry,pimChangeInformation);
			  getChangeLogType().getNewNamespaceEntry().add(entry);
		  }
	  
	  
	  protected void RemovedTypeContainsPropertyEntry(Property namespace,Package pimChangeInformation,Project project){
		  RemovedTypeContainsPropertyEntryType entry=mpdchangelogFactory.eINSTANCE.createRemovedTypeContainsPropertyEntryType();
		  TypeContainsPropertyType namespaceType=TypeContainsPropertyType(namespace,project);
		  entry.setRemovedTypeContainsProperty(namespaceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getRemovedTypeContainsPropertyEntry().add(entry);
	  }
	  protected void RemovedPropertyEntry(Property namespace,Package pimChangeInformation,Project project){
		  RemovedPropertyEntryType entry=mpdchangelogFactory.eINSTANCE.createRemovedPropertyEntryType();
		  gov.niem.reference.niem.resource.model._1.niemmodel.PropertyObjectType namespaceType=PropertyObjectType(namespace,project);
		  entry.setRemovedProperty(namespaceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getRemovedPropertyEntry().add(entry);
	  }
	  protected void RemovedTypeEntry(Classifier namespace,Package pimChangeInformation,Project project){
		  RemovedTypeEntryType entry=mpdchangelogFactory.eINSTANCE.createRemovedTypeEntryType();
		  gov.niem.reference.niem.resource.model._1.niemmodel.TypeObjectType namespaceType=TypeObjectType(namespace,project);
		  entry.setRemovedType(namespaceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getRemovedTypeEntry().add(entry);
	  }
	  protected void RemovedNamespaceEntry(Package namespace,Package pimChangeInformation,Project project){
		  RemovedNamespaceEntryType entry=mpdchangelogFactory.eINSTANCE.createRemovedNamespaceEntryType();
		  NamespaceType namespaceType=NamespaceType(namespace,project);
		  entry.setRemovedNamespace(namespaceType);
		  setReference(entry,pimChangeInformation);
		  getChangeLogType().getRemovedNamespaceEntry().add(entry);
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.TypeObjectType TypeObjectType(Classifier namespace,Project project){
		  gov.niem.reference.niem.resource.model._1.niemmodel.TypeObjectType entry=niemmodelFactory.eINSTANCE.createTypeObjectType();
		  /*
		   *                                         <xsd:element ref="model:TypeQualifiedName"/>
                                        <xsd:element ref="model:TypeName" minOccurs="0"/>
                                        <xsd:element ref="model:TypeNamespace" minOccurs="0"/>
                                        <xsd:element ref="model:TypeDefinitionText" minOccurs="0"/>
                                        <xsd:element ref="model:TypeBaseTypeQualifiedName" minOccurs="0"/>
                                        <xsd:element ref="model:TypeContentStyleCode" minOccurs="0"/>
                                        <xsd:element ref="model:TypeSimpleStyleCode" minOccurs="0"/>
                                        <xsd:element ref="model:TypeAssociationIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:TypeAugmentationIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:TypeAdapterIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:TypeMetadataIndicator" minOccurs="0"/>

		   */
		  Package informationModel=ChangelogUtility.getNearestInformationModel(namespace,project);
		  entry.setTypeQualifiedName(QName(namespace,project));
		  entry.setTypeName(ProxyString(namespace.getName()));
		  entry.setTypeNamespace(NamespaceType(informationModel,project));
		  entry.setTypeDefinitionText(ProxyString(getCommentBody(namespace)));
		  Classifier baseClassifier=ChangelogUtility.getBaseClassifier(namespace,project);
		  if(baseClassifier!=null){
			  entry.setTypeBaseTypeQualifiedName(QName(baseClassifier,project));
		  }
		  entry.setTypeContentStyleCode(TypeContentStyleCodeType(namespace,project));
		  entry.setTypeSimpleStyleCode(TypeSimpleStyleCodeType(namespace,project));
		  entry.setTypeAssociationIndicator(ProxyBoolean(ChangelogUtility.isAssociationType(namespace,project)));
		  entry.setTypeAugmentationIndicator(ProxyBoolean(ChangelogUtility.isAugmentationType(namespace,project)));
		  entry.setTypeAdapterIndicator(ProxyBoolean(ChangelogUtility.isAdapterType(namespace,project)));
		  entry.setTypeMetadataIndicator(ProxyBoolean(ChangelogUtility.isMetadataType(namespace,project)));
		  return entry;
	  }
	   protected String getCommentBody(Element element){
		   for(Comment comment:element.getOwnedComment()){
			   return comment.getBody();
		   }
		   return "";
	   }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.PropertyObjectType PropertyObjectType(Property namespace,Project project){
		  /*
                                        <xsd:element ref="model:PropertyQualifiedName"/>
                                        <xsd:element ref="model:PropertyName" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyNamespace" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyDefinitionText" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyDataTypeQualifiedName" minOccurs="0"/>
                                        <xsd:element ref="model:PropertySubstitutionGroupHeadQualifiedName" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyElementIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyAbstractIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyInlineIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyReferenceIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyAugmentationOfTypeQualifiedName" minOccurs="0"/>
		   */
		  gov.niem.reference.niem.resource.model._1.niemmodel.PropertyObjectType entry=niemmodelFactory.eINSTANCE.createPropertyObjectType();
		  Package informationModel=ChangelogUtility.getNearestInformationModel(namespace,project);
		  entry.setPropertyQualifiedName(QName(namespace,project));
		  entry.setPropertyName(ProxyString(namespace.getName()));
		  entry.setPropertyNamespace(NamespaceType(informationModel,project));
		  entry.setPropertyDefinitionText(ProxyString(getCommentBody(namespace)));
		  Type type=namespace.getType();
		  if(type!=null){
			  entry.setPropertyDataTypeQualifiedName(QName(type,project));
		  }
		  for(Property subsetted:namespace.getSubsettedProperty()){
			  entry.setPropertySubstitutionGroupHeadQualifiedName(QName(subsetted,project));
			  break;
		  }
		  entry.setPropertyElementIndicator(ProxyBoolean(ChangelogUtility.isXSDElement(namespace,project)));
		  entry.setPropertyAbstractIndicator(ProxyBoolean(ChangelogUtility.isAbstractElement(namespace,project)));
		  //TODO entry.setPropertyInlineIndicator(NamespaceType(informationModel));
		  entry.setPropertyReferenceIndicator(ProxyBoolean(NIEMHelper.isReferenceProperty(namespace)));
		  boolean found=false;
			 for(Usage augmentationApplication:ChangelogUtility.getAugmentationApplications(namespace,project)){
				 for(NamedElement test:augmentationApplication.getSupplier()){
					 if(!Class.class.isInstance(test))continue;
					  entry.setPropertyAugmentationOfTypeQualifiedName(QName(test,project));
					  found=true;
					  break;
				 }
				 if(found)break;
			 }
		  
		  return entry;
	  }
	  protected TypeContainsPropertyType TypeContainsPropertyType(Property namespace,Project project){
		  /*
		   *                                         <xsd:element ref="model:TypeQualifiedName"/>
                                        <xsd:element ref="model:PropertyQualifiedName"/>
                                        <xsd:element ref="model:PropertyMinOccursText" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyMaxOccursText" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyInlineIndicator" minOccurs="0"/>
                                        <xsd:element ref="model:PropertyReferenceIndicator" minOccurs="0"/>

		   */
		  TypeContainsPropertyType entry=niemmodelFactory.eINSTANCE.createTypeContainsPropertyType();
		  Type type=namespace.getType();
		  if(type!=null){
			  entry.setTypeQualifiedName(QName(type,project));
		  }
		  entry.setPropertyQualifiedName(QName(namespace,project));
		  entry.setPropertyMinOccursText(ProxyString(new Integer(namespace.getLower()).toString()));
		  entry.setPropertyMaxOccursText(ProxyString(new Integer(namespace.getUpper()).toString()));
		  //TODO entry.setPropertyInlineIndicator(NamespaceType(informationModel));
		  entry.setPropertyReferenceIndicator(ProxyBoolean(NIEMHelper.isReferenceProperty(namespace)));
		  return entry;
	  }
	  protected FacetType FacetType(DataType namespace,String facetValue,String facetName,Project project){
		  /*
		   *                                         <xsd:element ref="model:TypeQualifiedName"/>
                                        <xsd:element ref="model:FacetCategoryCode"/>
                                        <xsd:element ref="model:FacetText"/>
                                        <xsd:element ref="model:FacetDefinitionText" minOccurs="0"/>

		   */
		  FacetType entry=niemmodelFactory.eINSTANCE.createFacetType();
		  entry.setTypeQualifiedName(QName(namespace,project));
		  entry.setFacetCategoryCode(FacetCategoryCodeType(facetName));
		  entry.setFacetText(ProxyString(facetValue));
		  //TODOentry.setFacetDefinitionText(NamespaceType(informationModel));
		  return entry;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeType FacetCategoryCodeType(String facetName){
		  gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeType result=niemmodelFactory.eINSTANCE.createFacetCategoryCodeType();
		  result.setValue(FacetCategoryCodeSimpleType(facetName));
		  return result;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeSimpleType FacetCategoryCodeSimpleType(String facetName){
		  /*
                        <xsd:enumeration value="enumeration"/>
                        <xsd:enumeration value="pattern"/>
                        <xsd:enumeration value="minInclusive"/>
                        <xsd:enumeration value="maxInclusive"/>
                        <xsd:enumeration value="maxExclusive"/>

		   */ 
		  if("pattern".equals(facetName)) return gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeSimpleType.PATTERN;
		  else if("minInclusive".equals(facetName)) return gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeSimpleType.MIN_INCLUSIVE;
		  else if("maxInclusive".equals(facetName)) return gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeSimpleType.MAX_INCLUSIVE;
		  else if("maxExclusive".equals(facetName)) return gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeSimpleType.MAX_EXCLUSIVE;
		  return gov.niem.reference.niem.resource.model._1.niemmodel.FacetCategoryCodeSimpleType.ENUMERATION;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.TypeSimpleStyleCodeType TypeSimpleStyleCodeType(Classifier classifier,Project project){
		  gov.niem.reference.niem.resource.model._1.niemmodel.TypeSimpleStyleCodeType result=niemmodelFactory.eINSTANCE.createTypeSimpleStyleCodeType();
		  result.setValue(TypeSimpleStyleCodeSimpleType(classifier,project));
		  return result;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.TypeSimpleStyleCodeSimpleType TypeSimpleStyleCodeSimpleType(Classifier classifier,Project project){
		  /*
                        <xsd:enumeration value="atomic"/>
                        <xsd:enumeration value="list"/>

		   */
		  if(ChangelogUtility.isList(classifier,project)){
			  return gov.niem.reference.niem.resource.model._1.niemmodel.TypeSimpleStyleCodeSimpleType.LIST;
		  }
		  return gov.niem.reference.niem.resource.model._1.niemmodel.TypeSimpleStyleCodeSimpleType.ATOMIC;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.TypeContentStyleCodeType TypeContentStyleCodeType(Classifier classifier,Project project){
		  gov.niem.reference.niem.resource.model._1.niemmodel.TypeContentStyleCodeType result=niemmodelFactory.eINSTANCE.createTypeContentStyleCodeType();
		  result.setValue(TypeContentStyleCodeSimpleType(classifier,project));
		  return result;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.TypeContentStyleCodeSimpleType TypeContentStyleCodeSimpleType(Classifier classifier,Project project){
		  /*
		   *                         <xsd:enumeration value="CCC"/>
                        <xsd:enumeration value="CSC"/>
                        <xsd:enumeration value="S"/>

		   */
		  if(DataType.class.isInstance(classifier)&&ChangelogUtility.isDataTypeSimpleType((DataType)classifier,project)){
			  return gov.niem.reference.niem.resource.model._1.niemmodel.TypeContentStyleCodeSimpleType.S;
		  }
		  if(DataType.class.isInstance(classifier)||!ChangelogUtility.isComplexType(classifier,project)){
			  return gov.niem.reference.niem.resource.model._1.niemmodel.TypeContentStyleCodeSimpleType.CSC;
		  }
		  return gov.niem.reference.niem.resource.model._1.niemmodel.TypeContentStyleCodeSimpleType.CCC;
	  }
	  protected gov.niem.reference.niem.resource.model._1.niemmodel.QName QName(NamedElement namedElement,Project project){
		  gov.niem.reference.niem.resource.model._1.niemmodel.QName result=niemmodelFactory.eINSTANCE.createQName();
		  Package informationModel=ChangelogUtility.getNearestInformationModel(namedElement,project);
		  String prefix=ChangelogUtility.getNamespaceDefaultPrefix(informationModel,project);
		  if(prefix==null){
			  prefix="{"+ChangelogUtility.getNamespaceTargetNamespace(informationModel, project)+"}";
		  }
		  result.setValue(prefix+":"+namedElement.getName());
		  return result;
	  }
	  protected NamespaceType NamespaceType(Package namespace,Project project){
		  NamespaceType entry=niemmodelFactory.eINSTANCE.createNamespaceType();
		  // can not get correct profile if this is not current project.........
		  entry.setNamespaceURI(ProxyString(ChangelogUtility.getNamespaceTargetNamespace(namespace,project)));
		  entry.setNamespacePrefixText(ProxyString(ChangelogUtility.getNamespaceDefaultPrefix(namespace,project)));
		  entry.setNamespaceVersionText(ProxyString(ChangelogUtility.getNamespaceVersion(namespace,project)));
		  return entry;
	  }
	  
	  protected gov.niem.niem.proxy.xsd.proxyxsd.String ProxyString(String value){
		  gov.niem.niem.proxy.xsd.proxyxsd.String result=proxyxsdFactory.eINSTANCE.createString();
		  result.setValue(value);
		  return result;
	  }
	  protected gov.niem.niem.proxy.xsd.proxyxsd.Boolean ProxyBoolean(Boolean value){
		  gov.niem.niem.proxy.xsd.proxyxsd.Boolean result=proxyxsdFactory.eINSTANCE.createBoolean();
		  result.setValue(value);
		  return result;
	  }
	  protected void setReference(ChangeLogEntryType entry,Package pimChangeInformation){
		  ReferenceType referenceType=niemstructuresFactory.eINSTANCE.createReferenceType();
		  referenceType.setRef(pimChangeInformation.getID());
		Blackbox.add(entry,"changeInformationAbstractGroup","changeInformationReference",referenceType,null);
	  }
	
}

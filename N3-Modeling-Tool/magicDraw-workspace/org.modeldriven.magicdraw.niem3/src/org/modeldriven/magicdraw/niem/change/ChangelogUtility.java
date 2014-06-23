/**
 * 
 */
package org.modeldriven.magicdraw.niem.change;

import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ChangeLogType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogFactory;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.util.mpdchangelogResourceFactoryImpl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author tom
 *
 */
public class ChangelogUtility implements NIEM_ProfileConstants,ChangelogConstants{
	public static String getMappingValue(Realization realization,String language){
		OpaqueExpression opaqueExpression=realization.getMapping();
		if(opaqueExpression==null)return null;
		List<String> languages=opaqueExpression.getLanguage();
		List<String> bodies=opaqueExpression.getBody();
		for(int i=0;i<languages.size();i++){
			String languageTest=languages.get(i);
			if(language.equals(languageTest)){
				if(i<bodies.size()){
					return bodies.get(i);
				}
			}
		}
		return null;
	}
	public static String getTVPropertyID(Realization realization){
		return getMappingValue(realization,"TVPropertyID");
	}
	public static String getValue(Realization realization){
		return getMappingValue(realization,"value");
	}
	public static String getKind(Realization realization){
		return getMappingValue(realization,"kind");
	}
	public static String getOrder(Realization realization){
		return getMappingValue(realization,"order");
	}
	public static String getIndex(Realization realization){
		return getMappingValue(realization,"index");
	}
	public static String getChangedPropertyName(Realization realization){
		return getMappingValue(realization,"changedPropertyName");
	}
	public static ProjectDescriptor getSourceProjectDescriptor(Package changelogPackage,Project targetProject){
		
		String relativeURIString=changelogPackage.getURI();
		if((relativeURIString==null)||(relativeURIString.length()==0))return null;
		URI relativeURI=null;
		try {
			relativeURI = new URI(relativeURIString);
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
		URI sourceURI=null;
		if(relativeURI.isAbsolute()){
			sourceURI=relativeURI;
		}else{
	    	File targetFile=targetProject.getFile().getAbsoluteFile();
	    	URI targetURI=targetFile.toURI();
	    	sourceURI=targetURI.resolve(relativeURI);
		}
    	ProjectDescriptor sourceProjectDescriptor=ProjectDescriptorsFactory.createProjectDescriptor(sourceURI);
    	return sourceProjectDescriptor;
	}
	
	static public String getNamespaceTargetNamespace(Package element,Project project){
		return (String)NIEMHelper.getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName,project),targetNamespaceTagName);
	}
	static public String getNamespaceDefaultPrefix(Package element,Project project){
		return (String)NIEMHelper.getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName,project),defaultPrefixTagName);
	}
	static public String getNamespaceVersion(Package element,Project project){
		return (String)NIEMHelper.getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName,project),versionTagName);
	}
	static public Stereotype getCommonStereotype(String stereotypeName,Project project){
		Profile profile=getCommonProfile(project);
		if(profile==null)return null;
		return StereotypesHelper.getStereotype(project,stereotypeName,profile); 
	}
	static public Profile getCommonProfile(Project project){
		return getProfile(CommonProfileName,project); 
	}
	static public  Profile getProfile(String profileName,Project project){
		try{
		return StereotypesHelper.getProfile(project,profileName);
		}catch(NullPointerException e){// magicdraw bug on open project?
			return null;
		}
	}
	static public boolean isInInformationModel(Element clientElement,Project project){
		Package specificModel=getNearestInformationModel(clientElement,project);
		return(
				(specificModel!=null)
				&&	isInformationModel(specificModel,project)
		);
		
	}
	static public boolean isInformationModel(Package element,Project project){
		return NIEMHelper.hasStereotype(element,getPimStereotype(InformationModelStereotypeName,project));
	}
	static public Stereotype getPimStereotype(String stereotypeName,Project project){
		Profile profile=getPimProfile(project);
		if(profile==null)return null;
		return StereotypesHelper.getStereotype(project,stereotypeName,profile); 
	}
	static public Profile getPimProfile(Project project){
		return getProfile(PimProfileName,project); 
	}

	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getNearestInformationModel(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element,Project project){
		if(element==null){
			QvtCommonAction.log("ERROR: getNearestInformationModel null element");
			return null;
		}
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)
				&&isInformationModel((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element,project))
			return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element;
		Element owner=element.getOwner();
		if(owner==null)return null;// may occur before there is any owner
		return getNearestInformationModel(owner,project);
	}
	static public boolean isPropertyHolder(Element element,Project project){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,getCommonStereotype(PropertyHolderStereotypeName,project));
	}
	static public Classifier getBaseClassifier(Classifier object,Project project)
    {
		Classifier baseClassifier=null;
    	DirectedRelationship dr=getBaseTypeRelation(object,project);
    	if(dr!=null){
			for(Element supplier:dr.getTarget()){
				if(Classifier.class.isInstance(supplier)){
					baseClassifier=(Classifier)supplier;
					break;
				}
			}
    		
    	}
    	return baseClassifier;
    }

static   public DirectedRelationship getBaseTypeRelation(Classifier clientClassifier,Project project)
  {
	 DirectedRelationship result=null;
  		for(Generalization generalization:clientClassifier.getGeneralization()){
  			if(isRolePlayedBy(generalization,project))continue;
  			if(isAugments(generalization,project))continue;
  			Classifier general=generalization.getGeneral();
  			if(isAugmentationType(general,project)&&!isAugmentationType(clientClassifier,project))continue;
  			result=generalization;
  			break;
  		}
  		if(result==null){
  			for(Dependency dependency:clientClassifier.getClientDependency()){
  				if(isRestriction(dependency,project)
  						||NIEMHelper.hasStereotype(dependency,getPsmStereotype(XSDSimpleContentStereotypeName,project))
  						){
  					for(NamedElement supplier:dependency.getSupplier()){
  						if(Classifier.class.isInstance(supplier)){
  							result=dependency;
  							break;
  						}
  					}
  				}
  				if(result!=null)break;
  			}
  		}
  	return result;
  }
static public boolean isRestriction(Element element,Project project){
	return NIEMHelper.hasStereotype(element,getCommonStereotype(RestrictionStereotypeName,project));
}

static public boolean isAugmentationType(Classifier classifier,Project project){
	if(classifier==null)return false;
	if(NIEMHelper.hasStereotype(classifier, getCommonStereotype(AugmentationTypeStereotypeName,project)))return true;
	for(Generalization generalization:classifier.getGeneralization()){
		if(isAugments(generalization,project))return true;
	}
	return false;
}
static public boolean isAugments(Generalization generalization,Project project){
	return(NIEMHelper.hasStereotype(generalization, getPimStereotype(AugmentsStereotypeName,project)));
}
static public boolean isRolePlayedBy(Element generalization,Project project){
	return(NIEMHelper.hasStereotype(generalization, getPimStereotype(RolePlayedByStereotypeName,project)));
}
static public boolean isAdapterType(Classifier classifier,Project project){
	return(NIEMHelper.hasStereotype(classifier, getCommonStereotype(AdapterTypeStereotypeName,project)));
}
static public boolean isMetadataType(Type classifier,Project project){
	//if(!isInInformationModel(classifier))return false;
	if(NIEMHelper.hasStereotype(classifier, getCommonStereotype(MetadataTypeStereotypeName,project)))return true;
	return false;
}
static public boolean isAbstractElement(Property property,Project project){
	return isXSDElement(property,project)&&(property.getType()==null);
}
static public boolean isXSDElement(Property property,Project project){
	Stereotype stereotype=getPsmStereotype(XSDPropertyStereotypeName,project);
	if(NIEMHelper.hasStereotype(property,stereotype)){
		return "element".equals(getXSDPropertyKind(property,project).getName());
	}else{
		return NIEMHelper.startsWithUpperCase(property.getName());
	}
}
static public EnumerationLiteral getXSDPropertyKind(Property element,Project project){
	return (EnumerationLiteral)NIEMHelper.getStereotypePropertyFirst(element,getPsmStereotype(XSDPropertyStereotypeName,project),"kind");
}

static public List<Usage> getAugmentationApplications(Property type,Project project){
	 List<Usage> result=new Vector<Usage>();
	 for(Dependency dependency:type.getClientDependency()){
		 if(Usage.class.isInstance(dependency)){
			 Stereotype stereotype=getCommonStereotype(AugmentationApplicationStereotypeName,project);
			 if(NIEMHelper.hasStereotype(dependency, stereotype)){
				 result.add((Usage)dependency);
			 }
		 }
	 }
	 return result;
}
static public boolean isList(Element element,Project project){
	return NIEMHelper.hasStereotype(element,getCommonStereotype(ListStereotypeName,project));
}
static public Classifier getBaseExtensionClassifier(Classifier object,Project project)
{
	Classifier baseClassifier=null;
	DirectedRelationship dr=getBaseTypeRelation(object,project);
	if((dr!=null)&&(!isRestriction(dr,project))){
		for(Element supplier:dr.getTarget()){
			if(Classifier.class.isInstance(supplier)){
				baseClassifier=(Classifier)supplier;
				break;
			}
		}
		
	}
	return baseClassifier;
}

static public boolean isDataTypeSimpleType(DataType dataType,Project project){
	if(dataType==null)return false;
	Classifier base=getBaseExtensionClassifier(dataType,project);
	return
			((
			isValueRestriction(dataType,project)
			||isXSDRepresentationRestriction(dataType,project)
			)
			&&(base!=null)
			&&DataType.class.isInstance(base)
			&&(isDataTypeSimpleType((DataType)base,project))
			)
	
//	return isValueRestriction(dataType,project)
	||NIEMHelper.hasStereotype(dataType,getCommonStereotype(ListStereotypeName,project))
	||isUnion(dataType,project)
//	||isXSDRepresentationRestriction(dataType,project)
	||NIEMHelper.isXMLPrimitiveTypesLibrary(NIEMHelper.getNearestPackage(dataType))
	;
}
static public boolean isValueRestriction(Element dataType,Project project){
	return NIEMHelper.hasStereotype(dataType,getCommonStereotype(ValueRestrictionStereotypeName,project));
}

static public boolean isUnion(Element element,Project project){
	return NIEMHelper.hasStereotype(element,getCommonStereotype(UnionStereotypeName,project));
}

static public boolean isXSDRepresentationRestriction(Element dataType,Project project){
	return NIEMHelper.hasStereotype(dataType,getPsmStereotype(XSDRepresentationRestrictionStereotypeName,project));
}
static public Stereotype getPsmStereotype(String stereotypeName,Project project){
	Profile profile=getPsmProfile(project);
	if(profile==null)return null;
	return StereotypesHelper.getStereotype(project,stereotypeName,profile); 
}
static public Profile getPsmProfile(Project project){
	return getProfile(PsmProfileName,project); 
}

static public boolean isComplexType(Classifier element,Project project){
	if(NIEMHelper.hasStereotype(element,getCommonStereotype(ChoiceStereotypeName,project)))return false;
	if(NIEMHelper.hasStereotype(element,getCommonStereotype(PropertyHolderStereotypeName,project)))return false;
	if(Class.class.isInstance(element))return true;
	else if(Enumeration.class.isInstance(element)){
		return NIEMHelper.isEnumerationComplexType((Enumeration)element);
	}
	else if(DataType.class.isInstance(element)){
		return !isDataTypeSimpleType((DataType)element,project);
	}
	else return false;
}
static public Stereotype getMpdStereotype(String stereotypeName,Project project){
	Profile profile=getMpdProfile(project);
	if(profile==null)return null;
	return StereotypesHelper.getStereotype(project,stereotypeName,profile); 
}
static public  Profile getMpdProfile(Project project){
	return getProfile(MpdProfileName,project); 
}




static public boolean isAssociationType(Type classifier,Project project){
	//if(!isInInformationModel(classifier))return false;
	if(com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass.class.isInstance(classifier))return true;
	if(NIEMHelper.hasStereotype(classifier, getCommonStereotype(AssociationTypeStereotypeName,project)))return true;
	return false;
}
public static void createChangelog(Package changelog,ChangeLogType changeLogTypeIn){
	ChangelogExport changelogExport=new ChangelogExport();
	changelogExport.pimToChangelog(changelog,changeLogTypeIn);
}
	/*
	public static void testCreateChangelog(Package changelog){
		ChangelogExport changelogExport=new ChangelogExport();
    	File rootFile=getTargetDirectory();
		Map options=new HashMap();
		mpdchangelogResourceFactoryImpl mpdclResourceFactory=new mpdchangelogResourceFactoryImpl();
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mpdcl", mpdclResourceFactory);

    	ResourceSet resourceSet = new ResourceSetImpl();
    	org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
    	Resource changeLogResource=resourceSet.createResource(rootURI.appendSegment("changelog.mpdcl"));
		ChangeLogType changeLogTypeIn=mpdchangelogFactory.eINSTANCE.createChangeLogType();
		changeLogResource.getContents().add(changeLogTypeIn);
		changelogExport.pimToChangelog(changelog,changeLogTypeIn);
    	try {
			changeLogResource.save(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static File getTargetDirectory(){
		Application application=Application.getInstance();
		Project project=application.getProject();
		File parentRootFile=new File(project.getFileName()).getParentFile();
		return parentRootFile;
	}
*/
}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.m2t.MasterDocument;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ClassDiagramLayouterOptionsGroup;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.properties.BooleanProperty;
import com.nomagic.magicdraw.properties.ChoiceProperty;
import com.nomagic.magicdraw.properties.ColorProperty;
import com.nomagic.magicdraw.properties.Property;
import com.nomagic.magicdraw.properties.PropertyID;
import com.nomagic.magicdraw.properties.PropertyManager;
import com.nomagic.magicdraw.properties.StringProperty;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.DisplayRelatedSymbols;
import com.nomagic.magicdraw.uml.symbols.DisplayRelatedSymbolsInfo;
import com.nomagic.magicdraw.uml.symbols.LinkType;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.layout.ClassDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.rcpf.product.utils.Utilities;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

// TODO:  change profiles and re-document
// TODO:  double check if most recent in profile
// TODO:  change transforms - QVT and m2t
// TODO:  apply results to all, starting with niem reference
// TODO:  verify result
// TODO:  the nci examples?

/**
 * @author Tom
 *
 */
public class Psm2PimAction extends QvtCommonAction
{
	public Psm2PimAction(String id, String name)
	{
	super(id, name);
	}
	/**
	* Entered when button pushed.
	 * @throws IOException 
	*/
	public void performTransform(ProgressStatus progressStatus) throws IOException
	{
		performPSM2PIMTransform(progressStatus);
	}
	protected void psm2pimComplete(){
    	//javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" complete");
		
	}
	protected boolean isNiemReferenceModel(){
	    Application application=Application.getInstance();
	    ProjectsManager projectsManager=application.getProjectsManager();
		String fileName=projectsManager.getActiveProject().getFileName();
		return fileName.endsWith(NIEM_REF_PSM_FILENAME);
	}
	protected void performPSM2PIMTransform(ProgressStatus progressStatus) throws IOException
	{
	    MDLog log=new MDLog(progressStatus);
		progressStatus.setDescription("starting");
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    try {
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    registerPackages(log,qvtEngine);
		    
		    Application application=Application.getInstance();
		    Model root = getCurrentModelRoot();
		    if(root==null)return;
		    ProjectsManager projectsManager=application.getProjectsManager();
		    //String fileName=projectsManager.getActiveProject().getFileName();
		    boolean isReferencePSM=isNiemReferenceModel();//fileName.endsWith(NIEM_REF_PSM_FILENAME);
//isReferencePSM=true;// TODO: remove this test	
		    Set inputModelList = new HashSet();
		    inputModelList.add(root);
		    qvtEngine.put("uml", inputModelList);
		    //
	        // create a new project and add objects to it
		    log.log("creating target PIM project");
	        Project pimProject=projectsManager.createProject();
	        //useCommonIndexing(pimProject);
	        //pimProject.getOptions().addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,createNewSymbols);
	        
	        /*
	    	if(firstTime){
	    		firstTime=false;
	    		ProjectOptions projectOptions=pimProject.getOptions();
	    		for(String manager:projectOptions.VISIBLE_MANAGERS ){
	    			PropertyManager propertyManager=projectOptions.getManager(manager);
	    			log("PropertyManager "+manager+" = "+propertyManager);
	    			if(propertyManager!=null){
	    	    		for(Property choiceProperty:propertyManager.getProperties()){
	    	    			try{
	    	    			log("Property "+choiceProperty.getID()+", "+choiceProperty.getName()+", "+choiceProperty.getValue()+", "+choiceProperty.getValueStringRepresentation()+", "+choiceProperty.getAdditionalProperties());
	    	    			}catch(Throwable ignore){
	    	    				
	    	    			}
	    	    		}
	    			}
	    		}
	    		{
    			PropertyManager propertyManager=projectOptions.getManager(projectOptions.PROJECT_GENERAL_PROPERTIES);
    			log("PropertyManager general "+" = "+propertyManager);
    			if(propertyManager!=null){
    	    		for(Property choiceProperty:propertyManager.getProperties()){
    	    			try{
    	    			log("Property "+choiceProperty.getID()+", "+choiceProperty.getName()+", "+choiceProperty.getValue()+", "+choiceProperty.getValueStringRepresentation()+", "+choiceProperty.getAdditionalProperties());
    	    			}catch(Throwable ignore){
    	    				
    	    			}
    	    		}
    			}
	    		}
	    		{
	    			PropertyManager propertyManager=projectOptions.getManager(projectOptions.PROJECT_INVISIBLE_PROPERTIES);
	    			log("PropertyManager general "+" = "+propertyManager);
	    			if(propertyManager!=null){
	    	    		for(Property choiceProperty:propertyManager.getProperties()){
	    	    			try{
	    	    			log("Property "+choiceProperty.getID()+", "+choiceProperty.getName()+", "+choiceProperty.getValue()+", "+choiceProperty.getValueStringRepresentation()+", "+choiceProperty.getAdditionalProperties());
	    	    			}catch(Throwable ignore){
	    	    				
	    	    			}
	    	    		}
	    			}
		    		}
	    	}
	        */
	        
	        
	        
	        Model pimModel=pimProject.getModel();
		    Set psmUmlModelList = new HashSet();
		    psmUmlModelList.add(pimModel);
		    qvtEngine.put("pimUml", psmUmlModelList);
		    // add required profiles and base models via useModule
	        //String dir = getPluginDirectory()+"transform/";
	        String profilesdir = getProfilesDir();
	       // String psmmoduleFilePath = profilesdir+ NIEM_PROFILE_FILENAME;
	        String psmmoduleFilePath = profilesdir+ NIEM_DSL_FILENAME;
	        
	        useModule(psmmoduleFilePath,log,pimProject);
	        useXmlLibrary(log,pimProject);
//	        String qvtName="psm2pim.qvto";
//	        String qvtName="NIEMmpd2psm.qvto";
	        String qvtName="NIEMmpd2pim.qvto";
		    setTransform(qvtName,qvtEngine);
		    log.log("start "+qvtName);
	        qvtEngine.eval((String) null);
	        if(!isReferencePSM) {
	        	// hook into reference model
	        	performSubsetReference(log,pimModel,pimProject);
		        createDiagrams(pimProject);
		        //toCanonicalIDs(pimModel);
	        }
	        psm2pimComplete();
	    }

	    catch (CancelError e)

	    {
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" Cancelled by User ");
    }

    catch (Throwable e)
    {
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);
        e.printStackTrace();
    }
	}
	public void performSubsetReference(MDLog log,Model pimModel,Project pimProject) throws IOException, ScriptException
	{
    	useReferenceLibrary(log,pimModel,pimProject);
//if(true){log.log("SUPPRESS SUBSET REFERENCE");return;}    	
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    executionContext.setLog(log);
	    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
	    Model root = pimModel;

	    Set inputModelList = new HashSet();
	    inputModelList.add(root);
	    addBlackbox(log,qvtEngine);

	    qvtEngine.put("pimUml", inputModelList);
        //useReferenceLibrary(log,psmProject);
//if(true)return;// TODO: complete        
	    setTransform("pimSubsetReference.qvto",qvtEngine);
	    log.log("start subsetting QVT ");
        qvtEngine.eval((String) null);
	}
	protected void useReferenceLibrary(MDLog log,Model pimModel,Project psmProject) throws IOException{
        String profilesdir = getLibraryDir();
        Set<String> targetNamespaces=getTargetNamespaces(pimModel);
        Set<String> libraries=getLibraries(targetNamespaces);
        log("useReferenceLibraries namespaces "+targetNamespaces+", libraries "+libraries);
        libraries=removeRedundantLibraries(libraries);
 //       log("useReferenceLibraries non-redundant libraries "+libraries);
        for(String library:libraries){
//        	String baseFileName="niem.reference."+ library+".mdzip";
        	String baseFileName="NIEM-Reference-"+ library+".mdzip";
            String psmmoduleFilePath = profilesdir+baseFileName;
            File absoluteFile=new File(getAbsoluteLibraryDir()+baseFileName);
	        if(!absoluteFile.exists()){
	    		    log.log("ERROR: could not locate referenced module at "+absoluteFile);
	    		    continue;
	        }

//            log("useReferenceLibraries useFilePath "+psmmoduleFilePath);
//if(true){log.log("SUPPRESS remaining LOAD REFERENCE MODULES "+SessionManager.getInstance().isSessionCreated());return;}    	
            useModule(psmmoduleFilePath,log,psmProject);
            
        };
//      String psmmoduleFilePath = profilesdir+ "niem.reference.pim.mdzip";
//      useModule(psmmoduleFilePath,log,psmProject);
	}
	protected Set<String> getTargetNamespaces(Model pimModel){
		Set<String> result=new HashSet<String>();
		Set<Package> editablePackages=getAllEditablePackages(pimModel);
		for(Package editablePackage:editablePackages){
			String targetNamespace=getTargetNamespace(editablePackage);
			if(targetNamespace!=null)result.add(targetNamespace);
		}
		return result;
	}
	protected String getTargetNamespace(Package p){
		String result=null;
		InstanceSpecification instance=p.getAppliedStereotypeInstance();
		if(instance!=null){
			for(Slot slot:instance.getSlot()){
				if("targetNamespace".equals(slot.getDefiningFeature().getName())){
					for(ValueSpecification value:slot.getValue()){
						if(LiteralString.class.isInstance(value)){
							String valueTest=((LiteralString)value).getValue();
							if((valueTest!=null)&&!"".equals(valueTest))return valueTest;
						}
					}
				}
			}
		}
		return result;
	}
	protected Set<Package> getAllEditablePackages(Model pimModel){
		Set<Package> result=new HashSet<Package>();
		for(Package test:pimModel.getNestedPackage()){
			if(test.isEditable()){
				addAllNestedPackages(test,result);
			}
		}
		return result;
	}
	protected Set<Package> addAllNestedPackages(Package p,Set<Package> result){
		result.add(p);
		for(Package test:p.getNestedPackage()){
				addAllNestedPackages(test,result);
		}
		return result;
	}
	protected Set<String> getLibraries(Set<String> targetNamespaces) throws IOException{
		Set<String> result=new HashSet<String>();
		//log("getLibraries namespace map "+getTargetNamespaceLibraryMap());
		for(String targetNamespace:targetNamespaces){
			String library=getLibrary(targetNamespace);
			if(library!=null)result.add(library);
		}
		return result;
	}
	protected String getLibrary(String targetNamespace) throws IOException{
		return (String)getTargetNamespaceLibraryMap().get(targetNamespace);
	}
	protected Properties  targetNamespaceLibraryMap=null;
	protected Properties getTargetNamespaceLibraryMap() throws IOException{
		if(targetNamespaceLibraryMap==null){
	    	String dir=getPropertiesDir();

	    	File propertiesFile=new File(dir+"niem.mapNamespace2library.properties");
	    	InputStream inStream=new FileInputStream(propertiesFile);
	    	targetNamespaceLibraryMap=new Properties();
	    	targetNamespaceLibraryMap.load(inStream);
	    	inStream.close();
			
		}
		return targetNamespaceLibraryMap;
	}
	protected Set<String> removeRedundantLibraries(Set<String> libraries) throws IOException{
		Set<String> result=new HashSet<String>();
		for(String library:libraries){
			boolean isRedundant=isRedundant(library,libraries);
			if(!isRedundant)result.add(library);
		}
		return result;
		
	}
	protected boolean isRedundant(String library,Set<String> libraries) throws IOException{
		for(String libraryTEST:libraries){
			String libraryTestValue=(String)getTargetNamespaceLibraryMap().get(libraryTEST);
			if((libraryTestValue!=null)&&libraryTestValue.contains(library))return true;
		}
		return false;
		
	}
	/*
	public void updateState()
	{
		// enabled if current project contains component stereotyped with mpd
		Boolean enabled=getPsmMpdPackage()!=null;
	    setEnabled(enabled);
	}
	*/	
	//////////////////////////////////////////////////////////////////////////////////////diagrams
	
	
	/*
	static protected void createSession(){
		SessionManager.getInstance().createSession("Edit class A");
	}
	static protected void closeSession(){
		SessionManager.getInstance().closeSession();
	}
	*/
	protected void createDiagrams(Project project){
//		SessionManager.getInstance().createSession("Edit class A");
//		try{
		// move session down so we get layout to work
		//boolean isSessionCreated=NIEMHelper.createSession("Diagrams"+project.getName());
		try{
			Model model=project.getModel();
			log("create diagrams for "+model.getQualifiedName());
			// create initial set of diagrams for new model
			for(PackageableElement packagedElement:model.getPackagedElement()){
				if(packagedElement.isEditable()&&Package.class.isInstance(packagedElement)){
					createPackageDiagrams((Package)packagedElement,project);
				}
			}
			log("create diagrams complete for "+model.getQualifiedName());
		}catch(Throwable t){
			log("ERROR: createDiagrams : "+t);
		}
		/*
		finally{
			if(false){
				log("WARNING: TEST Diagram session canceling");
				NIEMHelper.cancelSession(isSessionCreated);
				log("cancel diagram session complete");
				
			}else{
			log("closing diagram session");
			NIEMHelper.closeSession(isSessionCreated);
			log("close diagram session complete");
			}
		}
		*/
//		}finally{
//			SessionManager.getInstance().closeSession();		
//		}
	}
	static public Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
	static public PresentationElement findPresentationElement(PresentationElement dpe,Element element){
		// check all top level elements and nested elements
		if(element2presentation.containsKey(element))return element2presentation.get(element);
		if(DiagramPresentationElement.class.isInstance(dpe)){
			PresentationElement test= ((DiagramPresentationElement)dpe).findPresentationElement(element, ShapeElement.class);
			if(test!=null){
				//log("FOUND Presentation element ");
				return test;
			}
		}
		for(PresentationElement pe:dpe.getPresentationElements()){
			if(element.equals(pe.getElement()) || element.equals(pe.getActualElement())){
				return pe;
			}else{
				PresentationElement nestedPE=findPresentationElement(pe,element);
				if(nestedPE!=null)return nestedPE;
			}
		}
		return null;
	}
	static protected List<String> getOwnerDisplayChoices(){
		List<String> result=new Vector<String>();
		/*
		result.add("Do Not Display");
		result.add("Below Element Name");
		result.add("In Same Line With Name");
		result.add("Above Element Name");
		*/
		result.add("QNAME_DISPLAY_MODE_DO_NOT_DISPLAY");
		result.add("QNAME_DISPLAY_MODE_BELOW_NAME");
		result.add("QNAME_DISPLAY_MODE_MERGE_WITH_NAME");
		result.add("QNAME_DISPLAY_MODE_ABOVE_NAME");
		return result;
	}
	/*
	protected static Property ownerDisplayProperty=new ChoiceProperty(PropertyID.OWNER_DISPLAY_MODE,"Above Element Name ",getOwnerDisplayChoices());
	protected static Property ownerDisplayProperty=new StringProperty(PropertyID.QNAME_DISPLAY_MODE,"QNAME_DISPLAY_MODE_ABOVE_ELEMENT_NAME");
	*/
	public static Property ownerDisplayProperty=new ChoiceProperty(PropertyID.QNAME_DISPLAY_MODE,"QNAME_DISPLAY_MODE_ABOVE_NAME",getOwnerDisplayChoices());
	
//	protected static Property externalColorProperty=new ColorProperty(PropertyID.FILL_COLOR,Color.green);
	public static ColorProperty externalColorProperty=new ColorProperty(PropertyID.FILL_COLOR,getColor(204,255,204));
	//protected static Property createNewSymbols=new BooleanProperty(PropertyID.DISPLAY_RELATED_ELEMENTS_CREATE_NEW_SYMBOLS,false);
	public static Color getColor(int r,int g,int b){
		float hsbvals[]=Color.RGBtoHSB(r, g, b, null);
		return Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2]);
	}
	protected static Boolean firstTime=true;
	static public ShapeElement createShapeElement(Element type,PresentationElement dpe,boolean useExternalColor) throws ReadOnlyElementException{
//		ShapeElement shapeElement=PresentationElementsManager.getInstance().createShapeElement(type,dpe,true);
//		ShapeElement shapeElement=PresentationElementsManager.getInstance().createShapeElement(type,dpe,false);
		ShapeElement shapeElement=PresentationElementsManager.getInstance().createShapeElement(type,dpe);
//		shapeElement.getPropertyManager().addProperty(new Property(id,value));
		/*
		if(firstTime){
			firstTime=false;
			for(Property property:shapeElement.getPropertyManager().getProperties()){
				try{
					if(ChoiceProperty.class.isInstance(property)){
						ChoiceProperty choiceProperty=(ChoiceProperty)property;
				log("Property "+choiceProperty.getID()+", "+choiceProperty.getName()+", "+choiceProperty.getChoice()+", "+choiceProperty.getValue()+", "+choiceProperty.getValueStringRepresentation()+", "+choiceProperty.getAdditionalProperties());
					}
				}catch(Throwable ignore){
					
				}
			}
		}
		*/
		if(useExternalColor)shapeElement.addProperty(externalColorProperty);
		if(Namespace.class.isInstance(type))
			shapeElement.addProperty(ownerDisplayProperty);
//		shapeElement.addProperty(createNewSymbols);

		shapeElement.setSelected(false);
		//dpe.getPresentationElements().add(shapeElement); // supposed to be unmodifiable?
		if(!type.equals(shapeElement.getElement())){
			log("INTERNAL ERROR:Element not set on shape "+type+", "+shapeElement.getActualElement());
		}
		element2presentation.put(type, shapeElement);
		return shapeElement;
	}
	protected void createPackageDiagrams(Package model,Project project){
		// create diagram for package if it has types
		// recurse to nested packages
		log("createDiagrams for package "+model.getQualifiedName());
		boolean hasTypes=model.getOwnedType().size()>0;
//if(true){log("WARNING:createPackageDiagrams skipping all diagrams ");}else
		if(hasTypes){
			createInheritanceDiagram( model, project);
			// associations
			Set<Association> associations=new HashSet<Association>();
			for(PackageableElement pe:model.getPackagedElement()){
				if(Association.class.isInstance(pe) && (((Association)pe).getMemberEnd().size()==2))associations.add((Association)pe);
			}
			if(!associations.isEmpty())
				createAssociationDiagram( model, project,associations);
			// element imports
			Set<ElementImport> elementImports=new HashSet<ElementImport>();
			for(ElementImport pe:model.getElementImport()){
				if(pe.getImportedElement()==null){
					log("ERROR: ElementImport corrupted in "+model.getQualifiedName());
					continue;
				}
				elementImports.add(pe);
			}
			for(PackageableElement pe:model.getPackagedElement()){
				if(Namespace.class.isInstance(pe)){
					for(ElementImport ei:((Namespace)pe).getElementImport()){
						if(ei.getImportedElement()==null){
							log("ERROR: ElementImport corrupted in "+((Namespace)pe).getQualifiedName());
							continue;
						}
						elementImports.add(ei);
					}
				}
			}
			if(!elementImports.isEmpty())
				createElementImportDiagram( model, project,elementImports);
			//usages
			Set<Usage> usages=new HashSet<Usage>();
			for(PackageableElement pe:model.getPackagedElement()){
				if(Usage.class.isInstance(pe))
				usages.add((Usage)pe);
			}
			for(PackageableElement pe:model.getPackagedElement()){
				if(Component.class.isInstance(pe)){
					for(PackageableElement ei:((Component)pe).getPackagedElement()){
						if(Usage.class.isInstance(ei))
							usages.add((Usage)ei);
					}
				}
			}
			if(!usages.isEmpty())
				createUsageDiagram( model, project,usages);
			
			// realizations
			Set<Realization> realizations=new HashSet<Realization>();
			for(PackageableElement pe:model.getPackagedElement()){
				if(Realization.class.isInstance(pe))
					realizations.add((Realization)pe);
				// pick up any other realizations on packaged elements
				for(DirectedRelationship dr:pe.get_directedRelationshipOfTarget()){
					if(Realization.class.isInstance(dr)){
						if(dr.getOwner()==null){log("ERROR: orphaned realization referenced from "+pe.getQualifiedName());continue;}
						realizations.add((Realization)dr);
					}
				}
				for(DirectedRelationship dr:pe.get_directedRelationshipOfSource()){
					if(Realization.class.isInstance(dr)){
						if(dr.getOwner()==null){log("ERROR: orphaned realization referenced from "+pe.getQualifiedName());continue;}
						realizations.add((Realization)dr);
					}
				}
			}
			
			if(!realizations.isEmpty())
				createRealizationDiagram( model, project,realizations);
		}
		for(PackageableElement packagedElement:model.getPackagedElement()){
			if(packagedElement.isEditable()&&Package.class.isInstance(packagedElement)){
				createPackageDiagrams((Package)packagedElement,project);
			}
		}
	}
	protected void createInheritanceDiagram(Package model,Project project){
			//createSession();
			boolean isSessionCreated=NIEMHelper.createSession("InheritanceDiagram"+model.getQualifiedName());
			log("create Inheritance Diagram for package "+model.getQualifiedName()+", "+isSessionCreated);
			
			DiagramPresentationElement dpe=null;
			try {
				dpe= createDiagram(model,project,"");
//if(true)log("WARNING: suppress diagram content");else				
				// generalizations
				for(Type type:model.getOwnedType()){
					if(Classifier.class.isInstance(type) && ! Relationship.class.isInstance(type)){
						try {
						PresentationElement specificPE=getPresentationElement(dpe,type);
						if(specificPE==null){
							log("ERROR: Failed to get presentation element for "+type.getQualifiedName());
							continue;
						}
						for(Generalization g:((Classifier)type).getGeneralization()){
							if((g.getSpecific()==null)||(g.getGeneral()==null)){
								log("ERROR: corrupted generalization for supertype of "+type.getQualifiedName()+", "+g.getGeneral());
								continue;
							}
			                //Element specific = ModelHelper.getClientElement(g);
			                Element general = ModelHelper.getSupplierElement(g);
							if(general==null){
								log("ERROR: Failed to get general for "+type.getQualifiedName());
								continue;
							}
							PresentationElement generalPE=null;//getPresentationElement(dpe,general);
							try{
								generalPE=getPresentationElement(dpe,general);
							} catch (Throwable ee) {
								log("ERROR during inheritance diagram gen for general "+((NamedElement)general).getQualifiedName()+" : "+ee);
								continue;
							}
							if((g!=null)&&(generalPE!=null)){
								PresentationElement pathElement=getPathPresentationElement(dpe, specificPE, generalPE,g);
//								PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(g, specificPE, generalPE);
								if(pathElement==null){
									log("ERROR: Failed to create inheritance path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
									continue;
								}
								pathElement.setSelected(false);
							}else{
								log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
							}
						}
						// find elements for which this type is the general outside of the package
						for(DirectedRelationship dr:type.get_directedRelationshipOfTarget()){
							if(Generalization.class.isInstance(dr)){
								Generalization g=(Generalization)dr;
								if((g.getSpecific()==null)||(g.getGeneral()==null)){
									log("ERROR: corrupted generalization for subtype of "+type.getQualifiedName()+", "+g.getSpecific());
									continue;
								}
								if(g.getSpecific().getNamespace()==null){
									log("ERROR: Failed to get namespace for "+g.getSpecific());
									continue;
								}
								if(!g.getSpecific().getNamespace().equals(model)){
					                Element specific = ModelHelper.getClientElement(g);
					                Element general = ModelHelper.getSupplierElement(g);
									if((specific==null)||(general==null)){
										log("ERROR: corrupted off-package generalization for subtype of "+type.getQualifiedName()+", "+g.getSpecific());
										continue;
									}
					                PresentationElement generalPE=getPresentationElement(dpe,general);
					                PresentationElement specificPE2=getPresentationElement(dpe,specific);
									if((g!=null)&&(specificPE2!=null)&&(generalPE!=null)){
										PresentationElement pathElement=getPathPresentationElement(dpe, specificPE2, generalPE,g);
										//PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(g, specificPE2, generalPE);
										if(pathElement==null){
											log("ERROR: Failed to create inheritance inverse path element for "+type.getQualifiedName()+", "+general+", "+specificPE+", "+generalPE);
											continue;
										}
										pathElement.setSelected(false);
									}else{
										log("ERROR: Failed to set path element for "+type.getQualifiedName()+", "+g.getSpecific());
									}
									
								}
							}
						}
						} catch (Throwable eee) {
							log("ERROR during inheritance diagram gen type "+type.getQualifiedName()+" : "+eee);
						}

					}
				}
//				dpe.ensureLoaded();
//				dpe.update();
			} catch (Throwable e) {
				log("ERROR during inheritance diagram gen "+e);
//				e.printStackTrace();
			}finally{
				log("inheritance close session "+isSessionCreated);
				//closeSession();
				NIEMHelper.closeSession(isSessionCreated);
				log("inheritance close session complete");
				}
			layout(dpe);
	}
	static protected Namespace getDiagramElement(DiagramPresentationElement dpe){
		return dpe.getDiagram().getOwnerOfDiagram();
	}
//	static public PresentationElement getPathPresentationElement(DiagramPresentationElement dpe,PresentationElement source,PresentationElement target,DirectedRelationship element) throws ReadOnlyElementException{
	static public PresentationElement getPathPresentationElement(DiagramPresentationElement dpe,PresentationElement source,PresentationElement target,Element element) throws ReadOnlyElementException{
		try{
					PresentationElement child=findPathPresentationElement(dpe,element);
					if(child!=null)return child;
					child=createPathElement(element,source,target,false);
					if(child!=null)return child;
//					log("FAILED to locate child presentation element for "+((NamedElement)element).getQualifiedName());
					log("ERROR: Failed to create path presentation element for "+element+", "+source+", "+target);
//				}
				return null;
		}catch(Throwable t){
			log("ERROR: getPathPresentationElement failed on element "+element+" : "+t);
		}
		return null;
	}
	static public PresentationElement getAssociationPathPresentationElement(DiagramPresentationElement dpe,PresentationElement source,PresentationElement target,Association element) throws ReadOnlyElementException{
		try{
					PresentationElement child=findPathPresentationElement(dpe,element);
					if(child!=null)return child;
					child=createPathElement(element,source,target,false);
					if(child!=null)return child;
					log("FAILED to locate child presentation element for "+((NamedElement)element).getQualifiedName());
//				}
				return null;
		}catch(Throwable t){
			log("ERROR: getAssociationPathPresentationElement failed on element "+element+" : "+t);
		}
		return null;
	}
	
	static protected PathElement createPathElement(Element type,PresentationElement dpe,PresentationElement dpe2,boolean useExternalColor) throws ReadOnlyElementException{
		PathElement shapeElement=PresentationElementsManager.getInstance().createPathElement(type,dpe,dpe2);
		if(shapeElement==null){
			/*
			 * Creates a PathElement for given relationship between given client and supplier PresentationElements. The PathElement will be created in the same diagram as client's and supplier's PresentationElements are.
ModelElement of client must be equal to relationship's client.
ModelElement of supplier must be equal to relationship's supplier. 
			 */
			if(type instanceof Dependency){
				Dependency d=(Dependency)type;
				if(d.getClient().size()!=1){
					log("ERROR: createPathElement Dependency has no client "+type+", "+d.getClient().size());
				}
				if(d.getSupplier().size()!=1){
					log("ERROR: createPathElement Dependency has no supplier "+type+", "+d.getSupplier().size());
				}
				for(NamedElement ne:d.getClient()){
					if(!ne.equals(dpe.getElement()))
						log("ERROR: createPathElement Dependency client mismatch "+type+", "+ne.getQualifiedName()+", "+dpe.getElement());
				}
				for(NamedElement ne:d.getSupplier()){
					if(!ne.equals(dpe2.getElement()))
						log("ERROR: createPathElement Dependency client mismatch "+type+", "+ne.getQualifiedName()+", "+dpe2.getElement());
				}
				
			}
			log("ERROR: createPathElement Failed to create path element for "+type+", "+dpe+", "+dpe2);
			return null;
		}
		
		if(useExternalColor)shapeElement.addProperty(externalColorProperty);
		if(Namespace.class.isInstance(type))
			shapeElement.addProperty(ownerDisplayProperty);

		shapeElement.setSelected(false);
		if(!type.equals(shapeElement.getElement())){
			log("INTERNAL ERROR:Element not set on shape "+type+", "+shapeElement.getActualElement());
		}
		element2presentation.put(type, shapeElement);
		return shapeElement;
	}
	
	static protected PresentationElement findPathPresentationElement(PresentationElement dpe,Element element){
		// check all top level elements and nested elements
		if(element2presentation.containsKey(element))return element2presentation.get(element);
		if(DiagramPresentationElement.class.isInstance(dpe)){
			PresentationElement test= ((DiagramPresentationElement)dpe).findPresentationElement(element, PathElement.class);
			if(test!=null){
				return test;
			}
		}
		for(PresentationElement pe:dpe.getPresentationElements()){
			if(element.equals(pe.getElement()) || element.equals(pe.getActualElement())){
				return pe;
			}else{
				PresentationElement nestedPE=findPathPresentationElement(pe,element);
				if(nestedPE!=null)return nestedPE;
			}
		}
		return null;
	}

	static public PresentationElement getPresentationElement(DiagramPresentationElement dpe,Element element) throws ReadOnlyElementException{
		try{
			if(Comment.class.isInstance(element)){
				PresentationElement pe=findPresentationElement(dpe,element);
				if(pe==null){
					pe=createShapeElement(element,dpe,false);
				}
			return pe;
			}
			if(!Namespace.class.isInstance(element)||Artifact.class.isInstance(element)){
//				PresentationElement parent=getPresentationElement(dpe,((NamedElement)element).getNamespace());
				Element owner=element.getOwner();
				if(owner==null){
					log("ERROR: orphaned element "+element);
					return null;
				}
				PresentationElement parent=getPresentationElement(dpe,owner);
				if(parent!=null){
					PresentationElement child=findPresentationElement(parent,element);
					if(child!=null)return child;
					child=createShapeElement(element,parent,false);
					if(child!=null)return child;
					log("ERROR: Failed to create presentation element for "+((NamedElement)element).getQualifiedName());
				}
				return null;
			}
			PresentationElement pe=findPresentationElement(dpe,element);
			if(pe==null){
				boolean isDifferentPackage=true;
				Namespace diagrammed=getDiagramElement(dpe);
				if((diagrammed!=null)&&!Package.class.isInstance(diagrammed))diagrammed=NIEMHelper.getNearestPackage(diagrammed);
				if(Package.class.isInstance(diagrammed) && ((Package)diagrammed).getPackagedElement().contains(element))
					isDifferentPackage=false;
				//log("getPresentationElement "+isDifferentPackage+", "+dpe.getElement()+", "+element);
				pe=createShapeElement(element,dpe,isDifferentPackage);
			}
		return pe;
		}catch(Throwable t){
			log("ERROR: getPresentationElement failed on element "+element+" : "+t);
		}
		return null;
	}
	static public void layout(DiagramPresentationElement dpe){
		// layout works if we close and create a new session
//if(true){log("WARNING: layout suppressed");return;}		
		//log("layout start "+dpe);
		if(dpe==null)return;
		//createSession();
		boolean isSessionCreated=NIEMHelper.createSession("layout");
		try{
			dpe.setSelected(false);
			dpe.setAllSelected(false);
			ClassDiagramLayouterOptionsGroup options=new ClassDiagramLayouterOptionsGroup();
			options.setDefaultValues();
			//log("layout options "+options.getLayoutType());
			//options.setLayoutType(ClassDiagramLayouterOptionsGroup.ASSOCIATION_BASED);
			dpe.open();
			dpe.layout(false,new ClassDiagramLayouter(),options);
			//dpe.ensureLoaded();
			//dpe.update();
		}finally{NIEMHelper.closeSession(isSessionCreated);}	
	}
	protected DiagramPresentationElement createDiagram(Package model,Project project,String suffix) throws ReadOnlyElementException{
		Diagram diagram= ModelElementsManager.getInstance().createDiagram(DiagramTypeConstants.UML_CLASS_DIAGRAM, model);
		diagram.setName(model.getName()+suffix);
		
		DiagramPresentationElement dpe=project.getDiagram(diagram);
//if(true)log("SUPPRESS open");else		
		dpe.open();
//if(true)log("SUPPRESS addProperty");else		
		dpe.addProperty(ownerDisplayProperty);
		
		/*
		Property choiceProperty=dpe.getProperty(PropertyID.DISPLAY_RELATED_ELEMENTS_CREATE_NEW_SYMBOLS);
		if(choiceProperty!=null)
			log("Property "+choiceProperty.getID()+", "+choiceProperty.getName()+", "+choiceProperty.getValue()+", "+choiceProperty.getValue()+", "+choiceProperty.getValueStringRepresentation()+", "+choiceProperty.getAdditionalProperties());
*/
//		dpe.addProperty(createNewSymbols);
		/*
		log("TEST LOG");
		choiceProperty=dpe.getProperty(PropertyID.DISPLAY_RELATED_ELEMENTS_CREATE_NEW_SYMBOLS);
		if(choiceProperty!=null)
			log("PropertyX "+choiceProperty.getID()+", "+choiceProperty.getName()+", "+choiceProperty.getValue()+", "+choiceProperty.getValue()+", "+choiceProperty.getValueStringRepresentation()+", "+choiceProperty.getAdditionalProperties());
		*/	
		element2presentation.clear();
		return dpe;
	}
	protected void createAssociationDiagram(Package model,Project project,Set<Association> associations){
		log("create Association Diagram for package "+model.getQualifiedName());
//		createSession();
		boolean isSessionCreated=NIEMHelper.createSession("associationDiagram");
		DiagramPresentationElement dpe=null;
		/*
		 Set linkTypes = new HashSet();
		 linkTypes.add(new LinkType(Association.class));
		 DisplayRelatedSymbolsInfo info = createDisplayRelatedSymbolsInfo(linkTypes);
		 */
		try {
			dpe= createDiagram(model,project,".Associations");
			// associations
			for(Association association:associations){
                Element type0 = ModelHelper.getClientElement(association);
				if((type0==null)){
					log("ERROR: memberEnd types unspecified client "+association.getQualifiedName());
					continue;
				}
//				 DisplayRelatedSymbols.displayRelatedSymbols(pe0, info);

                 Element type1 = ModelHelper.getSupplierElement(association);
                
				if((type0==null)||(type1==null)){
					log("ERROR: memberEnd types unspecified supplier "+association.getQualifiedName());
					continue;
				}
				PresentationElement pe0=getPresentationElement(dpe,type0);
				PresentationElement pe1=getPresentationElement(dpe,type1);
				if((pe0==null)||(pe1==null)){
					log("ERROR:failed to resolve presentations elements for "+association.getQualifiedName());
				}else{
					try{
				PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(association, pe0, pe1);
				pathElement.setSelected(false);
					} catch (Throwable e) {
						log("ERROR during association path gen "+e);
//						e.printStackTrace();
					}
				}

			}
		} catch (Throwable e) {
			log("ERROR during association diagram gen "+e);
//			e.printStackTrace();
		}finally{NIEMHelper.closeSession(isSessionCreated);}	
		layout(dpe);
}
	protected void createElementImportDiagram(Package model,Project project,Set<ElementImport> elementImports){
		log("create Element Import Diagram for package "+model.getQualifiedName());
//		createSession();
		boolean isSessionCreated=NIEMHelper.createSession("elementImportDiagram");
		DiagramPresentationElement dpe=null;
		/*
		 Set linkTypes = new HashSet();
		 linkTypes.add(new LinkType(ElementImport.class));
		 DisplayRelatedSymbolsInfo info = createDisplayRelatedSymbolsInfo(linkTypes);
		 */
		try {
			dpe= createDiagram(model,project,".ElementImport");
			// associations
			for(ElementImport elementImport:elementImports){
                Element namespace = ModelHelper.getClientElement(elementImport);
                Element pe = ModelHelper.getSupplierElement(elementImport);
//				Namespace namespace=elementImport.getImportingNamespace();
				PresentationElement pe0=getPresentationElement(dpe,namespace);
//				 DisplayRelatedSymbols.displayRelatedSymbols(pe0, info);

//				PackageableElement pe=elementImport.getImportedElement();
				PresentationElement pe1=getPresentationElement(dpe,pe);
				PresentationElement pathElement=getPathPresentationElement(dpe, pe0, pe1,elementImport);
//				PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(elementImport, pe0, pe1);
				pathElement.setSelected(false);

			}
		} catch (ReadOnlyElementException e) {
			log("ERROR during diagram gen "+e);
//			e.printStackTrace();
		}finally{NIEMHelper.closeSession(isSessionCreated);}	
		layout(dpe);
}
	protected void createUsageDiagram(Package model,Project project,Set<Usage> usages){
		log("create Usage Diagram for package "+model.getQualifiedName());
//		createSession();
		boolean isSessionCreated=NIEMHelper.createSession("usageDiagram");
		DiagramPresentationElement dpe=null;
		try {
			dpe= createDiagram(model,project,".Usage");
			// associations
			for(Usage usage:usages){
				/*
                Element client = ModelHelper.getClientElement(usage);
                Element supplier = ModelHelper.getSupplierElement(usage);
				if(!Relationship.class.isInstance(client) && !Relationship.class.isInstance(supplier)){
				*/
				
				Collection<NamedElement> clients=usage.getClient();
				Collection<NamedElement> suppliers=usage.getSupplier();
				for(NamedElement client:clients){
					if(!Relationship.class.isInstance(client)){
						for(NamedElement supplier:suppliers){
							if(!Relationship.class.isInstance(supplier)){
							
								PresentationElement pe0=getPresentationElement(dpe,client);
								PresentationElement pe1=getPresentationElement(dpe,supplier);
								if((pe0==null)||(pe1==null)){
									log("ERROR:Failed to draw usage for "+client+" to "+supplier);
								}else{	
									try{
										PresentationElement pathElement=getPathPresentationElement(dpe, pe0, pe1,usage);
//									PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(usage, pe0, pe1);
									if(pathElement==null){
										log("ERROR during usage diagram, failed to create PathElement "+client.getQualifiedName()+", "+supplier.getQualifiedName()+", "+pe0+", "+pe1);
										
									}else{
										pathElement.setSelected(false);
									}
									} catch (Throwable ee) {
										log("ERROR during usage diagram gen pathElement "+client+", "+supplier+", "+pe0+", "+pe1+" : "+ee);
									}
								}
								
							}
						}
						
					}
					
				}
			}
		} catch (Throwable e) {
			log("ERROR during usage diagram gen "+e);
//			e.printStackTrace();
		}finally{NIEMHelper.closeSession(isSessionCreated);}	
		layout(dpe);
}
	protected void createRealizationDiagram(Package model,Project project,Set<Realization> realizations){
		log("create Realization Diagram for package "+model.getQualifiedName());
//		createSession();
		boolean isSessionCreated=NIEMHelper.createSession("realizationDiagram");
		DiagramPresentationElement dpe=null;
		try {
			dpe= createDiagram(model,project,".Realization");
			for(Realization realization:realizations){
				if(realization.getClient().isEmpty()||realization.getSupplier().isEmpty()){
					log("ERROR: corrupted Realization "+realization.getQualifiedName()+", "+realization.getClient()+", "+realization.getSupplier());
					continue;
				}
				boolean isRelationship=false;
				for(NamedElement test:realization.getClient())if(Relationship.class.isInstance(test)){isRelationship=true;break;}
				for(NamedElement test:realization.getSupplier())if(Relationship.class.isInstance(test)){isRelationship=true;break;}
				if(isRelationship)continue;
                Element client = ModelHelper.getClientElement(realization);
                Element supplier = ModelHelper.getSupplierElement(realization);
				if((client==null)||(supplier==null)){
					log("ERROR: corrupted Realization client/supplier "+realization.getQualifiedName()+", "+realization.getClient()+", "+realization.getSupplier());
					continue;
				}
				if(Relationship.class.isInstance(client)||Relationship.class.isInstance(supplier)){continue;}
						PresentationElement pe0=getPresentationElement(dpe,client);
								PresentationElement pe1=getPresentationElement(dpe,supplier);
								if((pe0==null)||(pe1==null)){
									log("ERROR:Failed to draw realization for "+client+" to "+supplier);
								}else{	
									PresentationElement pathElement=getPathPresentationElement(dpe, pe0, pe1,realization);
									
//									PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(realization, pe0, pe1);
									if(pathElement==null){
										log("ERROR during Realization diagram, failed to create PathElement "+((NamedElement)client).getQualifiedName()+", "+((NamedElement)supplier).getQualifiedName()+", "+pe0+", "+pe1);
										
									}else{
										pathElement.setSelected(false);
									}
								}
							}
		} catch (Throwable e) {
			log("ERROR during realization diagram gen "+dpe.getDiagram().getQualifiedName()+" : "+e);
		}finally{NIEMHelper.closeSession(isSessionCreated);}	
		layout(dpe);
}

	}
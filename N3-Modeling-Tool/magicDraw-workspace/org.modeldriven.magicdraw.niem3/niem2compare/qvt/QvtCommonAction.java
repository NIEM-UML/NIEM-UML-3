/**
 *
 */
package org.modeldriven.magicdraw.niem.qvt;

import gov.niem.niem.wantlist._2._2Factory;
import gov.niem.niem.wantlist._2._2Package;
import gov.niem.niem.wantlist._2.util._2ResourceFactoryImpl;
//import gov.niem.niem.wantlist._2.impl._2FactoryImpl;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.util.mpdcatResourceFactoryImpl;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogPackage;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.util.mpdchangelogResourceFactoryImpl;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEvaluationEnv;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.ExeXMIResource;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.wst.wsdl.WSDLPackage;
import org.eclipse.wst.wsdl.binding.soap.SOAPPackage;
import org.eclipse.wst.wsdl.internal.util.WSDLResourceFactoryImpl;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;

import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.util.SchematronResourceFactoryImpl;


import com.nomagic.ci.persistence.IAttachedProject;
import com.nomagic.ci.persistence.IPrimaryProject;
import com.nomagic.ci.persistence.IProject;
import com.nomagic.ci.persistence.PersistenceException;
//import com.nomagic.ci.persistence.ProjectOptions;
import com.nomagic.ci.persistence.decomposition.ProjectAttachmentConfiguration;
import com.nomagic.ci.persistence.spi.InvalidProjectObjectException;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.ProjectUtilities;
import com.nomagic.magicdraw.core.modules.AutoLoadKind;
import com.nomagic.magicdraw.core.modules.ModulesService;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.pathvariables.RecursivePathVariableException;
import com.nomagic.magicdraw.properties.FileProperty;
import com.nomagic.magicdraw.qvt.QVTPlugin;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptingEngineImpl;
import com.nomagic.magicdraw.qvt.parameters.ValidParameterException;
import com.nomagic.magicdraw.qvt.proxy.MDQVTScriptEngineFactory;
import com.nomagic.magicdraw.qvt.resources.QVTResources;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.BrowserTabTree;
import com.nomagic.magicdraw.ui.browser.InstanceBrowserInitializer;
import com.nomagic.magicdraw.ui.browser.InstanceBrowserInitializer.NiemInstanceBrowserTabTree;
import com.nomagic.magicdraw.uml.BaseElement;
//import com.nomagic.rcpf.product.utils.Utilities;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
//import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.metadata.MdmodelsFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.impl.ElementImpl;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.ElementsFactory;
import com.nomagic.utils.Utilities;



/**
 * @author Tom
 *
 */
abstract public class QvtCommonAction extends MDAction implements NIEM_ProfileConstants,ToolTipConstants
{
	static public boolean isLoggingDisabled=false;
	static public String NIEM_DSL_FILENAME="NIEM-DSL.mdzip";
	static public String NIEM_PROFILE_FILENAME="NIEM-UML-Profile.mdzip";
	static public String NIEM_REF_PSM_FILENAME="niem.reference.psm.mdzip";
	static protected XSDResourceFactoryImpl xsdResourceFactory=new XSDResourceFactoryImpl();
	static protected mpdcatResourceFactoryImpl mpdcatResourceFactory=new mpdcatResourceFactoryImpl();
	static protected mpdchangelogResourceFactoryImpl mpdclResourceFactory=new mpdchangelogResourceFactoryImpl();
	static protected EcoreResourceFactoryImpl ecoreResourceFactory=new EcoreResourceFactoryImpl();
	static protected _2ResourceFactoryImpl wantlistResourceFactory=new _2ResourceFactoryImpl();
	static protected SchematronResourceFactoryImpl schematronResourceFactory=new SchematronResourceFactoryImpl();
	static protected WSDLResourceFactoryImpl wsdlResourceFactory=new WSDLResourceFactoryImpl();

	//static protected org.eclipse.emf.ecore.resource.Resource.Factory qvtoResourceFactory=new ExeXMIResource.Factory();;
	public QvtCommonAction(String id, String name)
	{
		super(id, name, null, null);
		this.setSmallIcon(getNiemIcon());
		setEnabled(false);
	}
	static protected Icon niemIcon=null;
	static public Icon getNiemIcon(){
		if(niemIcon==null){
		File file=new File(getPropertiesDir()+"mds.small.gif");
		niemIcon=new ImageIcon(file.getAbsolutePath()) ;
		}
		return niemIcon;
	}
	static public boolean isLoggingDisabled(){return isLoggingDisabled;}
	static public void log(String text){
		if(isLoggingDisabled()){
			System.out.println(text);
		}else{
		Application.getInstance().getGUILog().log(text);
		}
	}
	protected void disableEventFiring(Project project){
		project.getRepository().getEventSupport().setEnableEventFiring(false);
	}
	protected void initTrees(){
		Browser browser=Application.getInstance().getMainFrame().getBrowser();
		browser.getContainmentTree().initTree();
		List<BrowserTabTree> trees=browser.getTrees();
		for(BrowserTabTree tree:trees){
			if(NiemInstanceBrowserTabTree.class.isInstance(tree)){
				tree.initTree();
				break;
			}
		}
	}
	/*
	protected void initTreesNow(){
		try{
		if(SwingUtilities.isEventDispatchThread()){
			initTrees();
		}else{
            SwingUtilities.invokeAndWait(new Runnable(){
				@Override
				public void run() {
					initTrees();
				}
            });
		}  
		}catch(Throwable t){
			log("ERROR: during initTreesNow "+t);
		}
	}
	*/
	protected void enableEventFiring(Project project){
		try{
		project.getRepository().getEventSupport().setEnableEventFiring(true);
		// refresh browser
//		Application.getInstance().getMainFrame().getBrowser().getContainmentTree().updateBrowser();
//		Application.getInstance().getMainFrame().getBrowser().getContainmentTree().updatePanelByEditingState();
//		Application.getInstance().getMainFrame().getBrowser().getContainmentTree().updateBrowser(true);
//		Application.getInstance().getMainFrame().getBrowser().getContainmentTree().updateUI();
//		Application.getInstance().getMainFrame().getBrowser().getContainmentTree().setNeedsInit(true);
//		Application.getInstance().getMainFrame().getBrowser().getContainmentTree().ok();
		if(SwingUtilities.isEventDispatchThread()){
			initTrees();
		}else{
            SwingUtilities.invokeLater(new Runnable(){
//            SwingUtilities.invokeAndWait(new Runnable(){
				@Override
				public void run() {
					//Application.getInstance().getMainFrame().getBrowser().getContainmentTree().initTree();
					initTrees();
				}
            	
            });
		}  
		}catch(Throwable t){
			log("ERROR: during enableEventFiring "+t);
		}
	}

	/*
	protected org.eclipse.emf.ecore.resource.Resource.Factory getQvtoResourceFactory() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if (qvtoResourceFactory==null){
			qvtoResourceFactory=(org.eclipse.emf.ecore.resource.Resource.Factory)QvtCommonAction.class.getClassLoader().loadClass("org.eclipse.m2m.internal.qvt.oml.runtime.resource.QvtOperationalResourceFactoryImpl").newInstance();
		}
		return qvtoResourceFactory;
	}
	*/
	protected File getMpdWorkingDirectory(Project project,String requestFrom){
		File result=null;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					MPD_WORKING_DIRECTORY_OPTION);
			if (FileProperty.class.isInstance(property))
			{
				try {
					result = ((FileProperty)property).getFile(requestFrom);
				} catch (RecursivePathVariableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
	}

	public File getTargetDirectory(){
		Application application=Application.getInstance();
		Project project=application.getProject();
		File parentRootFile=new File(project.getFileName()).getParentFile();
		String requestFrom=parentRootFile.getAbsolutePath();
		File rootParentFile=getMpdWorkingDirectory(project,requestFrom);
		/*
		if(rootParentFile==null){
	     rootParentFile=new File(parentRootFile, "mpd.fromPIM~");
		}
		*/
		File rootFile=new File(rootParentFile, getMpdName());
	    if(!rootFile.exists())rootFile.mkdirs();
	    return rootFile;
	}
	  protected String getMpdFileName(){
		  String mpdName="UNDEFINED";
		  String mpdVersionID="1.0";
		  String mpdClass="iepd";
			Component mpdComponent=getMpdComponent();
			if(mpdComponent!=null){
				String mpdNameTest=mpdComponent.getName();
				if((mpdNameTest!=null)&&(mpdNameTest.length()>0))mpdName=mpdNameTest;
				//InstanceSpecification instance=mpdComponent.getAppliedStereotypeInstance();
				//String mpdVersionIDTest=getMpdVersionID(instance);
				//mpdVersionIDTagName
				String mpdVersionIDTest=NIEMHelper.getMpdVersionID(mpdComponent);
				if((mpdVersionIDTest!=null)&&(mpdVersionIDTest.length()>0))mpdVersionID=mpdVersionIDTest;
				EnumerationLiteral mpdClassEnum=NIEMHelper.getMpdClassCode(mpdComponent);
				if(mpdClassEnum!=null)mpdClass=mpdClassEnum.getName();
				if("core_update".equals(mpdClass))mpdClass="cu";
				else if("domain_update".equals(mpdClass))mpdClass="du";
				else if("release".equals(mpdClass))mpdClass="rel";
			}
				  
		  /*
			String mpdBaseURI=getMpdBaseURI();
			String mpdName=mpdBaseURI;
			String mpdVersionID=mpdBaseURI;

			if(mpdVersionID.endsWith("/")){mpdVersionID=mpdVersionID.substring(0,mpdVersionID.length()-1);}
			int jndex=mpdVersionID.lastIndexOf("/");
			if(jndex>0){
				mpdName=mpdVersionID.substring(0,jndex);
				mpdVersionID=mpdVersionID.substring(jndex+1,mpdVersionID.length());
				jndex=mpdName.lastIndexOf("/");
				if(jndex>0){
					mpdName=mpdName.substring(jndex+1,mpdName.length());
				}else{mpdName=mpdBaseURI;}
			}else{mpdVersionID="1.0";}
			String result= mpdName.replace(":","_").replace("/","_").replace(" ","_")+"-"+mpdVersionID;
*/
			String result= mpdName.replace(":","_").replace("/","_").replace(" ","_")+"-"+mpdVersionID+"."+mpdClass;
			return result;
		}
	  protected String getMpdName(){
		 return getMpdFileName();
	}
	 /*
	 query UML::classes::mdkernel::InstanceSpecification::getStringValue(tagName:String):String=
			self.getValueSpecification(tagName).getStringValue()->select(v|(v<>null) and not(v.oclIsUndefined()))->asSequence()->first();
query UML::classes::mdkernel::InstanceSpecification::getValueSpecification(tagName:String):Sequence(UML::classes::mdkernel::ValueSpecification)=
	self.slot->select(s|s.definingFeature.name=tagName).value->asSequence();
query UML::classes::mdkernel::ValueSpecification::getStringValue():String=
	self->select(v|v.oclIsKindOf(UML::classes::mdkernel::LiteralString)).oclAsType(UML::classes::mdkernel::LiteralString)
	.value->asSequence()->first();

			*/
	static protected List<ValueSpecification> getValueSpecification(InstanceSpecification instance,String tagName){
		for(Slot slot:instance.getSlot()){
			if(slot.getDefiningFeature().getName().equals(tagName))return slot.getValue();
		}
		return new Vector<ValueSpecification>();
	}
	static protected String getStringValue(ValueSpecification valueSpec){
		if(LiteralString.class.isInstance(valueSpec)){
			return ((LiteralString)valueSpec).getValue();
		}
		return "";
			}
	static protected String getStringValue(InstanceSpecification instance,String tagName){
		for(ValueSpecification valueSpec:getValueSpecification(instance,tagName)){
			return getStringValue(valueSpec);
		}
		return "";
			}
/*
	static protected String getMpdBaseURI(InstanceSpecification instance){
		return getStringValue(instance,"mpdBaseURI");
	}

	static protected String getMpdVersionID(InstanceSpecification instance){
		return getStringValue(instance,"mpdVersionID");
	}
	static protected String getMpdClass(InstanceSpecification instance){
		return getStringValue(instance,"mpdVersionID");
	}

	static protected String getMpdBaseURI(){
		Component mpdComponent=getMpdComponent();
		if(mpdComponent==null)return "UNDEFINED";
		InstanceSpecification instance=mpdComponent.getAppliedStereotypeInstance();
		String mpdBaseURI=getMpdBaseURI(instance)+getMpdVersionID(instance);
		if("".equals(mpdBaseURI))mpdBaseURI="UNDEFINED";
		return mpdBaseURI;
	}
	*/
	/*
	static protected ElementImport getMpdModelImport(){
		Component mpdComponent=getMpdComponent();
		if(mpdComponent==null)return null;
		for(ElementImport elementImport:mpdComponent.getElementImport()){
			if(Model.class.isInstance(elementImport.getImportedElement()))return elementImport;
		}
		return null;
	}
	*/
	static public Set<Component> getContainedComponents(Package p){
		Set<Component> result=new HashSet<Component>();
		for(PackageableElement pe:p.getPackagedElement()){
			if(Component.class.isInstance(pe)){
				result.add((Component)pe);
			}else if(Package.class.isInstance(pe)){
				result.addAll(getContainedComponents((Package)pe));
			}
		}
		return result;
	}
	protected Set<Package> getContainedPackages(Package p){
		Set<Package> result=new HashSet<Package>();
		for(PackageableElement pe:p.getPackagedElement()){
			if(Package.class.isInstance(pe)){
				result.add((Package)pe);
			}
			if(Package.class.isInstance(pe)){
				result.addAll(getContainedPackages((Package)pe));
			}
		}
		return result;
	}
	static public Component getMpdComponent(){
	    Model root = getCurrentModelRoot();//project.getModel();
	    Component fallbackComponent=null;
	    if(root!=null){
	    	for(Component component:getContainedComponents(root)){
	    		if(!NIEMHelper.isModelPackageDescription(component))continue;
	    		if(isInPSM(component.getOwningPackage()))continue;
				// defer NIEM Reference Model
				if(component.getName().matches(".*NIEM Reference Model.*")){
					fallbackComponent=component;
					continue;
				}
				return component;
	    		/*
	    		InstanceSpecification is=component.getAppliedStereotypeInstance();
	    		if(is!=null){
	    			for(Classifier c:is.getClassifier()){
//	    				if("MPD".equals(c.getName())){
	    				if("ModelPackageDescription".equals(c.getName())){
	    					// defer NIEM Reference Model
	    					if(component.getName().matches(".*NIEM Reference Model.*")){
	    						fallbackComponent=component;
	    						break;
	    					}
	    					return component;
	    				}
	    			}
	    		}
	    		*/
	    	}
	    }
	    return fallbackComponent;
	}
	protected Model getRfpModel(){
	    Model root = getCurrentModelRoot();//project.getModel();
	    if((root!=null)&& (root.getName().contains("RFP")||root.getName().contains("RFC"))){
	    	return root;
	    }
	    return null;
	}
	protected Model getPSMModel(){
	    Model root = getCurrentModelRoot();
	    if(root!=null){
	    	for(Package psm:getContainedPackages(root)){
	    		if(Model.class.isInstance(psm)&&"PSM".equals(psm.getName())){
	    			return (Model)psm;
	    		}
	    	}
	    }
	    return null;
	}
	static public boolean isInPSM(Package p){return NIEMHelper.isInPSM(p);}
/*
	protected Package getPsmMpdPackage(){
	    Model root = getCurrentModelRoot();//project.getModel();
	    if(root!=null){
	    	for(Package component:getContainedPackages(root)){
	    		InstanceSpecification is=component.getAppliedStereotypeInstance();
	    		if(is!=null){
	    			for(Classifier c:is.getClassifier()){
	    				if("mpd".equals(c.getName())){
	    					return component;
	    				}
	    			}
	    		}
	    	}
	    }
	    return null;
	}
	*/
    protected ScriptEngineManager manager = new ScriptEngineManager(null);
	protected ScriptEngine getQvtEngine(){
	    //ScriptEngineManager manager = new ScriptEngineManager(null);
	    ScriptEngine qvtEngine = manager.getEngineByName("QVTO");
	    if(qvtEngine==null){
	    	log("getQvtEngine registering engine factory");
	    	manager.registerEngineName("QVTO", new QVTScriptEngineFactory(){
	    		//protected ScriptEngine scriptEngine= new NiemQVTScriptingEngine(this);
	    		@Override
	    		public ScriptEngine getScriptEngine() {
	    			// TODO Auto-generated method stub
//	    			ScriptEngine scriptEngine= super.getScriptEngine();
//	    			ScriptEngine scriptEngine= new NiemQVTScriptingEngine(this);
	    			/*
	    			log("ScriptEngine "+scriptEngine+", "+scriptEngine.getClass().getName());
	    			com.nomagic.magicdraw.qvt.jsr223.QVTScriptingEngineImpl x;
	    			x.
	    			x.eval("", x.compile(""));
	    			ScriptContext y;

	    			scriptEngine.eval(script, context);
	    			*/
	    			//this.ge
	    			//return scriptEngine;
	    			return new NiemQVTScriptingEngine(this);
	    			}
	    				
	    	});
	    	qvtEngine = manager.getEngineByName("QVTO");
	    	//QVTPlugin x;

	    }
	    if(qvtEngine==null){
	    	//com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory x;
	    	for(ScriptEngineFactory factory:manager.getEngineFactories()){
	        	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Engine Factory "+factory.getEngineName());

	    	}
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "ERROR: QVT Engine not found "+manager.getEngineByName("QVT Operational")+", "+manager.getEngineByName("QVTOperational"));
	    }
		//log("QVT ScriptEngine "+qvtEngine+", "+qvtEngine.getClass().getName());
	    return qvtEngine;
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
	    // create runnable
	    RunnableWithProgress runnable = new RunnableWithProgress()
		    {
		            public void run(ProgressStatus progressStatus)
		            {
		                    int max = Integer.MAX_VALUE;
		                    progressStatus.init("Start...", 0, max);
		                    try {
								performTransform(progressStatus);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}catch(CancelError e){
								
							}
		            }
		    };
	    // run with progress
	    ProgressStatusRunner.runWithProgressStatus(runnable,getName()+ " progress", true, 0);
	}
	static public Project getProject(){
	    Application application=Application.getInstance();
	    return application.getProject();
	}
	static public Model getCurrentModelRoot(){
		Project project=getProject();
		if(project==null)return null;
	    return project.getModel();
	}
	/**
	* Entered when button pushed.
	 * @throws IOException
	*/
	abstract public void performTransform(ProgressStatus progressStatus) throws IOException;
	static public String getInstallRootDirectory(){
		return System.getProperty("install.root", ".");
	}

	static public String getPluginDirectory(){
		return getInstallRootDirectory()+"plugins/"+NIEMQVTPlugin.getPluginID()+"/";
	}
	static public void registerFactories(MDLog log){
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xsd", xsdResourceFactory);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mpdcat", mpdcatResourceFactory);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mpdcl", mpdclResourceFactory);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", ecoreResourceFactory);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wlxml", wantlistResourceFactory);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sch", schematronResourceFactory);
    	//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qvto", qvtoResourceFactory);
    	/*
    	try {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qvto", getQvtoResourceFactory());
			new ExeXMIResource.Factory();
		} catch (Throwable e) {
		    log.log("ERROR: failed to register qvto factory, : "+e);
		}
		*/
	}
	protected void registerPackages(MDLog log,ScriptEngine qvtEngine){
	    EPackage.Registry ePackageRegistry=EPackage.Registry.INSTANCE;

	    // xsd
	    EPackage xsdEPackage=XSDPackage.eINSTANCE;
		//log.log("register xsd "+xsdEPackage);
	    String xsdnsURI=xsdEPackage.getNsURI();
	    log.log("register xsd namespace "+xsdnsURI);
	    ePackageRegistry.put(xsdnsURI, xsdEPackage);

	    // cat
	    EPackage catEPackage=mpdcatPackage.eINSTANCE;
		//log.log("register cat "+catEPackage);
	    String catnsURI=catEPackage.getNsURI();
	    log.log("register cat namespace "+catnsURI);
	    ePackageRegistry.put(catnsURI, catEPackage);

	    // changelog
	    EPackage mpdclEPackage=mpdchangelogPackage.eINSTANCE;
		//log.log("register mpdcl "+mpdclEPackage);
	    String mpdclnsURI=mpdclEPackage.getNsURI();
	    log.log("register mpdcl namespace "+mpdclnsURI);
	    ePackageRegistry.put(mpdclnsURI, mpdclEPackage);

	    // wantlist

	    EPackage wantlistEPackage=_2Package.eINSTANCE;
	    String wantlistURI=wantlistEPackage.getNsURI();
	    log.log("register wantlist namespace "+wantlistURI);
	    ePackageRegistry.put(wantlistURI, wantlistEPackage);

	    // schematron
	    EPackage schematronEPackage=SchematronPackage.eINSTANCE;
	    String schematronURI=schematronEPackage.getNsURI();
	    log.log("register schematron namespace "+schematronURI);
	    ePackageRegistry.put(schematronURI, schematronEPackage);
	    
	    EPackage expressionsEPackage=org.eclipse.ocl.expressions.ExpressionsPackage.eINSTANCE;
	    String expressionsURI=expressionsEPackage.getNsURI();
	    log.log("register expressions namespace "+expressionsURI);
	    ePackageRegistry.put(expressionsURI, expressionsEPackage);
	    
	    qvtEngine.put(QVTEngineConstants.QVTO_E_PACKAGE_REGISTRY, ePackageRegistry);
	    // wsdl
	    EPackage wsdlEPackage=WSDLPackage.eINSTANCE;
	    String wsdlnsURI=wsdlEPackage.getNsURI();
	    log.log("register wsdl namespace "+wsdlnsURI);
	    ePackageRegistry.put(wsdlnsURI, wsdlEPackage);
	    // and the factory
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wsdl", wsdlResourceFactory);

	    // soap
	    EPackage soapEPackage=SOAPPackage.eINSTANCE;
	    String soapnsURI=soapEPackage.getNsURI();
	    log.log("register soap namespace "+soapnsURI);
	    ePackageRegistry.put(soapnsURI, soapEPackage);
    	
	    // blackbox
	    /*
	    Set blackboxModelList = new HashSet();
	    EPackage blackboxPackage=EcorePackage.eINSTANCE.getEcoreFactory().createEPackage();
	    blackboxModelList.add(blackboxPackage);
	    Adapter blackboxAdapter=new BlackboxAdapter(log);
	    blackboxPackage.eAdapters().add(blackboxAdapter);
	    qvtEngine.put("blackboxAdapter", blackboxModelList);
	    */
	    addBlackbox(log,qvtEngine);
	    //org.eclipse.m2m.internal.qvt.oml.blackbox.java.BlackboxResourceFactory.
	    registerFactories(log);
	}
	protected void addBlackbox(MDLog log,ScriptEngine qvtEngine){
	    Set blackboxModelList = new HashSet();
	    EPackage blackboxPackage=EcorePackage.eINSTANCE.getEcoreFactory().createEPackage();
	    blackboxModelList.add(blackboxPackage);
	    Adapter blackboxAdapter=new BlackboxAdapter(log);
	    blackboxPackage.eAdapters().add(blackboxAdapter);
	    qvtEngine.put("blackboxAdapter", blackboxModelList);

	}
	protected File getTransformFile(String transform){
	    String dir = getTransformDir();
        File file = new File(dir + transform);
        return file;

	}
	protected void setTransform(String transform,ScriptEngine qvtEngine){
        File file = getTransformFile(transform);
        qvtEngine.put(ScriptEngine.FILENAME, file.getAbsolutePath());

	}
	protected ProjectsManager getProjectsManager(){
	    Application application=Application.getInstance();
		return application.getProjectsManager();
	}
	static public String getTransformDir(){
		return getPluginDirectory()+"transform/";
	}
	static public String getMetamodelDir(){
		return getPluginDirectory()+"metamodel/";
	}
	static protected String getAbsoluteSystemPrefix(){
		return "c:/";
	}
	static protected String getPredefinedInstallRoot(){
		//return getInstallRootDirectory();
		return getAbsoluteSystemPrefix()+"<install.root>/";
	}
	public static String getProfilesDir(){
		return getPredefinedInstallRoot()+ "profiles/";
	}
	protected String getLibraryDir(){
		return getPredefinedInstallRoot()+ "modelLibraries/";
	}
	protected String getAbsoluteLibraryDir(){
		return getInstallRootDirectory()+ "modelLibraries/";
	}

	protected void useXmlLibrary(MDLog log,Project psmProject){
        String profilesdir = getLibraryDir();
      String psmmoduleFilePath = profilesdir+ "XmlPrimitiveTypes.mdzip";
//      String psmmoduleFilePath = profilesdir+ "XMLPrimitiveTypes.mdzip";
      useModule(psmmoduleFilePath,log,psmProject);
	}
	protected void useBasePSM(MDLog log,Project psmProject){
        String profilesdir = getLibraryDir();
      String psmmoduleFilePath = profilesdir+ "niem.base.psm.mdzip";
      useModule(psmmoduleFilePath,log,psmProject);
	}
	protected Frame getFrame(){
    	Frame frame= Application.getInstance().getMainFrame();
    	//log("Frame "+frame);
    	return frame;
	}
	protected Project createBasePSM(MDLog log,ScriptEngine qvtEngine){
	    ProjectsManager projectsManager=getProjectsManager();

	    //
        // create a new project and add objects to it
	    log.log("creating target PSM project");
        Project psmProject=projectsManager.createProject();

        Model psmModel=psmProject.getModel();
	    Set psmUmlModelList = new HashSet();
	    psmUmlModelList.add(psmModel);
	    qvtEngine.put("psmUml", psmUmlModelList);

	    //String dir = getPluginDirectory()+"transform/";
        String profilesdir = getProfilesDir();
//        String psmmoduleFilePath = profilesdir+ "niem.mdzip";
        String psmmoduleFilePath = profilesdir+ "niem.psm.profile.mdzip";
        useModule(psmmoduleFilePath,log,psmProject);
        return psmProject;
	}
	protected Project createPSM(MDLog log,ScriptEngine qvtEngine){
		Project psmProject=createBasePSM(log,qvtEngine);
        useXmlLibrary(log,psmProject);
        return psmProject;
	}
	protected void indexModules(Project psmProject,Log log) throws PersistenceException{
	    IPrimaryProject primaryProject=psmProject.getPrimaryProject();
	    for(IAttachedProject attachedProject:primaryProject.getProjects()){
	    	String name=attachedProject.getName();
	    	if(!name.startsWith("NIEM-Reference-"))continue;
	    	log.log("indexModules "+name);
	    	try{
	    	//if(name.startsWith("UML"))continue;
	    	//if(name.startsWith("Traceability"))continue;
	    	//ModulesService.reMount(arg0, arg1, arg2, arg3)
//	    	ModulesService.setAutoLoadKind(primaryProject,attachedProject, AutoLoadKind.MANUAL_LOAD,null) ;
	    	
	    	ModulesService.setAutoLoadKindOnTask(primaryProject,attachedProject, AutoLoadKind.MANUAL_LOAD) ;
	    	
	    	log.log("indexModules update "+attachedProject.getName());
	    	attachedProject.update(null);
	    	}catch(Throwable t){
	    		log.log("ERROR: while adjusting module index for "+attachedProject+" : "+t);
	    	}
//	    	ModulesService.setReShared(primaryProject,attachedProject,true, null);
	    }
		//ModulesService.
	}
	static public void useModule(String psmmoduleFilePath,Log log,Project psmProject){
		/*
	    ProjectsManager projectsManager=getProjectsManager();
	    File psmmodulefile = new File(psmmoduleFilePath);
	    URI psmURI=psmmodulefile.toURI();
	    ProjectDescriptor psmprojectDescriptor =   ProjectDescriptorsFactory.createProjectDescriptor(psmURI);
	    log.log("new project loading Module "+psmURI);
	    projectsManager.useModule(psmProject, psmprojectDescriptor);
	    //log.log("new project loaded Module "+psmURI);

	     */
		if(log!=null){
	    log.log("new project loading Module "+psmmoduleFilePath+", "+SessionManager.getInstance().isSessionCreated());
		}
	    ModulesService.findOrLoadLocalModule(psmProject, psmmoduleFilePath,false) ;
	}
	static public String getPropertiesDir(){
		return getPluginDirectory()+"properties/";
	}
	protected void useCommonIndexing(Project psmProject){
		ProjectOptions projectOptions=psmProject.getOptions();
		projectOptions.setIndexMode(ProjectOptions.INDEX_COMMON);
	}
	// add option to specify the package to be shared
	protected void shareModule(String description,Log log,Project psmProject,String sharedPackageParent) throws InvalidProjectObjectException{
	    ProjectsManager projectsManager=getProjectsManager();
	    List<Package> packages=new Vector<Package>();
	    Package sharedParent=findPackageNamed(psmProject.getModel(),sharedPackageParent);
	    IPrimaryProject primaryProject=psmProject.getPrimaryProject();
	    
//	    for(Package p:psmProject.getModel().getNestedPackage()){
	    if(sharedParent==null){
	    	log.log("ERROR: shareModule failed to locate common package "+sharedPackageParent);
	    	return;
	    }
	    for(Package p:sharedParent.getNestedPackage()){
	    	if(p.isEditable()){
	    		//packages.add(p);
	    	    log.log("shareModule package "+p.getQualifiedName());
	    	    ModulesService.share( primaryProject, p, sharedPackageParent, null);
	    	    
	    	}
	    }
	    //projectsManager.sharePackage(psmProject, packages,description);
	}
	protected Package findPackageNamed(Package parent,String qualifiedName){
		String[] parts=qualifiedName.split("::", 2);
		for (Package nested:parent.getNestedPackage()){
			if(parts[0].equals(nested.getName())){
				if(parts.length==1)return nested;
				return findPackageNamed(nested,parts[1]);
			}
		}
		return null;
	}
	protected void saveProject(Log log,Project psmProject,String psmmoduleFilePath) throws PersistenceException{
		
	    ProjectsManager projectsManager=getProjectsManager();
	    File psmmodulefile = new File(psmmoduleFilePath);
	    //URI psmURI=psmmodulefile.toURI();
	    ProjectDescriptor psmprojectDescriptor =   ProjectDescriptorsFactory.createLocalProjectDescriptor(psmProject,psmmodulefile);
	    projectsManager.saveProject(psmprojectDescriptor, true);
	    
		/*
	    IPrimaryProject primaryProject=psmProject.getPrimaryProject();
	    primaryProject.save(psmmoduleFilePath, null);
	    //ProjectUtilities x;
	    */
	}
	protected void staticMpdCopy(MDLog log,File mpdStaticDirectory,File mpdStagingDirectory) {
		log.log("copy static mpd resources to mpd staging area");
		Utilities.copyDirectory(mpdStaticDirectory, mpdStagingDirectory);
	}
	protected void zipMasterDocumentOdt(MDLog log,File masterDocumentTempDirectory,File masterDocumentStaticDirectory,File masterDocumentOdtFile) throws IOException {
		log.log("copy static master-document resources to document build area, master document at "+masterDocumentOdtFile);
		removeSvnDirectories(masterDocumentStaticDirectory);
		Utilities.copyDirectory(masterDocumentStaticDirectory, masterDocumentTempDirectory);

		// we need to move the temp directory up to root for this tool
		//File masterDocumentWorkDirectory=masterDocumentTempDirectory;
		//File masterDocumentWorkDirectory=new File(getInstallRootDirectory());
		//Utilities.copyDirectory(masterDocumentTempDirectory, masterDocumentWorkDirectory);

		ZipUtility.zipDirectory(masterDocumentTempDirectory, masterDocumentOdtFile);
		/*
		OutputStream outputStream=new FileOutputStream(masterDocumentOdtFile);
		ZipOutputStream zos=new ZipOutputStream(outputStream);
		log.log("zip odt master-document");
		Utilities.zipDir(masterDocumentWorkDirectory.getAbsolutePath(),zos);
		zos.close();
		outputStream.close();
		*/
	}
	protected void removeSvnDirectories(File directory){
		if(directory.isDirectory()){
			if(directory.getName().equals(".svn")){
				Utilities.deleteTree(directory);
			}else{
				for(File file:directory.listFiles()) removeSvnDirectories(file);
			}
		}
	}
	//////////////////////////////////////////////////////////////////////
	/*
  protected void toCanonicalIDs(Namespace namespace,String prefix){
    if(!namespace.isEditable()) return;
    String canonicalId=prefix+getXmlName(namespace.getName());
    //if(namespace.getOwner()==null) canonicalId="_";
    namespace.setID(canonicalId);
    EClass eClass=namespace.eClass();
//    for(Element element:namespace.getOwnedElement()){
    for(EReference reference:eClass.getEAllContainments()){
      if(reference.isMany()){

      }else{
    	  EObject containee=(EObject)namespace.eGet(reference);
    	  if(isUniqueName(containee)){
    		  
    	  }else{
    		  
    	  }
      }
    }
  }
  */
	  protected void toCanonicalIDs(Package namespace){
		  String id="_"+getXmlName(namespace.getName());
		// problem at top level?		  namespace.setID(id);
		  setMofID(namespace,id);
		  //e.getRepository().
//		  log("toCanonicalIDs top "+id);
		  /*
		  Resource resource=namespace.eResource();
		  log("toCanonicalIDs resource "+resource);
		  if(XMLResource.class.isInstance(resource)){
			  XMLResource xmlResource=(XMLResource)resource;
			  xmlResource.setID(namespace, id);
			  log("toCanonicalIDs top "+id);
		  }
		  */
//		  boolean isSession=SessionManager.getInstance().isSessionCreated();
//		  log("toCanonicalIDs "+isSession);
//		  if(!isSession)SessionManager.getInstance().createSession("QVTCommonAction");
		  toCanonicalIDs(namespace,id+"-");
//		  if(!isSession)SessionManager.getInstance().closeSession();
		  }
	protected void setMofID(Element element,String id){
		//log("setMofID "+element+" = "+id);
		  ElementImpl e=(ElementImpl)element;
		  e.setMofID(id);
	}
  protected void toCanonicalIDs(Element namespace,String prefix){
	  try{
	    if(!namespace.isEditable()) return;
	    if(Diagram.class.isInstance(namespace))return;
	    /*
	    String canonicalId=prefix+getXmlName(namespace.getName());
	    //if(namespace.getOwner()==null) canonicalId="_";
	    namespace.setID(canonicalId);
	    */
	    EClass eClass=namespace.eClass();
    	if(eClass==null){
    		log("ERROR:toCanonicalIDs null eClass "+namespace);
    		return;
    	}
	    
//	    for(Element element:namespace.getOwnedElement()){
	    for(EReference reference:eClass.getEAllContainments()){
	    	if(reference==null){
	    		log("ERROR:toCanonicalIDs null reference "+eClass.getName());
	    		continue;
	    	}
	      if(reference.isMany()){
	    	  List<EObject> eObjects=new Vector<EObject>((Collection<EObject>)namespace.eGet(reference));
	    	  if(eObjects==null){
		    		log("ERROR:toCanonicalIDs null eGet "+reference+", "+namespace);
		    		continue;
	    	  }
	    	  for(int i=0;i<eObjects.size();i++){
	    	  //for(EObject containeeObject:eObjects){
	    		  EObject containeeObject=eObjects.get(i);
		    	  if(!Element.class.isInstance(containeeObject))continue;
		    	  Element containee=(Element)containeeObject;
		    	  if(!containee.isEditable())continue;
	    		  String id=prefix;
		    	  if(isUniqueName(containee)){
		    		  id+=getXmlName(((NamedElement)containee).getName());
		    	  }else{
		    		  // is there a nameclash here?
		    		  id+=getXmlName(reference.getName());
		    		  if(eObjects.size()>1)id+="-"+(i+1);
		    	  }
//		    	  log("toCanonicalIDs "+containee+" = "+id);
				  setMofID(containee,id);
	    		  //containee.setID(id);
	    		  toCanonicalIDs(containee,id+"-");
	    		  
	    	  }
	      }else{
	    	  EObject containeeObject=(EObject)namespace.eGet(reference);
	    	  if(!Element.class.isInstance(containeeObject))continue;
	    	  Element containee=(Element)containeeObject;
	    	  if(!containee.isEditable())continue;
    		  String id=prefix;
	    	  if(isUniqueName(containee)){
	    		  id+=getXmlName(((NamedElement)containee).getName());
	    	  }else{
	    		  // is there a nameclash here?
	    		  id+=getXmlName(reference.getName());
	    		  
	    	  }
//	    	  log("toCanonicalIDs single "+containee+" = "+id);
			  setMofID(containee,id);
//    		  containee.setID(id);
    		  toCanonicalIDs(containee,id+"-");
	      }
	    }
  }catch(Throwable t){
	  log("ERROR: toCanonicalIDs "+namespace+", "+prefix+" : "+t);
  }
	  }
  protected boolean isUniqueName(Element element){
	  try{
	  if(!NamedElement.class.isInstance(element)) return false;
	  if(EnumerationLiteral.class.isInstance(element)) return true;// assume ok
	  String name=((NamedElement)element).getName();
	  if((name==null)||name.equals(""))return false;
	  Namespace namespace=((NamedElement)element).getNamespace();
	  if(namespace==null){
//		  log("ERROR:isUniqueName null namespace "+element);
		  return false;
	  }
	  Collection<NamedElement> namedElements=namespace.getOwnedMember();
	  if(namedElements==null){
		  log("ERROR:isUniqueName null namedElements "+element);
		  return false;
	  }
	  for(NamedElement sibling:namedElements){
		  if(sibling==null){
			  log("ERROR:isUniqueName null sibling "+element);
			  return false;
		  }
		  if(name.equals(sibling.getName()) && !(element.equals(sibling)))return false;
	  }
	  return true;
	  }catch(Throwable t){
		  log("ERROR: isUniqueName "+element+" : "+t);
		  return false;
	  }
}
  /*
  protected String getCanonicalName(NamedElement namedElement){
      String xmlName=getXmlName(namedElement);
      // must be unique in namespace, must have a name
      // otherwise
  }
  */
  protected String getXmlName(String name){
	  try{
      return name.replaceAll(" ","_").replaceAll("/","_").replaceAll(":","_").replaceAll("\'","_");
	  }catch(Throwable t){
		  log("ERROR: getXmlName "+name+" : "+t);
		  return "";
	  }
  }
  protected void setMpdComponentStateEnabled(){
			// enabled if current project contains component stereotyped with mpd
			Boolean enabled=getMpdComponent()!=null;
			if(enabled){
				Application application=Application.getInstance();
				Project project=application.getProject();
				if(project==null){
					enabled=false;
				}else{
					if(project.getFileName()==null){
						enabled=false;
					}else{
						File parentRootFile=new File(project.getFileName()).getParentFile();
						if(parentRootFile==null){
							enabled=false;
						}
					}
				}
				
			}
		    setEnabled(enabled);
		}	  
	}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

//import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogPackage;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
//import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipFile;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.modeldriven.magicdraw.niem.qvt.CancelError;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;



import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationManager;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory;
import com.nomagic.magicdraw.ui.MainFrame;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.ui.browser.Tree;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.validation.ActiveValidationManager;
import com.nomagic.magicdraw.validation.ActiveValidationManagerListener;
import com.nomagic.magicdraw.validation.RuleViolationResult;
import com.nomagic.magicdraw.validation.ValidationResultProvider;
import com.nomagic.magicdraw.validation.ValidationRunData;
import com.nomagic.magicdraw.validation.ValidationService;
import com.nomagic.magicdraw.validation.ValidationSuiteHelper;
import com.nomagic.magicdraw.validation.ui.ShowActiveValidationOptions;
import com.nomagic.magicdraw.validation.ui.ValidationResultsWindowManager;
import com.nomagic.magicdraw.validation.ui.ValidationSuitesDlg;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
//import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.metadata.MdmodelsFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
import com.nomagic.uml2.impl.ElementsFactory;
import com.nomagic.utils.Utilities;



/**
 * @author Tom
 *
 */
public class NIEMValidateAction extends QvtCommonAction
{
	public NIEMValidateAction(String id, String name)
	{
	super(id, name);
	}
	/*
	public void actionPerformed(ActionEvent actionEvent)
	{
		logTest("NIEMValidate "+actionEvent+", "+getUserObject());
	}
	*/
	protected Object  getUserObject(){
		MainFrame mainFrame=Application.getInstance().getMainFrame();
		Browser browser=mainFrame.getBrowser();
		Tree tree=browser.getActiveTree();
		Node node=tree.getSelectedNode();
		return node.getUserObject();
		/*
		com.nomagic.magicdraw.validation.ActiveValidationManager.getInstance(getProject()).addActiveValidationManagerListener(arg0)ui.ValidationSuitesDlg z;
		z.ShowActiveValidationOptions y;
		y.rules.ValidationService x;
		x..ValidationSuiteHelper.
		com.nomagic.magicdraw.validation.ActiveValidationManager.getInstance(getProject()).ValidationSuiteHelper.ui.
		*/
	}
	/*
	public void logTest(String arg0) {
	    Application.getInstance().getGUILog().log(arg0);
	}
	*/
	
	// TEST: perform validation based on magic draw validation suites;  this used only for testing access to validation suites
	public void performTransformBasedOnValidationSuite(ProgressStatus progressStatus)
	{
	//	ValidationSuiteHelper y;
	//	y.
	//	ValidationService x;
	//	x.
		//com.nomagic.magicdraw.validation.ui.ValidationSuitesDlg dlg=new ValidationSuitesDlg(getFrame());
		//dlg.show();
		//com.nomagic.magicdraw.validation.ui.ShowActiveValidationOptions.
		//ShowActiveValidationOptions dlg=new ShowActiveValidationOptions();
		//dlg.
		
		//ShowActiveValidationOptions();
		com.nomagic.magicdraw.validation.ValidationSuiteHelper validationSuiteHelper=com.nomagic.magicdraw.validation.ValidationSuiteHelper.getInstance(getProject());
		
    Collection<Package> packages=validationSuiteHelper.getActiveValidationSuites();
    for(Package p:packages){
    	if(p.isEditable()){
    	log("TEST package "+p.getQualifiedName());
    	}
    }
    for(Constraint c:    	validationSuiteHelper.getActiveValidationRules()){
    	if(c.isEditable()){
    	log("TEST constraint "+c.getQualifiedName());
    	}
	}	
    for(Constraint c:    	validationSuiteHelper.getUserSelectedActiveValidationRules())
    	if(c.isEditable()){
    	log("TEST user constraint "+c.getQualifiedName()+", "+validationSuiteHelper.getRuleImplementationClassName(c));
    	}
    
    
    //com.nomagic.magicdraw.validation.
    ActiveValidationManager activeValidationManager=ActiveValidationManager.getInstance(getProject());
    
    /*
    try{
    com.nomagic.magicdraw.validation.ValidationRunHelper.run();
    }catch(Throwable t){log("TEST ValidationRunHelper "+t);}
    try{
    activeValidationManager.reset();
    }catch(Throwable t){log("TEST reset "+t);}
    try{
    activeValidationManager.init();
    }catch(Throwable t){log("TEST init "+t);}
    */
		/*
    try{
    activeValidationManager.revalidate();
    }catch(Throwable t){log("TEST revalidate "+t);}
    //ActiveValidationManagerListener x;
    //x.
    //com.nomagic.magicdraw.validation.ConstraintValidator z;
	Collection<RuleViolationResult> ruleViolations=new Vector<RuleViolationResult>();
//	AnnotationManager.getInstance().update();
	ValidationResultsWindowManager.openActivateValidationResultsWindow(getProject(),ruleViolations);
    
	log("TEST revalidate complete ");
	*/
	}	
	 
	/**
	* Entered when button pushed.
	* Validate all using the NIEMValidator
	*/
	public void performTransform(ProgressStatus progressStatus)
	{
    	EObject eObject=(EObject)getUserObject();
    	if(eObject==null){
    		log("No Element selected");
    		return;
    	}
    	Collection<EObject> allContents=getAllContents(eObject);
    	int max=1+allContents.size();
        progressStatus.init("Validating...", 0, max);
//		progressStatus.setDescription("starting");
		
	    MDLog log=new MDLog(progressStatus);
	    try {
	    	Map<Object,Object> context=new HashMap<Object,Object>();
	    	BasicDiagnostic diagnostics=new BasicDiagnostic();
	    	//log.log("validate "+eObject);
	    	progressStatus.setDescription(""+getQualifiedName(eObject));
	    	progressStatus.increase();
	    	NIEMValidator niemValidator=new NIEMValidator();
	    	niemValidator.validate(eObject,diagnostics,context);
	    	for(EObject sub:allContents){
	    		if(!(sub instanceof Element))continue;
	    		Element element=(Element)sub;
	    		if(!element.isEditable())continue;
	    		if(progressStatus.isCancel())throw new CancelError();
		    	progressStatus.setDescription(""+getQualifiedName(sub));
		    	progressStatus.increase();
		    	niemValidator.validate(sub,diagnostics,context);
	    	}
	    	log("allContents "+allContents.size());
	    	Collection<RuleViolationResult> ruleViolations=new Vector<RuleViolationResult>();
	    	logDiagnostics(diagnostics,ruleViolations);
	    	//com.nomagic.magicdraw.validation.ui.ValidationResultsWindowManager xx;
	    	//xx.openActivateValidationResultsWindow(arg0, arg1);
	    	//AnnotationManager.getInstance().update();
	    	
	    	for(RuleViolationResult violation:ruleViolations){
	    		Annotation annotation=violation.getAnnotation();
	    		System.out.println("violation "+violation+", "+violation.getErrorMessage()+", "+annotation.getSeverity().getName()+", "+annotation.getKind()+", "+annotation.getText()+", "+annotation.getTarget()+", "+violation.getElement()+", "+violation.getRule());
	    	}
	    	//ValidationRunData vrd=new ValidationRunData();
	    	Project project=getProject();
			ValidationResultProvider vrp=project.getValidationResultProvider();
			
			
			vrp.clearValidationResults();
			vrp.setValidationResults(ValidationResultProvider.ACTIVE_VALIDATION_GROUP, ruleViolations);
			vrp.update();
			//List<RuleViolationResult> validationResults=vrp.getActiveValidationResults(true);
			//validationResults.addAll(ruleViolations);
	    	//ValidationRunData vrd=new ValidationRunData();// has arguments
	    	
	    	//ValidationResultsWindowManager.openValidationResultsWindow(vrd, ruleViolations, "NIEM test");
//	    	ValidationResultsWindowManager.activateWindowFor(ruleViolations);// nothing
	    	//ValidationResultsWindowManager.openActivateValidationResultsWindow(project,ruleViolations);// null pointer
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(),getName()+" complete");
	    }

	    catch (CancelError e)

	    {
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" Cancelled by User ");
    }
/*
    catch (Exception e)

    {
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);

        //e.printStackTrace();

    }
	*/
	}
    protected String getQualifiedName(EObject eObject){
    	if(eObject==null)return "";
    	if(Element.class.isInstance(eObject)){
			Element container=((Element)eObject).getOwner();
    		if(NamedElement.class.isInstance(eObject)){
    			return (container==null?"":getQualifiedName(container)+"::")+((NamedElement)eObject).getName();
    		}else{
    			return (container==null?"":getQualifiedName(container)+"::")+"("+((Element)eObject).getHumanType()+")";
    		}
    	}
    	return eObject.toString();
    }
	protected Collection<EObject> getAllContents(EObject eobject){
		Collection<EObject> result=new Vector<EObject>();
		TreeIterator<EObject> iterator=eobject.eAllContents();
		while(iterator.hasNext())result.add(iterator.next());
		return result;
	}
	protected EnumerationLiteral getSeverity(Diagnostic diagnostics){
		if(diagnostics.getSeverity()==Diagnostic.WARNING)return getEnumerationLiteral(Annotation.WARNING);
		if(diagnostics.getSeverity()==Diagnostic.ERROR)return getEnumerationLiteral(Annotation.ERROR);
		return getEnumerationLiteral(Annotation.INFO);
	}
	protected EnumerationLiteral getEnumerationLiteral(String name){
		/*
		EnumerationLiteral result=MdkernelFactory.eINSTANCE.createEnumerationLiteral();
		result.setName(name);
		*/
		EnumerationLiteral result=Annotation.	getSeverityLevel(getProject(),name) ;
		return result;
	}
	protected BaseElement getBaseElement(Diagnostic diagnostics){
		for(Object test:diagnostics.getData()){
			if(BaseElement.class.isInstance(test))return (BaseElement)test;
		}
		return null;
	}
	protected void logDiagnostics(Diagnostic diagnostics,Collection<RuleViolationResult> ruleViolations){
		if((diagnostics.getMessage()!=null)&&(diagnostics.getSeverity()!=Diagnostic.OK)){
//			log("Diagnostic "+diagnostics.getSeverity()+" "+diagnostics.getCode()+" "+diagnostics.getMessage()+", "+diagnostics.getData());
			EnumerationLiteral severity=getSeverity(diagnostics);
//			java.lang.String kind="kind "+diagnostics.getCode();
			java.lang.String kind=""+diagnostics.getCode();
			java.lang.String text=diagnostics.getMessage();
			BaseElement target=getBaseElement(diagnostics);
			if((severity!=null)&&(target!=null)){
				Annotation annotation=new Annotation( severity, kind,  text,  target,new Vector<NMAction>()) ;
				
				//annotation.setToolTipText("test tooltip");
				AnnotationManager.getInstance().add(annotation);
				//log("Diagnostic "+severity+" "+kind+" "+text+", "+target);
				
				Constraint constraint=UMLFactory.eINSTANCE.createConstraint();
				constraint.setName("TEST");
				RuleViolationResult ruleViolation=new RuleViolationResult(annotation, constraint)
				{
					public boolean isIgnored(){
						// super crashes on this operation???
						return false;
					}
				}
				;
				
				ruleViolations.add(ruleViolation);
			}
		}
		
		for(Diagnostic diagnostic:diagnostics.getChildren()){
			logDiagnostics(diagnostic,ruleViolations);
		}
	}
	public void updateState()
	{
		// enabled always
		Boolean enabled=true;
		setEnabled(enabled);
	}	
	}
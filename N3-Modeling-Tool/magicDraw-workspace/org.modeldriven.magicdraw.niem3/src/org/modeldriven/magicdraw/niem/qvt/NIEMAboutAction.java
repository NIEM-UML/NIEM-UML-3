/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

//import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogPackage;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
//import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipFile;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.notify.Adapter;
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


import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.properties.PropertyResourceProvider;
import com.nomagic.magicdraw.properties.StringProperty;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
//import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.metadata.MdmodelsFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.ElementsFactory;
import com.nomagic.utils.Utilities;



/**
 * @author Tom
 *
 */
public class NIEMAboutAction extends QvtCommonAction
{
	public NIEMAboutAction(String id, String name)
	{
	super(id, name);
	setDescription(NIEM_ABOUT_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		String message="";
		try {
			message = "<html><b>build:</b>"+getBuildPropertyValue()
					+"<p/><b>Schematron feature expiration:</b>"+getSchematronExpireDateFormatted()
					+"<p/><b>WSDL/Service co-plugin feature expiration:</b>"+getWsdlServiceExpireDateFormatted()
					+"</html>";
		} catch (ParseException e) {
			message=""+e;
		}
		JOptionPane.showMessageDialog(getFrame(),message,"NIEM-UML Plugin",JOptionPane.INFORMATION_MESSAGE);
	}
	protected String getBuildPropertyValue(){
		return getProperties().getProperty("build");
	}
	protected Properties properties=null;
	protected Properties getProperties(){
		if(properties==null){
			 properties=new Properties();
			InputStream inStream=getClass().getClassLoader().getResourceAsStream("org/modeldriven/magicdraw/niem/qvt/niem.properties");
			
			try {
				properties.load( inStream) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return properties;
	}
	/**
	* Entered when button pushed.
	*/
	public void performTransform(ProgressStatus progressStatus)
	{
	}
	
	public void updateState()
	{
		// enabled always
		Boolean enabled=true;
		setEnabled(enabled);
	}	
	public String getSchematronExpire(){
		return getProperties().getProperty("schematronExpire");
	}
	public Date getSchematronExpireDate() throws ParseException{
		return new SimpleDateFormat("MM/dd/yyyy").parse(getSchematronExpire()); 
	}
	public String getSchematronExpireDateFormatted() throws ParseException{
		return DateFormat.getDateInstance().format(getSchematronExpireDate()); 
	}
	public String getWsdlServiceExpire(){
		return getProperties().getProperty("wsdlServiceExpire");
	}
	public Date getWsdlServiceExpireDate() throws ParseException{
		return new SimpleDateFormat("MM/dd/yyyy").parse(getWsdlServiceExpire()); 
	}
	public String getWsdlServiceExpireDateFormatted() throws ParseException{
		return DateFormat.getDateInstance().format(getWsdlServiceExpireDate()); 
	}
	
	}
/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

//import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage;
//import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogPackage;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
//import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;


import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
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
public class NIEM_EntityDiagramsAction extends QvtCommonAction
{
	public NIEM_EntityDiagramsAction(String id, String name)
	{
	super(id, name);
	setDescription(ENTITY_DIAGRAM_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
//		SubsetDialogHelper.SubsetPackageDialog(requestor, browserPackage);
		DiagramDialogHelper.EntityDiagramDialog();
		
	}
	
	public void updateState()
	{
		// enabled if project and <<mpd>> component known
//		Boolean enabled=NIEMHelper.getModelRoot()!=null;
		Boolean enabled=getMpdComponent()!=null;
		setEnabled(enabled);
	}
	@Override
	public void performTransform(ProgressStatus progressStatus)
			throws IOException {
		// TODO Auto-generated method stub
		
	}	
	}
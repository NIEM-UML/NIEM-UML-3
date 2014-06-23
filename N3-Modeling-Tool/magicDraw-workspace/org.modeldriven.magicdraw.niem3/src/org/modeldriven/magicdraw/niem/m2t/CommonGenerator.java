/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.modeldriven.magicdraw.niem.m2t;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.acceleo.common.AcceleoCommonPlugin;
import org.eclipse.acceleo.common.IAcceleoConstants;
import org.eclipse.acceleo.common.utils.ModelUtils;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.model.mtl.Module;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.PackageAdmin;

import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;

/**
 * Entry point of the 'CommonGenerator'  module.
 *
 */
abstract public class CommonGenerator extends AbstractAcceleoGenerator {
	static File saveTargetDirectory=null;
	static File getLastTargetDirectory(){return saveTargetDirectory;}
	/**
	 * Allows the public constructor to be used. Note that a generator created
	 * this way cannot be used to launch generations before one of
	 * {@link #initialize(EObject, File, List)} or
	 * {@link #initialize(URI, File, List)} is called.
	 * <p>
	 * The main reason for this constructor is to allow clients of this
	 * generation to call it from another Java file, as it allows for the
	 * retrieval of {@link #getProperties()} and
	 * {@link #getGenerationListeners()}.
	 * </p>
	 *
	 * @generated
	 */
	public CommonGenerator() {
    // Empty implementation
  }
	/**
	 * This will initialize all required information for this generator.
	 * 
	 * @param element
	 *            We'll iterate over the content of this element to find Objects matching the first parameter
	 *            of the template we need to call.
	 * @param folder
	 *            This will be used as the output folder for this generation : it will be the base path
	 *            against which all file block URLs will be resolved.
	 * @param arguments
	 *            If the template which will be called requires more than one argument taken from the model,
	 *            pass them here.
	 * @throws IOException
	 *             This can be thrown in two scenarios : the module cannot be found, or it cannot be loaded.
	 */
	public void initialize(EObject element, File folder, List<? extends Object> arguments) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		originalResources.addAll(resourceSet.getResources());

		// make sure that metamodel projects in the workspace override those in plugins
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());

		registerResourceFactories(resourceSet);
		registerPackages(resourceSet);

		addListeners();
		addProperties();

		String moduleName = getModuleName();
		if (moduleName.endsWith('.' + IAcceleoConstants.MTL_FILE_EXTENSION)) {
			moduleName = moduleName.substring(0, moduleName.lastIndexOf('.'));
		}
		if (!moduleName.endsWith('.' + IAcceleoConstants.EMTL_FILE_EXTENSION)) {
			moduleName += '.' + IAcceleoConstants.EMTL_FILE_EXTENSION;
		}

		URL moduleURL = findModuleURL(moduleName);
		//QvtCommonAction.log("CommonGenerator.initialize "+moduleURL);
		if (moduleURL == null) {
			throw new IOException("'" + getModuleName() + ".emtl' not found"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		URI moduleURI = createTemplateURI(moduleURL.toString());
		//QvtCommonAction.log("CommonGenerator.initialize moduleURI "+moduleURI);
		module = (Module)ModelUtils.load(moduleURI, resourceSet);
		//QvtCommonAction.log("CommonGenerator.initialize module "+module+", "+element);
		model = element;
		targetFolder = folder;
		saveTargetDirectory=folder;
		generationArguments = arguments;
	}


	  ////////////////////////////////////////////////////////////////
	/**
	 * Clients can override this if the default behavior doesn't properly find the emtl module URL.
	 * 
	 * @param moduleName
	 *            Name of the module we're searching for.
	 * @return The template's URL. This will use Eclipse-specific behavior if possible, and use the class
	 *         loader otherwise.
	 */
	protected URL findModuleURL(String moduleName) {return findModuleURLUtility(moduleName,getClass());}
	/**
	 * Creates the URI that will be used to resolve the template that is to be launched.
	 * 
	 * @param entry
	 *            The path towards the template file. Could be a jar or file scheme URI, or we'll assume it
	 *            represents a relative path.
	 * @return The actual URI from which the template file can be resolved.
	 */
	protected URI createTemplateURI(String entry) {return createTemplateURIUtility(entry);}
	/**
	 * Creates the URI that will be used to resolve the template that is to be launched.
	 * 
	 * @param entry
	 *            The path towards the template file. Could be a jar or file scheme URI, or we'll assume it
	 *            represents a relative path.
	 * @return The actual URI from which the template file can be resolved.
	 */
	public static URI createTemplateURIUtility(String entry) {
		if (entry.startsWith("file:") || entry.startsWith("jar:") || entry.startsWith("bundleentry:")||entry.startsWith("platform:")) { //$NON-NLS-1$ //$NON-NLS-2$ 
			URI result=URI.createURI(URI.decode(entry));
			//QvtCommonAction.log("CommonGenerator.createTemplateURI "+result+", "+entry);
			return result;
		}
		return URI.createFileURI(URI.decode(entry));
	}
	/**
	 * 
	 * @param moduleName
	 *            Name of the module we're searching for.
	 * @return The template's URL. This will use Eclipse-specific behavior if possible, and use the class
	 *         loader otherwise.
	 */
	static public URL findModuleURLUtility(String moduleName,Class clazz) {
		URL moduleURL = null;
			moduleURL = clazz.getResource(moduleName);
		return moduleURL;
	}
	/**
	 * This will try and find a resource of the given name using the bundle from which was originally loaded
	 * the given class so as to try and detect if it is jarred. If <code>clazz</code> hasn't been loaded from
	 * a bundle class loader, we'll resort to the default class loader mechanism. This will only return
	 * <code>null</code> in the case where the resource at <code>resourcePath</code> cannot be located at all.
	 * 
	 * @param clazz
	 *            Class which class loader will be used to try and locate the resource.
	 * @param resourcePath
	 *            Path of the resource we seek, relative to the class.
	 * @return The URL of the resource as we could locate it.
	 * @throws IOException
	 *             This will be thrown if we fail to convert bundle-scheme URIs into file-scheme URIs.
	 */
	public static URL getResourceURL(Class<?> clazz, String resourcePath) throws IOException {
		BundleContext context = AcceleoCommonPlugin.getDefault().getContext();
		ServiceReference packageAdminReference = context.getServiceReference(PackageAdmin.class.getName());
		PackageAdmin packageAdmin = null;
		if (packageAdminReference != null) {
			packageAdmin = (PackageAdmin)context.getService(packageAdminReference);
		}

		URL resourceURL = null;
		System.out.println("CommonGenerator.getResourceURL "+packageAdmin+", "+clazz.getName()+", "+resourcePath);
		if (packageAdmin != null) {
			Bundle bundle = packageAdmin.getBundle(clazz);
			if (bundle != null) {
				final String pathSeparator = "/"; //$NON-NLS-1$
				// We found the appropriate bundle. We'll now try and determine whether the emtl is jarred
				Enumeration<?> emtlFiles = bundle.findEntries(pathSeparator, resourcePath, true);
				if (emtlFiles != null && emtlFiles.hasMoreElements()) {
					resourceURL = (URL)emtlFiles.nextElement();
				}
				// This can only be a bundle-scheme URL if we found the URL. Convert it to file or jar scheme
				String urlPath=resourceURL.getPath();
				URI uri=URI.createPlatformPluginURI("/"+bundle.getSymbolicName()+urlPath,true);
				resourceURL=new URL(uri.toString());
				System.out.println("CommonGenerator.getResourceURL "+resourceURL+", "+urlPath);
								
if(false)				
				if (resourceURL != null) {
					resourceURL = FileLocator.resolve(resourceURL);
				}
System.out.println("CommonGenerator.getResourceURL "+resourceURL);
			}
		}
		/*
		 * We couldn't locate either the bundle which loaded the class or the resource. Resort to the class
		 * loader and return null if it cannot locate the resource either.
		 */
		if (resourceURL == null) {
			resourceURL = clazz.getResource(resourcePath);
		}

		if (packageAdminReference != null) {
			context.ungetService(packageAdminReference);
		}
		return resourceURL;
	}
	
	  ////////////////////////////////////////////////////////////////
	
	/**
	 * This can be used to update the resource set's package registry with all needed EPackages.
	 * 
	 * @param resourceSet
	 *            The resource set which registry has to be updated.
	 */
	@Override
	public void registerPackages(ResourceSet resourceSet) {
    super.registerPackages(resourceSet);

    resourceSet.getPackageRegistry().put(org.eclipse.ocl.ecore.EcorePackage.eINSTANCE.getNsURI(), org.eclipse.ocl.ecore.EcorePackage.eINSTANCE);
    // TODO If you need additional package registrations, do them here. The following line is an example for UML.
    // resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
    // get catalog metamodel
    resourceSet.getPackageRegistry().put("urn:oasis:names:tc:entity:xmlns:xml:catalog", 
    		oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage.eINSTANCE);
    
    // we need to get profile definitions
    resourceSet.getPackageRegistry().put("http://www.nomagic.com/magicdraw/UML/2.4.1", UMLPackage.eINSTANCE);
    resourceSet.getPackageRegistry().put("pathmap://MAGICDRAW/UML.ecore", UMLPackage.eINSTANCE);

    ResourceSet myResourceSet=new ResourceSetImpl();
    myResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
  }
	/**
	 * This can be used to update the resource set's resource factory registry with all needed factories.
	 * 
	 * @param resourceSet
	 *            The resource set which registry has to be updated.
	 */
	@Override
	public void registerResourceFactories(ResourceSet resourceSet) {
    super.registerResourceFactories(resourceSet);
    // TODO If you need additional resource factories registrations, do them here. The following line is an example for UML.
    // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("catalog",  new oasis.names.tc.entity.xmlns.xml.catalog.util.CatalogResourceFactoryImpl());
  }
	
}

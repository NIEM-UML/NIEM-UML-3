package org.modeldriven.magicdraw.niem.ecore2emof;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EMOFResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Ecore2emof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load ecore file;
		// create emof resource
		// move ecore objects to emof
		// save emof
		// done
		try {
		ResourceSet resourceSet=new ResourceSetImpl();
		Resource.Factory.Registry registry=resourceSet.getResourceFactoryRegistry();
		registry.getExtensionToFactoryMap().put("ecore",new EcoreResourceFactoryImpl());
		registry.getExtensionToFactoryMap().put("emof",new EMOFResourceFactoryImpl());

		String pathName="C:\\semtech.caCis\\RevisedSubmission\\XSD-RFC\\eclipse\\XSD.ecore";
		URI ecoreURI=URI.createFileURI(pathName);
		System.out.println("ecoreURI "+ecoreURI);
		//EcoreResourceFactoryImpl ecoreResourceFactory=new EcoreResourceFactoryImpl();
		//Resource ecoreResource=ecoreResourceFactory.createResource(ecoreURI);
		Resource ecoreResource=resourceSet.getResource(ecoreURI,true);
		System.out.println("ecoreResource "+ecoreResource);

		String emofPathName="C:\\semtech.caCis\\RevisedSubmission\\XSD-RFC\\eclipse\\XSD.emof";
		URI emofURI=URI.createFileURI(emofPathName);
		Resource emofResource=resourceSet.createResource(emofURI);
		System.out.println("emofResource "+emofResource);
		emofResource.getContents().addAll(ecoreResource.getContents());
		Map map=new HashMap();
			emofResource.save(map);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done ");
	}

}

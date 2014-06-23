/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.awt.Component;

import javax.swing.ProgressMonitor;

import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.xsd.XSDSchema;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.task.ProgressStatus;


/**
 * @author Tom
 *
 */
public class MDLog implements Log {
	ProgressStatus progressStatus;
	public MDLog(ProgressStatus progressStatusIn){
		progressStatus=progressStatusIn;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.m2m.qvt.oml.util.Log#log(java.lang.String)
	 */
	@Override
	public void log(String arg0) {
	    //Application.getInstance().getGUILog().log(arg0, false);
	    //Application.getInstance().getMainFrame().getStatusLine().setText(arg0);
	    if(progressStatus!=null){
		    Application.getInstance().getGUILog().log(arg0);
		    progressStatus.setDescription(arg0);
		    if(progressStatus.isCancel()){
		    	throw new CancelError();
		    }
	    }else{
	    	System.out.println(arg0);
	    }
	}

	/* (non-Javadoc)
	 * @see org.eclipse.m2m.qvt.oml.util.Log#log(int, java.lang.String)
	 */
	@Override
	public void log(int arg0, String arg1) {
		log(arg0+" "+arg1);
	}
//	protected static String setQnamePrefix="setQNamePrefixToNamespace,tns,";
//	protected static String setSchemaForSchemaPrefix="setSchemaForSchema,xsd,";
	/* (non-Javadoc)
	 * @see org.eclipse.m2m.qvt.oml.util.Log#log(java.lang.String, java.lang.Object)
	 */
	@Override
	public void log(String arg0, Object arg1) {
		// arg1 is always a String, can not communicate objects
		/*
		if(XSDSchema.class.isInstance(arg1) && arg0.startsWith(setQnamePrefix)){
			String namespace=arg0.substring(setQnamePrefix.length());
			log("setting schema namespace to " +namespace);
			((XSDSchema)arg1).getQNamePrefixToNamespaceMap().put("tns", namespace);
			return;
		}
		if(XSDSchema.class.isInstance(arg1) && arg0.startsWith(setSchemaForSchemaPrefix)){
			String namespace=arg0.substring(setSchemaForSchemaPrefix.length());
			log("setting schema for schema namespace " +namespace);
			XSDSchema schema=(XSDSchema)arg1;
			schema.setSchemaForSchemaQNamePrefix("xsd");
			schema.getQNamePrefixToNamespaceMap().put("xsd", namespace);
			schema.setIncrementalUpdate(false);
			return;
		}
		log(arg0+" (with) "+arg1.getClass().getName()+", "+XSDSchema.class.isInstance(arg1)+", "+arg0.startsWith(setQnamePrefix)+", "+arg0.startsWith(setSchemaForSchemaPrefix));
*/
		log(arg0+" (with) "+arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.m2m.qvt.oml.util.Log#log(int, java.lang.String, java.lang.Object)
	 */
	@Override
	public void log(int arg0, String arg1, Object arg2) {
		log(arg0+" "+arg1+" "+arg2);

	}

}

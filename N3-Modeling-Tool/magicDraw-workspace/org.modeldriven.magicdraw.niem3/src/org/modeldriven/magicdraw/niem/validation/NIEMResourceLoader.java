package org.modeldriven.magicdraw.niem.validation;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Properties;

import org.eclipse.emf.common.util.ResourceLocator;

public class NIEMResourceLoader implements ResourceLocator {
	public static NIEMResourceLoader INSTANCE=new NIEMResourceLoader();
	protected  Properties properties=new Properties();
	public NIEMResourceLoader() {
		InputStream inStream=getClass().getClassLoader().getResourceAsStream("org/modeldriven/magicdraw/niem/validation/NIEMResource.properties");
		
		try {
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void log(Exception e){
		
	}
	@Override
	public URL getBaseURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getImage(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString(String key) {
		// TODO Auto-generated method stub
	    String result=properties.getProperty(key);
	    if(result==null)result=key;
	    return result;
	}

	@Override
	public String getString(String key, boolean arg1) {
		// TODO Auto-generated method stub
	    String result=getString(key);
	    return result;
	}

	@Override
	public String getString(String key, Object[] substitutions) {
		// TODO Auto-generated method stub
//		return null;
	    String result=getString(key);
      return MessageFormat.format(result, substitutions);
/*	    
	    for(Object object:substitutions){
	    	if(object!=null){
	    		result+=" "+object.toString();
	    	}
	    }
	    return result;
	    */
	}

	@Override
	public String getString(String key, Object[] substitutions, boolean arg2) {
		// TODO Auto-generated method stub
		return getString(key,substitutions);
	}

}

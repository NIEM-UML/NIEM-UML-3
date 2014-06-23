/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;
import java.util.Set;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;

/**
 * @author tom
 *
 */
public class DiagramSelectionListenerRouter {
	public static DiagramSelectionListenerRouter INSTANCE=new DiagramSelectionListenerRouter();
	protected DiagramSelectionListenerRouter(){}
	protected Set<PropertyChangeListener> propertyChangeListeners=new HashSet<PropertyChangeListener>();
	public void addPropertyChangeListener (PropertyChangeListener  diagramSelectionListener){
		getPropertyChangeListeners().add(diagramSelectionListener);
		
	}
	public void removePropertyChangeListener (PropertyChangeListener  diagramSelectionListener){
		getPropertyChangeListeners().remove(diagramSelectionListener);
	}
	public  Set<PropertyChangeListener> getPropertyChangeListeners(){
		return propertyChangeListeners;
	}
	public void setSelection(PresentationElement pe,Element element){
		PropertyChangeEvent evt=new PropertyChangeEvent(pe, "element",element,element);
		for(PropertyChangeListener propertyChangeListener:propertyChangeListeners){
			propertyChangeListener.propertyChange(evt);
		}
	}

}

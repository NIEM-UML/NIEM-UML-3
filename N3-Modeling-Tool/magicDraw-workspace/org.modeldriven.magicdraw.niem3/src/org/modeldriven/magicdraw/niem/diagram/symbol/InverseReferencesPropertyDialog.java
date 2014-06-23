package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.util.Collection;
import java.util.HashSet;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

public class InverseReferencesPropertyDialog extends ReferencesPropertyDialog {

	public InverseReferencesPropertyDialog(PresentationElement pe,
			Class browserClassifier) {
		super(pe, browserClassifier);
		// TODO Auto-generated constructor stub
	}
	 protected String getTitle(){
			return("Select Inverse References Properties to be added");

		 }
	
		 protected Collection<Class> getRestrictedClasses(Classifier clientClassifier){
			 Collection<Class> result=new HashSet<Class>();
			//Class restrictedClass=null;
			for(DirectedRelationship test:clientClassifier.get_directedRelationshipOfTarget()){
				if(NIEMHelper.isReferences(test)){
					for(Element supplier:test.getSource()){
						if(Class.class.isInstance(supplier)&&NIEMHelper.isInInformationModel((Class)supplier)){
							//restrictedClass=(Class)supplier;
							result.add((Class)supplier);
						}
					}
				}
			}
			if(result.size()==0){
				QvtCommonAction.log("ERROR: NO Inverse <<References>> to ComplexType");
				//return;
			}

			return result;
		 }
	

}

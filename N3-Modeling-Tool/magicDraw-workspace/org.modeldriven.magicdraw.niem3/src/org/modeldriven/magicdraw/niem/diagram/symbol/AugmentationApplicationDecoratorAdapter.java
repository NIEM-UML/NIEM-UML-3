/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElementTextEnum;
import com.nomagic.magicdraw.uml.symbols.manipulators.ViewManipulator;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author Tom
 *
 */
public class AugmentationApplicationDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public AugmentationApplicationDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	/* never called?
	public String createRepresentationText(PresentationElement pe){
		String test=super.createRepresentationText(pe);
		System.out.println("createRepresentationText "+test);
		return test;
	}
	*/
	/*
	public String getText(PresentationElement pe,PresentationElementTextEnum pete){
		pete.
	}
	*/
	// no update, check made by isConnectable
	public boolean isConnectable2Obj(PathElement pe,PresentationElement supplier,PresentationElement client){
// TODO: how to get Status to show.........................suppress other, listen to mouse and override, another place,tooltip?
		// or timer to override for a while?
		//ViewManipulator manipulator=this.getManipulator(pe);
		//manipulator.getContainer().
		// TODO: inverse
		
		setStatusText(null);
		
		Element supplierElement=((supplier==null)?null:supplier.getElement());
		Element clientElement=((client==null)?null:client.getElement());
		if((clientElement==null)&&(supplierElement==null))return false;
		if(clientElement!=null){
			if(!(clientElement instanceof Property)) {
				setStatusText("<<AugmentationApplication>> Client must be a Property");
				return false;
			}
//			(client==null)
//					||!Property.class.isInstance(client.getElement())
//					)return false;
			Property clientProperty=(Property)clientElement;
			Type clientType=clientProperty.getType();
			Classifier clientClassifier=null;
			if(Classifier.class.isInstance(clientType))clientClassifier=(Classifier)clientType;
			if((clientClassifier==null)
					||!NIEMHelper.isAugmentationType(clientClassifier)
					){
				//QvtCommonAction.log("<<AugmentationApplication>> Client Property must be typed by an <<AugmentationType>>");
				setStatusText("<<AugmentationApplication>> Client Property must be typed by an <<AugmentationType>>");
				return false;
			}
			if(!isInInformationModel(clientProperty)){
				setStatusText("<<AugmentationApplication>> Property must be in an <<InformationModel>>");
				return false;
			}
		}
		if(supplierElement!=null){
			if(!NIEMHelper.canBeAugmentationApplicationSupplier(supplierElement)){
				setStatusText("<<AugmentationApplication>> Supplier can not be <<Choice>>,<<PropertyHolder>>; must be a Class in an <<InformationModel>>");
				return false;
				
			}
			/*
			if(!(supplierElement instanceof Class)){
				setStatusText("<<AugmentationApplication>> Supplier must be a Class");
				return false;
			}
			//if((supplier==null)||(supplier.getElement()==null))return true; 
			//Element supplierElement=supplier.getElement();
			// but not a choice or a PropertyHolder
	//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class c=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)supplierElement;
			if(!isClassifierAllowed(c))return false;
			if(!isInInformationModel(c)){
				setStatusText("<<AugmentationApplication>> Supplier must be in an <<InformationModel>>");
				return false;
			}
			*/
			Classifier c=(Classifier)supplierElement;
			if(clientElement!=null){
				if(clientElement instanceof Property) {
					Property clientProperty=(Property)clientElement;
	
					if(NIEMHelper.isPropertyHolder(clientProperty.getOwner()))return true;
//					if(NIEMHelper.hasStereotype(clientProperty.getOwner(),NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName)))return true;
					Classifier clientOwningClassifier=NameHelper.getOwningClassifier(clientProperty);
					if ((c==clientOwningClassifier) || !isSuperTypeOf(c,clientOwningClassifier)){
						setStatusText("<<AugmentationApplication>> Supplier must be inherited by Property's Class");
						//QvtCommonAction.log("<<AugmentationApplication>> Supplier must be inherited by client Property\'s Class, client Property "+clientProperty.getQualifiedName());
						return false;
					}
				}
			}
			//setStatusText("Supplier is "+c.getQualifiedName());
		}
		return true;
		/*
		 * The AugmentationApplication stereotype is a specialization of Application that is always between a Property 
		 * whose type is an AugmentationType Class and a Class. 
		 * It represents a constraint on a NEIM augmentation property that limits the application of the property to specific types. 
		 * When an augmentation property is the client of an AugmentationApplication Usage, 
		 * this serves to constrain the NIEM types to which the augmentation property may apply. 
		 * If the client augmentation Property is not in a PropertyHolder, 
		 * then its Class must be a (direct or indirect) subclass of the supplier Class of the AugmentationApplication. 
		 * If the augmentation Property is in a PropertyHolder, 
		 * then any Property defined by reference to the augmentation Property must be for a Class that is a subclass of the supplier Class.
		 */
	}
	protected boolean isClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be supplier of a <<AugmentationApplication>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be supplier of a <<AugmentationApplication>>");
			//QvtCommonAction.log("<<PropertyHolder>> can not be supplier of a <<AugmentationApplication>>");
			return false;
		}
		return true;
	}
}

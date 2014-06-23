/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
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

/**
 * @author Tom
 *
 */
public class MetadataApplicationDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public MetadataApplicationDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	// no update, check made by isConnectable
	public boolean isConnectable2Obj(PathElement pe,PresentationElement supplier,PresentationElement client){
		setStatusText(null);
		
		Element supplierElement=((supplier==null)?null:supplier.getElement());
		Element clientElement=((client==null)?null:client.getElement());
		if((clientElement==null)&&(supplierElement==null))return false;
		
		//if((client==null)||!Class.class.isInstance(client.getElement())	)return false;
		if(clientElement!=null){
			if(!(clientElement instanceof Class)){
				setStatusText("<<MetadataApplication>> Client must be a Class");
				return false;
			}
			Class clientClass=(Class)clientElement;
			//System.out.println("MeadataAppicationDecoratorAdapter clientClass "+clientClass);
			if(!NIEMHelper.hasStereotype(clientClass,NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
				setStatusText("<<MetadataApplication>> Client must be a <<MetadataType>>");
				return false;
			}
			if(!isInInformationModel(clientClass)){
				setStatusText("<<MetadataApplication>> Client must be in an <<InformationModel>>");
				return false;
			}
		}
		//if((supplier==null)||(supplier.getElement()==null))return true; 
		//Element supplierElement=supplier.getElement();
		/*
		String metaClassName=supplierElement.eClass().getName();
		if(!"Class".equals(metaClassName)){
			setStatusText("<<MetadataApplication>> Supplier must be a Class");
			return false;
		}
		*/
		//System.out.println("MeadataAppicationDecoratorAdapter supplierElement "+supplierElement);
		if(supplierElement!=null){
			if(!NIEMHelper.canBeMetadataApplicationSupplier(supplierElement)){
				setStatusText("<<MetadataApplication>> can not be <<Choice>>, <<PropertyHolder>>; must be a Classifier representing ComplexType and be in an <<InformationModel>>");
				return false; 
			}
			/*
			if(!(supplierElement instanceof Classifier)){
				setStatusText("Supplier must be a Classifier");
				return false; 
			}
			if(!NIEMHelper.isComplexType((Classifier)supplierElement)){
				setStatusText("Supplier must represent a ComplexType");
				return false; 
			}
			
			// but not a choice or a PropertyHolder
			com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier c=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier)supplierElement;
			//System.out.println("MeadataAppicationDecoratorAdapter c "+c.getQualifiedName());
			if(!isClassifierAllowed(c))return false;
			if(!isInInformationModel(c)){
				setStatusText("<<MetadataApplication>> Supplier must be in an <<InformationModel>>");
				return false;
			}
			*/
		}
		return true;
	}
	/*
	protected boolean isClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be supplier of a <<MetadataApplication>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be supplier of a <<MetadataApplication>>");
			return false;
		}
		return true;
	}
	*/
}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.AssociationView;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;

/**
 * @author Tom
 *
 */
public class AssociationDecoratorAdapter extends ContentDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public AssociationDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		//QvtCommonAction.log("RoleOfDecoratorAdapter.isConnectable2Obj "+pe+", "+general+", "+specific);
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
			if(specificElement==null)return false;
			if(!Class.class.isInstance(specificElement)){
				setStatusText("Client must be a Class");
				return false;
			}
			if(!isClassifierAllowed(specificElement))return false;
			if(!isInInformationModel(specificElement)){
				setStatusText("Client must be in an <<InformationModel>>");
				return false;
			}
			if(generalElement==null)return true; 
			if(!(generalElement instanceof Classifier)){
				setStatusText("Supplier must be a Classifier");
				return false; 
			}
			if(!Class.class.isInstance(generalElement)){
				setStatusText("Supplier must be a Class");
				return false;
			}
			if(!isClassifierAllowed(generalElement))return false;
			if(!isInInformationModel(generalElement)){
				setStatusText("Supplier must be in an <<InformationModel>>");
				return false;
			}
			// both specific and general should be InformationModel, 
		return true;
	}
	
}

/**
 * 
 */
package org.modeldriven.magicdraw.niem.instance;

import java.util.Collection;

import org.eclipse.xsd.XSDDiagnostic;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.impl.XSDSimpleTypeDefinitionImpl;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralNull;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralReal;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;

/**
 * @author tom
 *
 */
public class SimpleTypeInstance {
//	protected XSDSimpleTypeDefinitionImpl simpleType;
	protected XSDSimpleTypeDefinition simpleType;
	protected LiteralSpecification literalSpecification;
	public SimpleTypeInstance(XSDSimpleTypeDefinition simpleTypeIn,LiteralSpecification literalSpecificationIn){
		simpleType=simpleTypeIn;
		literalSpecification=literalSpecificationIn;
	}
	public Object getValue(){
		return getValue(getValueString());
	}
	public String getValueString(){
		return getLiteralValueString();
	}
	public void setValueString(String literal){
		setLiteralValueString(literal);
	}
	public void setDefaultValue(){
		setLiteralDefaultValue();
	}
	public Collection<XSDDiagnostic> 	getDiagnostics() {
		return getDiagnostics(getLiteralValueString());
	}
	
	protected XSDSimpleTypeDefinition getSimpleType(){return simpleType;}
	protected LiteralSpecification getLiteralSpecification(){return literalSpecification;}
	protected Object getValue(String literal){
		return getSimpleType().getValue(literal);
	}
	protected  XSDSimpleTypeDefinition.Assessment 	assess(String literal){
		return getSimpleType().assess(literal);
	}
	protected Collection<XSDDiagnostic> 	getDiagnostics(String literal) {
		return assess(literal).getDiagnostics();
	}
	protected String getLiteralValueString(){
		LiteralSpecification literalSpecification=getLiteralSpecification();
		return getLiteralValueString(literalSpecification);
	}
	protected String getLiteralValueString(LiteralSpecification literalSpecification){
		if(literalSpecification instanceof LiteralString)return getLiteralValueString((LiteralString)literalSpecification);
		else if(literalSpecification instanceof LiteralBoolean)return getLiteralValueString((LiteralBoolean)literalSpecification);
		else if(literalSpecification instanceof LiteralInteger)return getLiteralValueString((LiteralInteger)literalSpecification);
		else if(literalSpecification instanceof LiteralNull)return getLiteralValueString((LiteralNull)literalSpecification);
		else if(literalSpecification instanceof LiteralReal)return getLiteralValueString((LiteralReal)literalSpecification);
		else return getLiteralValueString((LiteralUnlimitedNatural)literalSpecification);
	}
	
	protected String getLiteralValueString(LiteralString vs){
		return vs.getValue();
	}
	protected String getLiteralValueString(LiteralBoolean vs){
		return Boolean.toString(vs.isValue());
	}
    
	protected String getLiteralValueString(LiteralInteger vs){
		return Integer.toString(vs.getValue());
	}
	protected String getLiteralValueString(LiteralNull vs){
		return null;
	}
	protected String getLiteralValueString(LiteralReal vs){
		return Double.toString(vs.getValue());
	}
	protected String getLiteralValueString(LiteralUnlimitedNatural vs){
		return Integer.toString(vs.getValue());
	}
	protected void setLiteralValueString(String literal){
		LiteralSpecification literalSpecification=getLiteralSpecification();
		if(literalSpecification instanceof LiteralString) setLiteralValueString((LiteralString)literalSpecification,literal);
		else if(literalSpecification instanceof LiteralBoolean) setLiteralValueString((LiteralBoolean)literalSpecification,literal);
		else if(literalSpecification instanceof LiteralInteger) setLiteralValueString((LiteralInteger)literalSpecification,literal);
		else if(literalSpecification instanceof LiteralNull) setLiteralValueString((LiteralNull)literalSpecification,literal);
		else if(literalSpecification instanceof LiteralReal) setLiteralValueString((LiteralReal)literalSpecification,literal);
		else  setLiteralValueString((LiteralUnlimitedNatural)literalSpecification,literal);
	}
	
	protected void setLiteralValueString(LiteralString vs,String literal){
		 vs.setValue(literal);
	}
	protected void setLiteralValueString(LiteralBoolean vs,String literal){
		vs.setValue(Boolean.getBoolean(literal));
	}
    
	protected void setLiteralValueString(LiteralInteger vs,String literal){
		vs.setValue(Integer.getInteger(literal));
	}
	protected void setLiteralValueString(LiteralNull vs,String literal){
	}
	protected void setLiteralValueString(LiteralReal vs,String literal){
		vs.setValue(Double.valueOf(literal));
	}
	protected void setLiteralValueString(LiteralUnlimitedNatural vs,String literal){
		vs.setValue(Integer.getInteger(literal));
	}
	
	protected void setLiteralDefaultValue(){
		LiteralSpecification literalSpecification=getLiteralSpecification();
		Slot slot=literalSpecification.getOwningSlot();
		String defaultValue="";
		if(slot!=null){
			StructuralFeature structuralFeature=slot.getDefiningFeature();
			if(structuralFeature instanceof Property){
				Property property=(Property)structuralFeature;
				ValueSpecification vs=property.getDefaultValue();
				if(vs instanceof LiteralSpecification){
					defaultValue=getLiteralValueString((LiteralSpecification)vs);
				}else{
					// if property or its <<PropertyHolder>> has "fixed", use that
					defaultValue=property.getDefault();
				}
			}
		}
		if(literalSpecification instanceof LiteralString) setLiteralDefaultValue((LiteralString)literalSpecification,defaultValue);
		else if(literalSpecification instanceof LiteralBoolean) setLiteralDefaultValue((LiteralBoolean)literalSpecification,defaultValue);
		else if(literalSpecification instanceof LiteralInteger) setLiteralDefaultValue((LiteralInteger)literalSpecification,defaultValue);
		else if(literalSpecification instanceof LiteralNull) setLiteralDefaultValue((LiteralNull)literalSpecification,defaultValue);
		else if(literalSpecification instanceof LiteralReal) setLiteralDefaultValue((LiteralReal)literalSpecification,defaultValue);
		else  setLiteralDefaultValue((LiteralUnlimitedNatural)literalSpecification,defaultValue);
	}
	
	protected void setLiteralDefaultValue(LiteralString vs,String defaultValue){
		setLiteralValueString(vs,defaultValue);
	}
	protected void setLiteralDefaultValue(LiteralBoolean vs,String defaultValue){
		setLiteralValueString(vs,defaultValue);
	}
    
	protected void setLiteralDefaultValue(LiteralInteger vs,String defaultValue){
		setLiteralValueString(vs,defaultValue);
	}
	protected void setLiteralDefaultValue(LiteralNull vs,String defaultValue){
		setLiteralValueString(vs,defaultValue);
	}
	protected void setLiteralDefaultValue(LiteralReal vs,String defaultValue){
		setLiteralValueString(vs,defaultValue);
	}
	protected void setLiteralDefaultValue(LiteralUnlimitedNatural vs,String defaultValue){
		setLiteralValueString(vs,defaultValue);
	}
}

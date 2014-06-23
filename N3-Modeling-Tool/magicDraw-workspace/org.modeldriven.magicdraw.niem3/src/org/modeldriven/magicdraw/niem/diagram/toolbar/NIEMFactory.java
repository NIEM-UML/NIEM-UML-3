/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;


import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.copypaste.CopyPasting;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralReal;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class NIEMFactory implements NIEM_ProfileConstants{
	public static NIEMFactory instance=new NIEMFactory();
	protected NIEMFactory(){}
	public Realization createReferences(NamedElement client,NamedElement supplier) {
		Realization references = Application.getInstance().getProject().getElementsFactory().createRealizationInstance();
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(ReferencesStereotypeName);
		//Profile commonProfile=getCommonProfile();
		NIEMHelper.addStereotype(references,stereotype);
		references.getClient().add(client);
		references.getSupplier().add(supplier);
		Package owner=null;
		if(Package.class.isInstance(client))owner=(Package)client;
		else owner=NIEMHelper.getNearestPackage(client);
		owner.getPackagedElement().add(references);
		return references;
	}
	/*
	public Usage createModelPackageDescriptionFile(Component client,NamedElement supplier) {
		Usage references = Application.getInstance().getProject().getElementsFactory().createUsageInstance();
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getModelPackageDescriptionFileStereotype();
		//Profile commonProfile=getCommonProfile();
		NIEMHelper.addStereotype(references,stereotype);
		references.getClient().add(client);
		references.getSupplier().add(supplier);
		Package owner=null;
		if(Package.class.isInstance(client))owner=(Package)client;
		else owner=NIEMHelper.getNearestPackage(client);
		owner.getPackagedElement().add(references);
		NIEMHelper.set
		NatureCode
		return references;
	}
	*/
	public Slot createSlot(Property property,InstanceSpecification instanceSpecification) {
		if(property==null){return null;}
		if(instanceSpecification==null){return null;}
		Classifier owningClassifier=NameHelper.getOwningClassifier(property);
		if(owningClassifier==null){return null;}
		Slot slot = Application.getInstance().getProject().getElementsFactory().createSlotInstance();
		slot.setDefiningFeature(property);
		slot.setOwningInstance(instanceSpecification);
		boolean hasClassifier=false;
			for(Classifier classifier:instanceSpecification.getClassifier()){
				
				if(classifier.equals(owningClassifier)
						||NIEMHelper.getAllParents(classifier).contains(owningClassifier)){
					hasClassifier=true;
					break;
				}
			}
			if(!hasClassifier){
				instanceSpecification.getClassifier().add(owningClassifier);
			}
		return slot;
	}
	public InstanceSpecification createInstanceSpecification(Classifier classifier,Package owner,String name) {
		if(classifier==null){return null;}
		if(owner==null){return null;}
		InstanceSpecification instanceSpecification = Application.getInstance().getProject().getElementsFactory().createInstanceSpecificationInstance();
		instanceSpecification.getClassifier().add(classifier);
		instanceSpecification.setName(name);
		instanceSpecification.setOwningPackage(owner);
		return instanceSpecification;
	}
	public InstanceValue createInstanceValue(InstanceSpecification instanceSpecification,Slot owner,String name,Type type) {
		if(instanceSpecification==null){return null;}
		if(owner==null){return null;}
		InstanceValue instanceValue = Application.getInstance().getProject().getElementsFactory().createInstanceValueInstance();
		instanceValue.setInstance(instanceSpecification);
		instanceValue.setName(name);
		instanceValue.setOwningSlot(owner);
		instanceValue.setType(type);
		return instanceValue;
	}
	public LiteralBoolean createLiteralBoolean(Slot owner,boolean value,String name,Type type) {
		if(owner==null){return null;}
		LiteralBoolean instanceValue = Application.getInstance().getProject().getElementsFactory().createLiteralBooleanInstance();
		instanceValue.setName(name);
		instanceValue.setOwningSlot(owner);
		instanceValue.setValue(value);
		instanceValue.setType(type);
		return instanceValue;
	}
	public LiteralInteger createLiteralInteger(Slot owner,int value,String name,Type type) {
		if(owner==null){return null;}
		LiteralInteger instanceValue = Application.getInstance().getProject().getElementsFactory().createLiteralIntegerInstance();
		instanceValue.setName(name);
		instanceValue.setOwningSlot(owner);
		instanceValue.setValue(value);
		instanceValue.setType(type);
		return instanceValue;
	}
	public LiteralReal createLiteralReal(Slot owner,double value,String name,Type type) {
		if(owner==null){return null;}
		LiteralReal instanceValue = Application.getInstance().getProject().getElementsFactory().createLiteralRealInstance();
		instanceValue.setName(name);
		instanceValue.setOwningSlot(owner);
		instanceValue.setValue(value);
		instanceValue.setType(type);
		return instanceValue;
	}
	public LiteralString createLiteralString(Slot owner,String value,String name,Type type) {
		if(owner==null){return null;}
		LiteralString instanceValue = Application.getInstance().getProject().getElementsFactory().createLiteralStringInstance();
		instanceValue.setName(name);
		instanceValue.setOwningSlot(owner);
		instanceValue.setValue(value);
		instanceValue.setType(type);
		return instanceValue;
	}
	public Constraint createConstraint(Classifier owner,String name,Stereotype validationRule,String language,String body) {
		if(owner==null){return null;}
		Constraint constraint = Application.getInstance().getProject().getElementsFactory().createConstraintInstance();
		constraint.setName(name);
		owner.getOwnedRule().add(constraint);
		NIEMHelper.addStereotype(constraint, validationRule);
		constraint.getConstrainedElement().add(owner);
		OpaqueExpression specification= Application.getInstance().getProject().getElementsFactory().createOpaqueExpressionInstance();
		constraint.setSpecification(specification);
		specification.getLanguage().add(language);
		specification.getBody().add(body);
		return constraint;
	}

	public Package createInformationModel() {
		
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel= UMLFactory.eINSTANCE.createPackage();
		
		// do we need an owner now?
//		addPackagedElement(informationModel);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		
		//informationModel.setName(InformationModelStereotypeName);
//		setName(informationModel);
		
		//URL location=getClass().getResource("/com/nomagic/magicdraw/icons/icons16/package.gif");
		//informationModel.setName(location+"");
		
		
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getPimStereotype(InformationModelStereotypeName);
		Profile pimProfile=getPimProfile();
//		applyStereotype(informationModel,stereotype);
		NIEMHelper.addStereotype(informationModel,stereotype);
		Enumeration defaultPurposeCode=(Enumeration)NIEMHelper.getType(pimProfile,DefaultPurposeCodeTypeName);
		EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(defaultPurposeCode,subsetLiteralName);
		NIEMHelper.setStereotypePropertyValue(informationModel,stereotype,defaultPurposeTagName,defaultPurpose);
//		NIEMHelper.setStereotypePropertyValue(informationModel,stereotype,targetNamespaceTagName,"http://niem.gov/niem/"+InformationModelStereotypeName);
		NIEMHelper.setNamespaceTargetNamespace(informationModel,"http://niem.gov/niem/"+InformationModelStereotypeName);
		
		return informationModel;
	}
	protected Classifier createClassifierInstance(Classifier example){
		Classifier result=null;
		if(AssociationClass.class.isInstance(example))result=Application.getInstance().getProject().getElementsFactory().createAssociationClassInstance();
		else if(Class.class.isInstance(example))result=Application.getInstance().getProject().getElementsFactory().createClassInstance();
		else if(PrimitiveType.class.isInstance(example))result=Application.getInstance().getProject().getElementsFactory().createPrimitiveTypeInstance();
		else if(Enumeration.class.isInstance(example))result=Application.getInstance().getProject().getElementsFactory().createEnumerationInstance();
		else result=Application.getInstance().getProject().getElementsFactory().createDataTypeInstance();
		result.setName(example.getName());
		// get applied stereotypes on example and apply to new 
		result.setAbstract(example.isAbstract());
		result.setLeaf(example.isLeaf());
		populateNamedElement(result,example);
		return result;
	}
	public Association shallowAssociationCopy(Association referenceAssociation,Property subsetClassifierProperty){
		// create Target Association, copies name, comment, and applied stereotypes
//		Association subsetAssociation = Application.getInstance().getProject().getElementsFactory().createAssociationInstance();
		Association subsetAssociation = UMLFactory.eINSTANCE.createAssociation();
		NIEMHelper.getNearestInformationModel(subsetClassifierProperty).getPackagedElement().add(subsetAssociation);

		
		subsetAssociation.getMemberEnd().add(subsetClassifierProperty);
		Property subsetOwnedEnd = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		subsetOwnedEnd.setType(NameHelper.getOwningClassifier(subsetClassifierProperty));
		subsetOwnedEnd.setAggregation(AggregationKindEnum.NONE);
		subsetOwnedEnd.setDerived(false);
		subsetOwnedEnd.setReadOnly(false);
		subsetOwnedEnd.setOrdered(false);
		subsetOwnedEnd.setUnique(false);
		subsetOwnedEnd.setVisibility(VisibilityKindEnum.PUBLIC);
		Blackbox.setLower(subsetOwnedEnd, 0);
		Blackbox.setUpper(subsetOwnedEnd, -1);
		subsetAssociation.getOwnedEnd().add(subsetOwnedEnd);
		
		/*
		subsetAssociation.getOwnedEnd().clear();// does MD place ownedEnds on ?
		
		subsetAssociation.setName(referenceAssociation.getName());
//		subsetAssociation.setName("");
		// get applied stereotypes on example and apply to new 
		subsetAssociation.setAbstract(referenceAssociation.isAbstract());
		subsetAssociation.setLeaf(referenceAssociation.isLeaf());
		populateNamedElement(subsetAssociation,referenceAssociation);
		//subsetClassifierProperty.setAssociation(subsetAssociation);
		subsetAssociation.getMemberEnd().add(subsetClassifierProperty);
		
		//subsetAssociation.getEndType().add(subsetClassifierProperty.getClassifier());
		//subsetAssociation.getEndType().add(subsetClassifierProperty.getType());
		
		
		for(Property referenceOwnedEnd:referenceAssociation.getOwnedEnd()){
			Property subsetOwnedEnd=shallowPropertyCopy(referenceOwnedEnd);
			subsetOwnedEnd.setType(subsetClassifierProperty.getClassifier());
			subsetAssociation.getOwnedEnd().add(subsetOwnedEnd);
			subsetAssociation.getMemberEnd().add(subsetOwnedEnd);
			//subsetOwnedEnd.setOwningAssociation(subsetAssociation);
			//break;// test : why multiple ownedEnds?
		}
		*/
		return subsetAssociation;
	}
	static protected void populateElement(Element result,Element example){
		for(Comment comment:example.getOwnedComment()){
			Comment newComment=(Comment)CopyPasting.copyPasteElement(comment, result);
			newComment.getAnnotatedElement().remove(example);
			newComment.getAnnotatedElement().add(result);
			
		}
		CopyPasting.copyPasteElement(example.getAppliedStereotypeInstance(),result);
	}
	static protected void populateNamedElement(NamedElement result,NamedElement example){
		populateElement(result,example);
		result.setName(example.getName());
		result.setVisibility(example.getVisibility());
	}
	public Dependency createDependencyInstance(Dependency example,NamedElement client,NamedElement supplier){
		Dependency result=null;
		// refine to specific ; copy stereotypes
		if(Realization.class.isInstance(example))result=Application.getInstance().getProject().getElementsFactory().createRealizationInstance();
		else if(Usage.class.isInstance(example))result=Application.getInstance().getProject().getElementsFactory().createUsageInstance();
		else result=Application.getInstance().getProject().getElementsFactory().createDependencyInstance();
		result.getClient().add(client);
		result.getSupplier().add(supplier);
		// get applied stereotypes on example and apply to new 
		populateNamedElement(result,example);
		NIEMHelper.getNearestPackage(client).getPackagedElement().add(result);
		return result;
	}
	public Generalization createGeneralizationInstance(Generalization example,Classifier specific,Classifier general){
		Generalization result=Application.getInstance().getProject().getElementsFactory().createGeneralizationInstance();
		result.setSpecific(specific);
		result.setGeneral(general);
		// get applied stereotypes on example and apply to new 
		populateElement(result,example);
		return result;
	}
	public Classifier shallowClassifierCopy(Classifier source){
		// create Target Classifier, copies name, comment, and applied stereotypes
		Classifier targetClassifier = createClassifierInstance(source);
		return targetClassifier;
	}
	public Package shallowPackageCopy(Package source){
		// create Target Package, copies name, comment, and applied stereotypes
		Package targetPackage = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		populateNamedElement(targetPackage,source);
		return targetPackage;
	}
	public EnumerationLiteral shallowEnumerationLiteralCopy(EnumerationLiteral source){
		// create Target EnumerationLiteral, copies name, comment, and applied stereotypes
		EnumerationLiteral result = Application.getInstance().getProject().getElementsFactory().createEnumerationLiteralInstance();
		result.setVisibility(source.getVisibility());
		populateNamedElement(result,source);
		return result;
	}
	public Property shallowPropertyCopy(Property source){
		// create Target Package, copies name, comment, and applied stereotypes
		Property result = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		populateProperty(source,result);
		/*
		result.setVisibility(source.getVisibility());
		result.setAggregation(source.getAggregation());
		result.setDerived(source.isDerived());
		result.setDerivedUnion(source.isDerivedUnion());
		result.setLeaf(source.isLeaf());
		result.setOrdered(source.isOrdered());
		result.setReadOnly(source.isReadOnly());
		result.setStatic(source.isStatic());
		result.setUnique(source.isUnique());
	
		populateNamedElement(result,source);
		result.setLowerValue((ValueSpecification)CopyPasting.copyPasteElement(source.getLowerValue(),result));
		result.setUpperValue((ValueSpecification)CopyPasting.copyPasteElement(source.getUpperValue(),result));
		result.setDefaultValue((ValueSpecification)CopyPasting.copyPasteElement(source.getDefaultValue(),result));
*/
		return result;
	}
	public static void populateProperty(Property source,Property result){
		// create Target Package, copies name, comment, and applied stereotypes
		//Property result = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		result.setVisibility(source.getVisibility());
		result.setAggregation(source.getAggregation());
		result.setDerived(source.isDerived());
		result.setDerivedUnion(source.isDerivedUnion());
		result.setLeaf(source.isLeaf());
		result.setOrdered(source.isOrdered());
		result.setReadOnly(source.isReadOnly());
		result.setStatic(source.isStatic());
		result.setUnique(source.isUnique());
	
		populateNamedElement(result,source);
		result.setLowerValue((ValueSpecification)CopyPasting.copyPasteElement(source.getLowerValue(),result));
		result.setUpperValue((ValueSpecification)CopyPasting.copyPasteElement(source.getUpperValue(),result));
		result.setDefaultValue((ValueSpecification)CopyPasting.copyPasteElement(source.getDefaultValue(),result));

		//return result;
	}
	static protected void setStereotypePropertyValue(Element element,Stereotype stereotype,java.lang.String propertyName,java.lang.Object value,Boolean append){
		StereotypesHelper.setStereotypePropertyValue(element,stereotype,propertyName,value,append);
	}
	
	/*
	static	protected void setName(NamedElement element,String name){
		element.setName("My"+name);
	}
	protected void setName(NamedElement element){
//		element.setName("My"+getName());
		setName(element,getName());
	}
	protected void setSimpleTypeName(NamedElement element){
		element.setName("My"+getName()+"SimpleType");
	}
	protected void setCodeSimpleTypeName(NamedElement element){
		element.setName("My"+getName()+"CodeSimpleType");
	}
	protected void setTypeName(NamedElement element){
		element.setName("My"+getName()+"Type");
	}
	*/
	static protected Stereotype getMpdStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getMpdProfile()); 
	}
	static protected Stereotype getPimStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getPimProfile()); 
	}
	static protected Stereotype getCommonStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getCommonProfile()); 
	}
	static protected Profile getPimProfile(){
		return getProfile(PimProfileName); 
	}
	static protected Profile getPsmProfile(){
		return getProfile(PsmProfileName); 
	}
	static protected Profile getMpdProfile(){
		return getProfile(MpdProfileName); 
	}
	static protected Profile getCommonProfile(){
		return getProfile(CommonProfileName); 
	}
	static protected Profile getProfile(String profileName){
		return StereotypesHelper.getProfile(getProject(),profileName);
	}
	static protected Project getProject(){
		return Application.getInstance().getProject();
	}

}

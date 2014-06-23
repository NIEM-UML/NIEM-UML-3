package org.modeldriven.magicdraw.niem.validate;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;

abstract public class NameValidationRule extends BaseValidationRule {
    /**
     * {@inheritDoc}
     */
    @Override
	protected Collection<? extends Element> getInvalidElements(Constraint constraint,
                                                               Collection<? extends Element> elements)
    {
        Collection<Element> result = new ArrayList<Element>();
//if(true)return result;// TODO: temporary suppress most validations        
    	int size=elements.size();
    	int count=0;
    	int statusLineCount=0;
    	String validationName=this.getClass().getName();
    	//setStatusText(validationName+" start for "+size+" elements");
        long startTime=System.currentTimeMillis();
        for (Element element : elements)
        {
        	count++;
//        	if(!NamedElement.class.isInstance(element))continue;
        	if(!element.isEditable())continue;
			statusLineCount--;
			if(statusLineCount<=0){
	    		setStatusText(validationName+" "+count+"/"+size);
				statusLineCount=200;
			}
        	try{
            	if(!NamedElement.class.isInstance(element)){
                	if(isElementInvalid(element))result.add(element);
            		
            	}else{
        	if(isNameInvalid((NamedElement)element))result.add(element);
            	}
        	}catch(Throwable t){
        		t.printStackTrace();
        	}
        }
        long elpasedTime=System.currentTimeMillis()-startTime;
        if(elpasedTime>10000){
        	setStatusText(validationName+" validation complete "+elpasedTime+" ms");
        }
        return result;
    }
    protected boolean isElementInvalid(Element namedElement){return false;}
    abstract protected boolean isNameInvalid(NamedElement namedElement);
    //////////////////////////////////////////////////////////
    static public class FixNameSuffixAction extends NMAction implements AnnotationAction
    {
        private Classifier mClassifier;
        protected String mSuffix;

        public FixNameSuffixAction(Classifier classifier,String suffix)
        {
            super("FIX_NAME", "Fix Name", 0);
            mClassifier = classifier;
            mSuffix=suffix;
        }

        /**
         * Executes the action.
         *
         * @param e event caused execution.
         */
        @Override
      public void actionPerformed(ActionEvent e)
        {
            SessionManager sm = SessionManager.getInstance();
            sm.createSession("Renaming ObjectType");
            try
            {
            	//mClassifier.setName(mClassifier.getName()+"Type");
                fixObjectTypeName(mClassifier,mSuffix);
              //fixJavaConstantNames(mClassifier);
            }
            catch (Exception exc)
            {
//                MDLog.getGUILog().error("", exc);
            	QvtCommonAction.log("ERROR: "+ exc);
                sm.cancelSession();
            }
            finally
            {
                sm.closeSession();
            }
        }
        protected void fixObjectTypeName(Classifier classifier,String suffix){
        	//classifier.setName(classifier.getName()+suffix);
        	NameHelper.fixClassifierName(classifier, suffix);
        }
        /**
         * Executes the action on specified targets.
         *
         * @param annotations action targets.
         */
        @Override
      public void execute(Collection<Annotation> annotations)
        {
            if (annotations == null || annotations.isEmpty())
            {
                return;
            }
            SessionManager sm = SessionManager.getInstance();
            sm.createSession("Renaming ObjectTypes");
            try
            {
                for (Annotation annotation : annotations)
                {
                    BaseElement baseElement = annotation.getTarget();
                    if (baseElement instanceof Classifier)
                    {
                    	Classifier classifier = (Classifier) baseElement;
//                        fixJavaConstantNames(classifier);
                        fixObjectTypeName(classifier,mSuffix);
                    }
                }
            }
            catch (Exception e)
            {
                //MDLog.getGUILog().error("", e);
                QvtCommonAction.log("ERROR: "+e);
                sm.cancelSession();
            }
            finally
            {
                sm.closeSession();
            }
        }

        @Override
      public boolean canExecute(Collection<Annotation> annotations)
        {
            return true;
        }
    }
    ///////////////////////////////////////////////
abstract    static public class FixNameAction extends NMAction implements AnnotationAction
    {
//    	protected NamedElement namedElement;
    	protected Element namedElement;
//        public FixNameAction(NamedElement namedElementIn)
           public FixNameAction(Element namedElementIn)
        {
            super("FIX_NAME", "Fix Name", 0);
            namedElement = namedElementIn;
        }

        /**
         * Executes the action.
         *
         * @param e event caused execution.
         */
        @Override
      public void actionPerformed(ActionEvent e)
        {
            SessionManager sm = SessionManager.getInstance();
            sm.createSession("Renaming Property");
            try
            {
                fixName(namedElement);
            }
            catch (Exception exc)
            {
            	QvtCommonAction.log("ERROR during fix: "+ exc);
                sm.cancelSession();
                return;
            }
            /*
            finally
            {
                sm.closeSession();
            }
            */
            sm.closeSession();
        }
        abstract protected void fixName(Element ne);
        /**
         * Executes the action on specified targets.
         *
         * @param annotations action targets.
         */
        @Override
      public void execute(Collection<Annotation> annotations)
        {
            if (annotations == null || annotations.isEmpty())
            {
                return;
            }
            SessionManager sm = SessionManager.getInstance();
            sm.createSession("Renaming Property");
            try
            {
                for (Annotation annotation : annotations)
                {
                    BaseElement baseElement = annotation.getTarget();
                    if (baseElement instanceof Element)
                    {
                    	Element classifier = (Element) baseElement;
                    	fixName(classifier);
                    }
                    /*
                    if (baseElement instanceof NamedElement)
                    {
                    	NamedElement classifier = (NamedElement) baseElement;
//                        fixJavaConstantNames(classifier);
                    	fixName(classifier);
                    }
                    */
                }
            }
            catch (Exception e)
            {
                //MDLog.getGUILog().error("", e);
                QvtCommonAction.log("ERROR: "+e);
                sm.cancelSession();
            }
            finally
            {
                sm.closeSession();
            }
        }

        @Override
      public boolean canExecute(Collection<Annotation> annotations)
        {
            return true;
        }
    }
    ///////////////////////////////////////////////
    static public class FixPropertyNameSuffixAction extends FixNameAction implements AnnotationAction
    {
        //private Property mProperty;
        protected String mSuffix;

        public FixPropertyNameSuffixAction(Property property,String suffix)
        {
            super(property);
          //  mProperty = property;
            mSuffix=suffix;
        }
        protected void fixName(Element ne){
        	if(Property.class.isInstance(ne))fixReferencePropertyName((Property)ne,mSuffix);
        }

        protected void fixReferencePropertyName(Property property,String suffix){
        	//classifier.setName(classifier.getName()+suffix);
        	NameHelper.fixPropertyName(property, property.getName(),suffix);
        }
    }
    ///////////////////////////////////////////////
    static public class FixPropertyNamePrefixAction extends FixPropertyNameSuffixAction implements AnnotationAction
    {

        public FixPropertyNamePrefixAction(Property property,String suffix)
        {
            super(property,suffix);
        }

        protected void fixReferencePropertyName(Property property,String suffix){
        	//classifier.setName(classifier.getName()+suffix);
        	NameHelper.fixPropertyName(property, "RoleOf"+property.getName().replace("RoleOf",""),suffix);
        }
    }
    ///////////////////////////////////////////////
    static public class FixPropertyNameLowerCaseAction extends FixPropertyNameSuffixAction implements AnnotationAction
    {

        public FixPropertyNameLowerCaseAction(Property property)
        {
            super(property,"");
        }

        protected void fixReferencePropertyName(Property property,String suffix){
        	property.setName(NameHelper.toLowerFirstLetter(property.getName()));
        }
    }
    ///////////////////////////////////////////////
    static public class FixPropertyNameUpperCaseAction extends FixNameAction implements AnnotationAction
    {

        public FixPropertyNameUpperCaseAction(NamedElement property)
        {
            super(property);
        }
        protected void fixName(Element ne){
        	((NamedElement)ne).setName(NameHelper.toUpperFirstLetter(((NamedElement)ne).getName()));
        }
    }
    ///////////////////////////////////////////////
    static public class FixNameCharacterAction extends FixNameAction implements AnnotationAction
    {

        public FixNameCharacterAction(NamedElement property)
        {
            super(property);
        }
        protected void fixName(Element ne){
        	((NamedElement)ne).setName(NIEMHelper.toLegalName(((NamedElement)ne).getName()));
        }
    }
    
}

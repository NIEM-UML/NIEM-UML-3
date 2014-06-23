/**
 * 
 */
package org.modeldriven.magicdraw.niem.instance;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xsd.XSDComplexTypeContent;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDComponent;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDDerivationMethod;
import org.eclipse.xsd.XSDDiagnostic;
import org.eclipse.xsd.XSDDiagnosticSeverity;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDEnumerationFacet;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDParticleContent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDSimpleTypeDefinition.Assessment;
import org.eclipse.xsd.XSDTerm;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.XSDVariety;
import org.eclipse.xsd.XSDWildcard;
import org.eclipse.xsd.impl.XSDConcreteComponentImpl;

/**
 * @author tom
 *
 */
public class ExtendedDiagnosticAnalyzer {
	protected XSDConcreteComponent typeDefinition=null;
	public ExtendedDiagnosticAnalyzer(XSDConcreteComponent typeDefinitionIn){
		typeDefinition=typeDefinitionIn;
	}

	// rcase-Recurse.2: There is not a complete functional mapping between the particles.	ExtensionModel.xsd	/test/issuer-ncqa-iepd-1.0.iepd/XMLschemas/extension	line 57	XML Schema Problem
	public List<XSDDiagnostic> extendedAnalysis() {
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	if(typeDefinition instanceof XSDSimpleTypeDefinition){
			XSDSimpleTypeDefinition simpleType=(XSDSimpleTypeDefinition)typeDefinition;
			XSDConcreteComponent test=simpleType.getContainer();
			XSDTypeDefinition derivationContext=simpleType;
			if(test instanceof XSDComplexTypeDefinition){
				derivationContext=(XSDComplexTypeDefinition)test;
			}
			XSDTypeDefinition baseContext=derivationContext.getBaseType();
    		extendedDiagnostics.addAll(simpleTypeAnalysis(simpleType,simpleType.getBaseTypeDefinition(),baseContext,derivationContext));
    	}else if(typeDefinition instanceof XSDComplexTypeDefinition){
    		XSDComplexTypeDefinition complexTypeDefinition=(XSDComplexTypeDefinition)typeDefinition;
    		XSDComplexTypeContent content=complexTypeDefinition.getContent();
    		XSDTypeDefinition base=complexTypeDefinition.getBaseTypeDefinition();
    		/*
    		if("MyComplexEnumeration1CodeType".equals(complexTypeDefinition.getName())){
				System.out.println("MyComplexEnumeration1CodeType "+complexTypeDefinition+", "+content+", "+base+", "+((XSDSimpleTypeDefinition)content).getEnumerationFacets());
    			
    		}
    		*/
    		extendedDiagnostics.addAll(complexTypeAnalysis(complexTypeDefinition));
    		/* this will be picked up in nested content
    		if(content instanceof XSDSimpleTypeDefinition){
    			XSDSimpleTypeDefinition simpleContent=(XSDSimpleTypeDefinition)content;
    			if(base==null){
    				System.out.println("NO Base for CTSC "+complexTypeDefinition);
    			}else{
    				extendedDiagnostics.addAll(simpleTypeAnalysis(simpleContent,base));
    			}
    		}
    		*/
    	}
		return extendedDiagnostics;
	}
    protected List<XSDDiagnostic> complexTypeAnalysis(XSDComplexTypeDefinition complexTypeDefinition){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	boolean isRestriction=isRestriction(complexTypeDefinition);
    	XSDTypeDefinition baseType=complexTypeDefinition.getBaseTypeDefinition();
    	if(isRestriction){		
    		XSDComplexTypeContent content=	complexTypeDefinition.getContent() ;
    		if(content instanceof XSDParticle){
    			XSDParticle derivedParticle=(XSDParticle)content;
    			if(baseType instanceof XSDComplexTypeDefinition){
    				XSDComplexTypeDefinition baseComplexType=(XSDComplexTypeDefinition)baseType;
    	    		XSDComplexTypeContent baseContent=	baseComplexType.getSyntheticParticle() ;
    	    		if(baseContent==null){
    	    			baseContent=	baseComplexType.getContent() ;
    	    		}else{
    	    	    	//XSDParticleContent baseModelGroup=((XSDParticle)baseContent).getContent();
    	        		//EList<XSDParticle> baseParticles=((XSDModelGroup)baseModelGroup).getParticles();

    	    			//System.out.println("complexTypeAnalysis syntheticParticle "+baseContent+" for "+baseComplexType+", "+baseParticles);
    	    		}
    	    		if(baseContent instanceof XSDParticle){
    	    			XSDParticle baseParticle=(XSDParticle)baseContent;
    	    			// seems to be checked by XSD
    	    			// well, not completely
    	    			extendedDiagnostics.addAll(particleRestriction(derivedParticle,baseParticle));
    	    		}
    			}
    		}
    	}
    	// check for unique particle attribution
		XSDComplexTypeContent content2=	complexTypeDefinition.getContent() ;
		if(content2 instanceof XSDParticle){
			XSDParticle derivedParticle=(XSDParticle)content2;
	    	extendedDiagnostics.addAll(uniqueParticleAttribution(derivedParticle));
		}
		return extendedDiagnostics;
    }
    protected List<XSDDiagnostic> simpleTypeAnalysis(XSDSimpleTypeDefinition simpleTypeDefinition,
    		XSDTypeDefinition base,XSDTypeDefinition baseContext,XSDTypeDefinition derivationContext){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	boolean isRestriction=isRestriction(derivationContext);
    	if(isRestriction){		
    		extendedDiagnostics.addAll(enumerationValidRestriction(simpleTypeDefinition,base,baseContext));
    	}
		return extendedDiagnostics;
    }
    static public boolean isRestriction(XSDTypeDefinition derivationContext){
    	XSDTypeDefinition base=derivationContext.getBaseType();
    	boolean isAnyBase=(base!=null)&&("anyType".equals(base.getName()));
    	if(isAnyBase)return false;
    	boolean isRestriction=(derivationContext instanceof XSDComplexTypeDefinition)?
    			XSDDerivationMethod.RESTRICTION_LITERAL.equals(((XSDComplexTypeDefinition)derivationContext).getDerivationMethod())
    			:XSDVariety.ATOMIC_LITERAL.equals(((XSDSimpleTypeDefinition)derivationContext).getVariety());
    	return isRestriction;		
    }
    //////////////////////////////////enumeration-valid-restriction
    protected List<XSDDiagnostic> enumerationValidRestriction(XSDSimpleTypeDefinition typeDefinition,XSDTypeDefinition base,XSDTypeDefinition baseContext){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();

    	// validate the enumeration literals are valid for base
    	XSDSimpleTypeDefinition baseType=getSimpleTypeDefinition(base);
    	if(baseType==null){
    		System.out.println("ExtendedDiagnosticAnalyzer NO Base type for "+typeDefinition);
    		return extendedDiagnostics;
    	}
    	// is the base right?
    	//Set<String> baseEnumerationValues=new HashSet<String>();
    	Set<String> baseEnumerationValues=getBaseEnumerationValues(baseContext);
    	/*
    	for(XSDEnumerationFacet enumerationFacet:baseType.getEnumerationFacets()){
    		baseEnumerationValues.add(enumerationFacet.getLexicalValue());
    	}
    	*/
    	/* this is useless in this case
    	XSDEnumerationFacet test=baseType.getEffectiveEnumerationFacet();
    	if(test!=null){
    		System.out.println("FOUND EffectiveEnumerationFacet for "+baseType+", "+test);
    	}
    	*/
    	if(!baseEnumerationValues.isEmpty()){
    	for(XSDEnumerationFacet enumerationFacet:typeDefinition.getEnumerationFacets()){
    		String value=enumerationFacet.getLexicalValue();
    		if(!baseEnumerationValues.contains(value)){
    			extendedDiagnostics.add(createDiagnostic(
    					"enumeration-valid-restriction: Enumeration value '"+value+"' is not in the value space of the base type,"+baseContext.getName(),
    					XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
    					));
    		}
    	}
    	}
    	// assess does not appear to check enumeration facets against base, does it check anything at all?
    	for(XSDEnumerationFacet enumerationFacet:typeDefinition.getEnumerationFacets()){
    		String value=enumerationFacet.getLexicalValue();
    		Assessment assessment=baseType.assess(value);
    		//System.out.println("ExtendedDiagnosticAnalyzer "+value+", "+typeDefinition+", "+baseType+", "+baseType.getEnumerationFacets()+", "+assessment.getDiagnostics());
    		extendedDiagnostics.addAll(assessment.getDiagnostics());
    	}
    	return extendedDiagnostics;
    }
    protected XSDDiagnostic createDiagnostic(String message,XSDDiagnosticSeverity severity,XSDConcreteComponent component){
		XSDDiagnostic diagnostic=XSDFactory.eINSTANCE.createXSDDiagnostic();
		diagnostic.setKey("");
		diagnostic.setMessage(message);
		diagnostic.setSeverity(severity);
		diagnostic.setPrimaryComponent(component);
		return diagnostic;
    }
    protected Set<String> getBaseEnumerationValues(XSDTypeDefinition baseContext){
    	if(baseContext instanceof XSDSimpleTypeDefinition)return getBaseEnumerationValues((XSDSimpleTypeDefinition)baseContext,baseContext);
    	Set<String> baseEnumerationValues=new HashSet<String>();
    	XSDComplexTypeContent contentType=((XSDComplexTypeDefinition)baseContext).getContent();
    	if(contentType instanceof XSDSimpleTypeDefinition){
    		return getBaseEnumerationValues((XSDSimpleTypeDefinition)contentType,baseContext);
    	}
    	return baseEnumerationValues;
    	
    }
    protected Set<String> getBaseEnumerationValues(XSDSimpleTypeDefinition baseType,XSDTypeDefinition baseContext){
    	Set<String> baseEnumerationValues=new HashSet<String>();
    	for(XSDEnumerationFacet enumerationFacet:baseType.getEnumerationFacets()){
    		baseEnumerationValues.add(enumerationFacet.getLexicalValue());
    	}
    	if(baseEnumerationValues.isEmpty()){
    		// try for its base
    		XSDTypeDefinition baseBase=baseContext.getBaseType();
    		if((baseBase!=null)&&(!baseBase.equals(baseContext)))return getBaseEnumerationValues(baseBase);
    	}
    	return baseEnumerationValues;
    	
    }
    protected XSDSimpleTypeDefinition getSimpleTypeDefinition(XSDTypeDefinition base){
    	if(base==null)return null;
    	if(base instanceof XSDSimpleTypeDefinition)return (XSDSimpleTypeDefinition)base;
		XSDComplexTypeDefinition complexTypeDefinition=(XSDComplexTypeDefinition)base;
		XSDComplexTypeContent content=complexTypeDefinition.getContent();
		if(content instanceof XSDSimpleTypeDefinition)return (XSDSimpleTypeDefinition)content;
		return null;
    	
    }
    //////////////////////////////////rcase-Recurse.2: There is not a complete functional mapping between the particles.
    /*
     * Schema Component Constraint: Particle Derivation OK (All:All,Sequence:Sequence -- Recurse)
    For an all or sequence group particle to be a ·valid restriction· of another group particle with the same {compositor} all of the following must be true:
    1 R's occurrence range is a valid restriction of B's occurrence range as defined by Occurrence Range OK (§3.9.6).
    2 There is a complete ·order-preserving· functional mapping from the particles in the {particles} of R 
    	to the particles in the {particles} of B such that all of the following must be true:
    2.1 Each particle in the {particles} of R is a ·valid restriction· of the particle in the {particles} of B it maps to 
    	as defined by Particle Valid (Restriction) (§3.9.6).
    2.2 All particles in the {particles} of B which are not mapped to by any particle in the {particles} of R are ·emptiable· 
    	as defined by Particle Emptiable (§3.9.6).
    Note: Although the ·validation· semantics of an all group does not depend on the order of its particles, 
    	derived all groups are required to match the order of their base in order to simplify checking that the derivation is OK.
    [Definition:]  A complete functional mapping is order-preserving if 
    	each particle r in the domain R maps to a particle b in the range B 
    	which follows (not necessarily immediately) the particle in the range B mapped to by the predecessor of r, 
    	if any, where "predecessor" and "follows" are defined with respect to the order of the lists which constitute R and B.
     */
    /*
     * Seems to be checked by :
     * error:derivation-ok-restriction.5.3.3:XSD: The restricted content type must accept a subset of the content accepted by the base type

	
     */

    protected List<XSDDiagnostic> particleRestriction(XSDParticle derivedParticle,XSDParticle baseParticle){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	int derivedMin=derivedParticle.getMinOccurs();
    	int derivedMax=derivedParticle.getMaxOccurs();
    	int baseMin=baseParticle.getMinOccurs();
    	int baseMax=baseParticle.getMaxOccurs();
    	boolean isRangeOK=true;
    	if(derivedMin<baseMin)isRangeOK=false;
    	if(derivedMax!=baseMax){
    		if(derivedMax==-1)isRangeOK=false;
    		else if(baseMax!=-1){
    			isRangeOK=(derivedMax<=baseMax);
    		}
    	}
    	if(!isRangeOK){
			extendedDiagnostics.add(createDiagnostic(
					"rcase-Recurse.1: Range is not a valid restriction of base Range= "+baseMin+" to "+baseMax,
					XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
					));
    	}
//    	XSDTerm derivedContent=derivedParticle.getTerm();
//    	XSDTerm baseContent=baseParticle.getTerm();
    	XSDParticleContent derivedContent=derivedParticle.getContent();
    	XSDParticleContent baseContent=baseParticle.getContent();
    	
    	extendedDiagnostics.addAll(termRestriction(derivedContent,baseContent));
		return extendedDiagnostics;
    }
    protected List<XSDDiagnostic> termRestriction(XSDParticleContent derivedTerm,XSDParticleContent baseTerm){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	if((baseTerm==null)&&(derivedTerm==null))return extendedDiagnostics;
    	if(baseTerm==null){
			extendedDiagnostics.add(createDiagnostic(
					"rcase-Recurse.2.1: Derived term "+derivedTerm+" is not defined in base",
					XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
					));
			return extendedDiagnostics;
    	}
    	if(baseTerm instanceof XSDWildcard){
    		extendedDiagnostics.addAll(wildcardRestriction(derivedTerm,(XSDWildcard)baseTerm));
    	}else if(baseTerm instanceof XSDElementDeclaration){
    		extendedDiagnostics.addAll(elementRestriction(derivedTerm,(XSDElementDeclaration)baseTerm));
    	}else {
    		extendedDiagnostics.addAll(modelGroupRestriction(derivedTerm,(XSDModelGroup)baseTerm));
    	}
		return extendedDiagnostics;
    }
    protected List<XSDDiagnostic> wildcardRestriction(XSDParticleContent derivedTerm,XSDWildcard baseTerm){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
		return extendedDiagnostics;
    }
    protected List<XSDDiagnostic> elementRestriction(XSDParticleContent derivedTerm,XSDElementDeclaration baseTerm){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
		return extendedDiagnostics;
    }
    /*
    protected XSDComplexTypeDefinition getContainingComplexTypeDefinition(XSDConcreteComponent component){
    	if(component==null)return null;
    	if(component instanceof XSDComplexTypeDefinition)return (XSDComplexTypeDefinition)component;
    	return getContainingComplexTypeDefinition(component.getContainer());
    }
    protected List<XSDParticle> getAllParticles(XSDModelGroup baseModelGroup){
    	List<XSDParticle> result=new Vector<XSDParticle>();
    	XSDComplexTypeDefinition containingType=getContainingComplexTypeDefinition(baseModelGroup);
    	if(containingType!=null){
    		if(XSDDerivationMethod.EXTENSION_LITERAL.equals(containingType.getDerivationMethod())){
    			XSDTypeDefinition baseType=containingType.getBaseTypeDefinition();
    			if(baseType instanceof XSDComplexTypeDefinition){
    				XSDComplexTypeDefinition baseComplexType=(XSDComplexTypeDefinition)baseType;
    	    		XSDComplexTypeContent baseContent=	baseComplexType.getContent() ;
    	    		if(baseContent instanceof XSDParticle){
    	    			XSDParticle baseParticle=(XSDParticle)baseContent;
    	    	    	XSDParticleContent baseTerm=baseParticle.getContent();
	    	        	if(baseTerm instanceof XSDElementDeclaration){
	    	        	}else if(baseTerm instanceof XSDModelGroup){
	    	        		result.addAll(getAllParticles((XSDModelGroup)baseTerm));
	    	        	}
    	    		}
    				
    			}
    		}
    	}
    	result.addAll(baseModelGroup.getParticles());
    	return result;
    }
    */
    protected List<XSDDiagnostic> modelGroupRestriction(XSDParticleContent derivedTerm,XSDModelGroup baseModelGroup){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	// valid restriction
    	if(derivedTerm instanceof XSDModelGroup){
    		XSDModelGroup derivedModelGroup=(XSDModelGroup)derivedTerm;
        	if(XSDCompositor.SEQUENCE_LITERAL.equals(derivedModelGroup.getCompositor())
        			&&XSDCompositor.SEQUENCE_LITERAL.equals(baseModelGroup.getCompositor())){
        		//System.out.println("ExtendedDiagnosticAnalyzer.modelGroupRestriction "+typeDefinition+", "+derivedModelGroup+", "+baseModelGroup+", "+derivedModelGroup.getParticles()+", "+baseModelGroup.getParticles());
        		Iterator<XSDParticle> derivedParticles=derivedModelGroup.getParticles().iterator();
        		EList<XSDParticle> baseParticles=baseModelGroup.getParticles();
//        		List<XSDParticle> baseParticles=getAllParticles(baseModelGroup);
        		XSDParticle derivedParticle=null;
        		if(derivedParticles.hasNext())derivedParticle=derivedParticles.next();
        		for(XSDParticle baseParticle:baseParticles){
        			int baseMin=baseParticle.getMinOccurs();
        			int baseMax=baseParticle.getMaxOccurs();
        			if((derivedParticle!=null)&&isParticleMatch(derivedParticle,baseParticle)){
        				int usedMin=derivedParticle.getMinOccurs();
        				int usedMax=derivedParticle.getMaxOccurs();
        				if(!isExactParticleMatch(derivedParticle,baseParticle)){
        					//derivation-ok-restriction.5.4.2: Error for type 'AccreditationIdentificationType'.  The particle of the type is not a valid restriction of the particle of the base.	ExtensionModel.xsd	/test/issuer-ncqa-iepd-1.0.iepd/XMLschemas/constraint/XMLschemas/extension	line 15	XML Schema Problem
        					// if derived is itself not substitutable, then the min/max must be 1
        					if(!hasSubstitution(derivedParticle)){
	        					if((usedMin!=1)||(usedMax!=1)){
	                				extendedDiagnostics.add(createDiagnostic(
	                						"derivation-ok-restriction.5.4.2: Error for particle "+derivedParticle+".  The particle of the derived type is not a valid restriction of the particle of the base.  The derived particle is not substitutable: it must have a cardinality of 1.  Current cardinality:"+usedMin+"..."+usedMax,
	                						XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
	                						));
	        						
	        					}
        					}
        				}
        				// check for cardinality, bump derivedParticle
        				derivedParticle=null;
        				if(derivedParticles.hasNext())derivedParticle=derivedParticles.next();
        				/*
        				while(derivedParticles.hasNext()){
        					derivedParticle=derivedParticles.next();
        					if(!isParticleMatch(derivedParticle,baseParticle))break;
            				if(!isExactParticleMatch(derivedParticle,baseParticle)){
            					
            				}
            				 usedMin+=derivedParticle.getMinOccurs();
            				 int testMax=derivedParticle.getMaxOccurs();
            				 if(usedMax>0){
            					 if(testMax<0)usedMax=testMax;
            					 else usedMax+=testMax;
            				 }
            				 derivedParticle=null;
        				}
        				*/
        				if(usedMin<baseMin){
        					// cardinality violation
            				extendedDiagnostics.add(createDiagnostic(
            						"rcase-Recurse.2.1: Derived particle minimum less than base required "+baseMin,
            						XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
            						));
        				}else if(baseMax>=0){
        					if((usedMax<0)||(usedMax>baseMax)){
        						// cardinality violation
                				extendedDiagnostics.add(createDiagnostic(
                						"rcase-Recurse.2.1: Derived particle maximum exceeds base limit "+baseMax,
                						XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
                						));
        					}
        				}
        			}else{
        				if(isEmptiable(baseParticle))continue;
        				extendedDiagnostics.add(createDiagnostic(
        						"rcase-Recurse.2.1: Base particle "+getName(baseParticle)+" must be in derived",
        						XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
        						));
        			
        				System.out.println("rcase-Recurse.2.1: Base particle "+getName(baseParticle)+" must be in derived; derivedParticle:"+(derivedParticle==null?"null":getName(derivedParticle)));
        			}
        		}
 				 if(derivedParticle!=null){
       				extendedDiagnostics.add(createDiagnostic(
      						"rcase-Recurse.2.1: Derived particle "+getName(derivedParticle)+" out of sequence or not valid restriction (of "+baseParticles.size()+" base particles)",
      						XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
      						));
     					 
     				 }
        	}else{
        		// not valid
        	}
    	}else{
    		// not valid
    	}

		return extendedDiagnostics;
    }
    protected boolean hasSubstitution(XSDParticle derivedParticle){
    	XSDParticleContent derivedTerm=derivedParticle.getContent();
    	if((derivedTerm instanceof XSDElementDeclaration)){
        	XSDElementDeclaration derivedResolvedElement=SimpleType.getResolvedElementDeclaration((XSDElementDeclaration)derivedTerm);
        	//System.out.println("isSubstitutable "+derivedResolvedElement+", "+derivedResolvedElement.getSubstitutionGroup());
        	for(XSDElementDeclaration substition:derivedResolvedElement.getSubstitutionGroup()){
        		if(substition.equals(derivedResolvedElement))continue;
        		if(substition.isAbstract())continue;
        		return true;
        	}
    		return false;
    	}
    	return true;
    }
    private boolean isExactParticleMatch(XSDParticle derivedParticle,
			XSDParticle baseParticle) {
    	XSDParticleContent derivedTerm=derivedParticle.getContent();
    	XSDParticleContent baseTerm=baseParticle.getContent();
    	if((derivedTerm instanceof XSDElementDeclaration)
    			&&(baseTerm instanceof XSDElementDeclaration)){
        	XSDElementDeclaration derivedResolvedElement=SimpleType.getResolvedElementDeclaration((XSDElementDeclaration)derivedTerm);
        	XSDElementDeclaration baseResolvedElement=SimpleType.getResolvedElementDeclaration((XSDElementDeclaration)baseTerm);
        	return(isElementExactMatch(derivedResolvedElement,baseResolvedElement));

    		//return (derivedResolvedElement.equals(baseResolvedElement));
    	}
		return true;
	}

	protected String getName(XSDParticle particle){
    	XSDParticleContent content=particle.getContent();
    	String name="";
    	if(content instanceof XSDElementDeclaration){
//    		name=((XSDElementDeclaration)content).getResolvedElementDeclaration().getName();
    		name=SimpleType.getResolvedElementDeclaration(((XSDElementDeclaration)content)).getName();
    	}
    	return name;
    }
    protected boolean isParticleMatch(XSDParticle derivedParticle,XSDParticle baseParticle){
    	// compare elements
    	boolean result=true;
//    	XSDTerm derivedTerm=derivedParticle.getTerm();
//    	XSDTerm baseTerm=baseParticle.getTerm();
    	XSDParticleContent derivedTerm=derivedParticle.getContent();
    	XSDParticleContent baseTerm=baseParticle.getContent();
    	if((derivedTerm instanceof XSDElementDeclaration)
    			&&(baseTerm instanceof XSDElementDeclaration)){
    		result=isElementMatch((XSDElementDeclaration)derivedTerm,(XSDElementDeclaration)baseTerm);
    	}
    	return result;
    }
    protected boolean isElementMatch(XSDElementDeclaration derivedElement,XSDElementDeclaration baseElement){
    	// compare elements
//    	XSDElementDeclaration derivedResolvedElement=derivedElement.getResolvedElementDeclaration();
    	XSDElementDeclaration derivedResolvedElement=SimpleType.getResolvedElementDeclaration(derivedElement);
//    	XSDElementDeclaration baseResolvedElement=baseElement.getResolvedElementDeclaration();
    	XSDElementDeclaration baseResolvedElement=SimpleType.getResolvedElementDeclaration(baseElement);
    	//if("IncomeAmount".equals(derivedResolvedElement.getName())){
    	//	System.out.println("DEBUG element match: "+derivedResolvedElement.getName()+":"+derivedResolvedElement.getTargetNamespace()+"; "+baseResolvedElement.getName()+":"+baseResolvedElement.getTargetNamespace());
    	//}
    	return isSubstitutableFor(derivedResolvedElement,baseResolvedElement);
    }
    protected boolean isEmptiable(XSDParticle particle){
    	return particle.getMinOccurs()==0;
    }
    protected boolean isElementExactMatch(XSDElementDeclaration derivedElement,XSDElementDeclaration baseElement){
    	if(derivedElement.equals(baseElement))return true;
    	if((derivedElement==null)||(baseElement==null))return false;
    	if((derivedElement.getName()==null)||(derivedElement.getTargetNamespace()==null)||(baseElement.getName()==null)||(baseElement.getTargetNamespace()==null))return false;
    	if(derivedElement.getName().equals(baseElement.getName())&&derivedElement.getTargetNamespace().equals(baseElement.getTargetNamespace()))return true;
    	return false;
    }
    protected boolean isSubstitutableFor(XSDElementDeclaration derivedElement,XSDElementDeclaration baseElement){
    	// compare elements
    	if(derivedElement==null)return false;
    	if(isElementExactMatch(derivedElement,baseElement))return true;
    	/*
    	if(derivedElement.equals(baseElement))return true;
    	if((derivedElement==null)||(baseElement==null))return false;
    	if((derivedElement.getName()==null)||(derivedElement.getTargetNamespace()==null)||(baseElement.getName()==null)||(baseElement.getTargetNamespace()==null))return false;
    	if(derivedElement.getName().equals(baseElement.getName())&&derivedElement.getTargetNamespace().equals(baseElement.getTargetNamespace()))return true;
    	*/
    	XSDElementDeclaration substitutionGroup=derivedElement.getSubstitutionGroupAffiliation();
    	if(substitutionGroup==null)return false;
    	return isSubstitutableFor(substitutionGroup,baseElement);
    }
    ///////////////////////////////////unique particle attribution
    protected List<XSDDiagnostic> uniqueParticleAttribution(XSDParticle derivedParticle){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	//int derivedMin=derivedParticle.getMinOccurs();
    	//int derivedMax=derivedParticle.getMaxOccurs();
    	XSDParticleContent derivedContent=derivedParticle.getContent();
    	
    	extendedDiagnostics.addAll(uniqueParticleContentAttribution(derivedContent));
		return extendedDiagnostics;
    }
    protected List<XSDDiagnostic> uniqueParticleContentAttribution(XSDParticleContent derivedTerm){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
    	if(derivedTerm==null)return extendedDiagnostics;
    	if(derivedTerm instanceof XSDModelGroup){
    		extendedDiagnostics.addAll(uniqueModelGroupAttribution((XSDModelGroup)derivedTerm));
    	}
		return extendedDiagnostics;
    }
    protected List<XSDDiagnostic> uniqueModelGroupAttribution(XSDModelGroup derivedModelGroup){
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>();
        	if(XSDCompositor.SEQUENCE_LITERAL.equals(derivedModelGroup.getCompositor())){
        		//System.out.println("ExtendedDiagnosticAnalyzer.modelGroupRestriction "+typeDefinition+", "+derivedModelGroup+", "+baseModelGroup+", "+derivedModelGroup.getParticles()+", "+baseModelGroup.getParticles());
        		EList<XSDParticle> derivedParticles=derivedModelGroup.getParticles();
        		int count=derivedParticles.size();
        		if(count>1)
           		for(int i=1;i<count;i++){
        		//for(XSDParticle derivedParticle:derivedParticles){
           			XSDParticle lastParticle=derivedParticles.get(i-1);
           			XSDParticle thisParticle=derivedParticles.get(i);
        			int lastMin=lastParticle.getMinOccurs();
        			int lastMax=lastParticle.getMaxOccurs();
        			//int thisMin=thisParticle.getMinOccurs();
        			//int thisMax=thisParticle.getMaxOccurs();
        			if(lastMax>=0){
//        				if(lastMin!=lastMax){
        				if(lastMin==lastMax){
        					continue;
        				}
        			}
        			if(isUniqueParticleAttribution(lastParticle.getTerm(),thisParticle.getTerm()))continue;
        			// violation

    				extendedDiagnostics.add(createDiagnostic(
    						"cos-nonambig: "+getParticleDescription(lastParticle)+" and "+getParticleDescription(thisParticle)+" (or elements from their substitution group) violate \"Unique Particle Attribution\". During validation against this schema, ambiguity would be created for those two particles.",
    						XSDDiagnosticSeverity.ERROR_LITERAL,typeDefinition
    						));
        		}
        	}else{
        		// not valid
        	}

		return extendedDiagnostics;
    }
    protected String getParticleDescription(XSDParticle particle){
    	XSDTerm term=particle.getTerm();
    	String name="(any)";
    	 
    	if(term instanceof XSDNamedComponent)name=((XSDNamedComponent)term).getName();
    	name=name+"("+particle.getMinOccurs()+".."+particle.getMaxOccurs()+")";
    	return name;
    }
    protected boolean isUniqueParticleAttribution(XSDTerm lastTerm,XSDTerm thisTerm){
    	boolean result=true;
        //XSDElementDeclaration, XSDModelGroup, XSDWildcard
    	//System.out.println("isUniqueParticleAttribution "+lastTerm+", "+thisTerm);
    	if(lastTerm instanceof XSDWildcard){
    		// should check to see namespace constraint
    		result=false;
    	}else	if(lastTerm instanceof XSDModelGroup){
    		XSDModelGroup lastModelGroup=(XSDModelGroup)lastTerm;
        	// if last was choice, then check each
    		// if last was sequence, then check last
			EList<XSDParticle> lastParticles=lastModelGroup.getContents();
    		if(XSDCompositor.CHOICE_LITERAL.equals(lastModelGroup.getCompositor())){
    			for(XSDParticle lastParticle:lastParticles){
    				if(!isUniqueParticleAttribution(lastParticle.getTerm(),thisTerm)){
    					result=false;
    					break;
    				}
    			}
    		}else	if(XSDCompositor.SEQUENCE_LITERAL.equals(lastModelGroup.getCompositor())){
    			if(lastParticles.size()>0){
    				result=isUniqueParticleAttribution(lastParticles.get(lastParticles.size()-1).getTerm(),thisTerm);
    			}
    		}else{
    			
    		}
    	}else{
    		// check if last element unique from this term
    		XSDElementDeclaration lastElement=(XSDElementDeclaration)lastTerm;
        	if(thisTerm instanceof XSDWildcard){
        		// should check to see namespace constraint
        		result=false;
        	}else	if(thisTerm instanceof XSDModelGroup){
        		XSDModelGroup thisModelGroup=(XSDModelGroup)thisTerm;
            	// if this was choice, then check each
        		// if this was sequence, then check first
    			EList<XSDParticle> thisParticles=thisModelGroup.getContents();
        		if(XSDCompositor.CHOICE_LITERAL.equals(thisModelGroup.getCompositor())){
        			for(XSDParticle thisParticle:thisParticles){
        				if(!isUniqueParticleAttribution(lastTerm,thisParticle.getTerm())){
        					result=false;
        					break;
        				}
        			}
        		}else	if(XSDCompositor.SEQUENCE_LITERAL.equals(thisModelGroup.getCompositor())){
        			if(thisParticles.size()>0){
        				result=isUniqueParticleAttribution(lastTerm,thisParticles.get(thisParticles.size()-1).getTerm());
        			}
        		}else{
        			
        		}
        	}else{
        		// check if last element unique from this term
        		XSDElementDeclaration thisElement=(XSDElementDeclaration)thisTerm;
        		result=isUniqueElementAttribution(lastElement,thisElement);
        	}
    	}
    	return result;
    }
    protected boolean isUniqueElementAttribution(XSDElementDeclaration lastElement,XSDElementDeclaration thisElement){
    	boolean result=!isSubstitutableFor(lastElement,thisElement)
    			&&!isSubstitutableFor(thisElement,lastElement);
    	return result;
    }
}

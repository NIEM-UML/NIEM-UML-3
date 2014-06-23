/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.script.ScriptContext;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.m2m.internal.qvt.oml.ast.env.ModelParameterExtent;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEnvFactory;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEvaluationEnv;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;
import org.eclipse.m2m.internal.qvt.oml.evaluator.InternalEvaluator;
import org.eclipse.m2m.internal.qvt.oml.evaluator.ModelInstance;
import org.eclipse.m2m.internal.qvt.oml.evaluator.ModelParameterHelper;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation.TransformationParameter.DirectionKind;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;

import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptingEngineImpl;
import com.nomagic.magicdraw.qvt.parameters.ValidParameterException;

/**
 * @author Tom
 *
 */
public class NiemQVTScriptingEngine extends QVTScriptingEngineImpl {

	/**
	 * @param arg0
	 */
	public NiemQVTScriptingEngine(QVTScriptEngineFactory arg0) {
		super(arg0);
	}
	static protected Map<String,CompiledUnit > compiledUnitsMap=new HashMap<String,CompiledUnit >();
	public Object eval(String script,ScriptContext context)throws ScriptException{
		String fileName=(String)context.getAttribute("javax.script.filename");
		CompiledUnit compiledUnit=compiledUnitsMap.get(fileName);
		if(compiledUnit==null){

			UnitProxy proxy=getNiemScriptUnit(script,context);
//		QvtCommonAction.log("ScriptEngine.eval proxy "+proxy.getURI());
			try {
				QvtCommonAction.log("ScriptEngine.eval compiling "+proxy);
				compiledUnit = compileNiemScript(proxy,context);
				compiledUnitsMap.put(fileName, compiledUnit);
			} catch (MdaException e) {
				throw new ScriptException(e);
			}
		}else{
			QvtCommonAction.log("ScriptEngine.eval using cached "+compiledUnit);
		}
		transformation=getNiemTransformation(compiledUnit);
//		checkIsExecutable(transformation);
		
		Object result=niemEvaluate(compiledUnit,context);
		return result;
	}
	protected Object niemEvaluate(CompiledUnit compiledUnit,ScriptContext context) throws ScriptException {
		IContext icontext=createNiemInternalContext(context);
		QvtOperationalEnvFactory envFactory=getEnvironmentFactory();
		QvtOperationalEvaluationEnv evaluationEnv=null;
		evaluationEnv=envFactory.createEvaluationEnvironment(icontext,evaluationEnv);
		 ModelExtent[] modelExtents=initNiemArguments(evaluationEnv,transformation,context);
		Environment environment=envFactory.createEnvironment(compiledUnit.getURI());
		Map map=null;
		EvaluationVisitor visitor=envFactory.createEvaluationVisitor(environment,evaluationEnv,map);
		InternalEvaluator evaluator=(InternalEvaluator)visitor;
		
		Object result=evaluator.execute(transformation);
		//ModelExtent[] modelExtents={};
		setOutputParameters(context,modelExtents,transformation,evaluationEnv);
		return result;
	}
	protected ModelExtent[] initNiemArguments(
			QvtOperationalEvaluationEnv evaluationEnv,
			OperationalTransformation transformation2,
			ScriptContext context) throws ScriptException {
		EList modelParameters=	transformation2.getModelParameter();
		ModelExtent[] modelExtents=getNiemTransformationArguments(modelParameters,context);
		ArrayList modelParameterArray= new java.util.ArrayList(modelParameters.size());
		Iterator iterator=modelParameters.iterator();
		int i=0;
		while(iterator.hasNext()){
			ModelParameter modelParameter=(ModelParameter)iterator.next();
			org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind directionKind=modelParameter.getKind();
			ModelParameterExtent modelParameterExtent=null;
//			if(directionKind==org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind.OUT){
			if(directionKind!=org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind.OUT){
				List<EObject> contents=modelExtents[i].getContents();
				modelParameterExtent=new ModelParameterExtent(contents,null,modelParameter);
				//modelParameterExtent/(contents,null,modelParameter);
			}else{
//				modelParameterExtent=new ModelParameterExtent();
				List<EObject> contents=new Vector<EObject>();
				modelParameterExtent=new ModelParameterExtent(contents,null,modelParameter);
			}
			modelParameterArray.add(modelParameterExtent);
			i++;
		}
		List<ModelInstance> modelArguments=ModelParameterHelper.createModelArguments(transformation2,modelParameterArray);
		evaluationEnv.getOperationArgs().clear();
		evaluationEnv.getOperationArgs().addAll(modelArguments);
		return modelExtents;
	}
	private ModelExtent[] getNiemTransformationArguments(
			EList<ModelParameter> modelParameters, ScriptContext context) throws ScriptException {
		ArrayList<ModelExtent> array=new ArrayList<ModelExtent>();
		Iterator<ModelParameter> iterator=modelParameters.iterator();
		while(iterator.hasNext()){
			ModelParameter modelParameter=iterator.next();
			String name=modelParameter.getName();
			Object value=context.getAttribute(name);
			
			if(modelParameter.getKind()==org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind.OUT){
				array.add(new BasicModelExtent());
			}else{	
			if(value==null){
				if(modelParameter.getKind()!=org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind.OUT){
					throw new ScriptException("No attribute value for required model parameter: "+name);
				}else{
					array.add(new BasicModelExtent());
				}
			}else{
				array.add(this.getNiemParameter(modelParameter,value,context));	
			}
			}
		}
		return array.toArray(new ModelExtent[0]);
	}
	private ModelExtent getNiemParameter(
			ModelParameter modelParameter, Object value,
			ScriptContext context) throws ValidParameterException {
		BasicModelExtent basicModelExtent=new BasicModelExtent();
		if(ModelExtent.class.isInstance(modelParameter))
			return (ModelExtent)modelParameter;
		if(String.class.isInstance(value)){
			if(((String)value).startsWith("md:")){
				com.nomagic.magicdraw.qvt.parameters.QVTParameter qvtParameter=com.nomagic.magicdraw.qvt.parameters.QVTParameterRegistry.getInstance().getParameter((String)value);
				if(qvtParameter!=null){
					Object test=context.getAttribute("qvto.parameters.context");
					if(com.nomagic.magicdraw.qvt.parameters.ParametersContext.class.isInstance(test)){
						com.nomagic.magicdraw.qvt.parameters.ParametersContext parametersContext=(com.nomagic.magicdraw.qvt.parameters.ParametersContext)test;
						qvtParameter.setParameterContext(parametersContext.getParameterSpecificProperties((String)value));
					}	
					org.eclipse.m2m.qvt.oml.ModelExtent modelExtent=qvtParameter.getParameterInstance();
					if(org.eclipse.m2m.qvt.oml.BasicModelExtent.class.isInstance(modelExtent)){
						addNiemEObjectValues(qvtParameter.getValue(),basicModelExtent);
					}
				}
				/////////130? error condition
			}
		}
		if(EObject.class.isInstance(value)){
			basicModelExtent.add((EObject)value);
			
		}
		if(Collection.class.isInstance(value)){
			addNiemEObjectValues((Collection)value,basicModelExtent);
		}
		return basicModelExtent;
	}
	private void addNiemEObjectValues(
			Collection<EObject> value,
			BasicModelExtent basicModelExtent) {
		if(value==null)return;
		java.util.Iterator<EObject> iterator=value.iterator();
		while(iterator.hasNext()){
			basicModelExtent.add(iterator.next());
		}
	}
	protected IContext createNiemInternalContext(
			ScriptContext context) {
		org.eclipse.m2m.qvt.oml.ExecutionContext executionContext=(org.eclipse.m2m.qvt.oml.ExecutionContext)context.getAttribute("qvto.execution.context");
		org.eclipse.m2m.internal.qvt.oml.library.Context libraryContext=new org.eclipse.m2m.internal.qvt.oml.library.Context();
		libraryContext.setMonitor(executionContext.getMonitor());
		libraryContext.setLog(executionContext.getLog());
		java.util.Iterator iterator=executionContext.getConfigPropertyNames().iterator();
		while(iterator.hasNext()){
			String propertyName=(String)iterator.next();
			libraryContext.setConfigProperty(propertyName, executionContext.getConfigProperty(propertyName));
		}
		return libraryContext;
	}
	protected org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation transformation;
	protected CompiledUnit compileNiemScript(UnitProxy proxy,
			ScriptContext context) throws MdaException {
		//proxy.getURI();
		Registry registry=(Registry)context.getAttribute(QVTEngineConstants.QVTO_E_PACKAGE_REGISTRY);
		if(registry==null)registry=EPackage.Registry.INSTANCE;
		UnitResolver unitResolver=null;
		QVTOCompiler compiler=createNiemCompiler(unitResolver,registry);
		QvtCompilerOptions options=null;
		Monitor monitor=null;
		CompiledUnit compiledUnit=compiler.compile(proxy, options, monitor);
//		checkCompiledUnit(compiledUnit);
		return compiledUnit;
	}
	private OperationalTransformation getNiemTransformation(
			CompiledUnit compiledUnit) {
		List<Module> modules=compiledUnit.getModules();
		Iterator<Module> iterator=modules.iterator();
		while(iterator.hasNext()){
			Module module=iterator.next();
			if(OperationalTransformation.class.isInstance(module))
				return (OperationalTransformation)module;
		}
		return null;
	}
	private QVTOCompiler createNiemCompiler(
			UnitResolver unitResolver, Registry registry) {
		return QVTOCompiler.createCompiler(unitResolver,registry);
	}
	/*
	public Bindings getBindings(int scope){
		Bindings result=super.getBindings(scope);
		log("ScriptEngine.getBindings "+scope+", "+result);
		if(result!=null){
			log("ScriptEngine.getBindings "+result.entrySet());
		}
		return result;
	}
	*/

	protected UnitProxy getNiemScriptUnit(String script,
			ScriptContext context) {
		String fileName=(String)context.getAttribute("javax.script.filename");
		org.eclipse.emf.common.util.URI uri=org.eclipse.emf.common.util.URI.createFileURI(fileName);
		org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory.Registry registry=org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory.Registry.INSTANCE;
		UnitProxy proxy=registry.getUnit(uri);
		return proxy;
	}

}

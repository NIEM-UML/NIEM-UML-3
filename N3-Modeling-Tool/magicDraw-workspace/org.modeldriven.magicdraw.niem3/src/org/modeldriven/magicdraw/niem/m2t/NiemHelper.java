package org.modeldriven.magicdraw.niem.m2t;

import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogFactory;
import oasis.names.tc.entity.xmlns.xml.catalog.util.CatalogResourceFactoryImpl;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDImport;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSchemaContent;
import org.eclipse.xsd.XSDSchemaDirective;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.instance.InstanceHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEMQVTPlugin;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.qvt.Rfp2DocAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


//import org.modeldriven.magicdraw.qvt.DeployedQvtModule;
//import org.eclipse.uml2.uml.Classifier;
//import org.eclipse.uml2.uml.Element;
//import org.eclipse.uml2.uml.Stereotype;
//import com.nomagic.ci.metamodel.binary.BinaryObject;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.export.image.ImageExporter;
import com.nomagic.magicdraw.foundation.diagram.AbstractDiagramRepresentationObject;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.validation.RuleViolationResult;
import com.nomagic.magicdraw.validation.ValidationResultProvider;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.OpaqueBehavior;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.utils.Utilities;

public class NiemHelper implements NIEM_ProfileConstants{
//	protected static Boolean isWord=true;
	protected static Boolean isWord=false;
	protected ResourceSet resourceSet=new ResourceSetImpl();
	protected ResourceSet getResourceSet(){
		return resourceSet;
	}
	public void log(String text){
		Application.getInstance().getGUILog().log(text);
	}
	protected Project getProject(){
		return Application.getInstance().getProject();
	}
	public String getProjectName(){
		return getProject().getName();
	}
	public Element getElementByID(String id){
		return (Element) getProject().getElementByID(id);
	}
	public String getID(Element element){
		return element.getID();
	}
	public Boolean isEditable(Element element){
		return element.isEditable();
	}
	protected static String anchorHeadBase="&lt;a href=\"";
	protected static String anchorHead="&lt;a href=\"mdel://";
	protected static String hrefTail="\">";
	protected static String anchorEndHead="&lt;";
	protected static String anchorEndTail="/a>";
	protected static String anchorEnd=anchorEndHead+anchorEndTail;
	protected int getNextAnchor(String html){
		int result=-1;
		int head=html.indexOf(anchorHeadBase);
		if(head>=0){
			int end=html.indexOf(anchorEnd, head);
			if(end>=0){
				return head;
/*				
				String anchor=html.substring(head,end+anchorEnd.length());
				String tail=html.substring(end+anchorEnd.length());
				if(anchor.matches("&lt;a href=\"mdel://[^>]*\">[^>]*&lt;/a>")
//					||anchor.matches("&lt;a href=\"[^>]*\">&lt;font size=\"3\">[^>]*&lt;/font>&lt;/a>")	
//					||anchor.matches("&lt;a href=\"[^\"]*\">[^[&lt;/a>]]*&lt;/a>")	
					||anchor.matches("&lt;a href=\"[^>]*\">.*&lt;/a>")	
					){
					return head;
				}else{
					result=getNextAnchor(tail);
					if(result>=0){
						return end+anchorEnd.length()+result;
					}	
				}
*/				
			}
		}
		return result;
	}
	public String getCommentBody(Comment comment){
		String result=comment.getBody();
		if(result.contains("A specified classification (type or kind) of the MPD.")){
			log("getCommentBody "+result);
		}
//if(true)return "";// TEST		
	//if(true)return result;// TEST		
		return result;
	}
	/*
	 * <a href="http://www.w3.org/TR/xmlschema-2/"><font size="3">http://www.w3.org/TR/xmlschema-2/</font></a>
	 */
	public String convertAnchors(String html){
		String result=convertAnchorsInternal(html);
//if(true)return "";// TEST		
	//if(true)return result;// TEST		
		return result;
	}
	protected String convertAnchorsInternal(String html){
		String result=convertAllAnchors(html);
//if(true)return result;// TEST		
		result=convertPreformatted(result);
	//if(true)return "";// TEST		
	//if(true)return result;// TEST		
		return result;
	}
	protected static String preformatHead="&lt;pre>";
	protected static String preformatTail="&lt;/pre>";
	protected int getNextPreformatted(String html){
		int result=-1;
		int head=html.indexOf(preformatHead);
		if(head>=0){
			int end=html.indexOf(preformatTail, head);
			String tail=html.substring(end+preformatTail.length());
			if(end>=0){
				return head;
			}else{
				result=getNextPreformatted(tail);
				if(result>=0){
					return end+preformatTail.length()+result;
				}	
			}
		}
		return result;
	}
	protected static String preformatContentHead="&lt;font color=\"#";
	protected static String preformatContentTail="&lt;/font>";
	protected int getNextPreformattedContent(String html){
		int result=-1;
		int head=html.indexOf(preformatContentHead);
		if(head>=0){
			int end=html.indexOf(preformatContentTail, head);
			if(end>=0){
				String anchor=html.substring(head,end+preformatContentTail.length());
				String tail=html.substring(end+preformatContentTail.length());
				//log("preformatted content "+anchor+", "+anchor.matches("&lt;font color=\"#[^\"]*\">[ ]*&lt;/font>"));
				if(anchor.matches("&lt;font color=\"#[^\"]*\">[ ]*&lt;/font>")	){
					return head;
				}else{
					result=getNextPreformattedContent(tail);
					if(result>=0){
						return end+preformatContentTail.length()+result;
					}	
				}
			}
		}
		return result;
	}
	static protected String nextPreformattedText="</text:p><text:p text:style-name=\"Preformatted_20_Text\">";
	protected String convertPreformattedContent(String html){
		// find <font color="#0000ff">  </font> pattern and wrap embedded parts with odt 
		
		String result=html;
		int head=getNextPreformattedContent(result);
		//log("convertPreformattedContent content "+head+", "+result);
		if(head>=0){
			String prefix=result.substring(0,head);
			String bodyCheck=result.substring(head+preformatContentHead.length());
			int bodyStart=bodyCheck.indexOf(">");
			String body=bodyCheck.substring(bodyStart+1);
			int bodyEnd=body.indexOf(preformatContentTail);
			//String bodyFragment=body.substring(0,bodyEnd);
			String tail=body.substring(bodyEnd+preformatContentTail.length());
			int column=bodyEnd;
			result=prefix
				+nextPreformattedText+"<text:span text:style-name=\"T8\"><text:s text:c=\""+column+"\"/></text:span>"
				+convertPreformattedContent(tail);
		}
		return result;
	}
	protected int leadingSpaces(String html){
		int i=0;
		for(;i<html.length();i++){
			if(html.charAt(i)!=' ')break;
		}
		return i;
		
	}
	protected String convertPreformatted(String html){
		// find <pre>...</pre> and wrap embedded parts with odt 
		String result=html;
		int head=getNextPreformatted(result);
		if(head>=0){
			String prefix=result.substring(0,head);
			String body=result.substring(head+preformatHead.length());
			//log("preformatted body "+body);
			int bodyEnd=body.indexOf(preformatTail);
			String bodyFragment=body.substring(0,bodyEnd);
			String preformattedBody=convertPreformattedContent(bodyFragment);
			// blank line
//			preformattedBody=Pattern.compile("$ *$",Pattern.MULTILINE).matcher(preformattedBody).replaceAll(nextPreformattedText);
//			preformattedBody=Pattern.compile("$[ ]*$",Pattern.MULTILINE).matcher(preformattedBody).replaceAll(nextPreformattedText);
			preformattedBody=Pattern.compile("^ *$",Pattern.MULTILINE).matcher(preformattedBody).replaceAll(nextPreformattedText);
			// leading blanks
			preformattedBody=Pattern.compile("^",Pattern.MULTILINE).matcher(preformattedBody).replaceAll("<>");
			String[] splits=preformattedBody.split("<>");
			preformattedBody="";
			for(String split:splits){
				// if starts with spaces then add
				int leadingSpaces=leadingSpaces(split);
				if(leadingSpaces>0){
					preformattedBody+=nextPreformattedText+"<text:span text:style-name=\"T8\"><text:s text:c=\""+leadingSpaces+"\"/></text:span>";
				}
				if(leadingSpaces<split.length())preformattedBody+="\n"+split.substring(leadingSpaces);
				
			}
//			preformattedBody=preformattedBody.replaceAll("(?m)$\\s*$","<text:p text:style-name=\"Preformatted_20_Text\"/>");
//			preformattedBody=preformattedBody.replaceAll("$\\s*$","<text:p text:style-name=\"Preformatted_20_Text\"/>");
//			preformattedBody=preformattedBody.replaceAll("\\r\\s*\\r","<text:p text:style-name=\"Preformatted_20_Text\"/>");
//			preformattedBody=preformattedBody.replaceAll("\\n *\\n",nextPreformattedText);
			String tail=body.substring(bodyEnd+preformatTail.length());
			result=prefix+""+preformattedBody+""+"</text:p><text:p text:style-name=\"PT10TIMES\">"+convertPreformatted(tail);
		}
		return result;
	}
	protected String refName(String name){
		return refName(name,"a");
	}
	protected String refName(String name,String prefix){
		return prefix+name.replaceAll("\\.","").replaceAll(" ","").replaceAll("_","").replaceAll("-","");
	}
	protected String convertAllAnchors(String html){
		String result=html;
//		int head=result.indexOf(anchorHead);
		int head=getNextAnchor(result);
		if(head>=0){
			String prefix=result.substring(0,head);
			//String href="";
			//if(re)&lt;a href=\"mdel://
//			String href=result.substring(head+anchorHead.length());
			String href=result.substring(head+anchorHeadBase.length());
			int hrefEnd=href.indexOf(hrefTail);
			String hrefFragment=href.substring(0,hrefEnd).replace("mdel://","#");
			String rest=href.substring(hrefEnd+hrefTail.length());
			int anchorEndx=rest.indexOf(anchorEnd);
			if(anchorEndx<0){
				log("ERROR:failed to find anchor end for "+rest);
				return result;
			}
			String tail=rest.substring(anchorEndx+anchorEnd.length());
			String name="?";
			if(hrefFragment.startsWith("#")){
				String refFragment=hrefFragment.replace("#","");
				Element element=getElementByID(refFragment);
				if(NamedElement.class.isInstance(element))name=((NamedElement)element).getName();
				String refFragmentSave=refFragment;
				refFragment=refName(refFragment);
				hrefFragment="#"+refFragment;
				if(Diagram.class.isInstance(element)){
					if(isWord){
						name="<text:span text:style-name=\"italicFont\">Figure "+name+"</text:span>";
					}else{
						refFragment=refName(refFragmentSave,"_Ref");
						name+=" (Figure <text:sequence-ref text:reference-format=\"value\" text:ref-name=\""
						+refFragment+"\">?</text:sequence-ref>)";
					}
//					refFragment=refName(refFragmentSave,"_Ref");
//					hrefFragment="#"+refFragment;
//					hrefFragment="#"+((Diagram)element).getName()+"7";
//					refFragment=((Diagram)element).getName()+"6";
//					hrefFragment="#"+refName(((Diagram)element).getName())+"7";
//					hrefFragment="#"+refName(((Diagram)element).getName())+"6";
//					refFragment=refName(((Diagram)element).getName())+"6";
					/* does not work for word
<text:bookmark-ref text:ref-name="_Ref316873367" text:reference-format="text">Figure 1</text:bookmark-ref>
					*/	
//					name+=" (Figure <text:sequence-ref text:reference-format=\"value\" text:ref-name=\""
//						+refFragment+"\">?</text:sequence-ref>)";
					/*
					result=prefix+"<text:a xlink:type=\"simple\" xlink:href=\""+hrefFragment+"\">"+name+"</text:a>"
					+"(<text:bookmark-ref text:ref-name=\""+refFragment+"\" text:reference-format=\"text\">Figure</text:bookmark-ref>)"
					+convertAnchorsInternal(tail);
<text:bookmark-ref text:ref-name="_Ref316877286" text:reference-format="text">Figure 1xxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyxx
</text:bookmark-ref>
					
					*/
					/*
					result=prefix+"<text:bookmark-ref text:ref-name=\""+refFragment
						+"\" text:reference-format=\"text\">Figure "+name+"</text:bookmark-ref>"
					+convertAnchorsInternal(tail);
					return result;
					*/
//					name="Figure <text:bookmark-ref text:ref-name=\""+refFragment
//					+"\" text:reference-format=\"value\"></text:bookmark-ref> "+name;
//					name="<text:bookmark-ref text:ref-name=\""+refFragment
//					+"\" text:reference-format=\"text\">Figure "+name+"</text:bookmark-ref> ";
//					name="<text:bookmark-ref text:ref-name=\""+refFragment
//					+"\" text:reference-format=\"text\">Figure "+name+"</text:bookmark-ref>";
//					result=prefix+name+convertAnchorsInternal(tail);
//					return result;
				}
				else if(OpaqueBehavior.class.isInstance(element)){
//				else if(NamedElement.class.isInstance(element)){
					// add additional reference information
					name+=" (clause <text:bookmark-ref text:reference-format=\"chapter\" text:ref-name=\""
					+refFragment+"\"></text:bookmark-ref>, page <text:bookmark-ref text:reference-format=\"page\" text:ref-name=\""
						+refFragment+"\"></text:bookmark-ref>) ";
				}	
				else if(NamedElement.class.isInstance(element)){
					/* does not work for word
							name+=" (page <text:bookmark-ref text:reference-format=\"page\" text:ref-name=\""
								+refFragment+"\"></text:bookmark-ref>) ";
					*/		
					
				}
				/*else if(Diagram.class.isInstance(element)){
//					hrefFragment="#"+((Diagram)element).getName()+"7";
//					refFragment=((Diagram)element).getName()+"6";
//					hrefFragment="#"+refName(((Diagram)element).getName())+"7";
//					refFragment=refName(((Diagram)element).getName())+"6";
					name+=" (Figure <text:sequence-ref text:reference-format=\"value\" text:ref-name=\""
						+refFragment+"\">?</text:sequence-ref>)";
				}*/
			}else{
				name=rest.substring(0,anchorEndx);
			}
			result=prefix+"<text:a xlink:type=\"simple\" xlink:href=\""+hrefFragment+"\">"+name+"</text:a>"+convertAnchorsInternal(tail);
			
/*
 *<text:a xlink:type="simple" xlink:href="#7.2.1.5.&lt;Stereotype> Nillable|outline">
                            7.2.1.5 &lt;Stereotype> Nillable
                            <text:tab />
                            <text:bookmark-ref text:reference-format="page"
                                    text:ref-name="__RefHeading__7.2.1.5"></text:bookmark-ref>
                    </text:a>

 */
		}
		return result;
		/*
		 * 	.replaceAll('&lt;a href="mdel://([^>]*)">([^>]*)</a>','<text:a xlink:type="simple" xlink:href="#\1">\2</text:a>')
[template public convertAnchors(value:String){
	anchorHead:String='<a href="mdel://';
	hrefTail:String='">';
	anchorTail:String='</a>';
	head:Integer=value.index(anchorHead);
	result:String=if(head<0) then value else value.substring(head+6) endif;
}][result/][/template]

		 */
	}
	/*
	public String copyImage(String sourceFile){
		
		Project project=getProject();
		File parentRootFile=new File(project.getFileName()).getParentFile();
		File source=new File(parentRootFile,sourceFile);
		String relativeLocation="Pictures/"+source.getName();
		File target=new File(Rfp2DocAction.getCurrentAction().getMasterDocumentBuildDirectory()+"/"+relativeLocation);
		log("NiemHelper.copyImage source "+source+" to "+target);
		Utilities.copyFile(source, target);
		return relativeLocation;
	}
	*/
	public String copyImage(Artifact artifact){
		String sourceFile=artifact.getFileName();
		Project project=getProject();
		File parentRootFile=new File(project.getFileName()).getParentFile();
		File source=new File(parentRootFile,sourceFile);
		String relativeLocation="Pictures/"+source.getName();
		File target=new File(Rfp2DocAction.getCurrentAction().getMasterDocumentBuildDirectory()+"/"+relativeLocation);
		log("NiemHelper.copyImage source "+source+" to "+target);
		Utilities.copyFile(source, target);
//		return relativeLocation;
		return getDrawFrameFragment(target,artifact.getName(),getUriFragment(artifact));
	}
	/*
	static protected ImageObserver imageObserver=new ImageObserver(){
		@Override
		public boolean imageUpdate(Image img, int infoflags, int x, int y,
				int width, int height) {
			return ((infoflags&WIDTH)!=WIDTH) || ((infoflags&HEIGHT)!=HEIGHT);
		}};
		*/
	protected boolean isMasterDocumentDiagramProvisioned(Project project){
		boolean result=true;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
	}
	
	public String createDiagramImage(Diagram diagram){
		long start=System.currentTimeMillis();
		/*
		 * 		<draw:frame draw:style-name="fr2" draw:name="[diagram.name/]"
						text:anchor-type="paragraph" svg:width="6.5in" style:rel-width="100%"
						svg:height="6.478in" style:rel-height="75%" draw:z-index="248">
						<draw:image xlink:href="[diagram.createDiagramImage()/]"
							xlink:type="simple" xlink:show="embed" xlink:actuate="onLoad" />
					</draw:frame>
					

		 */
		Project project=getProject();
		if(!isMasterDocumentDiagramProvisioned(project)){
			log("NiemHelper.createDiagramImage "+diagram.getName()+" suppressed for this project");
			return "";
		}
		String relativeLocation="Pictures/"+diagram.getName()+".png";
		File file=new File(Rfp2DocAction.getCurrentAction().getMasterDocumentBuildDirectory()+"/"+relativeLocation);
//		int height=0;
//		int width=0;
		//log("NiemHelper.createDiagramImage target "+file);
		file.getParentFile().mkdirs();
		for(DiagramPresentationElement diagramTest:project.getDiagrams()){
			if(diagram.equals(diagramTest.getDiagram())){
//				Rectangle rectangle=diagramTest.getBounds();
//				int size=diagramTest.getPresentationElementCount();
//				log("NiemHelper.createDiagramImage target "+file+", diagram bounds "+rectangle+", element count="+size);
				int size=diagramTest.getUsedModelElements(false).size();
								
				log("NiemHelper.createDiagramImage target "+file+", element count="+size);
				System.out.println("NiemHelper.createDiagramImage target "+file);
				if(size>2000){
					log("NiemHelper.createDiagramImage suppress image due to excessive complexity/detail for type of target document");
					return "";
				}
				// create and save image
				try {
					ImageExporter.export(diagramTest, ImageExporter.PNG, file);
					// determine size
//					ImageIcon image=new ImageIcon(file.getAbsolutePath()) ;
//					  height=image.getIconHeight();
//					  width=image.getIconWidth();
					/*
					 Image image=Toolkit.getDefaultToolkit().createImage(file.getAbsolutePath());
					 // we may need to wait for image
					  height=image.getHeight(imageObserver);
					  width=image.getWidth(imageObserver);
					  */
					String result= getDrawFrameFragment(file,diagram.getName(),getID(diagram));
					log("NiemHelper.createDiagramImage complete "+(System.currentTimeMillis()-start));
					System.out.println("NiemHelper.createDiagramImage complete "+(System.currentTimeMillis()-start));
					return result;
				} catch (IOException e) {
					log("ERROR: fail to save diagram "+diagram.getName()+" to "+file+" : "+e);
					return "";
				}
			}
		}
		/*
		AbstractDiagramRepresentationObject adro=diagram.get_representation();
		log("NiemHelper.createDiagramImage represents "+adro);
		if(adro!=null){
		log("NiemHelper.createDiagramImage contents "+diagram.get_representation().getDiagramContents());
		BinaryObject bo=diagram.get_representation().getDiagramContents().getBinaryObject();
		log("NiemHelper.createDiagramImage binaryObject "+bo);
//		bo.get_internalProxy();
		}
 * 
 * <draw:frame draw:style-name="fr4" draw:name="graphics4" text:anchor-type="paragraph" 
 * svg:width="6.5in" svg:height="0.9402in" draw:z-index="21">
<draw:image xlink:href="Pictures/2000000B000055A100000C64C14CBC76.svm" xlink:type="simple" xlink:show="embed" xlink:actuate="onLoad"/>
</draw:frame>

		String drawFrame="<draw:frame draw:style-name=\"fr2\" draw:name=\""+diagram.getName()+"\""
						+"text:anchor-type=\"paragraph\" svg:width=\"6.5in\" style:rel-width=\"100%\" "
						+"svg:height=\"6.478in\" style:rel-height=\"75%\" draw:z-index=\"248\">"
						+"<draw:image xlink:href=\""+relativeLocation+"\" "
							+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
					+"</draw:frame>";
 		if(height<0)height=0;
		if(width<0)width=0;
		String drawFrame="<draw:frame draw:style-name=\"fr2\" draw:name=\""+diagram.getName()+"\" "
						+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
						+"svg:height=\""+height+"pt\"  draw:z-index=\"21\">"
						+"<draw:image xlink:href=\""+relativeLocation+"\" "
							+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
					+"</draw:frame>";
		return drawFrame;//relativeLocation;
*/
//		return getDrawFrameFragment(file,diagram.getName(),getUriFragment(diagram));
		return "";
	}
//	protected float scale=(float) 0.4;
	protected float scale=(float) 0.5;
	protected String getDrawFrameFragment(File file,String diagramName,String eobjectURI){
		int height=0;
		int width=0;
		String relativeLocation=file.getParentFile().getName()+"/"+file.getName();
		// determine size
		ImageIcon image=new ImageIcon(file.getAbsolutePath()) ;
		  height=image.getIconHeight();
		  width=image.getIconWidth();
		  Image awtImage=image.getImage();
		  if(awtImage!=null)awtImage.flush();
		  // scale result
		  height=(int) (height*scale);
		  width=(int) (width*scale);
		if(height<0)height=0;
		if(width<0)width=0;
		
		if((height==0)||(width==0)){
			log("ERROR: failed to determine size of diagram at "+file+", height "+height+", width "+width);
		}
		
/*
 * <draw:frame draw:style-name="fr4" draw:name="Frame6" text:anchor-type="paragraph" svg:width="1.2638in" draw:z-index="139">
<draw:text-box fo:min-height="0.5835in">
<text:p text:style-name="Caption">
<draw:frame draw:style-name="fr7" draw:name="Object Type Example in UML"
        text:anchor-type="paragraph"
        svg:x="0.0016in" svg:y="0.0008in" svg:width="1.2638in" style:rel-width="100%"
        svg:height="0.5835in" style:rel-height="scale" draw:z-index="140">
<draw:image xlink:href="Pictures/10000000000000E50000006BF5C7C6E7.png" xlink:type="simple" xlink:show="embed" xlink:actuate="onLoad"/>
</draw:frame
>Object Type Example in UML
</text:p>
</draw:text-box>
</draw:frame>
		
		String drawFrame="<draw:frame draw:style-name=\"fr2\" draw:name=\""+diagramName+"\" "
						+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
						+"svg:height=\""+height+"pt\"  draw:z-index=\"21\">"
						+"<draw:image xlink:href=\""+relativeLocation+"\" "
							+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
					+"</draw:frame>";
 */
/*		
		String drawFrame=
			""
//			+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
			+			"<draw:frame draw:style-name=\"fr4\" draw:name=\""+diagramName+"\" "
						+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
						+"  draw:z-index=\"139\">"
						+"<draw:text-box fo:min-height=\""+height+"pt\">"
						+"<text:p text:style-name=\"Caption\">"
//						+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+diagramName+"7\" "
						+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
						+"text:anchor-type=\"paragraph\" "
						+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
						+"svg:height=\""+height+"pt\" "
//						+"style:rel-height=\"scale\" "
						+"style:rel-height=\"100%\" "
						+"draw:z-index=\"140\">"
						+"<draw:image xlink:href=\""+relativeLocation+"\" "
						+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
						+"</draw:frame>"
// added
//						+"Figure <text:sequence text:ref-name=\"refFigure0\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
//						+"Figure <text:sequence text:ref-name=\""+diagramName+"6\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
//						+"Figure <text:sequence text:ref-name=\""+refName(diagramName)+"6\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
						+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
//						+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI)+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "

						+diagramName
//						+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
//						+"<text:bookmark-start text:name=\""+eobjectURI+"\"/>  <text:bookmark-end text:name=\""+eobjectURI+"\"/>"
						+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
						+"</text:p>"
						+"</draw:text-box>"
						+"</draw:frame>"
						;
*/		
/*
 * <text:p text:style-name="P2162">
        <draw:frame draw:z-index="251679232" draw:id="id1" draw:style-name="a29" draw:name="Text Box 41"
        text:anchor-type="paragraph" svg:x="0.00139in" 
        svg:y="7.53542in" 
        svg:width="6.11111in" 
        svg:height="0.35833in"
        style:rel-width="scale" style:rel-height="scale">
                <draw:text-box>
                        <text:p text:style-name="Caption">
                                <text:bookmark-start text:name="_Ref316873367"/>Figure
                                        <text:s/>1
                                <text:bookmark-end text:name="_Ref316873367"/>xxxxxxxxxxxxxxx
                        </text:p>
                </draw:text-box>
                <svg:title/>
                <svg:desc/>
        </draw:frame>
        <text:span text:style-name="T2163">
                <draw:frame draw:z-index="251666944" draw:style-name="a30" draw:name="aNIEMMPDPSMMappingCommonOverview1Types7"
                text:anchor-type="paragraph" svg:x="0.0016in" svg:y="0.0008in" svg:width="6.11111in" svg:height="7.36111in"
                style:rel-width="scale" style:rel-height="scale">
                        <draw:image xlink:href="media/image29.png" xlink:type="simple" xlink:show="embed" xlink:actuate="onLoad"/>
                        <svg:title/>
                        <svg:desc/>
                </draw:frame>
        </text:span>
        <text:span text:style-name="T2164">Figure - NIEM MPD-PSM Mapping Common Overview 1 Types</text:span>
</text:p>
		
					refFragment=refName(refFragmentSave,"_Ref");
 */
		/*
		String drawFrame=
			""
			+"<draw:frame draw:style-name=\"fr5\" draw:name=\""+diagramName+"\" "
			+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
	        +" svg:y=\""+(height+12)+"pt\" "
	        +" svg:height=\"0.35833in\""
			+"  draw:z-index=\"139\">"
			+"<draw:text-box>"
			+"<text:p text:style-name=\"Caption\">"
			+"<text:bookmark-start text:name=\""+refName(eobjectURI,"_Ref")+"\"/>Figure <text:s/> "
			+diagramName+"<text:bookmark-end text:name=\""+refName(eobjectURI,"_Ref")+"\"/>"
			+"</text:p>"
			+"</draw:text-box>"
			+"<svg:title/>"
			+"<svg:desc/>"
			+"</draw:frame>"
			+"<text:span>"
			+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
			+"text:anchor-type=\"paragraph\" "
			+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
			+"svg:height=\""+height+"pt\" "
			+"style:rel-height=\"100%\" draw:z-index=\"140\">"
			+"<draw:image xlink:href=\""+relativeLocation+"\" "
			+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
			+"<svg:title/>"
			+"<svg:desc/>"
			+"</draw:frame>"
			+"</text:span>"
			;
			*/
//////////////////////////////////////////////////////////////////////////////
/*		
		String drawFrame=
			""
			+"<text:span>"
			+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
			+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
			+"text:anchor-type=\"paragraph\" "
			+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
			+"svg:height=\""+height+"pt\" "
			+"style:rel-height=\"100%\" draw:z-index=\"140\">"
			+"<draw:image xlink:href=\""+relativeLocation+"\" "
			+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
			+"</draw:frame>"
//			+"Figure <text:sequence text:ref-name=\""+refName(diagramName)+"6\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\"></text:sequence> - "
			+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")
			+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
			+diagramName
			+"</text:span>"
			;
*/		
/*		
		String drawFrame=
			""
			+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
			+"<text:span>"
			+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
			+"text:anchor-type=\"paragraph\" "
			+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
			+"svg:height=\""+height+"pt\" "
			+"style:rel-height=\"100%\" draw:z-index=\"140\">"
			+"<draw:image xlink:href=\""+relativeLocation+"\" "
			+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
			+"</draw:frame>"
//			+"Figure <text:sequence text:ref-name=\""+refName(diagramName)+"6\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\"></text:sequence> - "
//			+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")
//			+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
//			+diagramName
			+"</text:span>"
			+"</text:p>"
			+"<text:p text:style-name=\"Caption\">"
			+"<text:bookmark-start text:name=\""+refName(eobjectURI,"_Ref")+"\"/>"
			+"Figure <text:s/>1 "
			+diagramName
			+"<text:bookmark-end text:name=\""+refName(eobjectURI,"_Ref")+"\"/>"
			;
*/
		String drawFrame="";
		if(isWord){
		 drawFrame=
			""
			+"</text:p>"
			+"<text:p text:style-name=\"Caption\">"
//			+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
			+"<text:span>"
			+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
			+"text:anchor-type=\"paragraph\" "
			+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
			+"svg:height=\""+height+"pt\" "
			+"style:rel-height=\"100%\" draw:z-index=\"140\">"
			+"<draw:image xlink:href=\""+relativeLocation+"\" "
			+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
			+"</draw:frame>"
//			+"Figure <text:sequence text:ref-name=\""+refName(diagramName)+"6\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\"></text:sequence> - "
//			+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")
//			+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
//			+diagramName
			+"</text:span>"
//			+"<text:bookmark-start text:name=\""+refName(eobjectURI,"_Ref")+"\"/>"
			+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>"
			+"Figure"
//			+"<text:s/>1"
			+" "
			+diagramName
//			+"<text:bookmark-end text:name=\""+refName(eobjectURI,"_Ref")+"\"/>"
			+"<text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
			;
		}else{
/*
 <text:p text:style-name="P48">
        <draw:frame draw:style-name="fr2" draw:name="Frame2" text:anchor-type="paragraph" svg:x="0.0016in" svg:width="6.278in" draw:z-index="315">
                <draw:text-box fo:min-height="7.7638in">
                        <text:p text:style-name="Figure">
                                <draw:frame draw:style-name="fr4" draw:name="aTransformOverview17" text:anchor-type="paragraph" svg:x="0.0016in" svg:y="0.0008in" 
                                        svg:width="6.278in" style:rel-width="100%" svg:height="7.7638in" style:rel-height="scale" draw:z-index="316">
                                        <draw:image xlink:href="Pictures/10000000000003880000045EF4431087.png" xlink:type="simple" xlink:show="embed" xlink:actuate="onLoad"/>
                                </draw:frame>
                                <text:sequence text:ref-name="refFigure0" text:name="Figure" text:formula="ooow:Figure+1" style:num-format="1">1</text:sequence>
                                . Figure: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                        </text:p>
                </draw:text-box>
        </draw:frame>
        <text:soft-page-break/>
</text:p>
			
 */
			drawFrame=
				""
//				+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
	+			"<draw:frame draw:style-name=\"fr2x\" draw:name=\""+diagramName+"\" "
							+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
							+"svg:x=\"0.0016in\" "
//							+"svg:height=\""+height+"pt\" "
							+"  draw:z-index=\"139\">"
							+"<draw:text-box fo:min-height=\""+height+"pt\">"
								+"<text:p text:style-name=\"Figure\">"
									+"<draw:frame draw:style-name=\"fr4x\" draw:name=\""+refName(diagramName)+"7\" "
										+"text:anchor-type=\"paragraph\" "
										+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
										+"svg:height=\""+height+"pt\" "
										+"style:rel-height=\"scale\" "
										+"draw:z-index=\"140\">"
										+"<draw:image xlink:href=\""+relativeLocation+"\" "
											+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
									+"</draw:frame>"
									
									+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
		//							+"<text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
									+diagramName
									+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
								+"</text:p>"
								
	//							<text:sequence text:ref-name="refFigure56" text:name="Figure" text:formula="ooow:Figure+1" style:num-format="1">6</text:sequence>
	//							. Figure: xxxxxxxxxxxxxxxxxxxxxxx</text:p>
								
							
							+"</draw:text-box>"
				+"</draw:frame>"
				;
			
			/*
			drawFrame=
				""
//				+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
	+			"<draw:frame draw:style-name=\"fr4\" draw:name=\""+diagramName+"\" "
							+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
							+"svg:height=\""+height+"pt\" "
							+"  draw:z-index=\"139\">"
							+"<draw:text-box fo:min-height=\""+height+"pt\">"
								+"<text:p text:style-name=\"Caption\">"
									+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
										+"text:anchor-type=\"paragraph\" "
										+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
										+"svg:height=\""+height+"pt\" "
										+"style:rel-height=\"100%\" "
										+"draw:z-index=\"140\">"
										+"<draw:image xlink:href=\""+relativeLocation+"\" "
											+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
									+"</draw:frame>"
									
									+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
		//							+"<text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
									+diagramName
									+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
								+"</text:p>"
								
	//							<text:sequence text:ref-name="refFigure56" text:name="Figure" text:formula="ooow:Figure+1" style:num-format="1">6</text:sequence>
	//							. Figure: xxxxxxxxxxxxxxxxxxxxxxx</text:p>
								
							
							+"</draw:text-box>"
				+"</draw:frame>"
				;
	
			drawFrame=
				""
									+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
										+"text:anchor-type=\"paragraph\" "
										+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" "
//										+"style:rel-width=\"100%\" "
										+"svg:height=\""+height+"pt\" "
//										+"style:rel-height=\"100%\" "
										+"draw:z-index=\"140\">"
										+"<draw:image xlink:href=\""+relativeLocation+"\" "
											+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
									+"</draw:frame>"
				;
*/			
		}
/*
 * </draw:frame>
<text:soft-page-break/>
</text:p>
<text:p text:style-name="Caption">Figure 
<text:sequence text:ref-name="refFigure0" text:name="Figure" text:formula="ooow:Figure+1" style:num-format="1">
1
</text:sequence>
 - figure title
</text:p>
		
 */
		return drawFrame;//relativeLocation;
	}
	public Collection<EObject> getResourceObjects(/*EObject element,*/String uriIn){
		try{
		URI uri=URI.createURI(uriIn);
		String lastSegment=uri.lastSegment();
		Collection<EObject> result=new Vector<EObject>();
		if(lastSegment.endsWith(".ecore")||lastSegment.endsWith(".xsd")){
			uri=URI.createFileURI(QvtCommonAction.getMetamodelDir()+lastSegment);
		}else if (lastSegment.endsWith("qvto")){
			Module module=Rfp2DocAction.getModule(lastSegment.replace(".qvto",""));
			log("get MOF QVT  Module "+lastSegment+"="+module);
			if(module!=null)result.add(module);
			return result;
			// use qvtEngine to hook into base model via blackbox, then derive model via import
			//uri=URI.createFileURI(QvtCommonAction.getTransformDir()+lastSegment);
//			uri=URI.createPlatformPluginURI("/"+NIEMQVTPlugin.getPluginID()+"/transform/"+lastSegment.replace(".qvto",""), true);
//			uri=URI.createPlatformPluginURI("/"+NIEMQVTPlugin.getPluginID()+"/transform/"+lastSegment, true);
//			log("getResourceObjects QVTO "+uri);
//			DeployedQvtModule deployedQvtModule=new DeployedQvtModule(NIEMQVTPlugin.getPluginID()+"/transform/"+lastSegment.replace(".qvto",""));
			/*
			DeployedQvtModule deployedQvtModule=new DeployedQvtModule(QvtCommonAction.getTransformDir()+lastSegment.replace(".qvto",""));
			Collection<EObject> qvtresult= new HashSet<EObject>();
			Module module=deployedQvtModule.getModule();
			log("getResourceObjects QVTO "+module);
			qvtresult.add(module);
			return qvtresult;
			*/
		}
		// not getting resource set??????????????
		ResourceSet resourceSet=getResourceSet();
		/*
		ResourceSet resourceSet=element.eResource().getResourceSet();
		if(resourceSet==null){
			resourceSet=new ResourceSetImpl();
		}
		*/
		//System.out.println("getResourceObjects start "+uri+", resource="+element.eResource().getResourceSet());
		result= resourceSet.getResource(uri, true).getContents();
		log("get MOF Resource "+uri+"="+result);
		return result;
		}catch(Throwable t){
			log("ERROR: getResourceObjects "+uriIn+", error="+t);
			t.printStackTrace();
			return new Vector<EObject>();
		}
	}
	
	/*
	public String date(EObject dummy){
		return new Date().toString();
	}
*/
	public String date(){
		return new Date().toString();
	}
	public String month(){
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		StringBuffer toAppendTo=new StringBuffer();
		FieldPosition fieldPosition=new FieldPosition(DateFormat.MONTH_FIELD);
		dateFormat.format(new Date(), toAppendTo, fieldPosition);
		return toAppendTo.toString().substring(fieldPosition.getBeginIndex(), fieldPosition.getEndIndex());
	}
	public String year(){
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		StringBuffer toAppendTo=new StringBuffer();
		FieldPosition fieldPosition=new FieldPosition(DateFormat.YEAR_FIELD);
		dateFormat.format(new Date(), toAppendTo, fieldPosition);
		return toAppendTo.toString().substring(fieldPosition.getBeginIndex(), fieldPosition.getEndIndex());
	}
	public String getUriFragment(EObject eObject){
		try{
		if((eObject==null)||(eObject.eResource()==null))return "";
		String result= eObject.eResource().getURIFragment(eObject);
		if(result==null)result="";
		//System.out.println("getUriFragement "+result+" = "+eObject);
		return result;
		}catch(Throwable t){
			t.printStackTrace();
			return "";
		}
	}
	/////////////////////////////////////////
	public String getNodeName(Object any){
		String result="";
		if(org.w3c.dom.Node.class.isInstance(any)){
			result=((org.w3c.dom.Node)any).getNodeName();
		}
		return result;
	}
	public String getNodeValue(Object any){
		String result="";
		if(org.w3c.dom.Node.class.isInstance(any)){
			result=((org.w3c.dom.Node)any).getNodeValue();
		}
		return result;
	}
	public String getTextContent(Object any){
		String result="";
		if(org.w3c.dom.Element.class.isInstance(any)){
			result=((org.w3c.dom.Element)any).getTextContent();
		}
		return result;
	}
	/*
	public Set<Object> getAttributes(Object any){
		Set<Object> result=new HashSet<Object>();
		if(org.w3c.dom.Element.class.isInstance(any)){
			NamedNodeMap namedNodes=((org.w3c.dom.Element)any).getAttributes();
			for(int i=0;i<namedNodes.getLength();i++){
				result.add(namedNodes.item(i));
			}
		}
		return result;
	}
	public List<Object> getApplicationInformation(XSDAnnotation any){
		List<Object> result=new Vector<Object>(any.getApplicationInformation());
		return result;
	}
	*/
	//////////////////////////////////////
	protected List<org.w3c.dom.Element> getApplicationInformationElements(XSDAnnotation any){
		List<org.w3c.dom.Element> result=new Vector<org.w3c.dom.Element>();
		for(org.w3c.dom.Element element:any.getApplicationInformation()){
			NodeList nodeList=element.getChildNodes();
			for(int index=0;index<nodeList.getLength();index++){
				Node node=nodeList.item(index);
				if(org.w3c.dom.Element.class.isInstance(node)){
					result.add((org.w3c.dom.Element)node);
				}
			}
		}
		return result;
	}
	
	public List<String> getApplicationInformation(XSDAnnotation any){
		List<String> result=new Vector<String>();
		for(org.w3c.dom.Element element:getApplicationInformationElements(any)){
			result.add(getNodeName(element));
		}
		return result;
	}
	public List<String> getAttributes(XSDAnnotation any,Integer elementIndex){
		List<String> result=new Vector<String>();
		List<org.w3c.dom.Element> appinfoElements=getApplicationInformationElements(any);
		if(elementIndex<=appinfoElements.size()){
			org.w3c.dom.Element element=appinfoElements.get(elementIndex-1);
			NamedNodeMap nodeMap=element.getAttributes();
			for(int index=0;index<nodeMap.getLength();index++){
				Node node=nodeMap.item(index);
				if(org.w3c.dom.Attr.class.isInstance(node)){
					org.w3c.dom.Attr attr=(org.w3c.dom.Attr)node;
					result.add(getNodeName(attr)+"="+getNodeValue(attr));
				}
			}
		}
		return result;
	}
	//////////////////////////////////////
	public Catalog getMpdCatalog(Element context,String filePath){
		if(NamedElement.class.isInstance(context))log("getMpdCatalog test context "+((NamedElement)context).getName());
		try{
		URI uri=URI.createFileURI(filePath);
//		Resource resource=context.eResource().getResourceSet().getResource(uri,true);
		ResourceSet resourceSet=new ResourceSetImpl();
		// register mpdcat
	    resourceSet.getPackageRegistry().put("urn:oasis:names:tc:entity:xmlns:xml:catalog", 
	    		CatalogPackage.eINSTANCE);
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("catalog",  new CatalogResourceFactoryImpl());
	    CatalogResourceFactoryImpl rf=new CatalogResourceFactoryImpl();
	    Resource resource=rf.createResource(uri);
	    Map options=new HashMap();
	    resource.load(options);
//		Resource resource=resourceSet.getResource(uri,true);
		log("getMpdCatalog "+filePath+", "+uri+", "+resource+", "+resource.getContents());
		for(EObject test:resource.getContents()){
			log("getMpdCatalog test "+test);
			if(DocumentRoot.class.isInstance(test)){
				return ((DocumentRoot)test).getCatalog();
			}
		}
		}catch(Throwable t){
			t.printStackTrace();
		}
		return null;
	}
	public Set<String> getUserInformationSources(XSDAnnotation element){
		return element.getUserInformationSources();
		}
	public InstanceSpecification getApplication(Element element){
		return element.getAppliedStereotypeInstance();
		}
	public Boolean hasAppliedStereotype(Element element,String stereotypeName){return getStereotype(element,stereotypeName)!=null;}
	public Stereotype getStereotype(Element element,String stereotypeName){
		if((element==null)||(stereotypeName==null))return null;
		Stereotype result=null;
		if(getApplication(element)!=null)
		for(Classifier classifier:getApplication(element).getClassifier()){
			if(Stereotype.class.isInstance(classifier) && isStereotypeMatch((Stereotype) classifier,stereotypeName)){
				result=(Stereotype) classifier;
				break;
			}
		}
		//System.out.println("getStereotype "+result);
		return result;
	}
	protected boolean isStereotypeMatch(Stereotype stereotype,String stereotypeName){
		if(isStereotypeNameMatch(stereotype,stereotypeName)){
			return true;
		}else{
			for(Classifier classifier:allParents(stereotype)){
				if(isStereotypeNameMatch(classifier,stereotypeName)){
					return true;
				}
			}
		}
		return false;
	}
	protected Set<Classifier> allParents(Classifier classifier){
		Set<Classifier> result=new HashSet<Classifier>();
		for(Classifier parent:classifier.getGeneral()) allParents(parent,result);
		return result;
	}
	protected void allParents(Classifier classifier,Set<Classifier> didThat){
		if(didThat.contains(classifier)) return;
		didThat.add(classifier);
		for(Classifier parent:classifier.getGeneral()) allParents(parent,didThat);
	}
	protected boolean isStereotypeNameMatch(Classifier stereotype,String stereotypeName){
		if(stereotypeName.equals(stereotype.getName())
				||stereotypeName.equals(stereotype.getQualifiedName())
				||stereotypeName.replace("::","_").equals(stereotype.getName())
				){
			return true;
		}
		return false;
	}
	public List<ValueSpecification> getValues(Element element,String tagName){
		List<ValueSpecification> result=new Vector<ValueSpecification>();
		InstanceSpecification instance=getApplication(element);
		if(instance!=null){
			for(Slot slot:instance.getSlot()){
				if(tagName.equals(slot.getDefiningFeature().getName())){
					result.addAll(slot.getValue());
				}
			}
		}
		return result;
	}
	public String getNIEMName(Classifier classifier){
		/*
		String result="(unnamed)";
		if(classifier==null)return result;
		result= classifier.getName();
		if(result==null)return "(unnamed)";
		return result;
		*/
		return NameHelper.getNIEMName(classifier);
	}
	public String getPropertyNIEMName(Property classifier){
//		return classifier.getName();
		return NameHelper.getNIEMName(classifier);
	}
	public Property redefinedProperty(Property subsetProperty){
		return NIEMHelper.getReferenceProperty(subsetProperty);
	}
	
	public List<String> getValidationResults(){
		List<String> results=new Vector<String>();
		Project project=getProject();
		ValidationResultProvider vrp=project.getValidationResultProvider();
		List<RuleViolationResult> validationResults=vrp.getActiveValidationResults(true);
		for(RuleViolationResult result:validationResults){
			Annotation annotation=result.getAnnotation();
			String asString=getTargetName(annotation)+";"+annotation.getSeverity().getName()+";"+annotation.getKind()+";"+annotation.getText();
//			results.add(result.getAnnotation());
			results.add(asString);
		}
		//System.out.println("getValidationResults "+results);
		return results;
	}
	protected String getTargetName(Annotation annotation){
		BaseElement baseElement=annotation.getTarget();
		if(baseElement instanceof NamedElement)return ((NamedElement)baseElement).getQualifiedName();
		return baseElement.toString();
	}
//	public Element getValidationElement(Object annotation){
	public String getValidationElement(String annotation){
		String result= annotation.split(";")[0];
//		System.out.println("getValidationElement "+annotation+" = "+result);
		return result;
//		return (Element)((Annotation)annotation).getTarget();
	}
	public String getValidationSeverity(String annotation){
		return annotation.split(";")[1];
//		return ((Annotation)annotation).getSeverity().getName();
	}
	public String getValidationAbbreviation(String annotation){
		return annotation.split(";")[2];
//		return ((Annotation)annotation).getKind();
	}
	public String getValidationMessage(String annotation){
		return annotation.split(";",4)[3];
//		return ((Annotation)annotation).getText();
	}

	///////////////////
	public static class NamespaceMapEntry{
		protected String key=null;
		protected String value=null;
		public NamespaceMapEntry(String k,String v){
			key=k;
			value=v;
		}
		public String getPrefix(){return key;}
		public String getSchemaLocation(){return value;}
		public void setSchemaLocation(String schemaLocation){value=schemaLocation;}
	}
	public static class QNamePrefixToNamespaceMap{
		protected int nextID=0;
		protected Map<String,NamespaceMapEntry> entries=null;
		public QNamePrefixToNamespaceMap(Map<String,NamespaceMapEntry> entriesIn){
			entries=entriesIn;
		}
		public Map<String,NamespaceMapEntry> getEntries(){return entries;}
		public int nextID(){return nextID++;}
	}
	///////////////////
	/*
	public Set<Object> getQNamePrefixToNamespaceMap(XSDSchema schema){
		Set<Object> result=new HashSet();
		schema.update();
		Map<String,String> maps=schema.getQNamePrefixToNamespaceMap();
		log("getQNamePrefixToNamespaceMap "+schema.getTargetNamespace()+" = "+maps);
		for(Entry<String, String> entry:maps.entrySet()){
			result.add(new NamespaceMapEntry(entry.getKey(),entry.getValue()));
		}
		return result;
	}
	*/
	public Object getQNamePrefixToNamespaceMap(XSDSchema schema){
		Map<String,NamespaceMapEntry> result=new HashMap<String,NamespaceMapEntry>();
		Set<XSDSchema> didThat=new HashSet<XSDSchema>();
		getQNamePrefixToNamespaceMapCommon(schema,result,didThat);
		//log("getQNamePrefixToNamespaceMap "+schema.getTargetNamespace()+" = "+result);
		QNamePrefixToNamespaceMap map=new QNamePrefixToNamespaceMap(result);
		return map;
	}
	protected String getUniquePrefix(String prefix,Map<String,NamespaceMapEntry> result){
		for(Entry<String,NamespaceMapEntry> entry:result.entrySet()){
			NamespaceMapEntry myEntry=entry.getValue();
			String prefixTest=myEntry.getPrefix();
			if(prefix.equals(prefixTest)){
				return getUniquePrefix(prefix+"_",result);
			}
		}
		return prefix;
	}
	protected void getQNamePrefixToNamespaceMapCommon(XSDSchema schema,Map<String,NamespaceMapEntry> result,Set<XSDSchema> didThat){
		didThat.add(schema);
		schema.update();
		//System.out.println("getQNamePrefixToNamespaceMapCommon updated schema "+schema.getTargetNamespace());
		Map<String,String> maps=schema.getQNamePrefixToNamespaceMap();
		String myNamespace=schema.getTargetNamespace();
		String mySchemaLocation=schema.getSchemaLocation();
		//log("getTransitiveQNamePrefixToNamespaceMap "+schema.getTargetNamespace()+" = "+maps);
		//log("getTransitiveQNamePrefixToNamespaceMap "+schema.getTargetNamespace()+" = "+mySchemaLocation);
		for(Entry<String, String> entry:maps.entrySet()){
			String namespace=entry.getValue();
			String prefix=entry.getKey();
			if((prefix==null)||(namespace==null))continue;
			if(result.get(namespace)==null){
				prefix=getUniquePrefix(prefix,result);
				result.put(namespace,new NamespaceMapEntry(prefix,null));
			}
			String schemaLocation=null;
			if(myNamespace.equals(namespace)){
				schemaLocation=mySchemaLocation;
				NamespaceMapEntry myEntry=result.get(namespace);
				myEntry.setSchemaLocation(schemaLocation);
			}
		}
		// imported schemas
		for(XSDSchemaContent content:schema.getContents()){
			if(XSDSchemaDirective.class.isInstance(content)){
				XSDSchemaDirective xsdImport=(XSDSchemaDirective)content;
				XSDSchema importedSchema=xsdImport.getResolvedSchema();
				if(importedSchema!=null){
					getTransitiveQNamePrefixToNamespaceMap(importedSchema,result,didThat);
				}
			}
		}
	}
	protected void getTransitiveQNamePrefixToNamespaceMap(XSDSchema schema,Map<String,NamespaceMapEntry> result,Set<XSDSchema> didThat){
		if(didThat.contains(schema))return;
		getQNamePrefixToNamespaceMapCommon(schema,result,didThat);
	}
	public String nextID(Object m){
		QNamePrefixToNamespaceMap map=(QNamePrefixToNamespaceMap)m;
		return ""+map.nextID();
	}
	public String getPrefix(XSDNamedComponent element,Object m){
		QNamePrefixToNamespaceMap map=(QNamePrefixToNamespaceMap)m;
		NamespaceMapEntry entry=map.getEntries().get(element.getTargetNamespace());
		if(entry!=null){
			return entry.getPrefix();
		}
		return "UNKNOWN";
	}
	public String xmlnsAttribues(Object m,Slot slot){
		QNamePrefixToNamespaceMap map=(QNamePrefixToNamespaceMap)m;
//		String result="";
		StringBuffer result=new StringBuffer(8000);
		Map<String,NamespaceMapEntry> entries=map.getEntries();
		for(Entry<String, NamespaceMapEntry> mapentry:entries.entrySet()){
			String namespace=mapentry.getKey();
			NamespaceMapEntry entry=mapentry.getValue();
			String prefix=entry.getPrefix();
			if((prefix!=null)&&(namespace!=null))
				result.append(" xmlns:"+prefix+"=\""+namespace+"\"");
		}
		result.append(
				" xmlns:s=\"http://niem.gov/niem/structures/2.0\"" +
				" xmlns:i=\"http://niem.gov/niem/appinfo/2.0\"" +
				" xmlns:niem-xsd=\"http://niem.gov/niem/proxy/xsd/2.0\"" +
				" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n xsi:schemaLocation=\"");
//		File rootFile=CommonGenerator.getLastTargetDirectory();
//		String rootFilePath=rootFile.getAbsolutePath();
// just get the root schema; otherwise validation errors occur on other schemas
		StructuralFeature feature=slot.getDefiningFeature();
		if(feature!=null){
			Package informationModel=NIEMHelper.getNearestInformationModel(feature);
			if(informationModel!=null){
				String namespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
				if(namespace!=null){
					for(Entry<String, NamespaceMapEntry> mapentry:entries.entrySet()){
						String namespaceTest=mapentry.getKey();
						if(namespace.equals(namespaceTest)){
							NamespaceMapEntry entry=mapentry.getValue();
							String schemaLocation=entry.getSchemaLocation();
							if(schemaLocation!=null){
								result.append(namespace+" "+schemaLocation+"\n");
								break;
							}
						}
					}
				}
			}
		}
		/*
		for(Entry<String, NamespaceMapEntry> mapentry:entries.entrySet()){
			String namespace=mapentry.getKey();
			if(namespace==null)continue;
			NamespaceMapEntry entry=mapentry.getValue();
			String schemaLocation=entry.getSchemaLocation();
			if(schemaLocation!=null){
				result.append(namespace+" "+schemaLocation+"\n");
				*/
				/*
				try{
				java.net.URI uri=new java.net.URI(schemaLocation);
				File schemaFile=new File(uri);
				String schemaFilePath=schemaFile.getAbsolutePath();
				if(schemaFilePath.startsWith(rootFilePath)){
					String schemaLocation2="../.."+schemaFilePath.substring(rootFilePath.length()).replace("\\","/");
					result.append(namespace+" "+schemaLocation2+"\n");
				}
				}catch(URISyntaxException e){
					
				}
				*/
//			}
//		}
		result.append("\"");
//		Charset charset=Charset.forName("UTF-8") ;
//		Charset charset=Charset.forName("US-ASCII") ;
//		result=charset.decode(charset.encode(result)).toString(); 
		return result.toString();
	}
	/*
	public String getKey(Object entry){
		return ((NamespaceMapEntry)entry).getKey();
	}
	public String getValue(Object entry){
		return ((NamespaceMapEntry)entry).getValue();
	}
	*/
	/*
	public String getPrefix(Object entry){
		return ((Entry<String,String>)entry).getValue();
	}
	*/
	public String getXmlDate(){
				SimpleDateFormat format=new		SimpleDateFormat("yyyy-MM-dd ZZZZZZ") ;	
				Date date=new Date();
				return  format.format(date);
	}
	public String getXmlDateTime(){
		//  yyyy '-' mm '-' dd 'T' hh ':' mm ':' ss ('.' s+)? (zzzzzz)?
		SimpleDateFormat format=new		SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss ZZZZZZ") ;	
		Date date=new Date();
		return  format.format(date);
}
	
	public String getXmlTime(){
		//  hh:mm:ss.sss
		SimpleDateFormat format=new		SimpleDateFormat("hh:mm:ss.SSS") ;	
		Date date=new Date();
		return  format.format(date);
}
	
	public String getXmlGYearMonth(){
		//  CCYY-MM
		SimpleDateFormat format=new		SimpleDateFormat("yyyy-MM") ;	
		Date date=new Date();
		return  format.format(date);
}
	public String getXmlGYear(){
		//  CCYY
		SimpleDateFormat format=new		SimpleDateFormat("yyyy") ;	
		Date date=new Date();
		return  format.format(date);
}
	public String getXmlGMonthDay(){
		//  MM-dd
		SimpleDateFormat format=new		SimpleDateFormat("MM-dd") ;	
		Date date=new Date();
		return  format.format(date);
}
	public String getXmlGDay(){
		//  dd
		SimpleDateFormat format=new		SimpleDateFormat("dd") ;	
		Date date=new Date();
		return  format.format(date);
}
	public String getXmlGMonth(){
		//  MM
		SimpleDateFormat format=new		SimpleDateFormat("MM") ;	
		Date date=new Date();
		return  format.format(date);
}
	///////////////////////////////////////////////////////
	public Boolean isXSDAttribute(StructuralFeature feature){
		if(Property.class.isInstance(feature)){
			return NIEMHelper.isXSDAttribute((Property)feature);
		}
		return false;
	}
	public Object getUmlQNamePrefixToNamespaceMap(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		Map<String,NamespaceMapEntry> result=new HashMap<String,NamespaceMapEntry>();
		Set<Package> didThat=new HashSet<Package>();
		boolean hasConstraints=hasConstraints((InstanceSpecification)element);
		getUmlQNamePrefixToNamespaceMapCommon((InstanceSpecification)element,result,didThat,hasConstraints);
		
		QNamePrefixToNamespaceMap map=new QNamePrefixToNamespaceMap(result);
		//log("getUmlQNamePrefixToNamespaceMap "+result);
		return map;
	}
	public String getNIEMName(NamedElement namedElement){
		String result=namedElement.getName();
		if(namedElement instanceof Property)result=NameHelper.getNIEMName((Property)namedElement);
		else if(namedElement instanceof EnumerationLiteral)result=NameHelper.getNIEMName((EnumerationLiteral)namedElement);
		else if(namedElement instanceof Classifier)result=NameHelper.getNIEMName((Classifier)namedElement);
		return result;
	}
	protected static Map<String,String> standardNiemNamespacePrefixMap=null;
	protected Map<String,String> getStandardNiemNamespacePrefixMap(){
		if(standardNiemNamespacePrefixMap==null){
			standardNiemNamespacePrefixMap=new HashMap<String,String>();
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/ansi-nist/2.0","ansi-nist");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/ansi_d20/2.0","ansi_d20");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/apco/2.1","apco");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/atf/2.0","atf");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/post-canada/2.0","can");
			standardNiemNamespacePrefixMap.put("urn:oasis:names:tc:emergency:cap:1.1","cap");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/cbrn/2.1","cbrn");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/cbrncl/2.1","cbrncl");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/census/2.0","census");
			standardNiemNamespacePrefixMap.put("urn:oasis:names:tc:emergency:EDXL:DE:1.0","de");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/dea/2.1","dea");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/dod_jcs-pub2.0-misc/2.0","dod_jcs-pub2.0");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/edxl/2.1","edxl");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/edxl/2.1","edxl-cap");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/edxl-de/2.1","edxl-de");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/edxl-have/2.1","edxl-have");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/emergencyManagement/2.1","em");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/fbi/2.0","fbi");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/fips_10-4/2.0","fips_10-4");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/fips_5-2/2.0","fips_5-2");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/fips_6-4/2.0","fips_6-4");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/familyServices/2.1","fs");
			standardNiemNamespacePrefixMap.put("http://www.isotc211.org/2005/gco","gco");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/geospatial/2.1","geo");
			standardNiemNamespacePrefixMap.put("http://www.isotc211.org/2005/gmd","gmd");
			standardNiemNamespacePrefixMap.put("http://www.opengis.net/gml/3.2","gml");
			standardNiemNamespacePrefixMap.put("http://www.isotc211.org/2005/gmx","gmx");
			standardNiemNamespacePrefixMap.put("http://www.isotc211.org/2005/gsr","gsr");
			standardNiemNamespacePrefixMap.put("http://www.isotc211.org/2005/gss","gss");
			standardNiemNamespacePrefixMap.put("http://www.isotc211.org/2005/gts","gts");
			standardNiemNamespacePrefixMap.put("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0","have");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/have-codes/2.1","have-codes");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/hazmat/2.1","hazmat");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/immigration/2.1","im");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/intelligence/2.1","intel");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/infrastructureProtection/2.1","ip");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/iso_3166/2.0","iso_3166");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/iso_4217/2.0","iso_4217");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/iso_639-3/2.0","iso_639-3");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/internationalTrade/2.1","it");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/itis/2.1","itis");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/jxdm/4.1","j");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/lasd/2.0","lasd");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/maritime/2.1","m");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/mmucc_2/2.1","mmucc_2");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/mn_offense/2.0","mn_off");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/niem-core/2.0","nc");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/nga/2.0","nga");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/proxy/xsd/2.0","niem-xsd");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/nlets/2.1","nlets");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/nonauthoritative-code/2.0","nonauth");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/sar/2.1","sar");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/domains/screening/2.1","scr");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/twpdes/2.0","twpdes");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/ucr/2.0","twpdes");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/ucr/2.0","ucr");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/unece_rec20-misc/2.0","unece");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/usps_states/2.0","usps");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/ut_offender-tracking-misc/2.0","ut_offender");
			standardNiemNamespacePrefixMap.put("http://www.w3.org/1999/xhtml","xhtml");
			standardNiemNamespacePrefixMap.put("http://www.w3.org/1999/xlink","xlink");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/structures/2.0","s");
			standardNiemNamespacePrefixMap.put("http://www.w3.org/XML/1998/namespace","xml");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/external/ogc/xls/1.1.0/dhs-gmo/2.1.0","xls");
			standardNiemNamespacePrefixMap.put("http://niem.gov/niem/appinfo/2.0","i");

		}
		return standardNiemNamespacePrefixMap;
	}
	protected String getStandardNiemNamespacePrefix(String namespace){
		return getStandardNiemNamespacePrefixMap().get(namespace);
	}
	protected void addUmlPackagePrefixToNamespace(Package informationModel,InstanceSpecification schema,Map<String,NamespaceMapEntry> result,Set<Package> didThat,boolean hasConstraints){
		if(informationModel!=null){
			if(!didThat.contains(informationModel)){
				didThat.add(informationModel);
				String namespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
				String prefix=NIEMHelper.getNamespaceDefaultPrefix(informationModel);
				if((prefix==null)||(prefix.length()==0)){
					// is this a standard niem namespace?
					prefix=getStandardNiemNamespacePrefix(namespace);
					if(prefix==null){
					prefix="Q";
					}
				}
				if((namespace!=null)&&(namespace.length()>0)){
					if(result.get(namespace)==null){
						prefix=getUniquePrefix(prefix,result);
						result.put(namespace,new NamespaceMapEntry(prefix,null));
					
					// we need to resolve schemaLocation
						//Package resolvedInformationModel=resolveInformationModel(informationModel);
						
						String schemaLocation=resolvePathToRoot(NIEMHelper.getNearestPackage(schema))+resolveSchemaLocation(informationModel,schema,hasConstraints);
							NamespaceMapEntry myEntry=result.get(namespace);
							myEntry.setSchemaLocation(schemaLocation.replace(" ","%20"));
					}
				
				}
						
			}
		}
		
	}
	/*
	protected Package resolveInformationModel(Package informationModel){
		Package resolvedInformationModel=informationModel;
		if(resolvedInformationModel==null)return resolvedInformationModel;
		String targetNamespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
		if(targetNamespace==null)return resolvedInformationModel;
		// resolve to constraint schema, if it exists
		// TODO: this may not work if there are multiple constraint schema sets;
		//  for that scenario, we would need to keep the <<References>>
		for(Dependency dependency:informationModel.getSupplierDependency()){
			if(!NIEMHelper.isModelPackageDescriptionFile(dependency))continue;
			for(NamedElement mpdTest:dependency.getClient()){
				if(!NIEMHelper.isModelPackageDescription(mpdTest))continue;
				// is there a constraint model with the same namespace?
				for(Dependency d:mpdTest.getClientDependency()){
					if(!NIEMHelper.isModelPackageDescriptionFile(d))continue;
					if(d.equals(dependency))continue;
					for(NamedElement imTest:d.getSupplier()){
						if(!NIEMHelper.isNamespacePackage(imTest))continue;
						if(imTest.equals(informationModel))continue;
						String testNamespace=NIEMHelper.getNamespaceTargetNamespace((Package)imTest);
						if(targetNamespace.equals(testNamespace))return (Package)imTest;
					}
				}
			}
		}
		return resolvedInformationModel;
	}
	*/
	protected String resolvePathToRoot(Package informationModel){
		// get the <<ModelPackageDescriptionFile>>, relativePathUri if present, otherwise relative path to applied profile
		
		for(Dependency dependency:getSupplierModelPackageDescriptionFiles(informationModel)){
			String relativePath=NIEMHelper.getMpdFileRelativePathName(dependency);
			if((relativePath!=null)&&(relativePath.length()>0)){
				if(relativePath.startsWith("./")){
					if(relativePath.length()>2)relativePath=relativePath.substring(2);
					else relativePath="";
				}
				else if(relativePath.startsWith("/")){
					if(relativePath.length()>1)relativePath=relativePath.substring(1);
					else relativePath="";
				}
				String reversePath=".";
				for(String text:relativePath.split("/")){
					reversePath+="/..";
				}
				return reversePath;
			}
		}
		return getPathToAppliedProfile(informationModel);
	}
	protected String getPathToAppliedProfile(Package fromPackage){
		if(fromPackage==null)return "";
		Package p=fromPackage.getNestingPackage();
		if(p==null)return ".";
		if(!p.getProfileApplication().isEmpty()) return ".";
		return getPathToAppliedProfile(p)+"/..";
	}
	public String resolveInstanceDocumentLocation(InstanceSpecification schema){
		//log("resolveInstanceDocumentLocation start "+schema);
		// get the <<ModelPackageDescriptionFile>>, relativePathUri if present, otherwise relative path to applied profile
		try{
		Package informationModel=NIEMHelper.getNearestPackage(schema);
		if(informationModel==null)return "/UNKNOWN.xml";
		for(Dependency dependency:getSupplierModelPackageDescriptionFiles(informationModel)){
			String relativePath=NIEMHelper.getMpdFileRelativePathName(dependency);
			if((relativePath!=null)&&(relativePath.length()>0))return appendXmlSuffix(relativePath);
		}
		String result= appendXmlSuffix(getPathFromAppliedProfile(informationModel));
		//log("resolveInstanceDocumentLocation "+result);
		return result;
		}catch(Throwable t){
			log("resolveInstanceDocumentLocation ERROR "+t);
			t.printStackTrace();
			return "/UNKNOWN.xml";
		}
	}
	protected String appendXmlSuffix(String filepath){
		if(filepath.endsWith(".xml"))return filepath;
		return filepath+".xml";
	}
	protected String resolveSchemaLocation(Package informationModel,InstanceSpecification schema,boolean hasConstraints){
		String baseSchemaLocation=resolveBaseSchemaLocation(informationModel,schema);
		if(hasConstraints){
			// determine adjustment for constraint schemas
			baseSchemaLocation="/XMLschemas/constraint"+baseSchemaLocation;
		}
		return baseSchemaLocation;
	}
	protected String resolveBaseSchemaLocation(Package informationModel,InstanceSpecification schema){
		// get the <<ModelPackageDescriptionFile>>, relativePathUri if present, otherwise relative path to applied profile
		for(Dependency dependency:getSupplierModelPackageDescriptionFiles(informationModel)){
			String relativePath=NIEMHelper.getMpdFileRelativePathName(dependency);
			if((relativePath!=null)&&(relativePath.length()>0))return appendXsdSuffix(relativePath);
		}
		return appendXsdSuffix(getPathFromAppliedProfile(informationModel));
	}
	protected String appendXsdSuffix(String filepath){
		if(filepath.endsWith(".xsd"))return filepath;
		return filepath+".xsd";
	}
	protected String getPathFromAppliedProfile(Package p){
		if(p==null)return "";
		if(!p.getProfileApplication().isEmpty()) return "";
		return getPathFromAppliedProfile(p.getNestingPackage())+"/"+p.getName();
	}
	protected List<Dependency> getSupplierModelPackageDescriptionFiles(Package informationModel){
		List<Dependency> result=new Vector<Dependency>();
		if(informationModel!=null)
		for(Dependency mpdFile:informationModel.getSupplierDependency()){
			if(!NIEMHelper.isModelPackageDescriptionFile(mpdFile))continue;
				result.add(mpdFile);
			
		}
		return result;
	}
	// use Catalog or model?
	/*
	protected static CatalogType currentCat=null;
	static public void setCurrentCat(CatalogType cat){currentCat=cat;}
	protected CatalogType getCurrentCat(){return currentCat;}
	*/
	// model should have relative location plus namespace info, but do we know where we are?
	// we should be at location of package relative to profile
	
	protected void getUmlQNamePrefixToNamespaceMapCommon(InstanceSpecification schema,Map<String,NamespaceMapEntry> result,Set<Package> didThat,boolean hasConstraints){
		for(Slot slot:schema.getSlot()){
			StructuralFeature feature=slot.getDefiningFeature();
			if(Property.class.isInstance(feature)){
				Property property=(Property)feature;
				Package informationModel=NIEMHelper.getNearestInformationModel(property);
				addUmlPackagePrefixToNamespace( informationModel,schema,result, didThat,hasConstraints);
				Type type=property.getType();
				if(type!=null){
					addUmlPackagePrefixToNamespace( NIEMHelper.getNearestInformationModel(type),schema,result, didThat,hasConstraints);
				}
				if(AggregationKindEnum.NONE.equals(property.getAggregation())){
					// go no further
				}else{
					// containment: continue if InstanceSpec
					for(ValueSpecification valueSpecification:slot.getValue()){
						if(InstanceValue.class.isInstance(valueSpecification)){
							InstanceSpecification containedInstance=((InstanceValue)valueSpecification).getInstance();
							if(containedInstance!=null){
								getUmlQNamePrefixToNamespaceMapCommon(containedInstance,result,didThat,hasConstraints);
							}
						}
					}
				}
			}
		}
	}
	protected boolean hasConstraints(InstanceSpecification schema){
		Set<Package> didThat=new HashSet<Package>();
		for(Slot slot:schema.getSlot()){
			StructuralFeature feature=slot.getDefiningFeature();
			if(Property.class.isInstance(feature)){
				Property property=(Property)feature;
				Package informationModel=NIEMHelper.getNearestInformationModel(property);
//				return hasConstraints(informationModel,new HashSet<Package>());
				if( hasConstraints(informationModel,didThat))return true;
			}
		}
		return false;
	}
	protected boolean hasConstraints(Package schema,Set<Package> didThat){
		if(schema==null)return false;
		if(didThat.contains(schema))return false;
		didThat.add(schema);
		// if this is a subset schema, then scan its types/properties for any type override
		if(!NIEMHelper.isInformationModel(schema))return false;
		for(Package subsettingPackage:NIEMHelper.getInformationModelSubsetting(schema)){
			if(NIEMHelper.isInformationModelDefaultPurposeConstraint(subsettingPackage))return true;
		}
		//if(NIEMHelper.getReferencesReferenceModelInformationModel(schema)==null)return false;
		for(Type type:schema.getOwnedType()){
			if(hasConstraints(type,didThat))return true;
		}
		return false;
	}
	
	protected boolean hasConstraints(Type type,Set<Package> didThat){
		if(type==null)return false;
		if(!(type instanceof Classifier))return false;
		Classifier classifier=(Classifier)type;
		// check bases
		Classifier baseClassifier=NIEMHelper.getBaseClassifier(classifier);
		if(baseClassifier!=null){
			Package basePackage=NIEMHelper.getNearestInformationModel(baseClassifier);
			if(basePackage!=null){
				if(hasConstraints(basePackage,didThat))return true;
			}
		}
		// check properties
		for(Property subsetProperty:NIEMHelper.getOrderedProperties(classifier)){
    		//if(NIEMHelper.isNiemTypeOverrideConstraint(subsetProperty))return true;
			
			Type subsetType=subsetProperty.getType();
			if(subsetType==null)continue;
			Package basePackage=NIEMHelper.getNearestInformationModel(subsetType);
			if(basePackage!=null){
				if(hasConstraints(basePackage,didThat))return true;
			}
		}
		return false;
	}
	
	public String getUmlPrefix(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element,Object m){
		QNamePrefixToNamespaceMap map=(QNamePrefixToNamespaceMap)m;
		// find via <<InformationModel>>
		if(Property.class.isInstance(element)){
			Property property=(Property)element;
			Property test=NameHelper.getSubsetPropertyHolderProperty(property);
			if(test!=null)element=test;
		}
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel=getInstanceInformationModel(element);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel=NIEMHelper.getNearestInformationModel(element);
		if(informationModel!=null){
			String targetNamespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
			NamespaceMapEntry entry=map.getEntries().get(targetNamespace);
			// may need to do some fixup here based on defaultPrefix, default namespace prefix, and dynamic assignment
			if(entry!=null){
				return entry.getPrefix();
			}
		}
		return "UNKNOWN";
	}
	/*
	protected com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getInstanceInformationModel(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		// obtained via Property in slot
		Property instanceProperty=getInstanceProperty(element);
		if(instanceProperty!=null){
			return NIEMHelper.getNearestInformationModel(element);
		}
		return null;
	}
	protected Property getInstanceProperty(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		// obtained via Property in slot
		Slot slot=getInstanceSlot(element);
		if(slot!=null){
			StructuralFeature feature=slot.getDefiningFeature();
			if(Property.class.isInstance(feature))return (Property)feature;
		}
		return null;
	}
	protected Slot getInstanceSlot(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		if(Slot.class.isInstance(element))return (Slot)element;
		if(ValueSpecification.class.isInstance(element))return ((ValueSpecification)element).getOwningSlot();
		if(InstanceSpecification.class.isInstance(element)){
			InstanceSpecification instanceSpecification=(InstanceSpecification)element;
			if(instanceSpecification.get_instanceValueOfInstance().isEmpty()){
				// for top level, get the slot
				for(Slot slot:instanceSpecification.getSlot()){
					return slot;
				}
			}
			// otherwise we should not be asking for contained InstanceSpecification
		}
		return null;
	}
	*/
	public List<Slot> getOrderedSlots(InstanceSpecification instance){
		List<Slot> result=new Vector<Slot>();
		if(instance==null)return result;
		Classifier classifier=InstanceHelper.getRootClassifier(instance);
		if(classifier==null)return result;
		result=InstanceHelper.getBestOrderedSlots(instance, classifier);
		return result;
	}
}

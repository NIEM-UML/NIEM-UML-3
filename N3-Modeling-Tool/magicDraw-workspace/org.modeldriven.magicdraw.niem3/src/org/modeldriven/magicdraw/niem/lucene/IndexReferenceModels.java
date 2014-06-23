/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.LongField;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;
  
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Date;
import java.util.StringTokenizer;


import com.nomagic.ci.persistence.IAttachedProject;
import com.nomagic.ci.persistence.IPrimaryProject;
import com.nomagic.ci.persistence.IProject;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.ProjectUtilities;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
/**
 * Only exposed to developer.   
 * The current model should contain all reference models starting with package "niem".
 * Builds index and saves file.
 * @author tom
 *
 */
public class IndexReferenceModels extends QvtCommonAction implements NIEM_ProfileConstants {
	protected static String pathFieldName="path";
	protected static String typeFieldName="type";
	protected static String textFieldName="text";
	protected static String contentsFieldName="contents";
	public IndexReferenceModels(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performTransform(ProgressStatus progressStatus)
			throws IOException {
		doIndexReferenceModels();
		
	}
	public void updateState()
	{
		// enabled if current project contains niem reference models
		Boolean enabled=false;
		Project project=getProject();
		if(project!=null){
			Model model=project.getModel();
			if(model!=null){
				for(Package p:model.getNestedPackage()){
			    	   if(NIEM_PAKAGENAME.equals(p.getName())){
			    		   enabled=true;
			    		   break;
			        	   }
					
				}
			}
		}
	    setEnabled(enabled);
	}	
static	protected File getIndexFile(){
		File indexFile=new File(QvtCommonAction.getPropertiesDir()+"luceneindex");
		return indexFile;
	}
	static protected Analyzer getAnalyzer(){
		
		CharArraySet stopWords= CharArraySet.copy(Version.LUCENE_40,StandardAnalyzer.STOP_WORDS_SET); 
		stopWords.add("code");
		stopWords.add("simple");
		stopWords.add("type");
		stopWords.add("data");
		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_40,  stopWords) ;
		return analyzer;
	}
	protected void doIndexReferenceModels(){
		Date start = new Date();
		Thread currentThread=Thread.currentThread();
		ClassLoader currentContextLoader=currentThread.getContextClassLoader();
		try{
			currentThread.setContextClassLoader(getClass().getClassLoader());
			File indexFile=getIndexFile();
		//File indexFile=new File(indexPath);
		 Directory dir = FSDirectory.open(indexFile);
		 Analyzer analyzer = getAnalyzer();
		 IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_40, analyzer);
//		 IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_CURRENT, analyzer);
         // Create a new index in the directory, removing any
         // previously indexed documents:
         iwc.setOpenMode(OpenMode.CREATE);
		     
       // Optional: for better indexing performance, if you
       // are indexing many documents, increase the RAM
       // buffer.  But if you do this, increase the max heap
       // size to the JVM (eg add -Xmx512m or -Xmx1g):
       //
       // iwc.setRAMBufferSizeMB(256.0);
		     
       IndexWriter writer = new IndexWriter(dir, iwc);
       Project project=QvtCommonAction.getProject();
       Model model=project.getModel();
       for(Package p:model.getNestedPackage()){
    	   if(NIEM_PAKAGENAME.equals(p.getName())){
    	   indexDocs(writer, p);
    	   }
       }
 
       // NOTE: if you want to maximize search performance,
       // you can optionally call forceMerge here.  This can be
       // a terribly costly operation, so generally it's only
       // worth it when your index is relatively static (ie
       // you're done adding documents to it):
       //
       writer.forceMerge(1);
 
       writer.close();
 
       Date end = new Date();
       System.out.println(end.getTime() - start.getTime() + " total milliseconds");
 
     } catch (IOException e) {
       System.out.println(" caught a " + e.getClass() +
        "\n with message: " + e.getMessage());
     }finally{
			currentThread.setContextClassLoader(currentContextLoader);
    	 
     }
	}
	
	 void indexDocs(IndexWriter writer, Package p)
	        throws IOException {
		if(!NIEMHelper.isInformationModel(p)){
			for(Package nestedPackage:p.getNestedPackage()){
				indexDocs(writer,nestedPackage);
			}
			return;
		}
		for(Type type:p.getOwnedType()){
			if(Classifier.class.isInstance(type)&&!Association.class.isInstance(type)){
				indexClassifierDocs(writer,(Classifier)type);
			}
		}
	      }	
	 void indexClassifierDocs(IndexWriter writer, Classifier classifier)
	        throws IOException {
		if(!NIEMHelper.isPropertyHolder(classifier)){
			indexNamedElementDocs(writer,classifier);
		}
		for(Property property:classifier.getAttribute()){
			indexPropertyDocs(writer,property);
		}
		if(Enumeration.class.isInstance(classifier)){
			for(EnumerationLiteral enumerationLiteral:((Enumeration)classifier).getOwnedLiteral()){
				indexEnumerationLiteralDocs(writer,enumerationLiteral);
			}
		}
	      }	
	 void indexEnumerationLiteralDocs(IndexWriter writer, EnumerationLiteral enumerationLiteral)
	        throws IOException {
		indexNamedElementDocs(writer,enumerationLiteral);
	      }	
	 void indexPropertyDocs(IndexWriter writer, Property property)
	        throws IOException {
		indexNamedElementDocs(writer,property);
	      }	
	 void indexNamedElementDocs(IndexWriter writer, NamedElement namedElement)
	        throws IOException {
              // make a new, empty document
              Document doc = new Document();
    
              // Add the path of the file as a field named "path".  Use a
              // field that is indexed (i.e. searchable), but don't tokenize 
              // the field into separate words and don't index term frequency
              // or positional information:
//              Project project=Project.getProject(namedElement);
              IProject project=ProjectUtilities.getProject(namedElement);
              /*
              final IPrimaryProject primaryProject = project.getPrimaryProject();
              Collection<IAttachedProject> attachedProjects =primaryProject.getProjects();
              ProjectUtilities.getAttachedProject(arg0)
              final Collection<IAttachedProject> projectAttachedProjects =
              ProjectUtilities.getAttachedProjects(primaryProject);
              for (IAttachedProject attachedProject : projectAttachedProjects)
              {
              final ProjectAttachmentConfiguration attachmentConfiguration =
              ProjectUtilities.getAttachment(primaryProject, attachedProject);
              // properties of the module usage
              final AutoLoadKind autoLoadKind =
              ProjectUtilities.getAutoLoadKind(attachmentConfiguration);
              final boolean loadIndex =
              ProjectUtilities.isLoadIndex(attachmentConfiguration);
              final boolean editable = !attachmentConfiguration.isReadOnly();
              }              
              */
              
              String fileName=project.getName();//getFileName();
              String path=fileName+"@"+namedElement.getID();
              Field pathField = new StringField(pathFieldName, path, Field.Store.YES);
              doc.add(pathField);
              String type=namedElement.getHumanType();
              Field typeField = new StringField(typeFieldName, type, Field.Store.YES);
              doc.add(typeField);
    
              // Add the contents of the file to a field named "contents".  Specify a Reader,
              // so that the text of the file is tokenized and indexed, but not stored.
              // Note that FileReader expects the file to be in UTF-8 encoding.
              // If that's not the case searching for special characters will fail.
              String line=getSearchText(namedElement);
              Field textField = new StringField(textFieldName, line, Field.Store.YES);
              doc.add(textField);
              Reader reader=new StringReader(line);
              doc.add(new TextField(contentsFieldName, new BufferedReader(reader)));
//              doc.add(new StoredField(contentsFieldName, line));
               
                // New index, so we just add the document (no old document can be there):
                //System.out.println("adding " + path+", "+type+", "+getTokenizedName(namedElement));
                writer.addDocument(doc);
	      }	
static	 protected String getSearchText(NamedElement namedElement){
         String name=getTokenizedName(namedElement);
         String line=name;
         for(Comment comment:namedElement.getOwnedComment()){
       	  String body=comment.getBody();
       	  if(body!=null){
       		  line+=(" "+body.replace("<"," ").replace(">", " ").replace("/"," ").replace("["," ")
       				  .replace("]"," ").replace("*"," ").replace("?"," ").replace("^"," ").replace("-"," "));
       	  }
         }
         line=line.trim();
         return line;
	 }
static	protected String getTokenizedName(NamedElement namedElement){
		String result="";
		String name=namedElement.getName();
		if(EnumerationLiteral.class.isInstance(namedElement))return name;
		if(name!=null){
			NameHelper x;
			name=name.replace(TYPE_SUFFIX, "")
					.replace(SIMPLE_MODIFIER, "").replace(CODE_MODIFIER, "")
					.replace(AUGMENTATION_MODIFIER, "")
					.replace(METADATA_MODIFIER, "")
					.replace(ASSOCIATION_MODIFIER, "")
					.replace(ADAPTER_MODIFIER, "").replace(REFERENCE_SUFFIX,"").replace("RoleOf", "");
			for(int i=0;i<name.length();i++){
				char c=name.charAt(i);
				char nextc=c;
				if(i+1<name.length()){
					nextc=name.charAt(i+1);
				}
				if(Character.isUpperCase(c)&&!Character.isUpperCase(nextc)){
					result+=" ";
				}
				result+=Character.toString(c);
			}
		}
		return result;
	}
}

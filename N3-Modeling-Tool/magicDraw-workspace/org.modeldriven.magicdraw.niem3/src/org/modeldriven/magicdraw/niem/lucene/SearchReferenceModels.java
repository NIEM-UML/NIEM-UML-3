/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


    
    import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
    import org.apache.lucene.analysis.standard.StandardAnalyzer;
    import org.apache.lucene.document.Document;
    import org.apache.lucene.index.DirectoryReader;
    import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.queryparser.classic.ParseException;
    import org.apache.lucene.queryparser.classic.QueryParser;
    import org.apache.lucene.search.IndexSearcher;
    import org.apache.lucene.search.Query;
    import org.apache.lucene.search.ScoreDoc;
    import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.search.highlight.TextFragment;
import org.apache.lucene.search.highlight.TokenSources;
    import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.BrowserTabTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
/**
 * @author tom
 *
 */
public class SearchReferenceModels extends IndexReferenceModels implements ToolTipConstants{
	protected NamedElement namedElement;
	public SearchReferenceModels(/*String id, String name*/NamedElement namedElementIn) {
		super("searchReferenceModelsAction", "Search NIEM Reference Models for similar");
		namedElement=namedElementIn;
		if(namedElement==null){
			setDescription(LUCENE_SEARCH_REFERENCE_MODELS_QUERY_ACTION_TOOLTIP);
			
		}else{
			setDescription(LUCENE_SEARCH_REFERENCE_MODELS_ACTION_TOOLTIP);
		}
//		super(id, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void performTransform(ProgressStatus progressStatus)
			throws IOException {
		/*
		Application application=Application.getInstance();
		Browser browser=application.getMainFrame().getBrowser();
		if(browser==null)return;
		BrowserTabTree tree=browser.getActiveTree();
		if(tree==null)return;
		Node node=tree.getSelectedNode();
		if(node==null)return;
		Object test=node.getUserObject();
		if(NamedElement.class.isInstance(test)){
			doSearchReferenceModels((NamedElement)test);
		}
		*/
		doSearchReferenceModels(namedElement);
	}
	public void updateState()
	{
		setMpdComponentStateEnabled();
	}	
	
static	protected IndexSearcher searcher=null;
static	protected IndexSearcher getIndexSearcher() throws IOException{
		if(searcher!=null)return searcher;
		File indexFile=getIndexFile();
        IndexReader reader = DirectoryReader.open(FSDirectory.open(indexFile));
        IndexSearcher searcher = new IndexSearcher(reader);
//        reader.close();		
		return searcher;
	}
/*
	protected void doSearchReferenceModels(NamedElement namedElement){
		Thread currentThread=Thread.currentThread();
		ClassLoader currentContextLoader=currentThread.getContextClassLoader();
		try{
			currentThread.setContextClassLoader(getClass().getClassLoader());
		        String field = contentsFieldName;
//		        String queries = null;
//		        boolean raw = false;
//		        String queryString = null;
		        IndexSearcher searcher = getIndexSearcher();
		        Analyzer analyzer = getAnalyzer();
		    
		        QueryParser parser = new QueryParser(Version.LUCENE_40, field, analyzer);
	              String line=getSearchText(namedElement);
		          Query query = parser.parse(line);
		          //System.out.println("Searching for: " + query.toString(field));
		          int maxHits=100;
		          Vector<Vector<String>> data=new Vector<Vector<String>>();
		          doPagingSearch(searcher, query, maxHits,data,analyzer,namedElement);
		          
		  		Application application=Application.getInstance();
				Frame frame=application.getMainFrame();
			    new SearchDialog(frame,"Reference Model Elements similar to "+namedElement.getQualifiedName(),data);
	     } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				currentThread.setContextClassLoader(currentContextLoader);
	    	 
	     }
	}
	*/
	protected void doSearchReferenceModels(NamedElement namedElement){
  		Application application=Application.getInstance();
		Frame frame=application.getMainFrame();
		if(namedElement==null){
				String line = SearchDialog.getSearchQuery(frame,"");
			if(line==null)return;
	          Vector<Vector<String>> data=textSearchReferenceModels(line, null);
		    SearchDialog searchDialog=new SearchDialog(frame,SearchDialog.searchTitle(),data);
		    searchDialog.setDescription("Search: "+line);
		    searchDialog.setLastSearch(line);

			
		}else{
		          Vector<Vector<String>> data=elementSearchReferenceModels( namedElement);
			    new SearchDialog(frame,SearchDialog.namedElementTitle(namedElement),data);
		}
	}
	static	public Vector<Vector<String>> elementSearchReferenceModels(NamedElement namedElement){
        String line=getSearchText(namedElement);
        Vector<Vector<String>> data=textSearchReferenceModels(line,namedElement);
        return data;
}	
static	public Vector<Vector<String>> textSearchReferenceModels(String line,NamedElement namedElement){
		Vector<Vector<String>> data=new Vector<Vector<String>>();
		Thread currentThread=Thread.currentThread();
		ClassLoader currentContextLoader=currentThread.getContextClassLoader();
		try{
			currentThread.setContextClassLoader(SearchReferenceModels.class.getClassLoader());
		        String field = contentsFieldName;
		        IndexSearcher searcher = getIndexSearcher();
		        Analyzer analyzer = getAnalyzer();
		    
		        QueryParser parser = new QueryParser(Version.LUCENE_40, field, analyzer);
		          Query query = parser.parse(line);
//		          int maxHits=100;
		          int maxHits=300;
		          doPagingSearch(searcher, query, maxHits,data,analyzer,namedElement);
	     } catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
	    	 QvtCommonAction.log("WARNING: Query Parse Exception: "+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				currentThread.setContextClassLoader(currentContextLoader);
	     }
		return data;
	}
	protected static boolean isAccepted(IndexSearcher searcher,ScoreDoc hit,NamedElement namedElement) throws IOException{
		if(namedElement==null)return true;
        Document doc = searcher.doc(hit.doc);
        String type = doc.get(typeFieldName);
        String humanType=namedElement.getHumanType();
        if(humanType.equals(type))return true;
        // check for variants of properties, classifiers
        if(EnumerationLiteral.class.isInstance(namedElement)||isEnumerationLiteral(type))return false;
        boolean isProperty=Property.class.isInstance(namedElement);
        boolean isOtherProperty=isProperty(type);
        if(isProperty&&isOtherProperty)return true;
        if(isProperty||isOtherProperty)return false;
        return true;
	}
	protected static boolean isEnumerationLiteral(String type){
		return "Enumeration Literal".equals(type);
	}
	protected static boolean isProperty(String type){
		return "Property".equals(type)
				||XSDPropertyStereotypeName.equals(type)
				||RoleOfStereotypeName.equals(type)
				||SequenceIDStereotypeName.equals(type)
				||XSDAnyPropertyStereotypeName.equals(type)
				;
	}
	
	protected static  void doPagingSearch(IndexSearcher searcher, Query query,int  maxHits,Vector<Vector<String>> data,Analyzer analyzer,NamedElement namedElement) throws IOException {
			        // Collect enough docs to show 5 pages
			        TopDocs results = searcher.search(query, maxHits);
			        ScoreDoc[] hits = results.scoreDocs;
			        List<ScoreDoc> filteredHits=new Vector<ScoreDoc>();
			        // filter the original hits by classifier/property/enumeration literal
			        for(ScoreDoc hit:hits){
			        	if(isAccepted(searcher,hit,namedElement)){
			        		filteredHits.add(hit);
			        	}
			        }
			        hits=filteredHits.toArray(new ScoreDoc[0]);
			        int numTotalHits = results.totalHits;
			        System.out.println(numTotalHits + " total matching documents");
			    
			        int start = 0;
			        int end = numTotalHits;//Math.min(numTotalHits, hitsPerPage);
			            
			          if (end > hits.length) {
			            System.out.println("Only results 1 - " + hits.length +" of " + numTotalHits + " total matching documents collected.");
			          }
			          end =hits.length;// Math.min(hits.length, start + hitsPerPage);
			          for (int i = start; i < end; i++) {
			            Document doc = searcher.doc(hits[i].doc);
			            String path = doc.get(pathFieldName);
			            if (path != null) {
					          Vector<String> row=new Vector<String>();
					          String rank=""+i;
					          String weight=""+hits[i].score;
					          int index=path.indexOf("@");
					          String module="";
					          String name="";
					          if(index>0){
					        	  module=path.substring(0,index);
					        	  name=path.substring(index+1);
					          }
					            String type = doc.get(typeFieldName);
//					            String text = doc.get(contentsFieldName);
					            //String text = doc.toString();
					            String text= doc.get(textFieldName);
					            String textResult= "";
					            /*
					            String text="";
					            for(String test:doc.getValues(contentsFieldName)){
					            	text+=" "+test;
					            }
					            for(IndexableField test:doc.getFields(contentsFieldName)){
					            	text+=" "+test.name()+"="+test.stringValue()+" ";
					            }
					            */
					            SimpleHTMLFormatter htmlFormatter = new SimpleHTMLFormatter();
					            Highlighter highlighter = new Highlighter(htmlFormatter, new QueryScorer(query));
					            //for (int k = 0; k < 10; k++) {
					              int id = hits[i].doc;
					              //Document doc = searcher.doc(id);
					              //String text = doc.get("notv");
//					              TokenStream tokenStream = TokenSources.getAnyTokenStream(searcher.getIndexReader(), id, "notv", analyzer);
					              TokenStream tokenStream = TokenSources.getAnyTokenStream(searcher.getIndexReader(), id, textFieldName, analyzer);
					              TextFragment[] frag={};
								try {
									frag = highlighter.getBestTextFragments(tokenStream, text, false, 10);
								} catch (InvalidTokenOffsetsException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}//highlighter.getBestFragments(tokenStream, text, 3, "...");
					              for (int j = 0; j < frag.length; j++) {
					                if ((frag[j] != null) && (frag[j].getScore() > 0)) {
					                  //System.out.println((frag[j].toString()));
					                	textResult+=frag[j].toString();
					                }
					              }
					              //Term vector
					              /*
					              text = doc.get("tv");
					              tokenStream = TokenSources.getAnyTokenStream(searcher.getIndexReader(), hits[i].doc, "tv", analyzer);
					              try {
									frag = highlighter.getBestTextFragments(tokenStream, text, false, 10);
								} catch (InvalidTokenOffsetsException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					              for (int j = 0; j < frag.length; j++) {
					                if ((frag[j] != null) && (frag[j].getScore() > 0)) {
					                  System.out.println((frag[j].toString()));
					                }
					              }
					              */
					              //System.out.println("-------------");
					            //}					            
					            
					            
					              textResult="<html>"+textResult.trim()+"</html>";
					              String shortModule=module.replace("NIEM-Reference-","");
					              String shortName=name;
					              int lastNameIndex=name.lastIndexOf("-");
					              if(lastNameIndex>=0)shortName=shortName.substring(lastNameIndex+1);
					              
					          row.add(rank);
					          row.add(weight);
					          row.add(shortModule);
					          row.add(shortName);
					          row.add(type);
					          row.add(textResult);
					         // TEST more
					          row.add(module);
					          row.add(name);
					          row.add(text);// original text
			              //System.out.println("path "+(i+1) + ". " + path+", type "+type+", score "+hits[i].score);
			              data.add(row);
			            } else {
			              System.out.println((i+1) + ". " + "No path for this document");
			            }
			                      
			          }
			      }	
}

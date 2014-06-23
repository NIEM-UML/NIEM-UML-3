/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

/**
 * @author tom
 *
 */
public interface SearchConstants {
	public int DISPLAYED_MODULE_COLUMN_INDEX=2;
	public int DISPLAYED_NAME_COLUMN_INDEX=3;
	public int DISPLAYED_TEXT_COLUMN_INDEX=5;
	public int MODULE_COLUMN_INDEX=6;
	public int NAME_COLUMN_INDEX=7;
	public int TEXT_COLUMN_INDEX=8;
	public int VISIBLE_COLUMN_COUNT=6;
	public String[] columnToolTips = {
	    "numerical ranking of similarity",
	    "weight",
	    "name of NIEM reference model library module",
	    "identifier of NIEM reference model element",
	    "type of NIEM reference model element: metaclass or stereotype",
	    "best text fragments based on keywords of NIEM reference model element name plus its documentation"};	
//"keywords of NIEM reference model element name plus its documentation"};	
	public String[] columnNameValues={"rank","weight","module","name","type","text"
			,"hidden","hidden","hidden"
			};
	public String descriptionText="Model elements from all NIEM Reference models which are most similar in name, type, and description.";

}

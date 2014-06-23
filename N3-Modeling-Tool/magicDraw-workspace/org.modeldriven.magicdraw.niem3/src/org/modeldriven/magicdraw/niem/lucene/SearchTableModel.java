/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

/**
 * @author tom
 *
 */
public class SearchTableModel extends DefaultTableModel implements SearchConstants{
	protected Vector<Vector<String>> saveData;
	public SearchTableModel(Vector<Vector<String>> data, Vector columnNames/*,Vector<Vector<String>> fulldata*/){
		super(data,columnNames);
		//saveData=fulldata;
		saveData(data);
		setColumnCount(VISIBLE_COLUMN_COUNT);
	}
	protected void saveData(Vector<Vector<String>> data){
		saveData=new Vector<Vector<String>>();
		for(Vector<String> row:data){
			saveData.add(new Vector<String>(row));
		}
		
	}
    	
    	public boolean isCellEditable(int row,int col){
    		return false;
    	}
    	/*
    	public int getColumnCount(){
    		return VISIBLE_COLUMN_COUNT;
    	}
    	*/
    	public Object 	getValueAt(int row, int column) {
    		if(column<VISIBLE_COLUMN_COUNT){
    			return super.getValueAt(row, column);
    		}
    		Vector<String> rowData=saveData.get(row);
    		return rowData.get(column);
    	}
    	public void setDataVector(Vector dataVector,Vector columnIdentifiers){
    		saveData(dataVector);
    		super.setDataVector(dataVector, columnIdentifiers);
    	}
    	
}

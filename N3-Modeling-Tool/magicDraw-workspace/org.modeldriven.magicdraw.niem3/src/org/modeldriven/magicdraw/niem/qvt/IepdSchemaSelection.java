/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * @author Tom
 *
 */
public class IepdSchemaSelection extends  JDialog
implements ActionListener {
	/**
	 * Use this modal dialog to let the user choose one string from a long
	 * list.  See ListDialogRunner.java for an example of using ListDialog.
	 * The basics:
	 * <pre>
	    String[] choices = {"A", "long", "array", "of", "strings"};
	    String selectedName = ListDialog.showDialog(
	                                componentInControllingFrame,
	                                locatorComponent,
	                                "A description of the list:",
	                                "Dialog Title",
	                                choices,
	                                choices[0]);
	 * </pre>
	 */
	    private static IepdSchemaSelection dialog;
	    private static String[] values = {};
	    private static String[] extValues = {};
	    private JList list;
	    private JList listExt;
	 
	    /**
	     * Set up and show the dialog.  The first Component argument
	     * determines which frame the dialog depends on; it should be
	     * a component in the dialog's controlling frame. The second
	     * Component argument should be null if you want the dialog
	     * to come up with its left corner in the center of the screen;
	     * otherwise, it should be the component on top of which the
	     * dialog should appear.
	     */
	    public static List<String[]> showDialog(Component frameComp,
	                                    Component locationComp,
	                                    String labelText,
	                                    String title,
	                                    String[] possibleValues,
//	                                    String initialValue,
//	                                    String longValue,
	                                    String extLabelText) {
	        Frame frame = JOptionPane.getFrameForComponent(frameComp);
	        dialog = new IepdSchemaSelection(frame,
	                                locationComp,
	                                labelText,
	                                title,
	                                possibleValues,
//	                                initialValue,
//	                                longValue,
	                                extLabelText);
	        dialog.setVisible(true);
	        List<String[]> value=new Vector<String[]>();
	        if((values==null)||(extValues==null))value=null;
	        else{
	        value.add(values);
	        value.add(extValues);
	        }
	        return value;
	    }
	 /*
	    private void setValue(String newValue) {
	        value = newValue;
	        list.setSelectedValue(value, true);
	    }
	 */
	    private IepdSchemaSelection(Frame frame,
	                       Component locationComp,
	                       String labelText,
	                       String title,
	                       Object[] data,
//	                       String initialValue,
//	                       String longValue,
	                       String extLabelText) {
	        super(frame, title, true);
	 
	        //Create and initialize the buttons.
	        JButton cancelButton = new JButton("Cancel");
	        cancelButton.setActionCommand("Cancel");
	        cancelButton.addActionListener(this);
	        //
	        final JButton setButton = new JButton("Set");
	        setButton.setActionCommand("Set");
	        setButton.addActionListener(this);
	        getRootPane().setDefaultButton(setButton);
	        
	        //main part of the dialog
	        list=addList( labelText, data,
//	                 initialValue,
//	                 longValue,
	                 setButton);

	        JPanel listPane =(JPanel) list.getParent().getParent().getParent();	 
	        listExt=addList( extLabelText, data,
//	                 initialValue,
//	                 longValue,
	                 setButton);

	        JPanel listExtPane =(JPanel) listExt.getParent().getParent().getParent();	 
	        //Lay out the buttons from left to right.
	        JPanel buttonPane = new JPanel();
	        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
	        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
	        buttonPane.add(Box.createHorizontalGlue());
	        buttonPane.add(cancelButton);
	        buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
	        buttonPane.add(setButton);
	 
	        //Put everything together, using the content pane's BorderLayout.
	        Container contentPane = getContentPane();
	        contentPane.add(listPane, BorderLayout.NORTH);
	        contentPane.add(listExtPane, BorderLayout.CENTER);
	        contentPane.add(buttonPane, BorderLayout.PAGE_END);
/*	 
	        //Initialize values.
	        setValue(initialValue);
	        if(initialValue!=null){
	        	
	        }
	        */
	        pack();
	        setLocationRelativeTo(locationComp);
	    }
	 
protected JList addList(String labelText,Object[] data,
//                String initialValue,
//                String longValue,
                final JButton setButton) {
 
 //main part of the dialog
 JList list = new JList(data) {
     //Subclass JList to workaround bug 4832765, which can cause the
     //scroll pane to not let the user easily scroll up to the beginning
     //of the list.  An alternative would be to set the unitIncrement
     //of the JScrollBar to a fixed value. You wouldn't get the nice
     //aligned scrolling, but it should work.
     public int getScrollableUnitIncrement(Rectangle visibleRect,
                                           int orientation,
                                           int direction) {
         int row;
         if (orientation == SwingConstants.VERTICAL &&
               direction < 0 && (row = getFirstVisibleIndex()) != -1) {
             Rectangle r = getCellBounds(row, row);
             if ((r.y == visibleRect.y) && (row != 0))  {
                 Point loc = r.getLocation();
                 loc.y--;
                 int prevIndex = locationToIndex(loc);
                 Rectangle prevR = getCellBounds(prevIndex, prevIndex);

                 if (prevR == null || prevR.y >= r.y) {
                     return 0;
                 }
                 return prevR.height;
             }
         }
         return super.getScrollableUnitIncrement(
                         visibleRect, orientation, direction);
     }
 };

 list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
 /*
 if (longValue != null) {
     list.setPrototypeCellValue(longValue); //get extra space
 }
 */
 list.setLayoutOrientation(JList.VERTICAL);
 list.setVisibleRowCount(-1);
 list.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
         if (e.getClickCount() == 2) {
             setButton.doClick(); //emulate button click
         }
     }
 });
 JScrollPane listScroller = new JScrollPane(list);
 listScroller.setPreferredSize(new Dimension(250, 80));
 listScroller.setAlignmentX(LEFT_ALIGNMENT);

 //Create a container so that we can add a title around
 //the scroll pane.  Can't add a title directly to the
 //scroll pane because its background would be white.
 //Lay out the label and scroll pane from top to bottom.
 JPanel listPane = new JPanel();
 listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
 JLabel label = new JLabel(labelText);
 label.setLabelFor(list);
 listPane.add(label);
 listPane.add(Box.createRigidArea(new Dimension(0,5)));
 listPane.add(listScroller);
 listPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
 return list;
}
	    //Handle clicks on the Set and Cancel buttons.
	    public void actionPerformed(ActionEvent e) {
	        if ("Set".equals(e.getActionCommand())) {
	        	try{
	        		Vector<String> myValues=new Vector<String>();
	        		Vector<String> myExtValues=new Vector<String>();
	        		for(Object test:list.getSelectedValues()){
	        			if(String.class.isInstance(test)){
	        				myValues.add((String)test);
	        			}
	        		}
	        		for(Object test:listExt.getSelectedValues()){
	        			if(String.class.isInstance(test)){
	        				myExtValues.add((String)test);
	        			}
	        		}
	        		
		        	IepdSchemaSelection.values = myValues.toArray(new String[0]);
		        	IepdSchemaSelection.extValues = myExtValues.toArray(new String[0]);
	        	//IepdSchemaSelection.values = (String[])(list.getSelectedValues());
	        	//IepdSchemaSelection.extValues = (String[])(listExt.getSelectedValues());
	        	}catch(Throwable t){
	        		QvtCommonAction.log("IepdSchemaSelection actionPerformed error: "+t);
	        	}
	        }else if ("Cancel".equals(e.getActionCommand())) {
	        	IepdSchemaSelection.values = null;
	        	IepdSchemaSelection.extValues = null;
	        }
	        IepdSchemaSelection.dialog.setVisible(false);
	    }
	}

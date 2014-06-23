package org.modeldriven.magicdraw.niem.qvt;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.SwingUtilities;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;

public class BatchUtility {
	public static void MpdExport(){
		final MDAction pim2psmAction = new Pim2PsmAction("pim2psm","NIEM MPD"){
			protected void initTrees(){}
			//protected void disableEventFiring(Project project){}
			protected void enableEventFiring(Project project){}
			public void actionPerformed(ActionEvent actionEvent)
			{
				QvtCommonAction.isLoggingDisabled=true;
				try{
										performTransform(null);
				}catch(Throwable t){
					t.printStackTrace();
				}
			}
			
		};
		/*
		if(SwingUtilities.isEventDispatchThread()){
			pim2psmAction.actionPerformed(null);
		}else{
            SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run() {
					pim2psmAction.actionPerformed(null);
				}
            	
            });
		}  
		*/
		pim2psmAction.actionPerformed(null);
	}
}

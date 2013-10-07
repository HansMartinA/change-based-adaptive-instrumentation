package org.splevo.ui.jobs;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.splevo.ui.editors.SPLevoProjectEditor;

import de.uka.ipd.sdq.workflow.jobs.AbstractJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

/**
 * Job to update the UI based on a referenced SPLevoProjectEditor instance.
 * @author Benjamin Klatt
 *
 */
public class UpdateUIJob extends AbstractJob {
	
	/** The internal reference to the splevo project editor to work with. */
	private SPLevoProjectEditor splevoProjectEditor = null;
	
	/** The optional message to hand over to the ui. */
	private String message = null;
	
	/**
	 * Constructor requiring to set the splevo project editor reference as well 
	 * as the ui message. 
	 * 
	 * @param splevoProjectEditor The editor to trigger the update for.
	 * @param message The message to be handed over to the ui.
	 */
	public UpdateUIJob(SPLevoProjectEditor splevoProjectEditor, String message) {
		this.splevoProjectEditor = splevoProjectEditor;
		this.message = message;
	}
	
	@Override
	public String getName() {
		return "Update UI Job";
	}
	
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		monitor.beginTask("UpdateUI", 100);
		
		// refresh workspace
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		splevoProjectEditor.updateUi(this.message);
		monitor.done();
	}

	@Override
	public void cleanup(IProgressMonitor arg0) throws CleanupFailedException {
	}

}

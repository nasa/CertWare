package net.certware.core.ui.natures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Project nature for CertWare, for attaching builders to projects.
 * Currently there are no builders defined.
 * @author mrb
 * @see 1.1.0
 */
@SuppressWarnings("unused")
public class ProjectNature implements IProjectNature
{
	/** reference to the project */ 
	private IProject project;
	/** nature identifier */
	private static final String NATURE_ID = "net.certware.resource.nature.id"; //$NON-NLS-1$
	/** markers generator builder identifier */
	private static final String BUILDER_ID = ""; //$NON-NLS-1$

	/**
	 * Adds builders to the project and performs a full build.
	 * @throws CoreException for build issues, writes to CodeHawk log.
	 */
	public void configure() throws CoreException {
		// nature added to the project, called after setProject()
		new Job("Configuring CertWare Project Nature") {
			protected IStatus run(IProgressMonitor monitor) {
				/* // TODO re-enable when a builder is created 
        try {
          addBuilderToProject(monitor,BUILDER_ID);
          project.build(IncrementalProjectBuilder.FULL_BUILD, BUILDER_ID, null, monitor);
        } catch( CoreException ce ) {
          CertWareLog.logError("Adding project history nature", ce);
        }
				 */
				return Status.OK_STATUS;
			}
		}.schedule();
	}

	/**
	 * Removes builders from the project.
	 * @throws CoreException
	 */
	public void deconfigure() throws CoreException
	{
		removeBuilderFromProject(null,BUILDER_ID);
	}

	/**
	 * Returns the project resource.
	 * @return project or null
	 */
	public IProject getProject()
	{
		return project;
	}

	/**
	 * Sets the project resource.
	 * @param project resource
	 */
	public void setProject(IProject project)
	{
		// nature added to this project
		this.project = project;
	}

	/**
	 * Adds the builder to the project reference if project is open and does not already
	 * have the builder associated in its project description.
	 * @param monitor progress monitor used in setting project description
	 * @param id builder identifier to add
	 * @throws CoreException
	 */
	private void addBuilderToProject(IProgressMonitor monitor, String id) throws CoreException {

		if ( project.isOpen() == false )
			return;

		IProjectDescription pd = project.getDescription();

		// check if already associated
		ICommand[] buildSpec = pd.getBuildSpec();
		for ( int b = 0; b < buildSpec.length; b++ ) {
			if ( buildSpec[b].getBuilderName().equals(id) )
				return;
		}

		// not associated, so add it
		ICommand newBuilder = pd.newCommand();
		newBuilder.setBuilderName(id);
		List<ICommand> newCommands = new ArrayList<ICommand>();
		newCommands.addAll(Arrays.asList(buildSpec));
		newCommands.add(newBuilder);
		pd.setBuildSpec((ICommand[])newCommands.toArray(new ICommand[newCommands.size()]));
		project.setDescription(pd, monitor);
	}

	/**
	 * Removes the builder from the project description if the project is open and has
	 * the builder in its project description.
	 * @param monitor progress monitor for setting description
	 * @param id builder ID to remove
	 * @throws CoreException
	 */
	private void removeBuilderFromProject(IProgressMonitor monitor, String id) throws CoreException {

		if ( project.isOpen() == false )
			return;

		IProjectDescription pd = project.getDescription();

		// check if not associated
		int foundIndex = -1;
		ICommand[] buildSpec = pd.getBuildSpec();
		for ( int b = 0; b < buildSpec.length; b++ ) {
			if ( buildSpec[b].getBuilderName().equals(id) ) {
				foundIndex = b;
				break;

			}
		}

		if ( foundIndex != -1 ) {
			List<ICommand> oldCommands = new ArrayList<ICommand>();
			oldCommands.addAll(Arrays.asList(buildSpec));
			oldCommands.remove(foundIndex);
			pd.setBuildSpec((ICommand[])oldCommands.toArray(new ICommand[oldCommands.size()]));
			project.setDescription(pd,monitor);
		}
	}

	/**
	 * Whether the project has this nature.
	 * @param p project resource
	 * @return true if project is open and has the @NATURE_ID@.
	 */
	static public boolean hasNature(IProject p) {
		try {
			return p.isOpen() && p.hasNature(NATURE_ID);
		} catch( CoreException ce ) {
			CertWareLog.logError("Checking project nature", ce);
			return false;
		}
	}

	/**
	 * Adds the nature ID to the given project if the project is open and does not
	 * already have the nature in its description.
	 * @param project target project
	 * @throws CoreException
	 */
	static public void addNature(IProject project) throws CoreException {

		if ( project.isOpen() == false )
			return;

		IProjectDescription pd = project.getDescription();
		IProjectNature nature = project.getNature(NATURE_ID);
		if ( nature == null ) {
			List<String>newNatures = new ArrayList<String>();
			newNatures.addAll(Arrays.asList(pd.getNatureIds()));
			newNatures.add(NATURE_ID);
			pd.setNatureIds(newNatures.toArray(new String[newNatures.size()]));
			project.setDescription(pd, null);
		}
	}

	/**
	 * Removes the nature ID from the given project if the project is open and has
	 * the nature. 
	 * @param project target project
	 * @throws CoreException
	 */
	static public void removeNature(IProject project) throws CoreException {
		if ( project.isOpen() == false )
			return;

		if ( hasNature(project) ) {
			IProjectDescription pd = project.getDescription();
			List<String>oldNatures = new ArrayList<String>();
			oldNatures.addAll(Arrays.asList(pd.getNatureIds()));
			oldNatures.remove(NATURE_ID);
			pd.setNatureIds(oldNatures.toArray(new String[oldNatures.size()]));
			project.setDescription(pd, null);
		}
	}

}

package net.certware.core.ui.contributions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.natures.ProjectNature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Contributes a dynamic menu item for toggling application of the project nature.
 * @author mrb
 * @since 1.1.0
 */
public class ToggleProjectNature extends ContributionItem
{

	/**
	 * Constructor creates image reference.
	 */
	public ToggleProjectNature() {
	}

	/**
	 * Constructor creates image reference.
	 * @param id
	 */
	public ToggleProjectNature(String id) {
		super(id);
	}

	/**
	 * Disposes of the parent and the image reference.
	 */
	public void dispose() {
		super.dispose();
	}

	/**
	 * Fills the menu, adding a menu item for toggling the nature.
	 * Adds a selection listener to the item. 
	 * Adds a menu listener to the menu to update its state.
	 */
	public void fill(Menu menu, int index) {
		final MenuItem menuItem = new MenuItem(menu, SWT.CHECK, index);
		Image menuImage = CertWareUI.getDefault().getImageRegistry().get(CertWareUI.CERTWARE_IMAGE);
		menuItem.setText("Toggle CertWare nature");
		menuItem.setImage(menuImage);
		menuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent se) {
				run();
			}
		});
		menu.addMenuListener(new MenuAdapter() {
			public void menuShown(MenuEvent me) {
				updateState(menuItem);
			}
		});
	}

	/**
	 * Updates the enable and selection states of the menu item.
	 * Enabled if one or more projects selected.
	 * Selected if enabled and project has nature applied.
	 * @param menuItem
	 */
	protected void updateState(MenuItem menuItem) {
		Collection<IProject> projects = getSelectedProjects();
		boolean enabled = projects.size() > 0;
		menuItem.setEnabled(enabled);
		menuItem.setSelection(enabled && ProjectNature.hasNature(projects.iterator().next()));
	}

	/**
	 * Creates a collection of open projects in the selection.
	 * Adapts resources if possible.
	 * @return collection of open projects, possibly empty
	 */
	private Collection<IProject> getSelectedProjects() {
		Collection<IProject> projects = new HashSet<IProject>();
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelection selection = window.getActivePage().getSelection();
		if ( selection instanceof IStructuredSelection ) {
			for (Iterator<?> iter = ((IStructuredSelection)selection).iterator(); iter.hasNext(); ) {
				Object e = iter.next();
				if ( ! (e instanceof IResource)) {
					if ( !(e instanceof IAdaptable)) 
						continue;
					e = ((IAdaptable)e).getAdapter(IResource.class);
					if ( ! (e instanceof IResource))
						continue;
				}

				if ( ! (e instanceof IProject)) {
					e = ((IResource)e).getProject();
					if ( ! (e instanceof IProject))
						continue;
				}

				IProject p = (IProject)e;
				if ( p.isOpen() )
					projects.add((IProject)e);
			}
		}

		return projects;
	}

	/**
	 * Performs the nature toggle, calling {@code toggleNature} on the collection
	 * returned by {@code getSelectedProjects}.  Performed in a workspace runnable.
	 * Catches {@ CoreException} and writes to CertWare log.
	 */
	protected void run() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		try {
			workspace.run(
					new IWorkspaceRunnable() {
						public void run(IProgressMonitor monitor) throws CoreException {
							Collection<IProject> projects = getSelectedProjects();
							for (IProject p : projects ) {
								toggleNature(p);
							}
						}},null);
		}
		catch (CoreException ce) {
			CertWareLog.logError("Toggle CertWare nature", ce);
		}
	}

	/**
	 * Toggles the nature on the given.  
	 * If project has nature, remove it.  If project does not have nature, add it.  
	 * @param project project reference
	 * @throws CoreException if project description cannot be read or written
	 */
	private void toggleNature(IProject project) throws CoreException {
		if ( ProjectNature.hasNature(project) )
			ProjectNature.removeNature(project);
		else
			ProjectNature.addNature(project);
	}
}

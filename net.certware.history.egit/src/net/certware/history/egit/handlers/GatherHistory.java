package net.certware.history.egit.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.history.egit.Activator;
import net.certware.history.egit.preferences.PreferenceConstants;
import net.certware.measurement.sco.ArtifactCommit;
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.CommitHistory;
import net.certware.measurement.sco.ScoFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egit.core.GitProvider;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.filter.PathFilterGroup;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.history.IFileHistory;
import org.eclipse.team.core.history.IFileHistoryProvider;
import org.eclipse.team.core.history.IFileRevision;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * Gather history from EGit repository and create an SCO file.
 * Uses a preference to identify the destination file name.
 * Presumes the input selection is a project container which has EGit repository attached.
 * @author mrb
 * @since 1.1
 */
public class GatherHistory implements ICertWareConstants {

	/** model file encoding as XML resource */
	private static final String FILE_ENCODING = "UTF-8";

	/**
	 * Process the EGit history associated with a given project. 
	 * @param selectedProject selected project, presumably an object contribution selection
	 * @throws CoreException 
	 * @throws IOException
	 */
	public void processHistory(IProject selectedProject,IProgressMonitor monitor) throws CoreException, IOException {

		// find the repository mapping for the project
		// if none found, return
		RepositoryMapping repositoryMapping = RepositoryMapping.getMapping((IResource) selectedProject);
		if ( repositoryMapping == null ) {
			CertWareLog.logWarning(
					String.format("%s %s","Missing repository for project",
							selectedProject.getName()));
			return;
		}


		// build the commit history model, load it from the tree walk
		final CommitHistory commitHistory = ScoFactory.eINSTANCE.createCommitHistory();
		Repository repo = repositoryMapping.getRepository();
		RevWalk revWalk = new RevWalk(repo);
		ObjectId headObject = repo.resolve("HEAD");
		revWalk.markStart(revWalk.parseCommit(headObject));

		final Set<String> repositoryPaths = 
			Collections.singleton(repositoryMapping.getRepoRelativePath(selectedProject));
		revWalk.setTreeFilter(PathFilterGroup.createFromStrings(repositoryPaths));

		for ( RevCommit commit : revWalk ) {
			String commitName = commit.getName();
			ArtifactCommit artifactCommit = ScoFactory.eINSTANCE.createArtifactCommit();
			artifactCommit.setCommitIdentifier( commitName );
			commitHistory.getCommitRecord().add(artifactCommit);
		}

		revWalk.dispose();

		// use the Git provider to find the file history, then converge into the model
		GitProvider provider = (GitProvider)RepositoryProvider.getProvider(selectedProject);
		IFileHistoryProvider fileHistoryProvider = provider.getFileHistoryProvider();
		IResource[] projectMembers = selectedProject.members();

		monitor.beginTask("Processing project resources", projectMembers.length);
		for ( IResource resource : projectMembers ) {
			processResource(resource,fileHistoryProvider,commitHistory,monitor);
			monitor.worked(1);
			if ( monitor.isCanceled() ) {
				return;
			}
		} 

		// model complete with commit history and associated file sizes
		// write the resulting model to an SCO file
		// expecting preference to have no extension, so add it if necessary
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String fileName = store.getString(PreferenceConstants.P_FILENAME_SCO);
		if ( fileName.endsWith( ICertWareConstants.SCO_EXTENSION) == false ) {
			fileName = fileName + '.' + ICertWareConstants.SCO_EXTENSION;
		}
		
		// fully specify the path to the new file given the container project
		final String modelFile = 
			selectedProject.getFullPath().toPortableString() + IPath.SEPARATOR + fileName; 

		// create the resource in a workspace modify operation
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor progressMonitor) {
				try {
					// create a resource set and resource for a new file
					ResourceSet resourceSet = new ResourceSetImpl();
					URI fileURI = URI.createPlatformResourceURI(modelFile, true);
					Resource resource = resourceSet.createResource(fileURI);
					resource.getContents().add(commitHistory);

					// save the contents of the resource to the file system
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put(XMLResource.OPTION_ENCODING, FILE_ENCODING);
					resource.save(options);
				}
				catch (Exception e) {
					CertWareLog.logError(String.format("%s %s","Saving SCO file",modelFile),e);
				}
			}
		};
		
		// modify the workspace
		try {
			operation.run(monitor);
		} catch (Exception e) {
			CertWareLog.logError(String.format("%s %s","Modifying workspace for",
					selectedProject.getName()),e);
		}

		monitor.done();
	}

	/**
	 * Process a resource.  For each revision find its commit and add to the new list.
	 * @param resource to recover historical record
	 * @param fileHistoryProvider
	 * @param commitHistory commit history records to populate
	 * @param monitor progress monitor
	 */
	private void processResource(IResource resource, IFileHistoryProvider fileHistoryProvider, CommitHistory commitHistory, IProgressMonitor monitor) {

		IFileHistory fileHistory = fileHistoryProvider.getFileHistoryFor(resource,
				IFileHistoryProvider.SINGLE_LINE_OF_DESCENT, 
				monitor);

		// process file revisions
		IFileRevision[] fileRevisions = fileHistory.getFileRevisions();
		for ( IFileRevision fr : fileRevisions ) {
			processFileRevision(fr,commitHistory,monitor);
		} // revisions
	}

	/**
	 * Computes and results the line count for a file revision using its storage.
	 * Uses a line number reader to compute the line count.
	 * @param fr file revision
	 * @param monitor progress monitor for storage access
	 * @return line count or zero, exceptions caught and reported to log
	 */
	protected int getLineCount(IFileRevision fr, IProgressMonitor monitor) {
		int lineCount = 0;
		try {
			IStorage storage = fr.getStorage(monitor);
			InputStream is = storage.getContents();
			LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(is));
			while( lineNumberReader.ready() ) {
				lineNumberReader.readLine();
				lineCount++;
			}
			lineNumberReader.close();
			is.close();
		} catch (Exception e) {
			CertWareLog.logError(String.format("%s %s",
					"Gathering line count for revision",
					fr.getName()), e);
		}
		return lineCount;
	}

	/**
	 * Computes and results the byte count for a file revision using its storage.
	 * Uses an input stream reader to count bytes read.
	 * @param fr file revision
	 * @param monitor progress monitor for storage access
	 * @return line count or zero, exceptions caught and reported to log
	 */
	protected int getByteCount(IFileRevision fr, IProgressMonitor monitor) {
		int byteCount = 0;
		try {
			IStorage storage = fr.getStorage(monitor);
			InputStream is = storage.getContents();
			InputStreamReader isr = new InputStreamReader(is);
			while( isr.read() != -1 ) {
				byteCount++;
			}
			isr.close();
			is.close();
		} catch (Exception e) {
			CertWareLog.logError(String.format("%s %s","Gathering byte count for revision",fr.getName()),e);
		}

		return byteCount;
	}

	/**
	 * Process file revision
	 * @param fr file revision
	 * @param ch commit history, already populated with artifact history records
	 * @param monitor progress monitor
	 */
	private void processFileRevision(IFileRevision fr, CommitHistory ch, IProgressMonitor monitor) {
		String commitId = fr.getContentIdentifier();
		String name = fr.getName();
		int lineCount = getLineCount(fr,monitor);

		// create artifact identifier and add it to the existing commit
		ArtifactIdentifier ai = ScoFactory.eINSTANCE.createArtifactIdentifier();
		ai.setCurrentLineCount(lineCount);
		ai.setResourceName(name);

		// add the resource revision identifier to the corresponding commit record
		ArtifactCommit ac = findCommit(ch, commitId);
		if ( ac != null ) {
			ac.getArtifactIdentifiers().add(ai);
		} else {
			CertWareLog.logWarning(String.format("%s %s","Could not find commit for file",fr.getName()));
		}
	}

	/**
	 * Find the artifact commit list associated with a commit ID.
	 * @param ch commit history, already populated with commit ID records
	 * @param id commit identifier
	 * @return commit matching the given ID, or null
	 */
	private ArtifactCommit findCommit(CommitHistory ch, String id ) {
		if ( ch != null ) {
			for ( ArtifactCommit ac : ch.getCommitRecord() ) {
				if ( ac.getCommitIdentifier().equals(id)) {
					return ac;
				}
			}
		}
		return null;
	}
}

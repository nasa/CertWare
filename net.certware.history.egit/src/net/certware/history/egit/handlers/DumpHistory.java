package net.certware.history.egit.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.sco.ArtifactCommit;
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.CommitHistory;
import net.certware.measurement.sco.ScoFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egit.core.GitProvider;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.FooterLine;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.filter.PathFilterGroup;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.history.IFileHistory;
import org.eclipse.team.core.history.IFileHistoryProvider;
import org.eclipse.team.core.history.IFileRevision;
import org.eclipse.team.core.history.ITag;

/**
 * Dump history collection to the console.
 * @author mrb
 * @since 1.1
 */
public class DumpHistory implements ICertWareConstants {

	/**
	 * Process a ref map.
	 * @param prefix reference prefix
	 * @param map map of strings and ref entries
	 */
	@SuppressWarnings("unused")
	private void processRefMap(String prefix, Map<String,Ref> map) {
		Set<String> keyset = map.keySet();
		if ( keyset.isEmpty() )
			return;
		System.out.println(prefix);
		Iterator<String> i = keyset.iterator();
		while( i.hasNext() ) {
			String key = i.next();
			System.out.println("key " + key + " value " + map.get(key));
		}
	}

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

		Repository repo = repositoryMapping.getRepository();

		//String branch = repo.getBranch();
		//Ref head = repo.getRef("HEAD");
		RevWalk revWalk = new RevWalk(repo);
		ObjectId headObject = repo.resolve("HEAD");
		revWalk.markStart(revWalk.parseCommit(headObject));
		Set<String> authorEmails = new HashSet<String>();

		final Set<String> repositoryPaths = 
			Collections.singleton(repositoryMapping.getRepoRelativePath(selectedProject));

		revWalk.setTreeFilter(PathFilterGroup.createFromStrings(repositoryPaths));

		final CommitHistory commitHistory = ScoFactory.eINSTANCE.createCommitHistory();

		for ( RevCommit commit : revWalk ) {
			String commitName = commit.getName();
			ArtifactCommit artifactCommit = ScoFactory.eINSTANCE.createArtifactCommit();
			artifactCommit.setCommitIdentifier( commitName );
			commitHistory.getCommitRecord().add(artifactCommit);
		}

		// revision commit walk
		for (RevCommit commit : revWalk) {
			System.out.println(' ');
			System.out.println("commit: " + commit);

			PersonIdent author = commit.getAuthorIdent();
			PersonIdent committer = commit.getCommitterIdent();
			Date when = committer.getWhen();
			String name = commit.getName();
			int type = commit.getType();
			int commitTime = commit.getCommitTime();


			System.out.println("name " + name + " type " + type + " author " + author + " committer " + committer + " time " + commitTime + " when " + when);

			int parentCount = commit.getParentCount();
			List<FooterLine> footerLines = commit.getFooterLines();
			String fullMessage = commit.getFullMessage();
			String shortMessage = commit.getShortMessage();

			System.out.println("parents " + parentCount + " full " + fullMessage + " short " + shortMessage);

			System.out.println("footer lines:");
			Iterator<FooterLine> i = footerLines.iterator();
			while( i.hasNext() ) {
				FooterLine fl = (FooterLine)i.next();
				System.out.println("key " + fl.getKey() + " value " + fl.getValue() + " email " + fl.getEmailAddress());
			}

			// extract the commit fields you need, for example:
			authorEmails.add(commit.getAuthorIdent().getEmailAddress());

			RevTree revTree = commit.getTree();
			int firstByte = revTree.getFirstByte();
			ObjectId oi = revTree.getId();
			String rtname = revTree.getName();

			System.out.print("commit rev tree: ");
			System.out.println("first byte " + firstByte + " id " + oi.getName() + " rev tree name " + rtname);

			int rtype = revTree.getType();
			switch( rtype ) {
			case Constants.OBJ_BAD:
				System.out.println("rev type bad");
				break;
			case Constants.OBJ_BLOB:
				System.out.println("rev type blob");
				break;
			case Constants.OBJ_COMMIT:
				System.out.println("rev type commit");
				break;
				case Constants.OBJ_OFS_DELTA :
					System.out.println("rev type OFS delta");
					break;
				case Constants.OBJ_REF_DELTA:
					System.out.println("rev type REF delta");
					break;
				case Constants.OBJ_TAG:
					System.out.println("rev type tag");
					break;
				case Constants.OBJ_TREE:
					System.out.println("rev type tree");
					break;
				case Constants.OBJ_TYPE_5:
					System.out.println("rev type five");
					break;
				case Constants.OBJ_EXT:
					System.out.println("rev type ext");
					break;
			} // switch


			// commit.dispose();
			// commit.reset();
		}


		revWalk.dispose();

		// use the Git provider to find the file history
		GitProvider provider = (GitProvider)RepositoryProvider.getProvider(selectedProject);
		IFileHistoryProvider fileHistoryProvider = provider.getFileHistoryProvider();
		IResource[] projectMembers = selectedProject.members();

		// process history
		processHistory(selectedProject,monitor);
		
		// process resources
		monitor.beginTask("Processing project resources", projectMembers.length);
		for ( IResource resource : projectMembers ) {
			processResource(resource,fileHistoryProvider,commitHistory,monitor);
			monitor.worked(1);
			if ( monitor.isCanceled() ) {
				return;
			}
		} // members

		
		// report what was created
		System.out.println("SCO model result");
		for ( ArtifactCommit ac : commitHistory.getCommitRecord() ) {
			System.out.println("artifact commit " + ac.getCommitIdentifier() );
			for ( ArtifactIdentifier ai : ac.getArtifactIdentifiers() ) {
				System.out.println("resource " + ai.getResourceName() 
						+ " current " + ai.getCurrentLineCount());
			}
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
			IFileRevision[] contributors = fileHistory.getContributors(fr);
			for ( IFileRevision c : contributors ) {
				processContributor(fr,c,monitor);
			}
		} // revisions
	}

	/**
	 * Process branch tags.
	 * @param prefix
	 * @param tags
	 */
	@SuppressWarnings("unused")
	private void processTags(String prefix, ITag[] tags) {
		if ( tags.length < 1 )
			return;
		System.out.println(prefix);
		for ( ITag t : tags ) {
			System.out.println("tag " + t.getName() );
		}
	}

	/**
	 * Process file revision contributors
	 * @param fr original revision
	 * @param c contributor to this revision
	 * @param monitor progress monitor
	 */
	private void processContributor(IFileRevision fr, IFileRevision c,IProgressMonitor monitor) {
		String author = fr.getAuthor();
		String comment = fr.getComment();
		String identifier = fr.getContentIdentifier();
		String name = fr.getName();
		long timestamp = fr.getTimestamp();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date(timestamp));

		System.out.println("file contributor: " + author + ";" + 
				comment + ";" + 
				identifier + ";" + 
				name + ";" + 
				timestamp + ";" + date);

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
		String author = fr.getAuthor();
		String comment = fr.getComment();
		long timestamp = fr.getTimestamp();
		String commitId = fr.getContentIdentifier();
		String name = fr.getName();
		int lineCount = getLineCount(fr,monitor);

		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date(timestamp));

		System.out.println("Author " + author + " comment " + comment);
		System.out.println("commit id: " + commitId);
		System.out.println("Date " + date + " timestamp " + timestamp);

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

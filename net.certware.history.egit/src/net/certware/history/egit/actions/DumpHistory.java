package net.certware.history.egit.actions;

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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egit.core.GitProvider;
import org.eclipse.egit.core.project.RepositoryMapping;
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

public class DumpHistory {


	public DumpHistory() {
	}

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
	
	public void processHistory(IProject selectedProject) throws CoreException, IOException {

		RepositoryMapping repositoryMapping = RepositoryMapping.getMapping((IResource) selectedProject);
		System.out.println("mapping: " + repositoryMapping);
		
		if (repositoryMapping != null) {
			Repository repo = repositoryMapping.getRepository();

			// tags
			processRefMap("Tags:",repo.getTags());
			processRefMap("Refs:",repo.getAllRefs());

			String branch = repo.getBranch();
			System.out.println("branch: " + branch);

			Ref head = repo.getRef("HEAD");
			System.out.println("head: " + head);

			RevWalk revWalk = new RevWalk(repo);
			System.out.println("walk: " + revWalk);

			ObjectId headObject = repo.resolve("HEAD");
			System.out.println("head obj: " + headObject);

			revWalk.markStart(revWalk.parseCommit(headObject));

			Set<String> authorEmails = new HashSet<String>();

			final Set<String> repositoryPaths = 
				Collections.singleton(repositoryMapping.getRepoRelativePath(selectedProject));

			revWalk.setTreeFilter(PathFilterGroup.createFromStrings(repositoryPaths));

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
				int rtype = revTree.getType();

				System.out.println("commit rev tree:");
				System.out.println("first " + firstByte + " id " + oi.getName() + " name " + rtname + " type " + rtype);

				// commit.dispose();
				// commit.reset();
			}

			revWalk.dispose();

			GitProvider provider = (GitProvider)RepositoryProvider.getProvider(selectedProject);
			IFileHistoryProvider fileHistoryProvider = provider.getFileHistoryProvider();
			IResource[] projectMembers = selectedProject.members();
			for ( IResource resource : projectMembers ) {
				processResource(resource,fileHistoryProvider);
			} // members
		}
	}

	private void processResource(IResource resource, IFileHistoryProvider fileHistoryProvider) {
		System.out.println("resource " + resource);
		IFileHistory fileHistory = fileHistoryProvider.getFileHistoryFor(resource,
				IFileHistoryProvider.SINGLE_LINE_OF_DESCENT, 
				new NullProgressMonitor());

		IFileRevision[] fileRevisions = fileHistory.getFileRevisions();
		for ( IFileRevision fr : fileRevisions ) {
			processFileRevision(fr);
		} // revisions
	}

	private void processTags(String prefix, ITag[] tags) {
		if ( tags.length < 1 )
			return;
		System.out.println(prefix);
		for ( ITag t : tags ) {
			System.out.println("tag " + t.getName() );
		}
	}
	
	private void processFileRevision(IFileRevision fr) {
		String author = fr.getAuthor();
		String comment = fr.getComment();
		String identifier = fr.getContentIdentifier();
		String name = fr.getName();
		long timestamp = fr.getTimestamp();
		// URI uri = fr.getURI();

		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date(timestamp));
		
		System.out.println("file revision: " + author + ";" + 
				comment + ";" + 
				identifier + ";" + 
				name + ";" + 
				timestamp + ";" + date);

		processTags("Tags:",fr.getTags());
		int lineCount = 0;
		int byteCount = 0;
		
		try {
			IStorage storage = fr.getStorage(new NullProgressMonitor());
			InputStream is = storage.getContents();
			LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(is));
			while( lineNumberReader.ready() ) {
				lineNumberReader.readLine();
				lineCount++;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			IStorage storage = fr.getStorage(new NullProgressMonitor());
			InputStream is = storage.getContents();
			InputStreamReader isr = new InputStreamReader(is);
			while( isr.read() != -1 ) {
				byteCount++;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("line count " + lineCount + " byte count " + byteCount);
	}
}

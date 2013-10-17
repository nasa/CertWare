/**
 * 
 */
package net.certware.history.egit.handlers;

import java.io.File;
import java.net.URI;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryBuilder;
import org.eclipse.jgit.revwalk.FooterLine;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.TreeFilter;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.history.IFileHistory;
import org.eclipse.team.core.history.IFileHistoryProvider;
import org.eclipse.team.core.history.IFileRevision;
import org.eclipse.team.core.history.ITag;
import org.eclipse.team.core.subscribers.Subscriber;


/**
 * Handles the dump command.
 * @author mrb
 */
public class DumpHandler extends AbstractHandler {

	@SuppressWarnings("unused")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		System.out.println("reporting from from dump handler...");
		
		// zeroth
		try {
			//GitProvider provider = new GitProvider();
			//provider.configureProject();
			// TODO derive from selection
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("net.certware.test");
			
			System.out.println("programmatic access to project " + project);
			
			RepositoryBuilder builder = new RepositoryBuilder();
			Repository repository = builder.setGitDir(((IResource)project).getFullPath().toFile()).readEnvironment().findGitDir().build();
			
			if (repository != null) {
				
				// tags
				Map<String, Ref> repoTags = repository.getTags();
				System.out.println("tags: ");
				{
				Set<String> keyset = repoTags.keySet();
				if ( keyset.isEmpty() == false ) {
					Iterator<String> i = keyset.iterator();
					while( i.hasNext() ) {
						String key = i.next();
						System.out.println("tags key " + key + " value " + repoTags.get(key));
					}
				}
				}
				
				//refs
				Map<String, Ref> refs = repository.getAllRefs();
				System.out.println("refs: ");
				{
				Set<String> keyset = repoTags.keySet();
				if ( keyset.isEmpty() == false ) {
					Iterator<String> i = keyset.iterator();
					while( i.hasNext() ) {
						String key = i.next();
						System.out.println("refs key " + key + " value " + repoTags.get(key));
					}
				}
				}
				
				
				String branch = repository.getBranch();
				System.out.println("branch: " + branch);
				
				Ref head = repository.getRef("HEAD");
				System.out.println("head: " + head);
				
				RevWalk walk = new RevWalk(repository);
				System.out.println("walk: " + walk);

				ObjectId headObject = repository.resolve("HEAD");
				System.out.println("head obj: " + headObject);
				
				walk.markStart(walk.parseCommit(headObject));
				
				Set<String> authorEmails = new HashSet<String>();
				
				TreeFilter filter = walk.getTreeFilter();

				// rev commit walk
				for (RevCommit commit : walk) {
					System.err.println(' ');
					System.err.println("commit: " + commit);
					
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
				
				walk.dispose();
				
				
				/**
				 * tree walk version
				 */
				TreeWalk treeWalk = new TreeWalk(repository);
				System.out.println(' ');
				System.err.println("tree walk: " + treeWalk);
				
				/**
				 * from test case
				 */
				System.err.println("file provider test");
				File workDir = repository.getWorkTree();
				System.out.println("work dir " + workDir);
				

				// GitProvider provider = (GitProvider)RepositoryProvider.getProvider(project);
				RepositoryProvider provider = RepositoryProvider.getProvider(project);
				String id = provider.getID();
				Subscriber subscriber = provider.getSubscriber();
				IFileHistoryProvider fileHistoryProvider = provider.getFileHistoryProvider();

				IResource[] projectMembers = project.members();
				for ( IResource resource : projectMembers ) {
					System.err.println("");
					System.err.println("resource " + resource);
					IFileHistory fileHistory = fileHistoryProvider.getFileHistoryFor(resource,
							IFileHistoryProvider.SINGLE_LINE_OF_DESCENT, 
							new NullProgressMonitor());
					// System.err.println("file history " + fileHistory);
					IFileRevision[] fileRevisions = fileHistory.getFileRevisions();
					for ( IFileRevision fr : fileRevisions ) {
						String author = fr.getAuthor();
						String comment = fr.getComment();
						String identifier = fr.getContentIdentifier();
						String name = fr.getName();
						ITag[] tags = fr.getTags();
						long timestamp = fr.getTimestamp();
						URI uri = fr.getURI();
						
						System.err.println("file revision: " + author + ";" + comment + ";" + identifier + ";" + name + ";" + timestamp);
						/*
						System.err.print("tags: ");
						for ( ITag t : tags ) {
							System.err.print(t.getName() + ' ');
						}
						System.err.println("");
						*/
					} // revisions
				} // members

				// IFileRevision fileRevision = fileHistory.getFileRevision("60f0d7917fe2aed5c92b5bc35dfb55b9b8ada359");
				//assertEquals("60f0d7917fe2aed5c92b5bc35dfb55b9b8ada359", fileRevision.getContentIdentifier());
				//assertEquals("J. Author",fileRevision.getAuthor());
				
				
				
				/*
				final WorkingTreeIterator iterator = treeWalk.getTree(0,WorkingTreeIterator.class); // TODO broken also
				System.out.println("iterator " + iterator);
				while( iterator.eof() == false ) {
					FileMode fileMode = iterator.getEntryFileMode();
					long lastModified = iterator.getEntryLastModified();
					long length = iterator.getEntryLength();
					ObjectId objectId = iterator.getEntryObjectId();
					int hashCode = iterator.getEntryPathHashCode();
					String pathString = iterator.getEntryPathString();

					System.out.println("path " + pathString + " hash code " + hashCode + " objectId " + objectId);
					System.out.println("length " + length + " last modified " + lastModified + " file mode " + fileMode );

					iterator.next(1);
				}
				*/
				
				// walk must have two trees
				/*
				List<DiffEntry> diffList = DiffEntry.scan(treeWalk);
				for ( DiffEntry diffEntry : diffList ) {
					System.out.println("diff entry: " + diffEntry);
					ChangeType changeType = diffEntry.getChangeType();
					FileMode newMode = diffEntry.getNewMode();
					FileMode oldMode = diffEntry.getOldMode();
					String newPath = diffEntry.getNewPath();
					String oldPath = diffEntry.getOldPath();
					int score = diffEntry.getScore();

					System.out.println("score " + score + " new path " + newPath + " old path " + oldPath);
					System.out.println("new mode " + newMode + " old mode " + oldMode );
					System.out.println("change type " + changeType );

					AbbreviatedObjectId oldId = diffEntry.getId(Side.OLD);
					AbbreviatedObjectId newId = diffEntry.getId(Side.NEW);
					System.out.println("old id " + oldId + " new id " + newId);

				} // diff entry
				*/
				
			}
			
			//provider.getData();
			//GitProjectData gpd = GitProjectData.get(project);
			//System.out.println("git project data: " + gpd); // okay
			
			//RepositoryFinder finder = new RepositoryFinder(project); // okay
			//Collection<RepositoryMapping> mapping = finder.find(Job.getJobManager().createProgressGroup()); // okay
			//System.out.println("mapping: " + mapping); // okay
			// RepositoryUtil ru = org.eclipse.egit.core.Activator.getDefault().getRepositoryUtil();

			/*
			for ( RepositoryMapping m : mapping) {
				System.out.println("path: " + m.getGitDirAbsolutePath());
				File workTree = m.getWorkTree();
				System.out.println("work tree: " + workTree);
				Repository r = m.getRepository();
				System.out.println("repository branch: " + r.getBranch());
				System.out.println("repository tags: " + r.getTags());
			}
			*/
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		// first
		/*
		ru.addConfiguredRepository(new File("..",Constants.DOT_GIT));
		List<String> repositories = ru.getConfiguredRepositories();
		System.out.println("configured repositories: " + repositories.size());
		for ( String r : repositories ) {
			System.out.println("configured repository: " + r);
		}
		*/
		
		// second
		/*
		try {
			FileRepository fr = lookupRepository(new File("."));
			System.err.println("lookup fr: " + fr);
			
			RevWalk walk = new RevWalk(fr);
			System.out.println("revision walk: " + walk);
			
			ObjectId head = fr.resolve("HEAD");
			System.out.println("repository head: " + head);
			
			// walk.markStart(walk.parseCommit(head));
			
			Set<String> authorEmails = new HashSet<String>();

			for (RevCommit commit : walk) {
				// extract the commit fields you need, for example:
				authorEmails.add(commit.getAuthorIdent().getEmailAddress());

				// commit.dispose();
				// commit.reset(); 
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		*/
		
		
		/*
		try {
			RepositoryBuilder builder = new RepositoryBuilder();
			// BaseRepositoryBuilder baseBuilder = builder.findGitDir();
			builder.setWorkTree(new File("."));
			builder.findGitDir(new File("."));
			System.err.println("git dir: " + builder.getGitDir());
			Repository repository = builder.build();

			// .readEnvironment() // scan environment GIT_* variables
			//.findGitDir() // scan up the file system tree
			//.build();

			ObjectId head = repository.resolve("HEAD");
			System.out.println("repository head: " + head);

			RevWalk walk = new RevWalk(repository);
			System.out.println("revision walk: " + walk);

			//			ObjectId from = repository.resolve("refs/heads/master");
			//			ObjectId to = repository.resolve("refs/remotes/origin/master");
			walk.markStart(walk.parseCommit(head));
			//			walk.markUninteresting(walk.parseCommit(to));

			// more setup
			Set<String> authorEmails = new HashSet<String>();

			for (RevCommit commit : walk) {
				// extract the commit fields you need, for example:
				authorEmails.add(commit.getAuthorIdent().getEmailAddress());

				// commit.dispose();
				commit.reset(); 
			}



			walk.setTreeFilter(AndTreeFilter.create(
					PathFilter.create("a/file/path"),
					TreeFilter.ANY_DIFF));


		} catch (IOException e) {
			e.printStackTrace();
		}
		*/

		return null;
	}


//	protected static org.eclipse.jgit.storage.file.FileRepository lookupRepository(File directory) throws Exception {
		//return (org.eclipse.jgit.storage.file.FileRepository) org.eclipse.egit.core.Activator.getDefault()
		//.getRepositoryCache().lookupRepository(directory);
	//}

}

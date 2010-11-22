/**
 * 
 */
package net.certware.history.egit.handlers;

import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.storage.file.FileRepository;


/**
 * Handles the dump command.
 * @author mrb
 */
public class DumpHandler extends AbstractHandler {

	@SuppressWarnings("unused")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// zeroth
		try {
			//GitProvider provider = new GitProvider();
			//provider.configureProject();
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("net.certware.test");
			
			RepositoryMapping repositoryMapping = RepositoryMapping.getMapping((IResource) project);
			System.out.println("mapping: " + repositoryMapping);
			if (repositoryMapping != null) {
				Repository repo = repositoryMapping.getRepository();
				Map<String, Ref> tags = repo.getTags();
				System.out.println("tags: " + tags);
				Map<String, Ref> refs = repo.getAllRefs();
				System.out.println("refs: " + refs);
				
				String branch = repo.getBranch();
				System.out.println("branch: " + branch);
				
				Ref head = repo.getRef("HEAD");
				System.out.println("head: " + head);
				
				RevWalk walk = new RevWalk(repo);
				System.out.println("walk: " + walk);

				ObjectId headObject = repo.resolve("HEAD");
				System.out.println("head obj: " + headObject);
				
				walk.markStart(walk.parseCommit(headObject));
				
				Set<String> authorEmails = new HashSet<String>();

				for (RevCommit commit : walk) {
					
					System.err.println("commit: " + commit);
					
					PersonIdent author = commit.getAuthorIdent();
					PersonIdent committer = commit.getCommitterIdent();
					Date when = committer.getWhen();
					String name = commit.getName();
					int type = commit.getType();
					int commitTime = commit.getCommitTime();
					
					System.out.println("commit " + name + " type " + type + " author " + author + " committer " + committer + " time " + commitTime + " when " + when);
					
					// extract the commit fields you need, for example:
					authorEmails.add(commit.getAuthorIdent().getEmailAddress());

					RevTree revTree = commit.getTree();
					

					// commit.dispose();
					// commit.reset();
				}
				
				walk.dispose();
				System.out.println("authors: " + authorEmails);
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
				// commit.reset(); // TODO check this
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
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
				commit.reset(); // TODO check this
			}



			walk.setTreeFilter(AndTreeFilter.create(
					PathFilter.create("a/file/path"),
					TreeFilter.ANY_DIFF));


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		return null;
	}


	protected static FileRepository lookupRepository(File directory) throws Exception {
		return (FileRepository) org.eclipse.egit.core.Activator.getDefault()
		.getRepositoryCache().lookupRepository(directory);
	}

}
